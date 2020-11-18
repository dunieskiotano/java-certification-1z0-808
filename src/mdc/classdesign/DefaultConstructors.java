package mdc.classdesign;

class DefaultConstructors {
    private String firstName;
    private String lastname;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printResult() {
        System.out.println("hi");
    }

    public static void printStaticContent(){
        System.out.println("static");
    }
}

class TestDefaultConstructor {
    public static void main(String[] args) {
        DefaultConstructors dc = new DefaultConstructors();
        dc.setFirstName("Maria");
        dc.setLastname("De Pena");
        dc.setAge(24);
        System.out.println(dc.getFirstName() + "\n" + dc.getLastname() + "\n" + dc.getAge());
        new DefaultConstructors().printResult();
        DefaultConstructors.printStaticContent();
    }
}
