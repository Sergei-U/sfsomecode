package module4.bebeshkon;

public class PETS {
    public static void main(String[] argv)
            throws Exception {
        StringBuilder str
                = new StringBuilder();

        str.append("PETS");
        System.out.println("String = "
                + str.toString());
        StringBuilder str1
                = new StringBuilder("PATTTTTTY");

        System.out.println("String1 = "
                + str1.toString());

        StringBuilder str2
                = new StringBuilder(100);

        System.out.println("String2 capacity = "
                + str2.capacity());

        StringBuilder str3
                = new StringBuilder(str1.toString());

        System.out.println("String3 = "
                + str3.toString());
    }
}