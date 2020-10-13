package abstractInterfacesBonus;

public class MusicTest {
    public static void main(String[] args) {
        Piano keyboard = new Piano(88);
        Sax bleedingGums = new Sax ("jazz");

        keyboard.startMusic();
        keyboard.stopMusic();
        keyboard.getKeys();
        keyboard.setKeys(100);
        keyboard.getKeys();

        bleedingGums.startMusic();
        bleedingGums.stopMusic();
        bleedingGums.getType();
        bleedingGums.setType("blues");
        bleedingGums.getType();

        MusicTest.makeTwoStaccatoSounds(keyboard);
        MusicTest.detuneRetune(keyboard);
        MusicTest.makeTwoStaccatoSounds(bleedingGums);
        MusicTest.detuneRetune(bleedingGums);


    }

    public static void detuneRetune(Tuneable tuneableObj) {
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }

    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();
    }
}
