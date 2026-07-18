public class Pruebas {
    // Abstraccion, Herencia, Polimorfismo, Encapsulamiento
    public static void main(String[] args) {

        Perro p = new Perro("firulais", 5, 5.0, true, Perro.RazaPerro.GOLDEN);
        Gato gato = new Gato("Misifu",300,20.00,true, Gato.RazaGato.NARANJA);
        Perrito perrito = new Perrito("Firulais", 15,2, false, Perro.RazaPerro.LABRADOR, false);

        System.out.println(p + "\n");
        System.out.println(gato + "\n");
        System.out.println(perrito + "\n");


        p.sonido();
        gato.sonido();
        perrito.sonido();

        Animal p2 = new Perro("firulais", 5, 5.0, true, Perro.RazaPerro.GOLDEN);
        Animal gato2 = new Gato("Misifu",300,20.00,true, Gato.RazaGato.NARANJA);

        p2.sonido();
        gato2.sonido();

        Animal[] pez = {
                new Perro("Snoopy", 5, 18,true, Perro.RazaPerro.GOLDEN),
                new Gato("Garfield", 3, 100000,true, Gato.RazaGato.NARANJA),
                new Perrito("Scooby Doo", 11, 25,true,Perro.RazaPerro.LABRADOR, true)
        };

        System.out.println("Arreglo de animales");
        for(int i = 0; i < pez.length; i++){
            pez[i].sonido();
        }
    }
}

/**
 *
 * Animal
 * ├── Perro
 * │   └── Perrito
 * └── Gato
 *
 * **/