import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hE = 0,mE = 0,hS = 0,mS = 0;
        feeCount FC=new feeCount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert hour-IN");
        while(true){
            if(!scanner.hasNextInt()){
                System.out.println("Incorrect Input");
                scanner.next();
            }else {
                hE= scanner.nextInt();
                if(hE<=23 && hE>=0){
            break;
                }else {
                    System.out.println("Incorrect hour");
                    scanner.next();
                }
            }
        }
        System.out.println("Insert minute-IN");
        while(true){
            if(!scanner.hasNextInt()){
                System.out.println("Incorrect Input");
                scanner.next();
            }else {
                mE= scanner.nextInt();
                if(mE<=59 && mE>=0){
                    break;
                }else {
                    System.out.println("Incorrect minute");
                    scanner.next();
                }
            }
        }

        System.out.println(hE+"h:"+mE+"m\n"+hS+"h:"+mS+"m");
        System.out.println(FC.calcAll(hE,mE,23,59));
    }
}