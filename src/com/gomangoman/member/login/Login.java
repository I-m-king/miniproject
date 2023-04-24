package com.gomangoman.member.login;

import java.util.Scanner;

import com.gomangoman.member.dto.SupervisorDTO;

public class Login {
	
	Scanner sc = new Scanner(System.in);
	
	SupervisorDTO suspervisor = new SupervisorDTO();
	
	
	public void login () {
      label :
	while(true) {
		System.out.println("아이디를 입력주세요 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요 : ");
		String pwd = sc.nextLine();
		
		if(id.equals(suspervisor.getId())) {
			if(pwd.equals(suspervisor.getPwd())) {
				System.out.print("로그인이 완료되었습니다.");
				break label ;
			}else
				System.out.print("비밀번호가 틀렸습니다. 다시 입력해주세요. 다시 입력하시겠습니까 ? Y/N ");
				char c = sc.next().charAt(0);
				if (c =='Y' || c == 'y') {
					break;
				}else {
			    break label;
				}
					
		}else
			System.out.print("아이디가 틀렸습니다. 다시 입력하시겠습니까 ? Y/N.");
			char c2 = sc.next().charAt(0);
			if (c2 =='Y' || c2 == 'y') {
				break;
			}else {
		    break label;
			}
		
		
	}
	}

}


