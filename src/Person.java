public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn(String somethingForLearning) {
        System.out.println("I'm learning to " + somethingForLearning);
    }

    public void walk(String place) {
        System.out.println("I'm walk to " + place);
    }

    public void eat(String food) {
        System.out.println("I'm eating a " + food);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", designation='" + designation + '\'' + '}';
    }
}
