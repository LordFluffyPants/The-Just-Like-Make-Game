package BackEnd.Tests;

import BackEnd.Character.*;
import BackEnd.Character.Character;
import BackEnd.Data.ImportManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jake on 7/3/2015.
 */
public class CharacterTest {
    @Test
    public void testListReturn()
    {
        assertEquals("Human", ImportManager.getInstance().getCharacterList().get(0).getRace());
    }

    @Test
    public void testCharacterCreation()
    {

        BackEnd.Character.Character elvenBerserker = new Character(ImportManager.getInstance().getCharacterList().get(1).getRace(),ImportManager.getInstance().getClassList().get(0).getClassValue(),"shit");
        assertEquals("Elven",elvenBerserker.getRace());
        assertEquals("Berserker",elvenBerserker.getaClass());
        assertEquals("shit",elvenBerserker.getArmor());
    }

    @Test
    public void testCalculateValues()
    {
        BackEnd.Character.Character elvenBerserker = new Character(ImportManager.getInstance().getCharacterList().get(1).getRace(),ImportManager.getInstance().getClassList().get(0).getClassValue(),"shit");
        int health = 10 -2 -3;
        int stamina = 15 +5 +4;
        int strength = 3 +0 +3;
        int intellect = 3-1 -2;
        int dex = 3 -1 -0;
        int speed = 0 +4 +1;
        int will = 0 + 0 +2;
        int wisdom = 0+0-2;
        int fortitude = 0+0+2;
        int armor = 0;
        assertEquals("Heath was not what it should be",health,elvenBerserker.getHealth());
        assertEquals("Stamina was not what it should be",stamina,elvenBerserker.getStamina());
        assertEquals("Strength was not what it should be",strength,elvenBerserker.getStrength());
        assertEquals("Int was not what it should be",intellect,elvenBerserker.getIntellect());
        assertEquals("Dex was not what it should be",dex,elvenBerserker.getDex());
        assertEquals("Speed was not what it should be",speed,elvenBerserker.getSpeed());
        assertEquals("Will was not what it should be",will,elvenBerserker.getWill());
        assertEquals("Wisdom was not what it should be",wisdom,elvenBerserker.getWisdom());
        assertEquals("Fort was not what it should be",fortitude,elvenBerserker.getFortitude());
        assertEquals("Armor was not what it should be",armor,elvenBerserker.getArmorValue());


    }

}
