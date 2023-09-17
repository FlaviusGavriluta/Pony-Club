package org.example.model;

import org.example.enums.Direction;
import org.example.enums.PonyType;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Pony {
    private String name;
    private int experienceLevel;
    private Coordinate position;
    private PonyType ponyType;

    public Pony(String name, PonyType ponyType) {
        this.name = name;
        this.experienceLevel = 0;
        this.position = new Coordinate(new Random().nextInt(10), new Random().nextInt(10));
        this.ponyType = ponyType;
    }

    public void walk(Direction direction) {
        switch (direction) {
            case EAST -> setPosition(new Coordinate(position.x(), position.y() + 1));
            case WEST -> setPosition(new Coordinate(position.x(), position.y() - 1));
            case NORTH -> setPosition(new Coordinate(position.x() + 1, position.y()));
            case SOUTH -> setPosition(new Coordinate(position.x() - 1, position.y()));
        }
    }

    public void ability() {
        Scanner scanner = new Scanner(System.in);

        switch (ponyType) {
            case NORMAL -> System.out.println("A normal pony, no ability");
            case PEGASUS -> {
                setPosition(new Coordinate(scanner.nextInt(), scanner.nextInt()));
                System.out.println("Pegasus can fly!");
            }
            case UNICORN -> {
                setExperienceLevel(this.experienceLevel + 1);
                List<String> characters = List.of("*", "#", "&");
                setName(this.name + characters.get(new Random().nextInt(characters.size() - 1)));
                System.out.println("Unicorn can do magic!");
            }
            case SUPERPONY -> {
                setPosition(new Coordinate(scanner.nextInt(), scanner.nextInt()));
                System.out.println("Superpony can fly!");
                setExperienceLevel(this.experienceLevel + 1);
                List<String> characters = List.of("*", "#", "&");
                setName(this.name + characters.get(new Random().nextInt(characters.size() - 1)));
                System.out.println("Superpony can do magic!");
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    public PonyType getPonyType() {
        return ponyType;
    }

    public void setPonyType(PonyType ponyType) {
        this.ponyType = ponyType;
    }

    @Override
    public String toString() {
        return "Pony{" +
                "name='" + name + '\'' +
                ", experienceLevel=" + experienceLevel +
                ", position=" + position +
                ", ponyType=" + ponyType +
                '}';
    }
}
