package logica;

public class Flower extends Plant{
    private String petalColor;
    private int numberOfPetals;
    private String bloomingSeason;

    public Flower() {
    }

    public Flower(String name, double stemHeight, boolean hasLeaf, String climate,
                  String petalColor, int numberOfPetals, String bloomingSeason) {
        super(name, stemHeight, hasLeaf, climate);
        this.petalColor = petalColor;
        this.numberOfPetals = numberOfPetals;
        this.bloomingSeason = bloomingSeason;
    }

    public String getPetalColor() {
        return petalColor;
    }

    public void setPetalColor(String petalColor) {
        this.petalColor = petalColor;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    public String getBloomingSeason() {
        return bloomingSeason;
    }

    public void setBloomingSeason(String bloomingSeason) {
        this.bloomingSeason = bloomingSeason;
    }

    @Override
    public void plantType() {
        System.out.println("Hello! I am a Flower!");
    }
}
