package logica;

public class Bush extends Plant{

    private double bushWidth;
    private boolean isDomestic;
    private boolean canPrune;
    private String leafColor;

    public Bush() {
    }

    public Bush(String name, double stemHeight, boolean hasLeaf, String climate,
                double bushWidth, boolean isDomestic, boolean canPrune, String leafColor) {
        super(name, stemHeight, hasLeaf, climate);
        this.bushWidth = bushWidth;
        this.isDomestic = isDomestic;
        this.canPrune = canPrune;
        this.leafColor = leafColor;
    }

    public double getBushWidth() {
        return bushWidth;
    }

    public void setBushWidth(double bushWidth) {
        this.bushWidth = bushWidth;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public boolean isCanPrune() {
        return canPrune;
    }

    public void setCanPrune(boolean canPrune) {
        this.canPrune = canPrune;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    @Override
    public void plantType() {
        System.out.println("Hello! I am a Bush!");
    }
}
