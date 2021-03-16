package problema4;

public class Main {

    public static void main(String[] args) {
        Paralelogram paralelogram = new Paralelogram(16, 5, 10);
        Romb romb = new Romb(33, 15, 20);
        Dreptunghi dreptunghi = new Dreptunghi(20, 17);
        Patrat patrat = new Patrat(22);

        System.out.println(paralelogram.area());
        System.out.println(romb.area());
        System.out.println(dreptunghi.area());
        System.out.println(patrat.area());
    }

}
