/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:02:48
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        String fuck;
        while (true) {
            fuck = rd.next();
            if (fuck.equals("end")) {
                break;
            }
            a.add(fuck);

        }
        Collections.sort(a, new Comparator<String>() {

            public int compare(String l, String r) {
                return l.compareTo(r);
            }

        });
        for (String string : a) {
            System.out.print(string+" ");
        }
        rd.close();
    }
}