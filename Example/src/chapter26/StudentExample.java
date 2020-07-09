package chapter26;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentExample {

	public static void main(String[] args) {
		//array
		Student[] student = new Student[4];//fixed
		ArrayList<Student> manage = new ArrayList<Student>();
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
			manage.add(student[i]);
		}
		
		System.out.println();
		//=================출  력==================
		System.out.println("학생 정보 ");
		for(int i=0;i<manage.size();i++) {
			Student s = manage.get(i);
			//System.out.println(manage.get(i));
			System.out.println("이름 : " + s.getName());
			System.out.println("학과: " + s.getDept());
			System.out.println("학번 : " + s.getNumber());
			System.out.println("학점평균 : " + s.getGrade());
			System.out.println("---------------------------");
		}
		System.out.println();
		while(true) {
			System.out.println("학생 이름 >> ");
			String search = scan.next();
			if(search.equals("그만")) {
				break;
			}else {
				for(int i=0; i<manage.size(); i++) {
					Student s = manage.get(i);
					s.find_student(search);
				}
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

