public class Main {
    public static void main(String[] args) {
        // Usando el constructor con parámetros (idcuenta y nombre)
        Cuenta cuenta1 = new Cuenta("C001", "Jesus Camacho Lopez");
        System.out.println("Cuenta creada: " + cuenta1.getNombre() + " (ID: " + cuenta1.getIdcuenta() + ")");
        System.out.println("Saldo inicial: $" + cuenta1.getSaldo());

        // Operaciones
        cuenta1.ingresarMonto(1000);
        cuenta1.retirarMonto(200);
        System.out.println("Saldo final: $" + cuenta1.getSaldo());
    }
}
