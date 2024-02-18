public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding(String programmingLanguage) {
        System.out.println("I codding in " + programmingLanguage);
    }

    @Override
    public String toString() {
        return "Programmer{" + "companyName='" + companyName + '\'' + "} " + super.toString();
    }
}
