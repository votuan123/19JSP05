package package1;

import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose");
		int status = Integer.parseInt(sc.nextLine());
		Employee e = new Employee();
		
		switch (status) {
		// create employee
		case 1:
			// Input job information
			System.out.println("Please input job id: ");
			int jobId =Integer.parseInt(sc.nextLine());
			System.out.println("Please input job name: ");
			String jobName = sc.nextLine();
			Job job = new Job(jobId, jobName);

			// Input employee information
			System.out.println("Please input employee id: ");
			int eId = Integer.parseInt(sc.nextLine());

			System.out.println("Please input employee name: ");
			String eName = sc.nextLine();
			System.out.println("Please input employee salary: ");
			int eSalary = Integer.parseInt(sc.nextLine());
	
			e = new Employee(eId, eName, eSalary, job);

			// show the existing employee
		case 2:
			System.out.println(e.toString());
			
			// exit
		case 3:
			break;
		default:
			break;
		}

//		sc.close();
	}
}
