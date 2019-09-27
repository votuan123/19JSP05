package package1;

public class MainEmployee {
	public static void main(String[] args) {

//		Job job1=new Job(1, "HR");
		Employee employee1 = new Employee(1, "NGUYEN VAN A", 3000, new Job(1, "HR"));
		Employee employee2 = new Employee(2, "NGUYEN VAN B", 4000, new Job(2, "BA"));
		Employee employee3 = new Employee(3, "NGUYEN VAN C", 5000, new Job(3, "TESTER"));
		Employee employee4 = new Employee(4, "NGUYEN VAN D", 6000, new Job(4, "Develoveper"));
		Employee employee5 = new Employee(5, "NGUYEN VAN E", 7000, new Job(5, "CEO"));
//		System.out.println("Employee infomation :");
//		Scanner input=new Scanner(System.in);
//		int number=input.nextInt();

		Employee[] Arrayemployee = new Employee[5];
		Arrayemployee[0] = employee1;
		Arrayemployee[1] = employee2;
		Arrayemployee[2] = employee3;
		Arrayemployee[3] = employee4;
		Arrayemployee[4] = employee5;
// System.out.println("Employee infomation :");
////System.out.println("ID :" + Arrayemployee[Arrayemployee.length-1].id);
// System.out.println("ID :" + Arrayemployee[4].id);
// System.out.println("name :" + Arrayemployee[4].name);
// System.out.println("salary :" + Arrayemployee[4].salary);
// System.out.println("Job :" + Arrayemployee[4].job.namejob);
		System.out.println("ID "+ "    NAME   "+"     Salary  "+" job name");
		for (int i = 0; i < 5; i++) {
			System.out.println(Arrayemployee[i].id+"   " + Arrayemployee[i].name+"   "+Arrayemployee[i].salary+"      "+Arrayemployee[i].job.namejob);
		}
	}
}
