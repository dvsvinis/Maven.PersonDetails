package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;

        while (counter < personArray.length) {
            result += (personArray[counter].toString());
            counter++;
        }

        return result;
    }



    public String forLoop() {
        String result = "";

        for (int i=0; i < personArray.length; i++) {
            result += (personArray[i].toString());
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";

        for (Person each : personArray) {
            result += each.toString();
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
