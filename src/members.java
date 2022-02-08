import java.util.Scanner;

import javax.swing.JOptionPane;

public class members {
	Boolean hasFinished = false;
	public members() {
	while (!hasFinished) {
			
			System.out.println("\nChoose member: ");
			System.out.println("\t1- Saif Almajd");
			System.out.println("\t2- Ahmed");
			System.out.println("\t3- Ali");
			System.out.println("\t4- Qiut");

			Scanner scanner = new Scanner(System.in);
			int M_Choice = scanner.nextInt();
			
	    if (M_Choice == 1) {
	        System.out.println("\t\nMember Number 1");
	        Main SaifAlmajd = new Main("Saif Almajd Almassri", 18, "08-04-2019", "A", 2, "Founder and member", true);

	    }
	    
        if (M_Choice == 2) {
			System.out.println("\t\nMember Number 2");	
			Main Ahmed = new Main("Ahmed", 18, "Unkwown", "A", 1, "member", false);
        }
        
		if (M_Choice == 3) {
			System.out.println("\t\nMember Number 3" );
			Main Ali = new Main("Ali", 19, "Unkwown", "A", 1, "member", false);
		}

		if (M_Choice == 4) {
			hasFinished = true;
			System.out.println("\t\nBye");
		}
	}
}}