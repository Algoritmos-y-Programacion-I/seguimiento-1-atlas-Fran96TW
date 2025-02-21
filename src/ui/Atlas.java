package ui;

import java.util.Scanner;

public class Atlas {

    public static void main(String[] args) {
        personalInfo();
    }

    public static void personalInfo(){

        String name;
        int Age;
        int Identification;
        String City;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello User, ¿Can you please identify your self?");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        Age = scanner.nextInt();
        System.out.print("Identification: ");
        Identification = scanner.nextInt();
        System.out.print("¿To what city you are going to?: ");
        City = scanner.nextLine();
        
        scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Age: " + Age);
        System.out.println("DNI: " + Identification);
        System.out.println("City:" + City);
        System.out.print("We want to certify that your information is correct, it is? ");
        String tc = scanner.nextLine();

        if (tc.equalsIgnoreCase("Yes")) {
            nights(scanner, name);
        } else if (tc.equalsIgnoreCase("No") ){
            System.out.println("Can you pls put your info correct");
            personalInfo();
        }

        scanner.close(); // Close the Scanner
    }

    public static void nights(Scanner scanner, String name){
        int night;

        System.out.print(name + " ¿How many nights you are gonna to stay?(Remember that you have to stay minimum one night): ");
        night = scanner.nextInt();

        if (night < 1){
            System.out.println("You can´t stay less than one night");
            nights(scanner, name);
        }else if (night <= 4){

        }else{
            System.out.println("You can´t be more than 4 nights");
            nights(scanner, name);
        }


    }

    public static int nightCalc(int night) {
        int nightsCost = night*150000;

        return nightsCost;
    }

    public static int planeCost(){
        int costPlane = 500000;

        return costPlane;
    }

    public static int total(int costPlane, int nightsCost){
        int totalp = costPlane + nightsCost;

        return totalp;
    }

    public static void displayInvoice(int night, int totalp) {
        // Display invoice decorated in Eventos Atlas theme
        System.out.println("\n*******************************************\n" +
                "*** Eventos Atlas - Factura de Venta ***\n" +
                "*******************************************\n" +
                "Noches vendidas ...................... " + night + "\n" +
                "Total Alojamiento .................... $" + nightCalc(night) + "\n" +
                "Total Transporte .................... $" + planeCost() + "\n" +
                "*******************************************\n" +
                "Total a Pagar ....................... $" + totalp + "\n" +
                "*******************************************\n" +
                "¡Gracias por preferirnos! Eventos Atlas\n" +
                "*******************************************\n");
    }



}
