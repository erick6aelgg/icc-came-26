public class CuentaPrueba {
    public static void main(String[] args) {
        CuentaBancaria ahorro = new CuentaAhorro("3240110224","Leon",10000);
        CuentaBancaria corriente = new CuentaCorriente("420102320", "Fer", 10000);

        ahorro.retirar(500);

        System.out.println();

        corriente.retirar(500);
    }
}
