package seven.design.principle.segregation;

public class Dog implements IAnimal {
    public void eat() {

    }

    public void fly() {
        // 此时，狗根本就不能飞！，如果用一个统一的接口的话

    }

    public void swim() {

    }
}
