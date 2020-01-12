/*
Author: Megan Zhang
PID: 730237266
I pledge the UNC and COMP290 Honor Code.
*/

// Create a class called Jrep that is defined inside the comp290 package
package comp290;

import java.util.Scanner;
import java.lang.*;

public class Jrep {
    
    // Main method    
    public static void main(String[] args) {
    
        // Edge Cases    
        if (args.length != 1 || args[0].equals("--help")) {
            System.out.println("Usage: jrep [PATTERN]");
            System.exit(1);
        }
        
        // Use Cases
        Scanner scan1 = new Scanner(System.in);
        
        while (scan1.hasNextLine()) {
            String line = scan1.nextLine();

            Scanner scan2 = new Scanner(line);    
            
            while (scan2.hasNext()) {
                if (scan2.next().equals(args[0])) {
                    System.out.println(line);
                    break;
                }
            }
        }
    }
}
