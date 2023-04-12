package logica;

public abstract class Plant {
    protected String name;
    protected double stemHeight;
    protected boolean hasLeaf;
    protected String climate;

    public Plant() {
    }

    public Plant(String name, double stemHeight, boolean hasLeaf, String climate) {
        this.name = name;
        this.stemHeight = stemHeight;
        this.hasLeaf = hasLeaf;
        this.climate = climate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStemHeight() {
        return stemHeight;
    }

    public void setStemHeight(double stemHeight) {
        this.stemHeight = stemHeight;
    }

    public boolean isHasLeaf() {
        return hasLeaf;
    }

    public void setHasLeaf(boolean hasLeaf) {
        this.hasLeaf = hasLeaf;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    protected abstract void plantType ();
}
