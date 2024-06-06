public class HamburguesaSimple extends  Hamburgesa {
    protected Medallon medallon;
    protected   Ingredientes ingredientes;

    public HamburguesaSimple(int precioBase) {
        super(precioBase);
    }


    public void  ponerMedallon (Medallon medallon){
        this.medallon = medallon;

    }
    public void ponerIngrediente (Ingredientes ingrediente){
        this.ingredientes = ingrediente;

    }



    protected int calcularPrecioSimple(){
return   this.precioBase + this.ingredientes.getPrecioIngrendientes() + this.medallon.getPrecioPorMedallon();


    }










}


