//使用继承思想实现动物类，以及猫科和犬科。
//定义Animal类
public class Animal {
//定义name属性
    String name;
    //定义动物叫的方法
    void shout (){
        System.out.println("Animals can make shout");
    }
    public static void main(String[] args) {
     //创建Animal类的对象animal
     Animal animal = new Animal();
        System.out.println(animal.toString());

    }
}
