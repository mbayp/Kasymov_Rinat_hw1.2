class Level1 {
    private int field1;
    private ComplexType field2;

    public Level1(int field1, ComplexType field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public int getField1() {
        return field1;
    }

    public ComplexType getField2() {
        return field2;
    }

    // Перегруженный метод 1
    public void overloadedMethod() {
        System.out.println("Overloaded method in Level1");
    }

    // Перегруженный метод 2
    public void overloadedMethod(String param) {
        System.out.println("Overloaded method with param in Level1: " + param);
    }
}