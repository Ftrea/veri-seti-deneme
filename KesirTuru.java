package kesirturu;
import java.util.Scanner;
public class KesirTuru {
    public static void main(String[] args) {
 Scanner klavye=new Scanner (System.in);
        System.out.print("Pay ve Payda değerini aralarında bir boşluk olacak şekilde tam sayı olarak yan yana giriniz:");
int pay=klavye.nextInt();
int payda=klavye.nextInt();
double kesir = 0;

        if (pay == -payda) {
            System.err.println("Tam Sayı Girdiniz!");
            return;   
        
        }
        if (!(pay==payda)) {
            if (pay < 0 || payda < 0) {
            System.err.println("Negatif sayılarda tanımlı değil!");
            return;
        }
        }
        

        if(payda!=0)
        {
            kesir=pay/payda;
        }
        if(pay<payda)
        {
            System.err.println("Basit Kesir Girdiniz!");
        }
        /*else if(pay==payda || pay==-payda)
    {
    System.err.println("Tam Sayı Girdiniz!");
    }*/
    else if(payda==0)
    {
        System.err.println("Tanımsız!");
    }
    else
{
    int i=pay/payda;
    int j=pay%payda;
    if(j==0)
    {
        System.err.println("Tam Sayı Girdiniz!");
        System.out.println("Kesir Değeri = "+i);
    }
    else
    {
    System.err.println("Bileşik Kesir Girdiniz!");
    System.out.println("Kesir Değeri = "+i+" tam "+j+ "/" +payda);
    }
}
        
    }
}