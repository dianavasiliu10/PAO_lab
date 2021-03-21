package validator;

public class Main {

    public static void main(String[] args) {
        PersonValidator validator = new PersonValidator();

        Person p1 = new Person("Maria", "Chitu", "0723456789", 26);
        Person p2 = new Person("maria", "Chitu", "0723456789", 26); // litera mica la prenume
        Person p3 = new Person("Maria", "", "0723456789", 26);      // fara nume
        Person p4 = new Person("Maria", "Chitu", "0323456789", 26); // numar de telefon gresit
        Person p5 = new Person("Maria", "Chitu", "07234589", 26);  // numar de telefon prea scurt
        Person p6 = new Person("Maria", "Chitu", "0723456789", 14); // varsta prea mica

        Person[] persons = new Person[] {p1, p2, p3, p4, p5, p6};

        for (Person person : persons) {
            validator.validate(person);
        }

        System.out.println();
        System.out.println("Error message");

        for (Person person : persons) {
            String message = validator.validateWithErrorMessages(person);
            System.out.println(message + " for " + person);
        }
    }

}
