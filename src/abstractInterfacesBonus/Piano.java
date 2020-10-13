package abstractInterfacesBonus;

public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable {

    private int numberOfKeys;

    public Piano(int keys){
        super("Stringed");
        this.numberOfKeys = keys;
    }

    @Override
    public void startMusic() {
        System.out.println("The piano starts playing");
    }

    @Override
    public void stopMusic() {
        System.out.println("The piano stops playing");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("The piano is in tune");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("The piano is out of tune");
    }

    @Override
    public void volumeUp() {
        System.out.println("The piano plays louder");
    }

    @Override
    public void volumeDown() {
        System.out.println("The piano plays more softly");
    }

    public void getKeys(){
        System.out.println("numberOfKeys = " + numberOfKeys);
    }

    public void setKeys(int newKeys){
        this.numberOfKeys = newKeys;
    }

}
