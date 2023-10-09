final public class Level3 {
    private EnumType field4;

    public Level3(EnumType field4) {
        this.field4 = field4;
    }

    public EnumType getField4() {
        return field4;
    }

    // Перезаписанный метод
    public void overloadedMethod() {
        System.out.println("Overridden method in Level3");
    }
}