/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobs7;

/**
 *
 * @Created Azzahra21343004
 */
import java.util.Scanner;
public class TugasDo_while {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int i = 0;
        System.out.print("Masukan nama lengkap: ");
        String nama = in.nextLine();     
        do{
            System.out.println("Azzahra Putri");
            i++;
            
        }
     while(i < 10);
    }
}
