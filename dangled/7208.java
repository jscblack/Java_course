/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:02:55
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.ArrayList;
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
        ArrayList<String>ary=new ArrayList<String>();
        while (true) {
            fuck = rd.next();
            if (a.indexOf(fuck)>=0) {
                ary.add(fuck);
            }
            if(fuck.equals("end")){
                break;
            }
        }

        Collections.sort(ary, new Comparator<String>(){
            public int compare(String l,String r){
                return l.compareTo(r);
            }
        });
        for (String string : ary) {
            System.out.print(string+" ");
        }
        rd.close();
    }
}