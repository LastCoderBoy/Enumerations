package Enumerations;


import java.util.Scanner;

public class Enumerations{
    public static void main(String[] args){
        System.out.println("Let's start...");
        Scanner scanner = new Scanner(System.in);

        CarList car;
        System.out.print("Enter your lovely car name: ");
        car = CarList.valueOf(scanner.nextLine().toUpperCase());


        switch (car){
            case BMW -> System.out.println(car + " is beautiful");

            case TOYOTA -> {
                System.out.println(car + " is very fast");
            }
            case KIA -> {
                System.out.println(car + " is affordable");
            }
            case NISSAN -> {
                System.out.println(car + " sound is crazy");
            }
            case MERCEDES -> {
                System.out.println(car + " is very comfortable");
            }
        }
        System.out.println("\nEnum constants:");

        CarList carLists[] = CarList.values();
        for (CarList carList : carLists) {
            System.out.println(carList);
        }

        System.out.println("\n***** Down below is from Fruits Enum *****\n");
        for(int i=0; i<Fruits.values().length; i++){
            System.out.println(Fruits.values()[i] + " " + Fruits.values()[i].getPrice() + " cents");
        }
        for(Fruits fruits : Fruits.values()){
            System.out.println(fruits + " "+ fruits.ordinal());
        }

    }
}
