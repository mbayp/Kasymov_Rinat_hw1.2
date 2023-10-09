class Level2 extends Level1 {
    private String field3;

    public Level2(int field1, ComplexType field2, String field3) {
        super(field1, field2);
        this.field3 = field3;
    }

    public String getField3() {
        return field3;
    }

    // Перегруженный метод 3, неперезаписываемый
    public final void nonOverridableMethod() {
        System.out.println("Non-overridable method in Level2");
    }
}
