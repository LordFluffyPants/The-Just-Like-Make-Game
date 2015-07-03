package BackEnd.Tests;

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

}
