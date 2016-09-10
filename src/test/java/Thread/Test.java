package Thread;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.ws.api.Cancelable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by bao on 2016/9/9.
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "---" + s2);// hello---world
        change(s1, s2);
        System.out.println(s1 + "---" + s2);// hello---world

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 + "---" + sb2);// hello---world
        change(sb1, sb2);
        System.out.println(sb1 + "---" + sb2);// hello---worldworld

        Date t1 = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(t1);

        cal.add(Calendar.DATE, 100);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(cal.getTime()));



    }

    public static void change(StringBuffer sb1, StringBuffer sb2) {
        sb1 = sb2;
        sb2.append(sb1);
    }

    public static void change(String s1, String s2) {
        s1 = s2;
        s2 = s1 + s2;
    }
}
