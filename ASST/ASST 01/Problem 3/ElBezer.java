public  class ElBezer extends HabbitMakhlouta {

    public ElBezer(String name, int price , String Source) {
        super(name, price);
        this.Source = Source;
    }

    private String Source;

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    @Override
    public void consume() {
        System.out.println("Tef2ayeh");
    }
    

}