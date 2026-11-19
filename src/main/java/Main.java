public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = Usuario.builder()
                .id(1L)
                .nombre("Valentina Sosa")
                .email("valentina.sosa@example.com")
                .build();

        Usuario usuario2 = Usuario.builder()
                .id(2L)
                .nombre("Lucas Pereyra")
                .build();

        System.out.println("=== Usuario 1 ===");
        System.out.println(usuario1);

        System.out.println("\n=== Usuario 2 ===");
        System.out.println(usuario2);

        System.out.println("\nEmail de Usuario 1: " + usuario1.getEmail());
    }
}