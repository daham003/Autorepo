public class Auto {
    private String name;
    private int ps;

    public Auto(String name, int ps) {
        this.name = name;
        this.ps = ps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public static void main(String[] args) {
        Auto auto1 = new Auto("Audi A1", 75);
        System.out.println(auto1.getName()+" "+auto1.getPs());

    }
}
