package de.lmu.ifi.dbs.elki.distance;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author Arthur Zimek
 */
public class IntegerDistance extends NumberDistance<IntegerDistance, Integer> {
    /**
     * Created serial version UID.
     */
    private static final long serialVersionUID = 5583821082931825810L;

    /**
     * Empty constructor for serialization purposes.
     */
    public IntegerDistance() {
        super(null);
    }

    /**
     * Constructor
     * 
     * @param value distance value
     */
    public IntegerDistance(int value) {
        super(value);
    }

    public String description() {
        return "IntegerDistance.intValue";
    }

    public IntegerDistance minus(IntegerDistance distance) {
        return new IntegerDistance(this.getValue() - distance.getValue());
    }

    public IntegerDistance plus(IntegerDistance distance) {
        return new IntegerDistance(this.getValue() + distance.getValue());
    }

    /**
     * Writes the integer value of this IntegerDistance to the specified stream.
     */
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(getValue());
    }

    /**
     * Reads the integer value of this IntegerDistance from the specified stream.
     */
    public void readExternal(ObjectInput in) throws IOException {
        setValue(in.readInt());
    }

    /**
     * Returns the number of Bytes this distance uses if it is written to an
     * external file.
     *
     * @return 4 (4 Byte for an integer value)
     */
    public int externalizableSize() {
        return 4;
    }

}
