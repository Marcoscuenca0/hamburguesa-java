import java.util.ArrayList;

public class Hamburguesaflex extends Plus {

    protected Ingredientes ingredientes1;
    protected Medallon medallon1;


    public Hamburguesaflex(int precioBase) {
        super(precioBase);
    }



    ArrayList<Ingredientes> ingrediente = new ArrayList<>();
    ArrayList<Medallon> medallonn = new ArrayList<>();
    public void ponerInggreddiente( Ingredientes Ingredientes1){
        ingrediente.add(ingredientes1);
        
    }
    public void poneerrMedalllon (Medallon medallon){
        medallonn.add(medallon1);


    }



    public  int calcularFlex(){
return this.medallon1.getPrecioPorMedallon() + this.ingredientes1.getPrecioIngrendientes();
    }
for(int  ){
//
//    }




}
