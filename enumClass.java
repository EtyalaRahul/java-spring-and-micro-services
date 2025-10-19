
enum Price{
    Macbook(1000), Surface(800), Thinkpad(700);
    private int price;
    Price(int p){
        price = p;
    }
    int getPrice(){
        return price;
    }
    public void setPrice(int p){
        price = p;
    }
}

public class enumClass{
    public static void main(String[] a){
        Price p = Price.Macbook;
        System.out.println(p.getPrice());   
        for(Price pr : Price.values()){
            System.out.println(pr + " costs " + pr.getPrice());
        }
        p.setPrice(1200);
        System.out.println(p.getPrice());
    }
}