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
		//=================입  력==================
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
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
		//=================출  력==================
		System.out.println("학생 정보 ");
		Set<String> key =manage.keySet();
		Iterator<String> ir = key.iterator();
		while(ir.hasNext()) {
			String name =ir.next();
			Student s = manage.get(name);
			//System.out.println(manage.get(i));
			System.out.println("이름 : " + s.getName());
			System.out.println("학과: " + s.getDept());
			System.out.println("학번 : " + s.getNumber());
			System.out.println("학점평균 : " + s.getGrade());
			System.out.println("---------------------------");

			System.out.println();
		}






		while(true) {
			System.out.println("학생 이름 >> ");
			String search = scan.next();
			if(search.equals("그만")) 
				break;
			while(ir.hasNext()) {
				String name = ir.next();
				Student s = manage.get(search);
				s.find_student(search);
			}


		}
		scan.close();
		/*
		System.out.println("정보 검색 ");
		System.out.print(">> ");
		String search = scan.nextLine();
		for(int i=0; i<student.length; i++) {
			student[i].find_student(search);

		}*/

	}
}

