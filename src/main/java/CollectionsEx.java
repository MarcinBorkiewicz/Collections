import java.util.*;

public class CollectionsEx {
    List<String> listWithNames;
    Set<String> setWithNames;
    Map<Integer, String> colors;

    private void addListEx1() {
        listWithNames = new ArrayList<String>();
        listWithNames.add("Marek");
        listWithNames.add("Aleksandra");
        listWithNames.add("Marta");
        listWithNames.add("Jakub");
        listWithNames.add("Bartosz");
        System.out.println("Ex 1 - add list: " + listWithNames);
    }

    private void showListEx2() {
        System.out.println("Ex 2 - show list: " + listWithNames);
    }

    private void sizeListEx3() {
        System.out.println("Ex 3 - size list: " + listWithNames.size());
    }

    private void addNameToTheListEx4() {
        listWithNames.add("Paulina");
        System.out.println("Ex 4 - add name: " + listWithNames);
    }

    private void show3ElementEx5() {
        System.out.println("Ex 5 - show third element: " + listWithNames.get(2));
    }

    private void firstNameFromBehindEx6() {
        StringBuilder stringBuilder = new StringBuilder(listWithNames.get(0).toLowerCase());
        System.out.println("Ex 6 - first name from behind: " + stringBuilder.reverse());
    }

    private void showIndexOfJakubEx7() {
        System.out.println("Ex 7 - show index of Jakub: " + listWithNames.indexOf("Jakub"));
    }

    private void infoAboutSylwiaOnTheListEx8() {
        if (listWithNames.contains("Sylwia")) {
            System.out.println("Ex 8 - info about Sylwia on the list: Na liście jest Sylwia");
        } else {
            System.out.println("Ex 8 - info about Sylwia on the list: Na liście nie ma Sylwii");
        }
    }

    private void infoAboutMartaOnTheListEx9() {
        if (listWithNames.contains("Marta")) {
            System.out.println("Ex 9 - info about Marta on the list: Na liście jest Marta");
        } else {
            System.out.println("Ex 9 - info about Marta on the list: Na liście nie ma Marty");
        }
    }

    private void showTheFistTwoElementsEx10() {
        System.out.println("Ex 10 - show the first two elements");
        for (int i = 0; i < 2; i++) {
            System.out.println(listWithNames.get(i));
        }
    }

    private void changeMarekToSebastianEx11() {
        System.out.println("Ex 11 - change Marek to Sebastian");
        listWithNames.set(0, "Sebastian");
        System.out.println(listWithNames);
    }

    private void showTheLastTwoElementsEx12() {
        System.out.println("Ex 12 - show the last two elements");
        for (int i = 4; i < 6; i++) {
            System.out.println(listWithNames.get(i));
        }
    }

    private void allNamesInOneStringEx13() {
        System.out.println("Ex 13 - all names in one string:");
        StringBuilder stringBuilder = new StringBuilder();
        for (String name : listWithNames) {
            stringBuilder.append(name);
        }
        System.out.println(stringBuilder);
    }

    private void allNamesContainsSEx14() {
        System.out.println("Ex 14 - allNamesContainsSInOneString:");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : listWithNames) {
            if (s.contains("s")) {
                stringBuilder.append(s);
            }
        }
        System.out.println(stringBuilder);
    }

    private void firstAndThirdLetterEx15() {
        System.out.println("Ex 15 - first and third letter");
        for (String letter : listWithNames) {
            System.out.println("Druga litera to: " + letter.charAt(1));
            System.out.println("Trzecia litera to: " + letter.charAt(2));
        }

    }

    private void listFromBehindEx16() {
        Collections.reverse(listWithNames);
        System.out.println("Ex 16 - list from behind: " + listWithNames);

    }

    private void startWithMOrendWithAEx17() {
        System.out.println("Ex 17: start with M or end with A");
        listWithNames.stream().filter(s -> s.toString().startsWith("M")).forEach(System.out::println);
        listWithNames.stream().filter(s -> s.toString().endsWith("a")).forEach(System.out::println);
    }

    private void nameWithNumberofLetterEx18() {
        System.out.println("Ex 18 - name with number of letter");
        for (String name : listWithNames) {
            System.out.println(name.length() + " " + name);
        }
    }

    private void addListToListEx19() {
        List<String> listWithNames2 = new ArrayList<>();
        listWithNames2.add("Anna");
        listWithNames2.add("Maciej");

        List<String> newList = new ArrayList<>();
        newList.addAll(listWithNames);
        newList.addAll(listWithNames2);

        System.out.println("Ex 19 - add list to list: " + newList);
    }


    private void namesWitchIDEx21() {
        System.out.println("Ex 21:");
        for (String name : listWithNames) {
            System.out.println(listWithNames.indexOf(name) + "." + " " + name);
        }
    }

    private void deleteFirstElementEx22() {
        String firstName = listWithNames.remove(0);
        System.out.println("Ex 22 - delete first element: " + firstName);
    }

    private void deleteJakubFromtheListEx23() {
        listWithNames.remove(3);
        System.out.println("Ex 23 - delete Jakub from the list " + listWithNames);
    }

    private void ascendingListEx24() {
        System.out.println("Ex 24 - ascending list");
        Collections.sort(listWithNames);
        for (String s : listWithNames) {
            System.out.println(s);
        }
    }

    private void descendingListEx25() {
        System.out.println("Ex 25 - descending list: ");
        Collections.sort(listWithNames);
        Collections.reverse(listWithNames);
        for (String s : listWithNames) {
            System.out.println(s);
        }
    }

    private void checkEmptyListEx26() {
        if (listWithNames.isEmpty()) {
            System.out.println("Ex 26 - check empty list: Lista jest pusta");
        } else {
            System.out.println("Ex 26 - check empty list: Lista nie jest pusta");
        }
    }

    private void clearAndDisplayListEx27() {
        listWithNames.removeAll(listWithNames);
        System.out.println("Ex 27 - clear and display list: " + listWithNames);
    }

    private void checkAgainEmptyListEx28() {
        if (listWithNames.isEmpty()) {
            System.out.println("Ex 28 - check again empty list: lista jest pusta");
        } else {
            System.out.println("Ex 28 - check again empty list: lista nie jest pusta");
        }
    }

    private void addSetEx29() {
        Set<String> setWithNames = new HashSet<String>();
        setWithNames.add("Marek");
        setWithNames.add("Aleksandra");
        setWithNames.add("Marta");
        setWithNames.add("Jakub");
        setWithNames.add("Bartosz");
        System.out.println("Ex 29 - addSet:");
        System.out.println(setWithNames);
    }

    private void addMarekEx30() {
        System.out.println("Ex 30 - add Marek:");
        try {
            System.out.println(setWithNames.add("Marek"));
        } catch (NullPointerException e) {
            System.out.println("Marek już został dodany");
        }
    }

    private void addHashMapEx31() {
        colors = new HashMap<>();

        colors.put(1, "Niebieski");
        colors.put(2, "Zielony");
        colors.put(3, "Czerwony");

        System.out.println("Ex 31 - add hashmap:");
        System.out.println(colors);
    }

    private void displayAllColorsEx32() {

        System.out.println("Ex 32 - display all colors: ");
        System.out.println(colors.values());

    }

    private void displayIDEx33() {
        System.out.println("Ex 33 - display id");
        System.out.println(colors.keySet());
    }

    private void addColorEx34() {
        System.out.println("Ex 34 - addColor:");
        colors.put(4, "Biały");
        System.out.println(colors);
    }

    private void displayColorId2Ex35() {
        System.out.println("Ex 35 - display color id 2:");
        System.out.println(colors.get(2));
    }

    private void displayIDBlueEx36() {
        System.out.println("Ex 36 - display id blue: ");

        colors.entrySet().stream().filter(e -> e.getValue().equals("Niebieski"))
                .forEach(System.out::println);

    }

    private void displayAllColorsEx37() {
        System.out.println("Ex 37 - display all colors");
        System.out.println(colors.values());
    }

    private void displayIDColorsEx38() {
        System.out.println("Ex 38 - display id colors ");
        System.out.println(colors.keySet());
    }

    private void deleteColorId2Ex39() {
        System.out.println("Ex 39 - delete color id 2");
        colors.remove(2);
        System.out.println(colors);
    }

    private void deletRedFromTheMapEx40() {
        System.out.println("Ex 40 - delete color red from the map");
        colors.remove(3, "Czerwony");
        System.out.println(colors);
    }


    public static void main(String[] args) {
        CollectionsEx collectionsEx = new CollectionsEx();
        collectionsEx.addListEx1();
        collectionsEx.showListEx2();
        collectionsEx.sizeListEx3();
        collectionsEx.addNameToTheListEx4();
        collectionsEx.show3ElementEx5();
        collectionsEx.firstNameFromBehindEx6();
        collectionsEx.showIndexOfJakubEx7();
        collectionsEx.infoAboutSylwiaOnTheListEx8();
        collectionsEx.infoAboutMartaOnTheListEx9();
        collectionsEx.showTheFistTwoElementsEx10();
        collectionsEx.changeMarekToSebastianEx11();
        collectionsEx.showTheLastTwoElementsEx12();
        collectionsEx.allNamesInOneStringEx13();
        collectionsEx.allNamesContainsSEx14();
        collectionsEx.firstAndThirdLetterEx15();
        collectionsEx.listFromBehindEx16();
        collectionsEx.startWithMOrendWithAEx17();
        collectionsEx.nameWithNumberofLetterEx18();
        collectionsEx.addListToListEx19();
        collectionsEx.namesWitchIDEx21();
        collectionsEx.deleteFirstElementEx22();
        collectionsEx.deleteJakubFromtheListEx23();
        collectionsEx.ascendingListEx24();
        collectionsEx.descendingListEx25();
        collectionsEx.checkEmptyListEx26();
        collectionsEx.clearAndDisplayListEx27();
        collectionsEx.checkAgainEmptyListEx28();
        collectionsEx.addSetEx29();
        collectionsEx.addMarekEx30();
        collectionsEx.addHashMapEx31();
        collectionsEx.displayAllColorsEx32();
        collectionsEx.displayIDEx33();
        collectionsEx.addColorEx34();
        collectionsEx.displayColorId2Ex35();
        collectionsEx.displayIDBlueEx36();
        collectionsEx.displayAllColorsEx37();
        collectionsEx.displayIDColorsEx38();
        collectionsEx.deleteColorId2Ex39();
        collectionsEx.deletRedFromTheMapEx40();


    }
}
