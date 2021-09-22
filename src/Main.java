import java.util.*;

public class Main {
    private static People[] people = People.values();
    private static Alcohol[] alcohols = Alcohol.values();

    public static void main(String[] args) {
        HashMap<People, Alcohol> peopleAlcoholDictionary = generateAlcohol(drinksSame());

        printResult(peopleAlcoholDictionary);
    }

    private static void printResult(HashMap<People, Alcohol> peopleAlcoholDictionary) {
        System.out.println("Drink list:\n");
        for (Map.Entry<People, Alcohol> entry : peopleAlcoholDictionary.entrySet()) {
            System.out.printf("%s: %s\n", entry.getKey().name, entry.getValue().name);
        }
    }

    private static HashMap<People, Alcohol> generateAlcohol(boolean drinksSame) {
        HashMap<People, Alcohol> peopleAlcoholDictionary = new HashMap<People, Alcohol>();

        if (drinksSame) {
            Alcohol alcohol = getRandomAlcohol();
            Arrays.stream(people).forEach(p -> peopleAlcoholDictionary.put(p, alcohol));
        } else {
            Arrays.stream(people).forEach(p -> peopleAlcoholDictionary.put(p, getRandomAlcohol()));
        }

        return peopleAlcoholDictionary;
    }

    private static boolean drinksSame() {
        return new Random().nextBoolean();
    }

    private static Alcohol getRandomAlcohol() {
        return alcohols[new Random().nextInt(alcohols.length)];
    }
}
