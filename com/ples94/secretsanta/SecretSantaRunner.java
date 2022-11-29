package com.ples94.secretsanta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SecretSantaRunner {
    public static void main(String[] args) {
//      List<String> list = Arrays.asList("Monika", "Ola", "Paweł", "Bogusia", "Ania", "Szymon", "Bartek", "Natka", "Piotrek");
        List<String> list = Arrays.asList("Monika", "Ola", "Paweł", "Piotr", "Marek", "Patrycja", "Beata", "Marcin", "Łukasz", "Irenka");

        System.out.println(list);

        List<String> newList = new ArrayList<>(list);
        Collections.shuffle(newList);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(newList.get(i))) {
                Collections.shuffle(newList);
                i = 0;
            }
        }

        System.out.println(newList);
    }
}
