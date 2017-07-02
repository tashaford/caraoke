package Behaviours;

/**
 * Created by natashaford on 30/06/2017.
 */

public enum Symbol {
    SEVEN("Seven"),
    ORANGE("Orange"),
    PLUM("Plum"),
    LEMON("Lemon"),
    WATERMELON("Watermelon"),
    BAR("Bar"),
    CHERRY("Cherry");

    public String value;

    Symbol(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
