package com.pluralsight.patternMatching;

public class PatternMatchingMain {

    public static void main(String[] args) {
        Record record = new Person("Sander");
//        Person record = new Person("Sander");
        // if we change the record type to Person -> compile time error.
        // the compilers sess that the instanceOf check will always be true

        if (record instanceof Person person && person.name().startsWith("S")) {
            System.out.println(person.name());
        }
        // here we can use && person.name().startsWith("S") because the compiler can see that
        // if the instanceOf check is true the person var is in scope
        // and if it is not the right expression will not be however evaluated

//        if (!(record instanceof Person person)) {
//            System.out.println(person.name());
//        }
        // this will not compile
        // the compiler knows that person var is no longer in scope
        // because if person is not instanceOf Person
        // then the check fail and person is not bound to anything inside the if.
        // but in the else branch we can use person var
        // there we can print the name of the person without any casting
        // and on the top branch we would need to print a default.
        // these binding variables in type patterns may not shadow any other local variable declarations.
//        Person person= null;
        // if we declare person as a local variable we can no longer use this person inside of the type pattern
        if (!(record instanceof Person person)) {
            System.out.println("Not a person.");
        } else {
            System.out.println(person.name());
        }



    }
}
