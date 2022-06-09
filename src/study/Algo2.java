package study;

import java.util.ArrayList;
import java.util.Scanner;

public class Algo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // x
        int b = sc.nextInt(); // y
        int R = sc.nextInt(); // 공사 현장 소음 크기
        int N = sc.nextInt(); // 나무 그늘의 수
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (((x - a) * (x - a)) + ((y - b) * (y - b)) > R * R) {
                list.add("silent");
            } else {
                list.add("noisy");
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
