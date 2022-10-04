public class ModifyDog {


    public static void main(String args[]) {
        Dog Dachschund  = new Dog();

        Dachschund.setGender("male");
        Dachschund.setAge(1);
        Dachschund.setName("Sharo");

        System.out.println(Dachschund.getGender());
        System.out.println(Dachschund.getAge());
        System.out.println(Dachschund.getName());
    }
}