package pl.gda.wsb;

import java.util.ArrayList;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Human Human1 = new Human();
        Human1.firstName = "Jacek";
        Human1.lastName = "Nowak";
        Human1.position = "Menager";
        Human1.age = 32;

        Human Human2 = new Human();
        Human2.firstName = "Mateusz";
        Human2.lastName = "Grochowalski";
        Human2.age = 33;

        Human Human3 = new Human();
        Human3.firstName = "Abraham";
        Human3.lastName = "Jankowski";
        Human3.age = 35;

        Animal Animal1 = new Animal();
        Animal1.type = "Tygrys";
        Animal1.name = "Reksio";
        Animal1.weight = 220;

        Animal Animal2 = new Animal();
        Animal2.type = "Myszoskoczek";
        Animal2.name = "Fado";
        Animal2.weight = 5;

        Phone Phone1 = new Phone();
        Phone1.producer = "apple";
        Phone1.model = "Iphone";


        Phone Phone2 = new Phone();
        Phone2.producer = "Samsung";
        Phone2.model = "S8";


        StringBuilder animalWeight = new StringBuilder("Reksio ktory wazy ");
        StringBuilder fadoWeight = new StringBuilder("ktorego waga wynosi  ");

        if(Animal1.weight>Animal2.weight){
            out.println(animalWeight.append(Animal1.weight )+" kg  wazy wiecej niz  Fado "+ fadoWeight.append(Animal2.weight)+" kg");
        } else{
            out.println("Fado który wazy " +Animal2.weight +" Jest Ciezszy od Tygrysa");}

            System.out.println("------------------------------------------------------");

        ArrayList<Human> humanList = new ArrayList();
        humanList.add(Human1);
        humanList.add(Human2);
        humanList.add(Human3);

        for(Human d :humanList )
            System.out.println(d.firstName+" "+(d.lastName)+" "+(d.age));






       /* System.out.println(Animal2.type);
        System.out.println(Animal2.name);
        System.out.println(Animal2.weight);

        System.out.println(Animal1.type);
        System.out.println(Animal1.name);
        System.out.println(Animal1.weight);

        System.out.println(Human1.firstName);
        System.out.println(Human1.age);
        System.out.println(Human1.lastName);


        System.out.println(Human2.firstName);
        System.out.println(Human2.age);
        System.out.println(Human2.lastName);
        */
    }
}
