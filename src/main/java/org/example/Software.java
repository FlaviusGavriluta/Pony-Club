package org.example;

import org.example.model.Coordinate;
import org.example.model.Pony;
import org.example.model.User;

import java.util.*;
import java.util.stream.Collectors;

public class Software {
    private List<User> users = new ArrayList<>();

    public void listAllPonies(Coordinate position) {
// Tema de casa

//        users.stream()
//                .map(user -> user.getPonies().stream()
//                        .filter(pony -> pony.getPosition().equals(position)))
//                .toList()
//                .forEach(System.out::println);
    }

    public void userWithHighestLevel() {
        Map<User, Integer> userHighestLevel = new HashMap<>();

        users.forEach(user -> {
            int levelExperience = user.getPonies().stream()
                    .mapToInt(Pony::getExperienceLevel)
                    .sum();
            userHighestLevel.put(user, levelExperience);
        });

        System.out.println(userHighestLevel.entrySet()
                .stream()
                .sorted(Map.Entry.<User, Integer>comparingByValue().reversed())
                .toList()
                .get(0)
                .getKey()
        );
    }

    public void addUser(User user) {
        users.add(user);
    }
}
