package builder;

public class VegBurguer extends Burguer {
    
    @Override
    public float price(){
        return 25.0f;
    }
    
    @Override
    public String name(){
        return "veg Burguer";
    }
}
