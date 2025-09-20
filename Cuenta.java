public class Cuenta {
    private String idcuenta;
    private String nombre;
    private double saldo;

    // Constructor por defecto (explícito)
    public Cuenta() {
        this.idcuenta = "";
        this.nombre = "";
        this.saldo = 0.0;
    }

    // Constructor con parámetros (solo idcuenta y nombre)
    public Cuenta(String idcuenta, String nombre) {
        this.idcuenta = idcuenta;
        this.nombre = nombre;
        this.saldo = 0.0; // Saldo inicial por defecto
    }

    // Constructor con todos los parámetros (opcional)
    public Cuenta(String idcuenta, String nombre, double saldo) {
        this.idcuenta = idcuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // Métodos getter y setter
    public String getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(String idcuenta) {
        this.idcuenta = idcuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos para operaciones de cuenta
    public void ingresarMonto(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Monto ingresado: $" + monto);
        } else {
            System.out.println("Error: Monto no válido.");
        }
    }

    public void retirarMonto(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Monto retirado: $" + monto);
        } else {
            System.out.println("Error: Fondos insuficientes.");
        }
    }
}
