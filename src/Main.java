import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hE,mE,hS,mS;
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
        System.out.println("Insert hour-OUT");
        while(true){
            if(!scanner.hasNextInt()){
                System.out.println("Incorrect Input");
                scanner.next();
            }else {
                hS= scanner.nextInt();
                if(hS<=23 && hS>=0){
                    break;
                }else {
                    System.out.println("Incorrect hour");
                    scanner.next();
                }
            }
        }
        System.out.println("Insert minute-OUT");
        while(true){
            if(!scanner.hasNextInt()){
                System.out.println("Incorrect Input");
                scanner.next();
            }else {
                mS= scanner.nextInt();
                if(mS<=59 && mS>=0){
                    break;
                }else {
                    System.out.println("Incorrect minute");
                    scanner.next();
                }
            }
        }

        System.out.println("Entrance time "+hE+"h:"+mE+"m\nExit time "+hS+"h:"+mS+"m");
        System.out.println(FC.calcAll(hE,mE,hS,mS));
    }
}