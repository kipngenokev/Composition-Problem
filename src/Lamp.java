public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
    public void turOn(){
        System.out.println("Lamp being turned on");
    }

    public String getStyle(){
        return style;
    }

    public boolean isBattery(){
        return isBattery();
    }

    public int getGlobRating(){
        return globRating;
    }
}
