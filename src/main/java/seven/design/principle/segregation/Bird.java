package seven.design.principle.segregation;

public class Bird implements IAnimal {
    public void eat() {

    }

    public void fly() {

    }

    public void swim() {
        // 此时，鸟根本就不能泳！，如果用一个统一的接口的话

    }
}
