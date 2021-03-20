import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Test();
        Test.main();
    }
}

/**
 * Test
 */
class Test {

    public static void main() {
        Scanner rd=new Scanner(System.in);
        SpottedDog spd=new SpottedDog(rd.next(),rd.nextDouble(),rd.next(),rd.next());
        UnspottedDog uspd = new UnspottedDog(rd.next(), rd.nextDouble(), rd.next());
        
        spd.show();
        uspd.show();
        rd.close();
    }    
}

/**
 * Dog
 */
class Dog {
    String breed;
    double weight;
    String color;

    Dog(String bd,double wei,String cr) {
        this.breed=bd;
        this.weight=wei;
        this.color=cr;
    }

    void show() {
        System.out.printf("这是一只%s体重为%.0f,颜色为%s\n", this.breed, this.weight, this.color);
    }
}

/**
 * UnspottedDog
 */
class UnspottedDog extends Dog {
    
    UnspottedDog(String bd, double wei, String cr) {
        super(bd, wei, cr);
        // TODO Auto-generated constructor stub
    }

    void show() {
        System.out.printf("这是一只%s犬\n", this.breed);
    }
}


/**
 * SpottedDog
 */
class SpottedDog extends Dog{
    String spotColor;
    SpottedDog(String bd, double wei, String cr,String spot) {
        super(bd,wei,cr);
        this.spotColor=spot;
    }
    void show() {
        super.show();
        System.out.printf("这是一只%s,颜色为%s,斑点颜色为%s\n", this.breed, this.color, this.spotColor);
    }   
}