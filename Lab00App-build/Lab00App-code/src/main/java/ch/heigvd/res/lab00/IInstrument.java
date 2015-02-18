package ch.heigvd.res.lab00;

public abstract class IInstrument {
    public String play() {
        return "pouet";
    }

    abstract public int getSoundVolume();
    abstract public String getColor();
}
