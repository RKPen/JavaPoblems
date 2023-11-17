public  class ElFesto2 extends HabbitMakhlouta
{

    public ElFesto2(String name, int price , boolean Salted){
        super(name, price);
        this.Salted = Salted;
    }

    private boolean Salted;

    public void setSalted(boolean salted) {
        Salted = salted;
    }

    public boolean isSalted() {
        return Salted;
    }

    @Override
    public void consume() {
        System.out.println("Ma T2asherne");
    }
    

}