import java.util.Scanner;

public class konversiMataUang {
  public static void main (String [] args) {
  
  double rupiah,dolar,ringgit,bath,pound,euro;
  
  Scanner input = new Scanner (System.in);
  
  System.out.print("Masukkan uang rupiah = ");
  rupiah = input.nextDouble();
  
  dolar = rupiah / 17000;
  ringgit = rupiah / 4500;
  bath = rupiah / 5500;
  pound = rupiah / 18500;
  euro = rupiah / 18000;
  
  System.out.print("Nilai Dolar ="+dolar);
  System.out.print("Nilai Ringgit ="+ringgit);
  System.out.print("Nilai Bath ="+bath);
  System.out.print("Nilai Pound ="+pound);
  System.out.print("Nilai Euro ="+euro);
  
  }
}