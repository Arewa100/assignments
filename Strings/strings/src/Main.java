//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[] info = {'a', 'b', 'c', 'd', 'e', 'f'};

        String theSequence = new String(info);
        System.out.println("the result of combining this is: " + theSequence);

        String name = "Miracle";
        System.out.printf("%s %n", name.charAt(3));
        System.out.println(name.length());
        char[] working = new char[5];
        name.getChars(0, 5, working, 0);
        System.out.println(working);
        if(name.equalsIgnoreCase("MIRACLE")) {
            System.out.println("it is true");
        }

//        if(name.compareTo()) {
//            System.out.println("it is true working");
//        }

        String[] testingStartWith = {"starting", "endng", "logos", "star"};

        for(String s : testingStartWith) {
            if(s.startsWith("st")) {
                System.out.println("this strings starts with st " + s);
            }
        }
        for (String s : testingStartWith) {
            if(s.endsWith("g")) {
                System.out.println("this is strings end with g " + s);
            }
        }

        String letters = "abcdefgcrfchts";
        System.out.printf("%s %n", letters.indexOf("c"));
        System.out.println(letters.lastIndexOf("c"));
        String newSubString = letters.substring(2);
        System.out.printf("%s %n", newSubString);


        //concatenating two string using the concat method of string

        String first = "welcome";
        String second = " home";
        String greetings = first.concat(second);
        System.out.printf("%s %n", greetings);

        System.out.println(second.trim().replace("o", "A"));

        String value = "0001";
        int valueInInt = Integer.parseInt(value);
        System.out.println(valueInInt);
//        String converted = Integer.toString(value);
//        System.out.printf("%s %n", converted);

        //string builders

        StringBuilder itemOne = new StringBuilder("orange");
        System.out.println(itemOne);
        System.out.printf("%d %n", itemOne.length());
        itemOne.ensureCapacity(22);
        itemOne.setLength(4);
        System.out.printf("%d %n", itemOne.capacity());
    }
}