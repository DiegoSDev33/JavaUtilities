package informacoes;

import java.io.File;
import java.util.Scanner;

public class ProgramInformacoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		
		String strPath = sc.next();
		
		File path = new File(strPath);
		
		
		System.out.println("getName: "+ path.getName());
		System.out.println(path.getParent());
		System.out.println(path.getPath());
		
		
		
sc.close();
	}

}
