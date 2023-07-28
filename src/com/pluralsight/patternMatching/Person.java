package com.pluralsight.patternMatching;

public record Person(String name) {

    @Override
    public boolean equals(Object obj) {
//        before
//        return (obj instanceof Person) && ((Person) obj).name.equals(name);
//        pattern matching
        return obj instanceof Person person && person.name.equals(name);
    }
}
