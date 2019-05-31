package com.biz.if_than;

public class If_05 {

	public static void main(String[] args) {
	
		// 1부터 100까지 숫자 주에서 6의 배수만 보고싶다.
		
			for(int i = 0; i < 100 ; i++) {
		
				if(i % 6 == 0) {
				System.out.println(i + "는 6의 배수입니다.");				
				// i를 6으로 나누었을 때 나머지가 0인수
				// 6의 배수
				
				// for 반복문을 중단한다.
					break;
				
			}
		}
		
	}

}
