public class Baseball extends Ball implements Tossable {
    private String brandName;
    public Baseball(String brandName) {
        super(brandName);
        this.brandName = brandName;
    }
    public void toss(){
        System.out.println("Throw me high and let me fly!");
    }
    public void bounce() {
        System.out.println("I bounce heavily compared to a Football");
    }
    
    
}
