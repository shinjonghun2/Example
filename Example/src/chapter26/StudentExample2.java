package chapter26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class StudentExample2 {

	public static void main(String[] args) {
		//array
		Student[] student = new Student[4];//fixed
		HashMap<String, Student> manage = new HashMap<String, Student>();
		Scanner scan = new Scanner(System.in);
		//=================��  ��==================
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		for(int i=0;i<student.length;i++) {
			System.out.print(">> ");
			String text = scan.nextLine();
			StringTokenizer st = new StringTokenizer(text,",");
			String name=st.nextToken().trim();
			String dept=st.nextToken().trim();
			String number=st.nextToken().trim();
			double grade = Double.parseDouble((st.nextToken().trim()));
			//fixed-length
			student[i] = new Student(name,dept,number,grade);
			//Array(Student) --> ArrayList(manage)
			manage.put(name, student[i]);
		}

		System.out.println();
		//=================��  ��==================
		System.out.println("�л� ���� ");
		Set<String> key =manage.keySet();
		Iterator<String> ir = key.iterator();
		while(ir.hasNext()) {
			String name =ir.next();
			Student s = manage.get(name);
			//System.out.println(manage.get(i));
			System.out.println("�̸� : " + s.getName());
			System.out.println("�а�: " + s.getDept());
			System.out.println("�й� : " + s.getNumber());
			System.out.println("������� : " + s.getGrade());
			System.out.println("---------------------------");

			System.out.println();
		}






		while(true) {
			System.out.println("�л� �̸� >> ");
			String search = scan.next();
			if(search.equals("�׸�")) 
				break;
			while(ir.hasNext()) {
				String name = ir.next();
				Student s = manage.get(search);
				s.find_student(search);
			}


		}
		scan.close();
		/*
		System.out.println("���� �˻� ");
		System.out.print(">> ");
		String search = scan.nextLine();
		for(int i=0; i<student.length; i++) {
			student[i].find_student(search);

		}*/

	}
}

