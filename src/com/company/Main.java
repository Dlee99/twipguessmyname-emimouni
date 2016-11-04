package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String names[] = {"Noah","Olivia","Liam","Emma","Ava","Sophia","Isabella","Mason","Mia","Michael","Elijah","Jacob","Ethan","James","Aiden","Benjamin","William","Lucas","Alexander","Mathew","Daniel","Abigail","Jayden","Logan","Sebastian","Carter","Charlotte","Anthony","Emily","Joseph","Amelia","Oliver","Jackson","Madison","Gabriel","Harper","Christopher","David","Andrew","Luke","Joshua","John","Sofia","Dylan","Jaxon","Isaiah","Julian","Elizabeth","Grayson","Samuel"};
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char ch[] = alphabet.toCharArray();

        Scanner kb = new Scanner(System.in);
        System.out.println("Pick a name from the list below:");
        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        String usersName = kb.next();
        int counter = 0;
        String response;
        int guess=13;
        int min= 0;
        int max = 25;
        boolean b = true;
        while (counter<7){
            counter++;
            System.out.println("Does your name start with the letter " + ch[(guess-1)] + "?");
            response=kb.next();
            switch (response){
                case"Yes":
                    b=true;
                    break;
                case"CloserToA":
                    max=guess;
                    guess=Math.round(min+((guess-min)/2));
                    b=false;
                    break;
                case"CloserToZ":

                    min=guess;
                    guess=Math.round((max-min)/2)+min;
                    b=false;
                    break;
            }
            if (b==true){
                System.out.println("Yay, I guessed the first letter of your name within 6 guesses");
                break;
            }

        }
    }
}
