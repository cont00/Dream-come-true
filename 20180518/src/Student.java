public class Student {
	private String name;
	private int kor;
	private int eng;
	private int jsp;
	private int gender;
	private String remark;
	
	// alt + shift + s + s
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", jsp=" + jsp + ", gender=" + gender
				+ ", remark=" + remark + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return jsp;
	}
	public void setMath(int math) {
		this.jsp = math;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	// alt shift s r	
}