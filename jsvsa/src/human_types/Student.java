package human_types;

public class Student extends Human{
	protected double average_grade;
	
	public double getGrade() {
		return average_grade;
	}
	public void setGrade(int p_grade) {
		this.average_grade = p_grade;
	}
	
	public Student (String s_fname, String s_sname, String s_pname, int s_age, char s_sex, int s_money, double s_grade){
		this.first_name = s_fname;
		this.second_name = s_sname;
		this.patronymic_name = s_pname;
		this.age = s_age;
		this.Sex = s_sex;
		this.money = s_money;
		this.average_grade = s_grade;
	}
	public Student (){
		
	}
	public String toString() {
		String result = ("Имя: " + this.first_name + ' ' + this.second_name + ' ' + this.patronymic_name + '\n' +
						 "Возраст: " + String.valueOf(this.age) + '\n' + 
						 "Пол: " + Character.toString(this.Sex) + '\n' +
						 "Количество карманных денег: " + String.valueOf(this.money) + '\n' +
						 "Средняя оценка за семестр: " + Double.toString(this.average_grade) + '\n');
		return result;
	}
}


