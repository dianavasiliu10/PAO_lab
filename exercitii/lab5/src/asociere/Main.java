package asociere;

public class Main {

    public static void main(String[] args) {
        Profesor[] profesoriCTI = {
                new Profesor(1, "Ionescu"),
                new Profesor(2, "Popescu"),
                new Profesor(3, "Pop")
        };

        Profesor[] profesoriMateInfo = {
                new Profesor(1, "Adam"),
                new Profesor(2, "Petru"),
                new Profesor(3, "Popa")
        };

        Departament departamentCTI = new Departament("CTI", profesoriCTI);
        Departament departamentMateInfo = new Departament("Mate-Info", profesoriMateInfo);

        Universitate unibuc = new Universitate("Unibuc", new Departament[] {departamentCTI, departamentMateInfo});

        System.out.println(unibuc);

    }

}
