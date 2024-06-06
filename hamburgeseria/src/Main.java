import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // precio por medallon
        Medallon vegetariano = new Medallon(1200);
Medallon pollo = new Medallon(1200);
Medallon carne = new Medallon(2000);
// precio por ingredientes
        Ingredientes lechuga = new Ingredientes(200);
        Ingredientes tomate = new Ingredientes(350);
        Ingredientes huevo = new Ingredientes(100);



        // crear primera hamburguesa
        HamburguesaSimple hamburguesaSimple = new HamburguesaSimple(1000);
hamburguesaSimple.setPrecioBase(1000);
hamburguesaSimple.ponerMedallon(carne);
hamburguesaSimple.ponerIngrediente(huevo);
// calculaar precio
int prrecio1 = hamburguesaSimple.calcularPrecioSimple();
System.out.println("EL PRECIO DE LLA PRIMERAA HAMBURRGUESSA ES DE " + prrecio1 );




//creaar hamburguesa ddoblle
        Doble hamburguessaadoble = new Doble(1000);
        hamburguessaadoble.ponerMedallon1(pollo);
        hamburguessaadoble.ponerMedallon2(pollo);
        hamburguessaadoble.ponerIngredientes(tomate);
        hamburguessaadoble.ponerIngrediente2(lechuga);
       int prrecio2 = hamburguessaadoble.calcularPreciodoble();
       System.out.println("el precio es de hamburguesa doble es de  " + prrecio2);


       // crear hambburguesa plus

        Plus hamburguessaPlus = new Plus(1000);
        hamburguessaPlus.ponerMedallon1(vegetariano);
hamburguessaPlus.ponerMedallon2(carne);
hamburguessaPlus.ponerMedallon3(pollo);
hamburguessaPlus.ponerIngrediente1(huevo);
hamburguessaPlus.ponerIngrediente2(tomate);
hamburguessaPlus.ponerIngredientes3(huevo);

int precio3 = hamburguessaPlus.calcularPrecioPlus();
System.out.println("el precio de la hammburguesa plus ess de " + precio3);


// hamburgguessa flex

        Hamburguesaflex HMF = new  Hamburguesaflex(1100);

        HMF.poneerrMedalllon(carne);
        HMF.ponerInggreddiente(huevo);
 int precio32 = HMF.calcularFlex();
        System.out.println(precio32);




    }

}