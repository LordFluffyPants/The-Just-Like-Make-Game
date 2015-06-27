package BackEnd;

import BackEnd.Character.CharacterValueElement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by Jake on 6/27/2015.
 */
public class ImportManager {
    private static ImportManager ourInstance = new ImportManager();
    private List<CharacterValueElement> list;

    public static ImportManager getInstance() {
        return ourInstance;
    }

    private ImportManager() {
       importFile();
    }
    public void importFile()
    {
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Data/CharacterStatGains.csv"));
            String line;
            boolean headerPassed = false;
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] mappingLine = line.split(",");
                if (headerPassed)
                {
                    CharacterValueElement element = new CharacterValueElement();
                    element.setRace(mappingLine[0]);
                    element.setHealth(Integer.parseInt(mappingLine[1]));
                    element.setStamina(Integer.parseInt(mappingLine[2]));
                    element.setStrength(Integer.parseInt(mappingLine[3]));
                    element.setIntellect(Integer.parseInt(mappingLine[4]));
                    element.setDex(Integer.parseInt(mappingLine[5]));
                    element.setSpeed(Integer.parseInt(mappingLine[6]));
                    element.setWill(Integer.parseInt(mappingLine[7]));
                    element.setFortitude(Integer.parseInt(mappingLine[8]));
                    list.add(element);
                }
                headerPassed = true;
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {

        }
    }

    public List<CharacterValueElement> getList()
    {
        return list;
    }
}
