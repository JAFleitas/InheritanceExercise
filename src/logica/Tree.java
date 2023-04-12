package logica;

public class Tree extends Plant{
    private String trunkType;
    private String variety;
    private double trunkRadius;
    private String color;

    private String typeLeaf;

    public Tree() {
    }

    public Tree(String trunkType, String variety, double trunkRadius, String color, String typeLeaf) {
        this.trunkType = trunkType;
        this.variety = variety;
        this.trunkRadius = trunkRadius;
        this.color = color;
        this.typeLeaf = typeLeaf;
    }

    public Tree(String name, double stemHeight, boolean hasLeaf, String climate, String trunkType, String variety, double trunkRadius, String color, String typeLeaf) {
        super(name, stemHeight, hasLeaf, climate);
        this.trunkType = trunkType;
        this.variety = variety;
        this.trunkRadius = trunkRadius;
        this.color = color;
        this.typeLeaf = typeLeaf;
    }

    public String getTrunkType() {
        return trunkType;
    }

    public void setTrunkType(String trunkType) {
        this.trunkType = trunkType;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public double getTrunkRadius() {
        return trunkRadius;
    }

    public void setTrunkRadius(double trunkRadius) {
        this.trunkRadius = trunkRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeLeaf() {
        return typeLeaf;
    }

    public void setTypeLeaf(String typeLeaf) {
        this.typeLeaf = typeLeaf;
    }

    @Override
    public void plantType() {
        System.out.println("Hello! I am a Tree!");
    }
}
