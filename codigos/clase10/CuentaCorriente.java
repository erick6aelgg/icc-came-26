//Cobra $20 de comision
public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public void retirar(double cantidad) {
        double comision = 20;
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
