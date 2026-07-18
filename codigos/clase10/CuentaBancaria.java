// Clase abstracta que representa una cuenta bancaria
public abstract class CuentaBancaria {

    //Encapsulamiento: atirbutos no se pueden modificar directamente en otras clases
    private final String numeroCuenta;
    private String titular;
    private double saldo;

    //Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Setters y Getters

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldoRecibido) {
        this.saldo = saldoRecibido;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Deposita dinero en la cuenta
    public void depositar(double cantidad){
        if(cantidad > 0){
            saldo = saldo + cantidad;

            System.out.println("Deposito realizado: $" + cantidad);
        }
        else{
            System.out.println("Ingresa una cantidad mayor a 0");
        }
    }

    // Cada tipo de cuenta decidira como retirar dinero
    public abstract void retirar(double cantidad);

    public void mostrarInformacion(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Numero Cuenta: " + numeroCuenta);
    }

}
