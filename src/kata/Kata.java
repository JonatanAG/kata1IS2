/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;


import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *
 * @author usuario
 */
public class Kata {
    public static void main(String[] args) {
        Calendar f = GregorianCalendar.getInstance();
        f.set(1963, 2, 3);
        Person person = new Person ("nombre", "apellido", f);
        
        f.set (1964,7,3);
        System.out.println(person.getFullName());
        System.out.println(person.getBirthday().getTime());
        System.out.println(person.getAge());
    }
}
