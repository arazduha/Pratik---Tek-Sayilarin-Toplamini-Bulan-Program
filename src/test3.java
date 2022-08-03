import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int i, tpl=0;

        do {
            System.out.print("Sayi giriniz: ");
            i = inp.nextInt();
            if ((i % 2 == 0)&&(i % 4 == 0)){
                tpl+= i;
            } else if (i % 2 == 1) {
                break;
            }

        }while (i > 0);
            System.out.println("toplam: "+tpl);

    }

}





