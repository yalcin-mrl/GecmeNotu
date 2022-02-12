import java.util.Scanner;
public class not {
    public static void main(String[] args){
        int gecmeNotu = 55,mat,fizik,turkce,kimya,muzik,n = 0,top=0;
        float ort;
        Scanner sc = new Scanner(System.in);
        System.out.println("Matemetik notu: ");
        mat = sc.nextInt();
        System.out.println("fizik notu: ");
        fizik = sc.nextInt();
        System.out.println("turkce notu: ");
        turkce = sc.nextInt();
        System.out.println("kimya notu: ");
        kimya = sc.nextInt();
        System.out.println("muzik notu: ");
        muzik = sc.nextInt();
        if(mat >=0 && mat<=100){
            top+=mat;
            n++;
        }

        if(fizik >=0 && fizik<=100) {
            top += fizik;
            n++;
        }
        if(turkce >=0 && turkce<=100) {
            top+=turkce;
            n++;
        }

        if(kimya >=0 && kimya<=100) {
            top+=kimya;
            n++;
        }
        if(muzik >=0 && muzik<=100) {
            top+=muzik;
            n++;
        }
        ort = (float)top/n;
        if(ort>=gecmeNotu){
            System.out.println(ort+" ile Gectiniz.");
        }else{
            System.out.println(ort + "Kaldiniz.");
        }
    }
}
