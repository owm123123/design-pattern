package org.example.creational.factory.abstractfactory;

/* 情境 : 兩個店家 分別都有硬幣 跟 卡片方式 */

// 定義「抽象產品」
interface Payment {
    void pay(String type, int amount);
}

interface CardPayment {
    void pay(String card, int amount);
}
// 定義「店家付款的實作」
class StoreA implements Payment{
    @Override
    public void pay(String type, int amount) {
        System.out.println("使用" + type + "支付 " + amount + " 元");
    }
}
class StoreACard implements CardPayment{
    @Override
    public void pay(String card, int amount) {
        System.out.println("使用" + card + "支付 " + amount + " 元");
    }
}

class StoreB implements Payment {
    @Override
    public void pay(String type, int amount) {
        System.out.println("使用" + type + "支付 " + amount + " 元");
    }
}
class StoreBCard implements CardPayment {
    @Override
    public void pay(String card, int amount) {
        System.out.println("使用" + card + "支付 " + amount + " 元");
        }
}

// 定義抽象工廠（Abstract Factory）
interface PaymentFactory {
    Payment createPayment();
    CardPayment createCardPayment();
}

// 實作具體工廠
//  1.storeA工廠
class StoreAFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new StoreA();
    }

    @Override
    public CardPayment createCardPayment() {
        return new StoreACard();
    }
}

//  2.storeB工廠
class StoreBFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new StoreB();
    }

    @Override
    public CardPayment createCardPayment() {
        return new StoreBCard();
    }
}

// 使用者端
class test {
    public static void main(String[] args) {
        // 1.使用StoreA工廠
        PaymentFactory storeAFactory = new StoreAFactory();
        Payment storeA = storeAFactory.createPayment();
        storeA.pay("現金", 1000);
        CardPayment storeACard = storeAFactory.createCardPayment();
        storeACard.pay("金融卡", 2000);

        // 2.使用StoreB工廠
        PaymentFactory storeBFactory = new StoreBFactory();
        Payment storeB = storeBFactory.createPayment();
        storeB.pay("現金", 3000);
        CardPayment storeBCard = storeBFactory.createCardPayment();
        storeBCard.pay("信用卡", 4000);
    }
}