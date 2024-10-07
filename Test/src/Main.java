//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int teklik = a%10;
//        System.out.println(teklik);
//
//    }
//}

//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int a =scanner.nextInt();
//        int evvelkicuteded;
//        if(a%2==0){
//            evvelkicuteded= a-2;
//        }else{
//            evvelkicuteded = a-1;
//        }
//        System.out.println(evvelkicuteded);
//    }
//}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eded daxil edin: ");
        int a = scanner.nextInt();
        int b = a / 10;
        int c = a % 10;
        System.out.println(b + " " + c);

        if((a>0) && (a<100)){
            int onluq = b;
            switch (onluq) {
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("iyirmi");
                    break;
                case 3:
                    System.out.println("otuz");
                    break;
                case 4:
                    System.out.println("qirx");
                    break;
                case 5:
                    System.out.println("elli");
                    break;
                case 6:
                    System.out.println("altmis");
                    break;
                case 7:
                    System.out.println("yetmis");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("dogsan");
                    break;

            }

            int teklik = c;
            switch (teklik) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dord");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yeddi");
                    break;
                case 8:
                    System.out.println("sekkiz");
                    break;
                case 9:
                    System.out.println("doqquz");
                    break;




            }


        }else {
            System.out.println("duzgun reqemi daxil edin");
        }


    }
}

