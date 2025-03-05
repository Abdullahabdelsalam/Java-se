package ObjectOrientedProgramming.wrapper;

public class Wrapper {

    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static utility methods.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing
        int x = a;

        String q = Integer.toString(123);
        String w = Double.toString(465);
        String e = Character.toString('W');
        String r = Boolean.toString(false);

        String t = q + w + e + r;

        System.out.println(t);

        int y = Integer.parseInt("123");
        double u = Double.parseDouble("4567");
        char i = "hdfjk".charAt(1);
        boolean o = Boolean.parseBoolean("false");

        char p = 'e';
        System.out.println(Character.isLetter(p));
        System.out.println(Character.isUpperCase(p));

    }
}
