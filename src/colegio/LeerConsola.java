package colegio;

import java.util.*;

public class LeerConsola {
	
	public static int nextInt(){
		Scanner teclado = new Scanner(System.in);
		int i = teclado.nextInt();
		return i;
	}
	public static String nextString() {
		Scanner teclado = new Scanner(System.in);
		String s = teclado.nextLine();
		return s;
	}
	
}
