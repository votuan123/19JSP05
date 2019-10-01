package package1;

public class Job {
	 int idjob;
	 String namejob;

	public Job() {
	}

	public Job(int id, String namejob) {
		this.idjob = id;
		this.namejob = namejob;
	}

	public int getIdjob() {
		return idjob;
	}

	public void setIdjob(int idjob) {
		this.idjob = idjob;
	}

	public String getNamejob() {
		return namejob;
	}

	public void setNamejob(String namejob) {
		this.namejob = namejob;
	}

	@Override
	public String toString() {
		return "Job [idjob=" + idjob + ", namejob=" + namejob + "]";
	}

}
