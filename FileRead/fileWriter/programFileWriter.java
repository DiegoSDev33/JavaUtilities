package fileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class programFileWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"good morning", "good afternoon"," good night"};
		
		String path = "c:\\temp\\saida.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){// acrescento o true, toda vez que o arquivo for rodar ele cria dentro do arquivo ja existente
			
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
