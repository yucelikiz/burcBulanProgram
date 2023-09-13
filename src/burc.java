import java.util.Scanner;
public class burc {
    public static void main(String[] args) {

        //Değişkenler
        int day, month;
        String burc="";
        Boolean isError = false;

        //Scanner nesnesi
        Scanner inpt= new Scanner(System.in);

        //Gün ve ay bilgisini al
        System.out.print("Doğum ayınızı sayı olarak giriniz: ");
        month = inpt.nextInt();

        System.out.print("Doğum gününüzü giriniz: ");
        day = inpt.nextInt();

        //Burç hesapla
        if (month==1 && (day>=1 && day<=31)){
                if (day<22){
                    burc = "Oğlak";
                }else {
                    burc = "Kova";
                }
        } else if (month==2 &&(day>=1 && day<=29)) {
            if (day<20){
                burc = "Kova";
            }else {
                burc = "Balık";
            }
        } else if (month==3 &&(day>=1 && day<=31)) {
            if (day < 21) {
                burc = "Balık";
            } else {
                burc = "Koç";
            }
        } else if (month==4 &&(day>=1 && day<=30)) {
            if (day < 21) {
                burc = "Koç";
            } else {
                burc = "Boğa";
            }
        } else if (month==5 &&(day>=1 && day<=31)) {
            if (day < 22) {
                burc = "Boğa";
            } else {
                burc = "İkizler";
            }
        } else if (month==6 &&(day>=1 && day<=30)) {
            if (day < 23) {
                burc = "İkizler";
            } else {
                burc = "Yengeç";
            }
        } else if (month==7 &&(day>=1 && day<=31)) {
            if (day < 23) {
                burc = "Yengeç";
            } else {
                burc = "Aslan";
            }
        } else if (month==8 &&(day>=1 && day<=31)) {
            if (day < 23) {
                burc = "Aslan";
            } else {
                burc = "Başak";
            }
        } else if (month==9 &&(day>=1 && day<=30)) {
            if (day < 23) {
                burc = "Başak";
            } else {
                burc = "Terazi";
            }
        } else if (month==10 &&(day>=1 && day<=31)) {
            if (day < 23) {
                burc = "Terazi";
            } else {
                burc = "Akrep";
            }
        } else if (month==11 &&(day>=1 && day<=30)) {
            if (day < 22) {
                burc = "Akrep";
            } else {
                burc = "Yay";
            }
        } else if (month==12 &&(day>=1 && day<=31)) {
            if (day < 22) {
                burc = "Yay";
            } else {
                burc = "Oğlak";
            }
        }
        //Yanlış bir tarih girilirse
        else {
            isError=true;
            System.out.print("Yanlış bir tarih girdiniz!");
        }
        //Tarih doğru girilirse
        if (!isError)
            System.out.print("Burcunuz : " + burc);
    }
}