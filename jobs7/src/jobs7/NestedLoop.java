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
public class NestedLoop {
    public static void main(String[] args) {
        int baris, kolom, hasil_kali;
        int MAKS = 8;
        for (baris =1; baris <= MAKS; baris++){
            for(kolom = 1; kolom <= MAKS; kolom++)
            {
                hasil_kali = baris * kolom;
                System.out.print("\t" + hasil_kali);
            }
            System.out.println(" ");
        }
    }
    
}
