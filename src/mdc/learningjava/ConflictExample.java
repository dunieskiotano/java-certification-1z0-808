package mdc.learningjava;

import java.util.*;

/**
 * @author Dunieski Otano on 10/08/2020
 */
public class ConflictExample {

    public static void main(String[] args) {
        java.util.Date date;
        java.sql.Date mySqlDate;
    }

    public void checkEmpty(List list) {
        if (list.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }

    }
}

class LineNumber {
    public void checkEmpty(List list) {
        if (list.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.print("not empty");
        }
    }
}
