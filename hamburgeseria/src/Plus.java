public class Plus extends Hamburgesa{
protected  Medallon medallonplus;
protected Medallon medallonplus2;
protected  Medallon medallonplus3;
protected Ingredientes ingredientesplus1;
protected  Ingredientes ingredientesplus2;
protected  Ingredientes ingredientesplus3;



public void ponerMedallon1(Medallon medallonplus){
    this.medallonplus = medallonplus;

}

public  void ponerMedallon2 (Medallon medallonplus2){
this.medallonplus2 = medallonplus2;



}

public  void ponerMedallon3 ( Medallon medallonplus3){
    this.medallonplus3 = medallonplus3;
}


public  void ponerIngrediente1(Ingredientes ingredientesplus1 ){
    this.ingredientesplus1 = ingredientesplus1;

}


public  void  ponerIngrediente2(Ingredientes ingredientesplus2){
    this.ingredientesplus2 = ingredientesplus2;


}

public  void ponerIngredientes3(Ingredientes ingredientesplus3){
    this.ingredientesplus3 = ingredientesplus3;
}


    public Plus(int precioBase) {
        super(precioBase);

    }

    public int calcularPrecioPlus(){
     return  this.precioBase + this.medallonplus.getPrecioPorMedallon() + this.medallonplus2.getPrecioPorMedallon() + this.medallonplus3.getPrecioPorMedallon() + this.ingredientesplus1.getPrecioIngrendientes() + this.ingredientesplus2.getPrecioIngrendientes() + this.ingredientesplus3.getPrecioIngrendientes();
     }



}



