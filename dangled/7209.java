/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:03:04
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.lang.reflect.Array;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        HashMap<String,Integer>m=new HashMap<>();
        Scanner rd=new Scanner(System.in);
        int n=rd.nextInt();
        while((n--)>0){
            m.put(rd.next(), rd.nextInt());
        }
        System.out.println(m.get(rd.next()));
        Object[] arr = m.keySet().toArray();
        Arrays.sort(arr);
        for (Object fuck : arr) {
            System.out.println(fuck+"="+m.get(fuck));
        }
        
        rd.close();
    }
}