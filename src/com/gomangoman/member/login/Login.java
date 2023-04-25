package com.gomangoman.member.login;


import java.util.Scanner;

import com.gomangoman.member.dto.SupervisorDTO;

public class Login {
	
	Scanner sc = new Scanner(System.in);
	
	SupervisorDTO suspervisor = new SupervisorDTO();
	
	
	public void login () {
      
		int count = 0;
		label :
    
		while(count>=5) {
		System.out.print("아이디를 입력주세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요 : ");
		String pwd = sc.nextLine();
		
		if(id.equals(suspervisor.getId())&&pwd.equals(suspervisor.getPwd())) {
			System.out.println("로그인에 성공했습니다.");
		}else
			System.out.print("로그인에 실패했습니다 다시 입력하시겠습니까? Y/N");
			char c = sc.next().charAt(0);
			sc.nextLine();
			for (int i = 0; i < 5; i++) {
				System.out.println(i + 1 + "번 실패하였습니다. 5번 틀릴시 프로그램이 종료됩니다.");
			}
			count++;
			if(c == 'y' || c == 'Y') {
				break;
			}else {
				break label;
			}
				
			
			
	}
     
	
	
	}
		
	

}
      






