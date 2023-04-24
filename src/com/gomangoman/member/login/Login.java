package com.gomangoman.member.login;

import java.util.Scanner;

import com.gomangoman.member.dto.SupervisorDTO;

public class Login {
	
	Scanner sc = new Scanner(System.in);
	
	SupervisorDTO suspervisor = new SupervisorDTO();
	
	
	public void login () {
      lable :
	while(true) {
		System.out.println("아이디를 입력주세요 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요 : ");
		String pwd = sc.nextLine();
		
		if(id.equals(suspervisor.getId())) {
			if(pwd.equals(suspervisor.getPwd())) {
				System.out.println("로그인이 완료되었습니다.");
				break lable ;
			}else
				System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요.");
			
		}else
			System.out.println("아이디가 틀렸습니다. 다시 입력해주세요.");
		
	}
	}

}

