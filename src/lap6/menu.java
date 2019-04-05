/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

import java.util.Scanner;

/**
 *
 * @author Hai Yen
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lap6 ds = new Lap6();
        while (true){
            menu();
            Scanner sc = new Scanner(System.in);
            int chon;
            chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    System.out.println("nhap");
                    ds.inputTable();
                    
                break;
                case 2:
                    System.out.println("xuat");
                    ds.outputTable();
                break;
                case 3:
                    System.out.println("gia tb");
                    ds.getAvgPrice();
                    
                break;
                case 4 :
                    System.out.println("Thoát");
                    System.exit(0);
            default:
                    System.out.println("k chon qua 1 - 4");
            }
        
        }
    }

    public static void menu() {
        System.out.println("-----------------------");
        System.out.println("1 . nhap: ");
        System.out.println("2 . xuat: ");
        System.out.println("3 . gia tb: ");
        System.out.println("0 . Thoát: ");
        System.out.println("-----------------------");

    }
}
