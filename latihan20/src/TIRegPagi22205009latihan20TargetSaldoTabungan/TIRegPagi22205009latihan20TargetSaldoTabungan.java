/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIRegPagi22205009latihan20TargetSaldoTabungan;
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Axioo
 * NAMA     : Asmalik Hudri
 * Prodi    : Teknik Informatika
 * NIM      : 22205009
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * target saldo tabungan
 * 
 */
public class TIRegPagi22205009latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bulan = 0;
        
        Locale locale = new Locale("id","ID");
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
        symbols.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("Rp, #,###,###",symbols);
        
        System.out.print("Saldo Awal: Rp.");
        int saldoAwal = scanner.nextInt();

        System.out.print("Bunga/Bulan (%): ");
        int bungaPerBulan = scanner.nextInt();

        System.out.print("saldo target: Rp.");
        int saldoTarget = scanner.nextInt();

        while (saldoAwal < saldoTarget) {
            bulan++;
            int bunga = saldoAwal * bungaPerBulan / 100 ;
            saldoAwal += bunga;
            System.out.println("Saldo di bulan ke-" + bulan + "= " + formatter.format(saldoAwal));
            
        }
    }
}


