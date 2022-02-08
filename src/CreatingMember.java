import java.util.Scanner;

public class CreatingMember {
	void CreatingMember() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t\nWhat is the new member name: ");
		String newMembername = scanner.next();
		System.out.println("\t\nWhat is the new member age: ");
		int newMemberAge = scanner.nextInt();
		System.out.println("\t\nWhat is the new member join date: ");
		String newMemberJD = scanner.next();
		System.out.println("\t\nWhat is the new member rule in the organization: (A, B, C)");
		String newMemberRule = scanner.next();
		System.out.println("\t\nWhat is the new member experience in years: ");
		int newMemberExp = scanner.nextInt();
		
		Main newMember1 = new Main(newMembername, newMemberAge, newMemberJD, newMemberRule, newMemberExp, "Member", false);

	}
}
