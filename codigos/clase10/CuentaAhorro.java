//Cobra 2% de comision
public class CuentaAhorro extends CuentaBancaria {

    public CuentaAhorro(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public void retirar(double cantidad) {
        double comision = cantidad * 0.02;
        double total = cantidad + comision;

        if(cantidad <= 0){
            System.out.println("La cantidad debe ser mayor a 0");
        } else if ( total > getSaldo()){
            System.out.println("Saldo insuficiente");
        }  else {
            setSaldo(getSaldo() - total);

            System.out.println("Retiro: $" + total);
            System.out.println("Saldo restante: $" + getSaldo());
        }
    }

}
