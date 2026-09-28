public class Main {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor(
                "Nicole Sanchez",
                1000.00,
                new ComisionPersonalizada()        );

        vendedor.mostrarDetalle();
    }
}