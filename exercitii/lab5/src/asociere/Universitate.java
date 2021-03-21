package asociere;

import java.util.Arrays;

public class Universitate {

    private String name;
    private Departament[] departaments;     // relatie de compozitie

    public Universitate(String name, Departament[] departaments) {
        this.name = name;
//        this.departaments = departaments;
        this.departaments = Arrays.copyOf(departaments, departaments.length);   // pentru a crea departamentele imutabile
    }

    @Override
    public String toString() {
        return "Universitate{" +
                "name='" + name + '\'' +
                ", departaments=" + Arrays.toString(departaments) +
                '}';
    }
}
