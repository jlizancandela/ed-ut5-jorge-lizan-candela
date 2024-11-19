package practica4;

public class CuentaCorrienteApp {
    public static void main(String[] args) {
        // Crear dos objetos de tipo CuentaCorriente con diferentes titulares
        CuentaCorriente cuenta1, cuenta2;

        cuenta1 = new CuentaCorriente("219865B", "Pedro Jiménez");
        cuenta2 = new CuentaCorriente("218542N", "María López");

        // Realizar ingresos en cada cuenta
        cuenta1.ingreso(600);
        cuenta2.ingreso(300);

        // Mostrar información de las cuentas
        System.out.println(cuenta1.informacion());
        System.out.println(cuenta2.informacion());

        // Intentar retirar dinero de las cuentas y mostrar mensaje de éxito o fracaso

        System.out.println(
                cuenta1.retiro(400)
                        ? "Se ha realizado la retirada exitosamente"
                        : "No se ha podido realizar la retirada, no hay saldo suficiente"
        );

        System.out.println(
                cuenta2.retiro(400)
                        ? "Se ha realizado la retirada exitosamente"
                        : "No se ha podido realizar la retirada, no hay saldo suficiente"
        );

    }
}
