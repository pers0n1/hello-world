import java.util.Scanner;

public class Bol {
    public static void main(String[] args) {
        int twixPrice = 77;
        int marsPrice = 78;
        int snikersPrice = 100;
        int water = 50;

        boolean isCanBuy = false;


        System.out.println("Введите колличество денег: ");
        int moneyAmount = new Scanner(System.in).nextInt();

        if (moneyAmount >= twixPrice) {
            System.out.println("Tvix!");
            isCanBuy = true;
            if (moneyAmount % 3 == 0) {
                System.out.println("Goodlike!");
            }
        }
        if (moneyAmount >= marsPrice) {
            System.out.println("Mars!");
            isCanBuy = true;
        }
        if (moneyAmount >= snikersPrice) {
            System.out.println("Snikers!");
            isCanBuy = true;
        }
        if (moneyAmount >= water) {
            System.out.println("Aqua!");
            isCanBuy = true;
        }

        if (isCanBuy == false) {
            System.out.println("No money, no foods!");
        }


    }
}
