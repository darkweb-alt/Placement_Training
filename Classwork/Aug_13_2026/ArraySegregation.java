package Aug_13_2026;

import java.util.*;

public class ArraySegregation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        int current = 0;
        int search = 0;

        for (search = 0; search < list.size(); search++) {
            if (list.get(search) % 10 != 0) {
                int temp = list.get(search);
                for (int itr = search; itr > current; itr--) {
                    list.set(itr, list.get(itr - 1));
                }
                list.set(current, temp);

            }

        }
        System.out.println(list);

    }
}