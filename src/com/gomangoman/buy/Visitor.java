package com.gomangoman.buy;

import java.util.List;
import java.util.Scanner;

import com.gomangoman.inventory.InventoryManager;
import com.gomangoman.inventory.ProductDTO;
import com.gomangoman.member.dto.GuestDTO;

public class Visitor {

	Scanner sc = new Scanner(System.in);
	GuestDTO gu = null;
	InventoryManager im = new InventoryManager();
	List<ProductDTO> plist = InventoryManager.plist;
	
	public Visitor() {}
	
	public void guest() {
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("전화번호 뒷자리를 입력해주세요 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("현재 보유 금액을 알려주세요 : ");
		int money = sc.nextInt();
		sc.nextLine();
		
		gu = new Gu
		
		menu();		
	}
	
	public void menu() {
		
		menu:
		while(true) {
			
			System.out.println("1. 상품 구매하기");
			System.out.println("2. 구매한 상품 환불하기");
			System.out.println("3. 내 정보 조회하기");
			System.out.println("4. 나가기");
			
			System.out.print("원하시는 메뉴를 선택해주세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
				case 1 : buyProduct(); break;
				case 2 : 
				case 3 : 
				case 4 : System.out.print("나가시겠습니까? (Y/N) : ");
							char ch = sc.next().charAt(0);
							sc.nextLine();
							if(ch == 'y' || ch == 'Y') {
								System.out.println("안녕히 가세용~");
								break menu;
							} else {
								break;
							}
				default : System.out.println("잘못된 접근입니다. 다시 시도해주세요!"); break;	
			}
		}
		
	}
	
	public void buyProduct() {
		
		buy:
		while(true) {
			
			im.printlist();
			
			System.out.print("구매를 원하시는 메뉴 명을 입력해주세요 : ");
			String menu = sc.nextLine();
			for(int i = 0; i < plist.size(); i++) {
				
				if(!plist.get(i).getName().equals(menu)) {
					System.out.println("원하시는 메뉴는 저희 편의점에 없습니다.");
					System.out.println("죄송합니다 :) ");
					break buy;
				}
				
				System.out.println(plist.get(i).getPrice() + "원 입니다.");
				System.out.print("구매하시겠습니까? (Y/N) : ");
				char ch = sc.next().charAt(0);
				sc.nextLine();
				
				if(ch == 'Y' || ch == 'y') {
					System.out.print("구매를 원하시는 수량을 입력해주세요 : ");
					int num = sc.nextInt();
					sc.nextLine();
					
					if(plist.get(i).getAmount() < num) {
						System.out.println("수량이 부족합니다. 죄송합니다 :) ");
					}
					
					System.out.println(plist.get(i).getPrice() * num + "원 입니다.");
					System.out.print("구매하시겠습니까? (Y/N) : ");
					
					char ch1 = sc.next().charAt(0);
					sc.nextLine();
					
					if(ch1 == 'y' || ch1 == 'Y') {
						
						if(plist.get(i).getPrice() * num > gu.getMoney()) {
							System.out.println("죄송합니다. 잔액부족이에요 :) ");
						}
						
						System.out.println("성공적으로 구매하셨어요!");
						gu.setMoney(gu.getMoney() - plist.get(i).getPrice() * num);
						gu.setPoint(gu.getPoint() + plist.get(i).getPrice() * num * 0.1);
						plist.get(i).setAmount(plist.get(i).getAmount() - num);
						
						break buy;
						
					} else {
						break buy;
					}
				} else {
					break buy;
				}
			}
		}
		
	}

}
