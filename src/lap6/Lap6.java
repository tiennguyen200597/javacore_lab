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
public class Lap6 {
    
   Scanner sc = new Scanner(System.in);
   String name[] = new String [4];
   String color[] = new String [4];
   int price[] = new int[4];
   public String readString(String tittle){
       Scanner sc = new Scanner(System.in);
       System.out.println("moi nhap"+tittle);
       String tittel = sc.nextLine();
       return tittel;
             
    }
   
    public int readInt(String tittle){
        int so;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen");
        so = Integer.parseInt(sc.nextLine());
        return so;
    }
    
    public void inputTable(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <name.length; i++) {
            System.out.println("nhap"+(i+1));
            name[i] = readString("ho ten:");
     //       System.out.println("nhap mau"+color);
            color[i] = readString("mau sac:");
            System.out.println("nhap gia:"+price);
            price[i] = Integer.parseInt(sc.nextLine());
        }
    }
    public void outputTable(){
        System.out.println("ho ten: \t mau sac: \t gia ca: ");
        for (int i = 0; i <price.length; i++) {
            System.out.println(name[i]+"\t"+color[i]+"\t"+price[i]);
        }
    }
    public double getAvgPrice(){
        double tb = 0;
        for (int i = 0; i < price.length; i++) {
           tb = tb + price[i];
        }
        return tb;
    }
    
    
}
