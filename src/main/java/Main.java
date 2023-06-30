/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args ){

        System.out.println("Hello users! Please enter your names: ");
        Scanner in = new Scanner(System.in);
        String username = in.nextLine();
        String alice = "alice";
        String bob = "bob";

        if (alice.equals(username)) {
            System.out.println("Hello alice, welcome back!");
        }
        if (alice.equals(username)) {
            System.out.println("Hello bob, welcome back!");
        }



    }
}
