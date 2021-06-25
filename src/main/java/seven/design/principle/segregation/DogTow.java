package seven.design.principle.segregation;

/**
 * @desc 我是狗的升级版，我现在不统一实现动物类，接口，我只是实行我需要的行为接口即接口隔离原则,我只要我的行为
 */
public class DogTow implements IEatAnimal, ISwimAnimal {
    public void eat() {

    }

    public void siwm() {

    }
}
