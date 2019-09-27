package package1;

public class Menu {
	public static void main(String[] args) {
//	Build program has menu
//	1: create employee
//	2: show the existing employee
//	3: exit 

//		System.out.println("==========Menu==========");
//		System.out.println("1. create employee");
//		System.out.println("2.show the exitting employee");
//		System.out.println("3.exit");
//       
//	

		Employee employee1 = new Employee(1, "NGUYEN VAN A", 3000, new Job(1, "HR"));
		Employee employee2 = new Employee(2, "NGUYEN VAN B", 4000, new Job(2, "BA"));
		Employee employee3 = new Employee(3, "NGUYEN VAN C", 5000, new Job(3, "TESTER"));
		Employee employee4 = new Employee(4, "NGUYEN VAN D", 6000, new Job(4, "Develoveper"));
		Employee employee5 = new Employee(5, "NGUYEN VAN E", 7000, new Job(5, "CEO"));
		Employee[] Arrayemployee = new Employee[5];
		Arrayemployee[0] = employee1;
		Arrayemployee[1] = employee2;
		Arrayemployee[2] = employee3;
		Arrayemployee[3] = employee4;
		Arrayemployee[4] = employee5;

		System.out.println("ID " + "    NAME   " + "     Salary  " + " job name");
//		for (int i = 0; i < 5; i++) {
//			System.out.println(Arrayemployee[i].id + "   " + Arrayemployee[i].name + "   " + Arrayemployee[i].salary
//					+ "      " + Arrayemployee[i].job.namejob);
//		}
	}
}
