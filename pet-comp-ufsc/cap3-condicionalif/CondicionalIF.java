public class CondicionalIF {
    public static void main(String... args) {
        if (true) {
            System.out.println("Entrou no if");
        }
        System.out.println("Após o if");

        var x = 10;
        var y = 20;

        if (x < y) {
            System.out.println("x é menor que y");
        }
    }

}
