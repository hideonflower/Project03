package view;

import java.util.*;

public class TSUtility {
	private static Scanner scanner = new Scanner(System.in);
	
	public static char readMenuSelection() {
		char c;
		for(;;) {
			String str = readKeyBoard(1, false); 
			c = str.charAt(0);
			if(c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.println("Wrong selection, please enter again: ");
			} else break;
		}
		return c;
	}
	
	public static void readReturn() {
		System.out.println("press enter to keep going...");
		readKeyBoard(100, true);
	}
	
	public static int readInt() {
		int n;
		for(;;) {
			String str = readKeyBoard(2, false);
			try {
				n = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e) {
				System.out.println("Number you entered is wrong, please enter again: ");
			}
		}
		return n;
	}
	
	public static char readConfirmSelection() {
		char c;
		for(;;) {
			String str = readKeyBoard(1, false).toUpperCase();
			c = str.charAt(0);
			if(c == 'Y' || c == 'N'){
				break;
			}else {
				System.out.println("Wrong selection, please enter again: ");
			}
		}
		return c;
	}
	
	private static String readKeyBoard(int limit, boolean blankReturn) {
		String line = "";
		while(scanner.hasNextLine()) {
			line  = scanner.nextLine();
			if(line.length() == 0) {
				if(blankReturn) return line;
				else continue;
			}
			
			if(line.length() < 1 || line.length() > limit) {
				System.out.println("imput length(no more than" + limit + ")error, please enter again: ");
				continue;
			}
			break;
		}
		return line;
	}
}
