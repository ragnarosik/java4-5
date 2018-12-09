package human_types;

abstract class Human {
	protected String first_name;
	protected String second_name;
	protected String patronymic_name;
	protected int age;
	protected char Sex;
	protected int money;
	public String getFullName() {
		return (first_name+ ' ' + second_name+ ' ' + patronymic_name);
	}
	public String getFirstName() {
		return first_name;
	}
	public String getSecondName() {
		return second_name;
	}
	public String getPatronymicName() {
		return patronymic_name;
	}
	public int getAge() {
		return age;
	}
	public char getSex() {
		return Sex;
	}
	public int getMoney() {
		return money;
	}
	
	
	
	public void setFirstName(String h_fname) {
		this.first_name = h_fname;
	}
	public void setSecondName(String h_sname) {
		this.second_name = h_sname;
	}
	public void setPatronymicName(String h_pname) {
		this.patronymic_name = h_pname;
	}
	public void setAge(int h_age) {
		this.age = h_age;
	}
	public void setSex(char h_sex) {
		this.Sex = h_sex;
	}
	public void setMoney(int h_money) {
		this.money = h_money;
	}
}
