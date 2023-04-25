package com.gomangoman.main;

import java.util.Scanner;

import com.gomangoman.buy.Visitor;
import com.gomangoman.inventory.InventoryManager;
import com.gomangoman.member.login.Login;

public class StartMenu {
	
	Scanner sc = new Scanner(System.in);
	Login log = new Login();
	InventoryManager im = new InventoryManager();
	Visitor vis = new Visitor();

	public StartMenu() {}
	
	public void mainMenu() {
		
		System.out.println("안녕하세요 고구마편의점 키오스크입니다.");
		
		menu:
		while(true) {
			
			System.out.println("1. 점장");
			System.out.println("2. 손님");
			System.out.println("3. 나가기");
			System.out.print("메뉴를 선택해주세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
				case 1 : log.login(); /*im.menu();*/break;
				case 2 : /*vis.guest();*/ break;
				case 3 : System.out.print("나가시겠습니까? (Y/N) : ");
				char ch = sc.next().charAt(0);
				if(ch == 'y' || ch == 'Y') {
					System.out.println("안녕히 가십시오."); break menu;
				} else {
					break;
				}
				default : System.out.println("잘못된 접근입니다. 다시 입력해주세요");
				System.out.println(); break;
			}
		}
	}

}
