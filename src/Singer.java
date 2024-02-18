public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }


    public void sing(String music) {
        System.out.println("I sing the " + music);
    }

    public void playGuitar(String melody) {
        System.out.println("I play the " + melody + " on the guitar");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                "} " + super.toString();
    }
}
