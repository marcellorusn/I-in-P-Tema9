public class Testare {
    public static void main(String[] args) {
        Joc joc1 = new Joc("Shakhtar Donetsk", "Dynamo Kyiv");
        joc1.simuleaza(); 
        System.out.println("    Prima Simulare    ");
        System.out.println(joc1);

        Joc joc2 = new Joc("Real Madrid", "Barcelona");
        joc2.simuleaza();
        System.out.println("    A doua Simulare    ");
        System.out.println(joc2);
    }
}