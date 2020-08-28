package Onboarding;

import java.util.Scanner;

public class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // character input
        char stat = ' ';

        // game loop
        while (stat != 'q') {
        	System.out.println("Enter the name of enemy 1");
            String enemy1 = in.next(); // name of enemy 1
            System.out.println("Enter the distance to enemy 1");
            int dist1 = in.nextInt(); // distance to enemy 1
            System.out.println("Enter the name of enemy 2");
            String enemy2 = in.next(); // name of enemy 2
            System.out.println("Enter the distance to enemy 2");
            int dist2 = in.nextInt(); // distance to enemy 2

            // Action

            if (dist1 < dist2) {
                System.out.println(enemy1);
            } else {
                System.out.println(enemy2);
            }
            
            System.out.println("Press c to continue, or press q to quit");
            
            stat = in.next().charAt(0);
        }
        
        in.close();
    }
}