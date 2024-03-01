public class Gravitacija{
    public static void main(String[] args) {
        System.out.println("OIS je zakon! Predmet je v redu");
        Izpis(0.0);
        Izpis(10.0);
        Izpis(100.0);
        Izpis(100000.0);
    }
    
    public static double izracunGravitacije(double visina){
        double C = 6.674e-11;
        double M = 5.972e24;
        double r = 6.371e6;
        return (C * M) / Math.pow(r + visina, 2.0);
    }

    public static void Izpis(double visina){
        System.out.printf("Gravitacijski pospesek na %2.f km nadmorske višine je %2.f m/s^2\n", visina, izracunGravitacije(visina * 1000));
    }
}