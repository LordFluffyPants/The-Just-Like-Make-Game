package BackEnd;

/**
 * Created by Jake on 6/19/2015.
 */
public class Dice {

    private int D6;
    private int D20;
    private static Dice instance = null;
    protected  Dice()
    {

    }
    public static Dice getInstance()
    {
        if (instance == null)
            instance = new Dice();
        return instance;
    }

    public int rollD6()
    {
        return D6 = (int) Math.ceil(6* Math.random());
    }

    public int rollD20()
    {
        return D20 = (int) Math.ceil((20 * Math.random()));
    }
}
