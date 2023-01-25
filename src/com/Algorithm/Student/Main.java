package com.Algorithm.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("손오공", "1682");
		Student st2 = new Student("저팔계", "1772");
		Student st3 = new Student("사오정", "1813");
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu: list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
						
		}
		
		Scanner scan = new Scanner(System.in);
					
		while(true) {
			System.out.println("계속 검색을 하고 싶으시면 Y, 종료하고 싶으면 N");
			String input = scan.next();
			
			
			
			if (input.equals("Y")) {
				System.out.println("검색을 시작합니다.");
				
				String name = scan.next();
				boolean flag = false;
				
				for(Student stu: list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은:" + stu.getNo());
						flag = true;
					}
				}
				
				if(!flag) {
					System.out.println("해당 학생의 이름이 없습니다.");
				}
			}
			else if(input.equals("N")) {
				break;
			}
		}
		
		System.out.println("프로그램이 종료 되었습니다.");
	}
}
