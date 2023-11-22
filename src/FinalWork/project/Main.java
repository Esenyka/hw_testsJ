package FinalWork.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый список без пробелов через запятую: ");
        String nums1 = in.nextLine();

        System.out.println("Введите второй список без пробелов через запятую: ");
        String nums2 = in.nextLine();

        WorkList wl1 = new WorkList(nums1);
        WorkList wl2 = new WorkList(nums2);

        ListsCommunication lc = new ListsCommunication(wl1, wl2);
        System.out.println(lc.makeComparison());
    }
}
