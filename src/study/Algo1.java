package study;

import java.util.ArrayList;
import java.util.Scanner;

public class Algo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}

		System.out.print("Hello ");

		for (int i = 0; i < list.size(); i++) {

			if (i == list.size() - 1) {
				System.out.print(list.get(i) + ".");
			} else {
				System.out.print(list.get(i) + ",");
			}
		}
	}

	// public static String resolve(String str){
	// return
	// }
}
