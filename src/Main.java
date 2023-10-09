public class Main {
    public static void main(String[] args) {
        ComplexType complexObj = new ComplexType("ComplexValue");
        EnumType enumValue = EnumType.VALUE2;

        Level2 objectA = new Level2(10, complexObj, "Field3Value");
        Level3 objectB = new Level3(enumValue);
        Level3 objectC = new Level3(EnumType.VALUE1);

        System.out.println("Properties of ObjectA (Level2):");
        System.out.println("Field1: " + objectA.getField1());
        System.out.println("Field2 Value: " + objectA.getField2().getValue());
        System.out.println("Field3: " + objectA.getField3());

        System.out.println("\nProperties of ObjectB (Level3):");
        System.out.println("Field4: " + objectB.getField4());

        System.out.println("\nProperties of ObjectC (Level3):");
        System.out.println("Field4: " + objectC.getField4());

        objectA.overloadedMethod();
        objectA.overloadedMethod("Parameter");
        objectA.nonOverridableMethod();

        objectB.overloadedMethod();
        objectC.overloadedMethod();
    }
}