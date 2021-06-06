/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App app = new App();
        String people = app.readPeople();
        String pizzas = app.readPizzas();
        String slices = app.readSlices();
        int totalSlices = app.totalSlices(people, pizzas, slices);
        app.printOutput(totalSlices, people,pizzas);
    }

    private int totalSlices(String people, String pizzas, String slices) {
        int sliceInt = Integer.parseInt(slices);
        int pizzaInt = Integer.parseInt(pizzas);
        int totalSlices = sliceInt*pizzaInt;
        return totalSlices;

    }

    private void printOutput(int totalSlices, String people, String pizzas) {
        int peopleInt = Integer.parseInt(people);
        int slicesPerPerson = totalSlices/peopleInt;
        int leftovers = Math.abs((slicesPerPerson*peopleInt) - totalSlices);
        String message = String.format("%s people with %s pizzas (%s slices)", people, pizzas, totalSlices);
        String message2 = String.format("Each person gets %s pieces of pizza.",slicesPerPerson);
        String message3 = String.format("There are %s leftover pieces.",leftovers);
        String newline = System.lineSeparator();
        System.out.print(message +newline+ message2 +newline+ message3);

    }

    private String readPeople() {
        System.out.print("How many people? ");
        String people = in.nextLine();
        return people;
    }

    private String readPizzas() {
        System.out.print("How many pizzas do you have? ");
        String pizzas = in.nextLine();
        return pizzas;
    }

    private String readSlices() {
        System.out.print("How many slices per pizza? ");
        String slices = in.nextLine();
        return slices;
    }
}
