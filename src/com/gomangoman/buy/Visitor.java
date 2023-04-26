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
		
		gu = new GuestDTO(name, number, money);
		
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
				case 3 : gu.toString();
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
			
			System.out.print("구매를 원하시는 메뉴 번호를 입력해주세요 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(plist.get(menu - 1) == null) {
				System.out.println("지금 입력하신 번호에 맞는 메뉴가 없습니다.");
				break buy;
			}
			
			System.out.print("구매를 원하시는 물품의 수량을 입력해주세요 : ");
			int amount = sc.nextInt();
			sc.nextLine();
			
			if(plist.get(menu - 1).getAmount() < amount) {
				System.out.println("현재 재고가 없어서 주문이 불가능합니다.");
				break buy;
			}
			
			if(plist.get(menu - 1).getPrice() * amount > gu.getMoney()) {
				System.out.println("잔액이 부족하여 구매를 진행할 수 없습니다.");
				break buy;
			}
			gu.setPoint(plist.get(menu - 1).getPrice() * amount * 0.1 + gu.getPoint());
			gu.setMoney(gu.getMoney() - plist.get(menu - 1).getPrice() * amount);
			plist.get(menu - 1).setAmount(plist.get(menu -1).getAmount() - amount);
			System.out.println("성공적으로 구매하셨습니다!");
			System.out.println("포인트가 10% 적립 되었습니다! \n현재 포인트는" + gu.getPoint() + " 포인트 입니다!");
			break buy;
			
			
		}
		
	}

}
