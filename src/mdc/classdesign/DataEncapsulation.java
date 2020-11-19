package mdc.classdesign;

public class DataEncapsulation {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("MyCompany");
        company.addEmployee("John");
        company.addEmployee("Anthony");
        company.addEmployee(null);
        company.addEmployee("");
        company.setName(null);
        company.printSorted();
    }

}
