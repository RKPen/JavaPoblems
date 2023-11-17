public class Football extends Ball implements Tossable {
    private String brandName;
    public Football(String brandName) {
        super(brandName);
        this.brandName = brandName;
    }
    public void toss(){
        System.out.println("Toss w ra22sni bennoss!");
    }
    public void bounce() {
        System.out.println("Toj w shoot!");
    }
    
    
}
