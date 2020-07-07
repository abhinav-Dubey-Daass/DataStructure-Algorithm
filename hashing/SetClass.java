package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        Lottery.compareWinnings();
    }
}

class Lottery {
    public static Set<Integer> createUserNumbers() {
        Scanner scan = new Scanner(System.in);
        Set<Integer> userNumbers = new HashSet<>();
        System.out.println("Enter six Numbers separately");
        userNumbers.add(scan.nextInt());
        userNumbers.add(scan.nextInt());
        userNumbers.add(scan.nextInt());
        userNumbers.add(scan.nextInt());
        userNumbers.add(scan.nextInt());
        System.out.println(userNumbers);
        return userNumbers;
    }

    public static Set<Integer> createLotteryNumbers() {
        Set<Integer> lotteryNumbers = new HashSet<>();
        lotteryNumbers.add((int) (100 * Math.random()));
        lotteryNumbers.add((int) (100 * Math.random()));
        lotteryNumbers.add((int) (100 * Math.random()));
        lotteryNumbers.add((int) (100 * Math.random()));
        lotteryNumbers.add(5);
        System.out.println(lotteryNumbers);
        return lotteryNumbers;
    }

    public static void compareWinnings() {
        Set<Integer> userNumbers = createUserNumbers();
        Set<Integer> lotteryNumbers = createLotteryNumbers();

        userNumbers.retainAll(lotteryNumbers);
        System.out.println("Lottery number " + userNumbers);
        if (userNumbers.size() == 0)
            System.out.println("Sorry!You Lose");
        else if (userNumbers.size() == 1)
            System.out.println("Hurray! You won 1$");
        if (userNumbers.size() == 2)
            System.out.println("Hurray! You won 2$");
        else if (userNumbers.size() == 3)
            System.out.println("Hurray! You won 3$");


    }
}
