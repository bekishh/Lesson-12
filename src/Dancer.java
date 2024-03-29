public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing(String dancing) {
        System.out.println("I dance the " + dancing);
    }

    @Override
    public String toString() {
        return "Dancer{" + "groupName='" + groupName + '\'' + "} " + super.toString();
    }
}
