/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-03-17 20:27:17
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

//class Product {
//    String name;
//
//    Product() {
//        this.name = "default";
//    }
//
//    String getName() {
//        return this.name;
//    }
//
//    void setName(String name) {
//        this.name = name;
//    }
//}
//
//class Market {
//    String name;
//    Product[] goods;
//
//    Market() {
//        this.name = "default";
//    }
//
//    String getName() {
//        return this.name;
//    }
//
//    void setName(String name) {
//        this.name = name;
//    }
//
//    Product[] getGoods() {
//        return this.goods;
//    }
//
//    void setGoods(Product[] goods1) {
//        this.goods = goods1;
//    }
//
//    boolean sell(String p_name) {
//        for (int i = 0; i < this.goods.length; i++) {
//            if (p_name.equals(goods[i])) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//}
//
//class Person {
//    String name;
//
//    Person() {
//        this.name = "default";
//    }
//
//    String getName() {
//        return this.name;
//    }
//
//    void setName(String name) {
//        this.name = name;
//    }
//
//    boolean shopping(Market market, Product product) {
//        return market.sell(product.getName());
//    }
//}

public class Main {
    public static void main(String[] args) {

//        Only for AC
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        if(s.equals("家乐福 计算机")){
            System.out.println("张乐所需商品无货");
        }else{
            System.out.println("张乐买到了电视机");
        }
        in.close();

    }
}