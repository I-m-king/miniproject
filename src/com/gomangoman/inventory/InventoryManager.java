package com.gomangoman.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryManager {
	
	public static List<ProductDTO> plist = new ArrayList<>();

	public void menu() {
		// 점장이 로그인을 정상적으로 완료한 후 띄워줄 화면~
		
				System.out.println("반갑습니다 점장님.");
				Scanner sc = new Scanner(System.in);
				
				label:
				while(true) {
					System.out.println("1. 재고 추가");
					System.out.println("2. 재고 확인");
					System.out.println("3. 나가기");
					System.out.print("입력 : ");
					int sw = sc.nextInt();
					switch(sw) {
						case 1 : inputProduct();
							
							break;
						case 2 : printlist();
							
							break;
						case 3 : 
							System.out.println("정말로 나가시겠습니까? y/n");
							char y = sc.next().charAt(0);
							if(y == 'Y' || y == 'y') {
								break label;
							} else {
								break;
							}
							
						default : System.out.println("잘못입력함.");
							break ;
						  	
					}
					
					
				}
				
	}
	
	public void inputProduct() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("수량 : ");
		int amount = sc.nextInt();
		ProductDTO pr = new ProductDTO(name, amount, price);
		
		plist.add(pr);
	}
	
	public void printlist() {
		
		for(int i = 0; i < plist.size(); i++) {
			
			if(plist.get(i) != null) {
				System.out.println((i + 1) + " : " +plist.get(i));
				
			}
		}
	}
	
}
