package BackEnd.Character.calculators;

import BackEnd.Character.enums.Race;
import BackEnd.Character.enums.Values;

/**
 * Created by Jake on 6/20/2015.
 */
public class RaceBonus {

    private Race race;

    public RaceBonus(Race race)
    {
        this.race = race;
    }

    public int getBonus(Values value)
    {
        switch (value)
        {

            case HEALTH:
                switch (race)
                {
                    case HUMAN:
                        return 3;
                    case ELVEN:
                        return -2;
                    case ORC:
                        return 0;
                    case DRYADS:
                        return 4;
                    case LIZARD_FOLK:
                        return -2;
                    case GOBLIN:
                        return -3;
                }
                break;
            case STAMINA:
                switch (race)
                {

                    case HUMAN:
                        return 0;
                    case ELVEN:
                        return 5;
                    case ORC:
                        return -1;
                    case DRYADS:
                        return 4;
                    case LIZARD_FOLK:
                        return 3;
                    case GOBLIN:
                        return 1;
                }
                break;
            case STRENGTH:
                switch (race)
                {

                    case HUMAN:
                        return -1;
                    case ELVEN:
                        return 0;
                    case ORC:
                        return 4;
                    case DRYADS:
                        return -3;
                    case LIZARD_FOLK:
                        return 0;
                    case GOBLIN:
                        return 0;
                }
                break;
            case INTELLECT:
                switch (race)
                {

                    case HUMAN:
                        return 0;
                    case ELVEN:
                        return -1;
                    case ORC:
                        return 4;
                    case DRYADS:
                        return 0;
                    case LIZARD_FOLK:
                        return 2;
                    case GOBLIN:
                        return 5;
                }
                break;
            case DEXTERITY:
                break;
            case SPEED:
                break;
            case WILL:
                break;
            case WISDOM:
                break;
            case FORTITUDE:
                break;
            case ARMOR:
                break;
        }
        return 0;
    }

}
