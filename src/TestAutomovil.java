public class TestAutomovil {
    public static void main(String[] args) {
        System.out.println("=== CONSTANTE DE LA CLASE ===");
        System.out.println("Año del primer automóvil registrado en la historia: " + Automovil.ANIO_PRIMER_AUTOMOVIL);
        System.out.println("--------------------------------------------------\n");
        Automovil coche= new Automovil("Peugeot","Type 2",1850);

        System.out.println("=== PRUEBA DE AÑO INVÁLIDO (1850) ===");
        Automovil autoInvalido = new Automovil("Benz", "Patent-Motorwagen", 1850);

        System.out.println("\n=== PRUEBA CON DATOS VÁLIDOS ===");
        // 3. Crear un automóvil con datos correctos
        Automovil autoValido = new Automovil("Ford", "Mustang", 1969);
        autoValido.mostrarInformacion();

        // Intentar modificar el año mediante el setter a un valor incorrecto (ej. 1700
        System.out.println("\nIntentando actualizar el año a 1700 (inválido):");
        autoValido.setAnio(1700);

        // Actualizar a un año correcto (ej. 2024)
        System.out.println("Intentando actualizar el año a 2024 (válido):");
        autoValido.setAnio(2024);

        // Mostrar estado final usando toString()
        System.out.println("\nEstado final del objeto:");
        System.out.println(autoValido);
    }
}