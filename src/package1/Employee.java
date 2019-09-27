package package1;

public class Employee {
	 String name;
	 int id;
	 int salary;
	 int age;
	 boolean merried;
	 Job job;

	public Employee() {

	}

	public Employee(int id, String name, int salary, Job job) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMerried() {
		return merried;
	}

	public void setMerried(boolean merried) {
		this.merried = merried;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + ", job=" + job + "]";
	}
	
}
