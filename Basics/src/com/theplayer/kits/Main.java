package com.theplayer.kits;

import java.util.Scanner;
import com.theplayer.kits.vo.LoginUser;

public class Main {

	private static Scanner sc;
	private static LoginUser[] users;
	
	static {// initialize block before Constructor
		sc = new Scanner(System.in);
		users = new LoginUser[ 10 ];
	}
	
	public static void main(String[] args) {
		int seq = 0;
		boolean exit = false;
		do {
			System.out.println(" cmd > ");
			String cmd = sc.nextLine();
			if ("exit".equals(cmd)) {
//				cmd.equalsIgnoreCase("exit");
				exit = true;
			}
			if ("join".equals(cmd)) {
				LoginUser user = join();
				if ( seq < users.length ) {	
					users[seq] = user;
					seq++;
				}
			}
			if ("login".equals(cmd)) {
				LoginUser user = login();
				if ( user == null ) {	
					System.out.println("Failed!");
				} else {
					System.out.println("Success login!");
				}
			}
			
		} while( !exit );
		
		sc.close();
	}

	private static LoginUser login() {
		LoginUser user = join();
		// search
		for (int i = 0; i < users.length; i++) {
			if ( users[i] != null) {
				if ( users[i].getUserId().equals(user.getUserId())) {
					if ( users[i].getUserPw().equals(user.getUserPw())) {
						return users[i];
					}
				}
			}
		}
		return null;
	}
	
	// null means empty
	// but 0 means not empty, -1, 999
	private static LoginUser join() {
		LoginUser user = new LoginUser();
		System.out.println(" ID : ");
		String id = sc.nextLine();
		System.out.println(" PW : ");
		String pw = sc.nextLine();
		
		user.setUserId(id);
		user.setUserPw(pw);
		return user;
	}

}
