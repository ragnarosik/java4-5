package MyMain;

import java.io.*;

import MyMain.Lab_4;
import human_types.CoolParent;
import human_types.NerdStudent;
import human_types.Parent;
import human_types.Student;

class myClass {
	public static void main(String Args[]) {
		Student s1 = new Student("Иванов", "Иван", "Иванович", 20, 'м', 5000, 4.5);
		
		Parent p1 = new Parent("Петров", "Петр", "Петрович", 45, 'м', 50000);
		System.out.println(s1.toString());
		System.out.println(p1.toString());
		Lab_4 laba_4 = new Lab_4();
		laba_4.start();
		Lab_5 laba_5 = new Lab_5();
		laba_5.start();
	}
	
}
