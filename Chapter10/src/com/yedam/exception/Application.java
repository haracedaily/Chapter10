package com.yedam.exception;

public class Application {
//	try {
//		//예외가 발생할만한 코드
//	} catch() {
//		//예외 발생 후 처리하는 코드
//	} finally {
//		//예외가 있든 없든 무조건 실행해야하는 코드
//		//즉, try만 실행하고 오든 catch까지 실행하고 오든 무조건 실행
//	}
	public static void main(String[] args) {
//		try {
			//예외가 발생할꺼 같은 코드
//			double avg = 1/0;
//			System.out.println(avg);
//		
//			String str="자바";
//			Integer.parseInt(str);
			
			//ClassNotFound
//			Class clazz = Class.forName("java.lang.String2");
			//java.lang.String2에 넣어달라
			//forname(경로)에 대한 정보를 넣얻ㄹ라
			
//		}catch(ClassNotFoundException e) {//위에서 발생할거 같은 예외 ; e<<위에 발생한 예외 구문을 변수에 대입
//			//Exception이 부모클래스여서 Exception으로 입력하면 발생하는 모든 예외를 대신 받아줄 수 있는 변수가 된다.
//			System.out.println(e.getMessage());//어떤 오류인지에 대한 메시지
//			System.out.println(e.toString());
//			e.printStackTrace();//어떤 이유로 오류가 발생했는지 알려주는 구문.
//			System.out.println("클래스를 찾지 못해서 나는 오류입니다.");
//		}
		
		try {
//			double avg = 1/0;
//			System.out.println(avg);
			
//			String str = "자바";
//			int a = Integer.parseInt(str);
			
			int[] intAry = new int[7];
			intAry[7]=6;

			Class clazz = Class.forName("java.lang.string2");
					
		}catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나누기 못함");
		}catch(NumberFormatException e) {
			System.out.println("문자열 변환 에러!");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못함!");
		}catch(Exception e) {
			 System.out.println("위에서 처리 못하면 내가 함!");
		} finally {
			System.out.println("finally 항상 실행");
		}
		System.out.println("try-catch탈출");
	}
}
