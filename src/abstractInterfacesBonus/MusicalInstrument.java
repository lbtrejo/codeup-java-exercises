package abstractInterfacesBonus;

abstract class MusicalInstrument implements Playable {

    private String instrumentClassification;

    public MusicalInstrument(String type){
        this.instrumentClassification = type;
    }
}
