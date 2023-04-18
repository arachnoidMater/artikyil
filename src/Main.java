import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input=new Scanner (System.in);
        System.out.print("Lütfen yılı giriniz:");
        year=input.nextInt();

        boolean artikYilMi=false;

        if(year%4==0 ){
            if (year%100==0 ) {
                if (year%400==0){
                    artikYilMi=true;
                }
            }else {
                artikYilMi=true;
            }
        }
        if (artikYilMi){
            System.out.println(year+ " Artık bir yıldır.");
        }else {
            System.out.println(year+ " Artık bir yıl değildir.");
        }
        }
    }
