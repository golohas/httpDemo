
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.*;

public class EmployeeTest {

    @BeforeClass
    public void beforeClass() {

    }

    @Test
    public void testSetSalary() throws Exception {
        Employee.sala = 34.5;
        Employee empone = new Employee("Ransika");
        empone.setSalary(1000);
        assertEquals(empone.getSalary(), 1000, 1);
        assertEquals(34.5, Employee.sala);

    }
    @Test
    public void testPlus() {
        int a = 10;
        System.out.println("a++ : " + a++);
        System.out.println("++a : " + ++a);
    }

    @Test
    public void  testWhile() {
        int i = 0;
        do {
            System.out.println("test while");
            ++i;
        }while (i < 10);
    }

    @Test
    public void testFor() {
        int a [] = {1, 2, 3, 4, 5, 6, 7};

        for(int i : a) {
            if(i == 4) {
                break;
            }
            System.out.println(i);
        }
    }

    @Test
    public void testChar(){
        char[] charArray = {'a', 'b', 'c', 'd'};
        Character ch ;
        ch = 'g';
        boolean isTrue = Character.isLetter(ch);
        System.out.println(isTrue);
        System.out.println(ch);
        for (char c : charArray) {
            System.out.println(c);
        }
    }

    @Test
    public void testStringBuffer(){
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("test ");
        stringBuffer.append("string buffer.");
        stringBuffer.reverse();
        stringBuffer.reverse();
        int num = stringBuffer.capacity();
        System.out.println(num);
        System.out.println(stringBuffer);
    }

    @Test
    public void testArray() {
        double [] arList = {2.3, 3.4, 4.7, 2.8, 3.9};
        Arrays.sort(arList);
        for(double alist :arList) {
            System.out.println(alist);
        }
        int result = Arrays.binarySearch(arList, 4.7);
        System.out.println(result);
    }
    @Test
    public void testDate() {
        Date date = new Date();
        System.out.println(date.before(new Date()));

        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(date));

        Calendar c1 = Calendar.getInstance();
        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH);

        System.out.println("year: " + year + " month: " + month);
    }

    @Test
    public void testReg() {
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("value: " + m.group(0));
            System.out.println("value: " + m.group(1));
            System.out.println("value: " + m.group(2));
        }
        else {
            System.out.println("no match.");
        }
    }

    @Test
    public void testFinalize() {
        Cmake c1 = new Cmake(1);
        Cmake c2 = new Cmake(2);
        Cmake c3 = new Cmake(3);

        c2 = c3 = null;
        System.gc();
    }


}