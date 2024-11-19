package practica4;

public class CalendarioApp {
    public static void main(String[] args) {
        // Declaración de tres objetos Calendario
        Calendario fecha1, fecha2, fecha3;

        // Inicialización de los objetos con fechas específicas
        fecha1 = new Calendario(2024, 1, 1);  // 1 de enero de 2024
        fecha2 = new Calendario(2022, 11, 30); // 30 de noviembre de 2022
        fecha3 = new Calendario(2030, 13, 21); // Fecha inválida: mes 13 no existe

        // Incrementamos el año, el mes y el día de fecha2
        fecha2.incrementarAnyo(1);  // Incrementa el año en 1 (pasará a 2023)
        fecha2.incrementarMes();    // Incrementa el mes, será diciembre (12)
        fecha2.incrementarDia();    // Incrementa el día, será 1 de diciembre de 2022

        // Muestra las tres fechas
        fecha1.mostrar();  // Muestra la fecha1 (01/01/2024)
        fecha2.mostrar();  // Muestra la fecha2 después de incrementos (01/12/2022)
        fecha3.mostrar();  // Muestra la fecha3 (13/21/2030), que es inválida y debería mostrarse como 01/01/1

        // Compara fecha1 con fecha2 y muestra si son iguales o no
        System.out.println(
                fecha1.iguales(fecha2)
                        ? "Las fechas son iguales"   // Si las fechas son iguales, muestra esto
                        : "Las fechas no son iguales" // Si no lo son, muestra esto
        );

        // Compara fecha1 con fecha3 y muestra si son iguales o no
        System.out.println(
                fecha1.iguales(fecha3)
                        ? "Las fechas son iguales"   // Si las fechas son iguales, muestra esto
                        : "Las fechas no son iguales" // Si no lo son, muestra esto
        );
    }
}
