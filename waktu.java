# selisihwaktu
package selisihwaktu;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Selisihwaktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Input = new Scanner (System.in);
        System.out.println("Menghitung selisih waktu");
        System.out.println ("syaratnya jam ke-2 harus lebih besar dari jam ke-1.");
       
        System.out.print("Jam 1 =");
        int j1 = Input.nextInt();
        System.out.print("Menit 1 =");
        int m1 = Input.nextInt();
        System.out.print("Detik 1 =");
        int d1 = Input.nextInt();
   
      
       
        System.out.print("Jam 2 =");
        int j2 = Input.nextInt();
        System.out.print("Menit 2 =");
        int m2 = Input.nextInt();
        System.out.print("Detik 2 =");
        int d2 = Input.nextInt();
   
   
    int j3, sisa, m3, d3;
    int waktu1, waktu2, selisih;

    waktu1 = (3600*j1)+(60*m1)+d1;
    waktu2 = (3600*j2)+(60*m2)+d2;
    selisih = waktu2-waktu1;
    j3 = selisih/3600;
    sisa = selisih%3600;
    m3 = sisa/60;
    d3 = sisa%60;

    System.out.println ("MENGHITUNG SELISIH WAKTU");
    System.out.println ("========================");
    System.out.println ("\nWaktu Pertama   = "+j1+":"+m1+":"+d1);
    System.out.println ("Waktu Kedua     = "+j2+":"+m2+":"+d2);
    System.out.println ("\nSelisih Waktu   = "+j3+":"+m3+":"+d3);
    }

    }
