package package1;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		int status;
		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("program has menu :");
			System.out.println("1.create Employee");
			System.out.println("2.show the exitting employee");
			System.out.println("3.exit");
			System.out.println("==========================");
			System.out.println("Please choose");
		    status = Integer.parseInt(sc.nextLine());
			
			switch (status) {
			case 1:
				CreateEmp();
				question();
				break;
			case 2:
				showemployee();
				question();
				break;
			case 3:
				System.out.println("program to finish");
				break;
			default:
				System.out.println("wrong choose");
				break;
			}
		}
		while(status==0);
		
	}
	public static void CreateEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input id");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("input name");
		String name = sc.nextLine();
		System.out.println("input salary");
		int salary = Integer.parseInt(sc.nextLine());
		System.out.println("input job id");
		int idJob = Integer.parseInt(sc.nextLine());
		System.out.println("input job");
		String namejob = sc.nextLine();
	}

	public static void showemployee() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input the numer of employee");
		int number = Integer.parseInt(sc.nextLine());
		Employee[] e = new Employee[number];
		Job job = new Job();

		for (int i = 0; i < number; i++) {
			System.out.println("input infomation employee:" + (i+1));
			System.out.println("input id");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("input name");
			String name = sc.nextLine();
			System.out.println("input salary");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.println("input job id");
			int idJob = Integer.parseInt(sc.nextLine());
			System.out.println("input job");
			String namejob = sc.nextLine();
			Job j = new Job(idJob, namejob);
			e[i]=new Employee(idJob, name, salary, j);
			System.out.println("================");
			System.out.println("id :" + e[i].id + ",name:" + e[i].name + ",salary" + e[i].salary + ",Job:" + e[i].job.namejob);
		}

	}
	public static void question()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("inter 1 to continue and 0 to exit");
		int select=sc.nextInt();
		if(select==1)
		{
			main(null);
		}
		if(select==0)
		{
			System.out.println("program to finish");
		}
		
	}
}


		