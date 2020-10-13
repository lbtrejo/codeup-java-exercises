package abstractInterfacesBonus;

public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable {

    private String saxType;

    public Sax(String type){
        super("Woodwind");
        this.saxType = type;
    }

    @Override
    public void startMusic() {
        System.out.println("The sax starts playing");
    }

    @Override
    public void stopMusic() {
        System.out.println("The sax stops playing");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("The sax is in tune");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("The sax is out of tune");
    }

    @Override
    public void volumeUp() {
        System.out.println("The sax plays louder");
    }

    @Override
    public void volumeDown() {
        System.out.println("The sax plays more softly");
    }

    public void getType(){
        System.out.println("saxType = " + saxType);
    }

    public void setType(String newType){
        this.saxType = newType;
    }

}
