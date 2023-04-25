package com.gomangoman.member.login;

import java.util.Scanner;

import com.gomangoman.member.dto.SupervisorDTO;

public class Login {
	
	Scanner sc = new Scanner(System.in);
	
	SupervisorDTO suspervisor = new SupervisorDTO();
	
	
	public void login () {
      label :
    	  while(true) {
    		  System.out.print("아이디를 입력주세요 : ");
    		  String id = sc.nextLine();
    		  System.out.print("비밀번호를 입력해주세요 : ");
    		  String pwd = sc.nextLine();
		
    		  if(suspervisor.equals(id)&&suspervisor.equals(pwd)) {
    			  System.out.println("로그인에 성공했습니다.");
    		  }else
    			  System.out.print("로그인에 실패했습니다 다시 입력하시겠습니까? Y/N");
    		  char c = sc.next().charAt(0);
    		  if(c == 'y' || c == 'Y') {
    			  break;
    		  }else {
    			  break label;
    		  }
		if(id.equals(suspervisor.getId())&&pwd.equals(suspervisor.getPwd())) {
			System.out.println("로그인에 성공했습니다.");
		}else
			System.out.print("로그인에 실패했습니다 다시 입력하시겠습니까? Y/N");
			char c = sc.next().charAt(0);
			sc.nextLine();
			if(c == 'y' || c == 'Y') {
				break;
			}else {
				break label;
			}
				
			
    	  }
     
	
	}
}





