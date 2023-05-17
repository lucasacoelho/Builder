package builder;

public class ChickenBurguer extends Burguer {
    
    @Override
    public float price(){
        return 50.5f;
    }
    
    @Override
    public String name() {
        return "chicken Burguer";
    }
}
