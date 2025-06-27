package Set_Interface;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Create a HashSet to store unique employee IDs
        HashSet set = new HashSet();
        
        int n = sc.nextInt();
        
        // TODO: Add n employee IDs to the HashSet
        for(int i = 0; i < n ; i++){
            set.add(sc.nextInt());
        }
        	
        sc.nextLine();
        
        // TODO: Perform operations until "STOP" is encountered
        while(true){
            String cmd = sc.nextLine();
            // Operations include ADD, REMOVE, CHECK, PRINT, and STOP
            if(cmd.equalsIgnoreCase("stop"))
                break;

            if(cmd.equalsIgnoreCase("print")){
                System.out.println(set);
                continue;
            }

            String[] input = cmd.split(" ");
            String op = input[0];
            int ele = Integer.parseInt(input[1]);

            
            if(op.equalsIgnoreCase("add")){
                set.add(ele);
                System.out.println(set);
            }
            else if(op.equalsIgnoreCase("remove")){
                set.remove(ele);
                System.out.println(set);
            }
            else if(op.equalsIgnoreCase("check")){
                if(set.contains(ele)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("Invalid input, Plaease try again");
            }

        }
        
        
        sc.close();
    }
}