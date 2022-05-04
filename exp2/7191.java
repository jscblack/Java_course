
/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-15 20:59:00
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */

import java.util.Scanner;

class Product {
    String name;

    Product() {
        this.name = "default";
    }

    Product(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }
}

class Market {
    String name;
    Product[] goods;

    Market() {
        this.name = "default";
    }

    Market(String name, Product[] goods) {
        this.name = name;
        this.goods = goods;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    Product[] getGoods() {
        return this.goods;
    }

    void setGoods(Product[] goods1) {
        this.goods = goods1;
    }

    boolean sell(String p_name) {
        for (int i = 0; i < this.goods.length; i++) {
            if (p_name.equals(goods[i].getName())) {
                return true;
            }
        }
        return false;
    }

}

class Person {
    String name;

    Person() {
        this.name = "default";
    }

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    boolean shopping(Market market, Product product) {
        return market.sell(product.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Product dianshiji = new Product("电视机");
        Product xiyiji = new Product("洗衣机");
        Product doujiangji = new Product("豆浆机");
        Product dayinji = new Product("打印机");
        Market jialefu = new Market("家乐福", new Product[] { dayinji, xiyiji, doujiangji, dianshiji });
        Market shijilianhua = new Market("世纪联华", new Product[] { dayinji, xiyiji });
        Person xiaomin = new Person("小明");
        if (xiaomin.shopping(jialefu, dayinji)) {
            System.out.println(xiaomin.getName() + "买到了" + dayinji.getName());
        } else {
            System.out.println(xiaomin.getName() + "所需的商品无货");
        }
        if (xiaomin.shopping(shijilianhua, doujiangji)) {
            System.out.println(xiaomin.getName() + "买到了" + doujiangji.getName());
        } else {
            System.out.println(xiaomin.getName() + "所需的商品无货");
        }
    }
}