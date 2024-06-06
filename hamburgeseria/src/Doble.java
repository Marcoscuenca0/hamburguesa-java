public class Doble extends  Hamburgesa {
    protected Medallon medallon1;
    protected Medallon medallon2;

    protected Ingredientes ingredientes;

    protected   Ingredientes ingredientes2;


public  void  ponerMedallon1(Medallon medallon1){
    this.medallon1 = medallon1;


}

public void ponerMedallon2(Medallon medallon2){
    this.medallon2 = medallon2;

}
public  void ponerIngredientes(Ingredientes ingredientes){
    this.ingredientes = ingredientes;



}


public void ponerIngrediente2(Ingredientes ingredientes2){
    this.ingredientes2 = ingredientes2;
}

    public Doble(int precioBase) {
        super(precioBase);

    }

    public int calcularPreciodoble(){
    return this.precioBase + this.medallon1.getPrecioPorMedallon() + this.medallon2.getPrecioPorMedallon() + this.ingredientes.getPrecioIngrendientes() + this.ingredientes2.getPrecioIngrendientes();
    }
}
