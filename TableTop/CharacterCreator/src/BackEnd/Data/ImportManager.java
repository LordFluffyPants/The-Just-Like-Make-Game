package BackEnd.Data;

import BackEnd.Character.ArmorValueElement;
import BackEnd.Character.CharacterValueElement;
import BackEnd.Character.ClassValueElement;
import BackEnd.Character.enums.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jake on 6/27/2015.
 */
public class ImportManager {
    private static ImportManager instance = new ImportManager();
//    private static String path = System.getProperty("user.dir");
    private List<CharacterValueElement> characterList = new ArrayList<CharacterValueElement>();
    private List<ClassValueElement> classList = new ArrayList<ClassValueElement>();
    private List<ArmorValueElement> armorList = new ArrayList<ArmorValueElement>();

    public static ImportManager getInstance() {
        if (instance == null) {
            instance = new ImportManager();
        }
        return instance;
    }

    private ImportManager()
    {
        importCharacterFile();
        importClassFile();
    }
    private void importCharacterFile()
    {
        try
        {
            String path = System.getProperty("user.dir");
            path += "/src/BackEnd/Data/CharacterStatGains.csv";
            //The URL implementation seems to only work for linux and not windows ATM
            //Creating the systemPath seems to fix this
            URL url = getClass().getResource("CharacterStatGains.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
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
                    element.setWisdom(Integer.parseInt(mappingLine[8]));
                    element.setFortitude(Integer.parseInt(mappingLine[9]));
                    characterList.add(element);
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

    private void importClassFile()
    {
        try
        {
            String path = System.getProperty("user.dir");
            path += "/src/BackEnd/Data/ClassStatGains.csv";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            boolean headerPassed = false;
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] mappingLine = line.split(",");
                if (headerPassed)
                {
                    ClassValueElement element = new ClassValueElement();
                    element.setClass(mappingLine[0]);
                    element.setHealth(Integer.parseInt(mappingLine[1]));
                    element.setStamina(Integer.parseInt(mappingLine[2]));
                    element.setStrength(Integer.parseInt(mappingLine[3]));
                    element.setIntellect(Integer.parseInt(mappingLine[4]));
                    element.setDex(Integer.parseInt(mappingLine[5]));
                    element.setSpeed(Integer.parseInt(mappingLine[6]));
                    element.setWill(Integer.parseInt(mappingLine[7]));
                    element.setWisdom(Integer.parseInt((mappingLine[8])));
                    element.setFortitude(Integer.parseInt(mappingLine[9]));
                    classList.add(element);
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

    private void importArmorFile()
    {
        try
        {
            String path = System.getProperty("user.dir");
            path += "/src/BackEnd/Data/ArmorStatGains.csv";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            boolean headerPassed = false;
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] mappingLine = line.split(",");
                if (headerPassed)
                {
                    //TODO import the armor file
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

    public List<CharacterValueElement> getCharacterList()
    {
        return characterList;
    }

    public List<ClassValueElement> getClassList()
    {
        return classList;
    }

    public List<ArmorValueElement> getArmorList()
    {
        return armorList;
    }

}
