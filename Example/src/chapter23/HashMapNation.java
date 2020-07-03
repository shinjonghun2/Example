package chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String,Integer>();
		
		
		System.out.println("나라이름과 인구를 입력하세요 . (예 : Korea 5000)");
		//입력 부
		while(true){//"그만"이 입력될때까지 입력을 반복
			System.out.print("나라이름, 인구 >> ");
			//scanner로 입력받은것을 변수방에 저장 
			String nation = scan.next();
			//변수방에 그만이라는 문자가 들어오면 break
			if(nation.equals("그만")) {
				break;
			}
			//인구를 입력받아 population변수방에 저장 
			int population = scan.nextInt();
			nations.put(nation, population); //해시맵 나라이름과 인구 저장
			
		}
		
		//입력검색부
		while(true) {
			System.out.print("인구 검색>>");
			String search = scan.next();
			if(search.equals("그만")) {
				break;
			}
			if(nations.get(search)!= null)
				System.out.println(search+ "의 인구는 " + nations.get(search));
			else {
				System.out.println(search + "나라는 없습니다");
			}
		
			
			}
		scan.close();
	}
		
	}

