import java.util.Scanner;
import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;
import javax.swing.event.*;

public class Main{
    public static void main(String[] args) {
        // JFrame window = new JFrame("Terraria Game");
        // window.setSize(1000, 1000); 
        // window.getContentPane().setLayout(null);
        // ImageIcon icon = new ImageIcon("912b92ae7dbedd0344a6580a7b90efc6.png");
        // window.setIconImage(icon.getImage());
        // window.setVisible(true);   

        //Selecting Class-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        String gameClass="";

        for (int timeOut = 0; timeOut < 500000000 && !gameClass.equals("q"); timeOut++){
            System.out.println("Welcome to the Terraria Game, in this game, you will make choices to advance your character!");
            game();
            gameClass = sc.nextLine();   
            System.out.println("Are you sure? If not, enter q");

        }        
    }
    public static String game(){
        Scanner sc = new Scanner(System.in);
        String choice = "";
        //Stats------------------------------------------------------------------------------------------------------------------------------------------------------------------
        int HP = 100;
        int damage = 5;

        //Inventory-----------------------------------------------------------------------------------------------------------------------------------------------------------------
        int trees = 0;
        
        System.out.println("The game is starting! Beat the Moon Lord!");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("You have just spawned in the world, what do you want to do?");
        System.out.println("a - cut down some trees!");
        System.out.println("b - go explore the world!");
        System.out.println("c - go in a cave");

        choice = sc.nextLine();
        if (choice == "a"){
            trees=Integer.parseInt(trees());
        } else if (choice == "b"){

        } else if (choice == "c"){

        } else {
        }
        return"";
    }
    public static String trees(){
        Scanner sc = new Scanner(System.in);
        int treeAns = 0;
        int wood =0;
        System.out.println("How many trees do you want to cut down? (Enter using numberpad)");
        String tree = sc.nextLine();
        treeAns = Integer.parseInt(tree);
        for (int i =0; i< treeAns; i++){
            wood += (int)(Math.random()*7);
        }
        System.out.println("You now have " + wood + " wood!");
        return(Integer.toString(wood));
    }
}
