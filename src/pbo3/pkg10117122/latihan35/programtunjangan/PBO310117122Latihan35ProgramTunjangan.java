/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan35.programtunjangan;

/**
 *
 * @author lenovo
 * NAMA  : Bonaventura Aldino Senda Seni
 * KELAS : IF-3
 * NIM   : 10117122
 * Deskripsi Program : User memasukan nama, status menikah dan gaji perbulannya.
 *                     menampilkan gaji pokok, tunjangan, dan total gaji.
 */
public class PBO310117122Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===========Program Tunjangan===========");
        
        Biodata output1 = new Biodata();
        output1.Profile();
        
        Salary output2 =  new Salary();
        System.out.println("Gaji Pokok : Rp " + output2.Salary()); 
        System.out.println("Tunjangan  : Rp " + output2.Subsidy());
        System.out.println("Total Gaji : Rp " + output2.calSal());
        System.out.println();
        System.out.println("(Developed by : Bonaventura Aldino Senda Seni)");
        
    }
    
}
