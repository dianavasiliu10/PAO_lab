package problema2;

class Persoana {

    private String nume;
    private String prenume;
    private int varsta;
    private long CNP;
    private enum gen {M, F}
    private gen sex;

    public static void main(String[] args) {
        Persoana persoana = new Persoana();
        System.out.println(persoana);

        persoana.setNume("Popescu");
        persoana.setPrenume("Ion");
        persoana.setCNP(1000203789231L);
        persoana.setVarsta(21);
        persoana.setSex(gen.M);

        System.out.println(persoana);

        Persoana persoana2 = new Persoana("Rusu", "Maria", 30, 2910107226443L, gen.F);

        System.out.println("Nume si prenume: " +
                persoana2.getNume() + " " +
                persoana2.getPrenume());
        System.out.println("CNP: " + persoana2.getCNP());
        System.out.println("varsta: " + persoana2.getVarsta());
        System.out.println("Sex: " + persoana2.getSex());

        Persoana persoana3 = new Persoana();
        persoana3.setNume("Rusu");
        persoana3.setPrenume("Maria");
        persoana3.setCNP(2910107226443L);
        persoana3.setVarsta(30);
        persoana3.setSex(gen.F);

        System.out.println();
        System.out.println("problema2.Persoana 1 are aceleasi date ca persoana 2? " + persoana.equals(persoana2));
        System.out.println("problema2.Persoana 2 are aceleasi date ca persoana 3? " + persoana2.equals(persoana3));

        System.out.println();
        System.out.println("HashCode persoana 1: " + persoana.hashCode());
        System.out.println("HashCode persoana 2: " + persoana2.hashCode());
        System.out.println("HashCode persoana 3: " + persoana3.hashCode());
        System.out.println("Hash persoana 2 == Hash persoana 3? " + (persoana2.hashCode() == persoana3.hashCode()));
    }

    public Persoana(String n, String p, int v, long nr, gen g) {
        nume = n;
        prenume = p;
        varsta = v;
        CNP = nr;
        sex = g;
    }

    public Persoana() {
        this("Noname", "Noname", 0, 0, gen.M);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public long getCNP() {
        return CNP;
    }

    public void setCNP(long CNP) {
        this.CNP = CNP;
    }

    public gen getSex() {
        return sex;
    }

    public void setSex(gen sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "problema2.Persoana:\n\t" +
                "nume = " + nume + "\n\t" +
                "prenume = " + prenume + "\n\t" +
                "varsta = " + varsta + "\n\t" +
                "CNP = " + CNP + "\n\t" +
                "sex = " + sex;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Persoana) {
            Persoana pers = (Persoana) obj;
            return nume.equals(pers.nume) &&
                    prenume.equals(pers.prenume) &&
                    varsta == pers.varsta &&
                    CNP == pers.CNP &&
                    sex == pers.sex;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        char[] fullName = (nume + prenume).toCharArray();
        int sum = 0;
        for (char c : fullName) {
            sum += c;
        }
        return sum;
    }
}
