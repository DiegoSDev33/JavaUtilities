package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut)/* throws DomainException */ {
		
		if (!checkOut.after(checkIn)) { // testando se a data de checkOut nao e antes da Checkin  assim retornado invalido
			throw new  DomainException("Check-out date must be after check-in date");
		}
		
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); // o valor vem em milissegundos
		return	TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // convertendo o valor de milissegundos para dias
		
		
	}
	
	public void updateDates(Date checkIn, Date checkOut) /* throws DomainException */{
		
		Date now = new Date();
		
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reversation dates for update must be future");
		}
		if (!checkOut.after(checkIn)) { // testando se a data de checkOut nao e antes da Checkin  assim retornado invalido
			throw new  DomainException("Check-out date must be after check-in date");
		}
		
		// PASSANDO PELAS CONDICOES DE ERRO ELE MANDA PARA VALIDAÇÃO
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}
	
	@Override
	public String toString() {
		return "Room: " 
			+ roomNumber
			+ ", checkIn: "
			+ sdf.format(checkIn)
			+ ", checkOut: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nights";
		
	}
	
	
	
	
	
}
