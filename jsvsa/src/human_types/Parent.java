package human_types;

public class Parent extends Human{
	protected int money;
	public Parent(String p_fname, String p_sname, String p_pname, int p_age, char p_sex, int p_money){
		this.first_name = p_fname;
		this.second_name = p_sname;
		this.patronymic_name = p_pname;
		this.age = p_age;
		this.Sex = p_sex;
		this.money = p_money;
	}
	public Parent(){
	}
	public String toString() {
		String result = ("���: " + this.first_name + ' ' + this.second_name + ' ' + this.patronymic_name + '\n' +
						 "�������: " + String.valueOf(this.age) + '\n' + 
						 "���: " + Character.toString(this.Sex) + '\n' +
						 "���������� ��������� �����: " + String.valueOf(this.money) + '\n');
		return result;
	}
}
