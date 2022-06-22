/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5_no18;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Lat_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a;
        Scanner input = new Scanner (System.in);
        
        //untuk input bilangan maksimalnya
        System.out.print("Masukan bilangan maksimalnnya = ");
        a = input.nextInt();
        
        //untuk mencari bilangan ganjil dari bilangan maksimal yang diinputkan pada sebelumnya

        for(int i=1; i <=a; i+= 2 ) 
        {
            System.out.print(i + " ");
        }
    }
}
