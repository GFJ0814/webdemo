package 面试宝典.Collection;

import org.apache.commons.lang.ArrayUtils;

import java.util.*;

/**
 * Created by acer on 2017/3/25.
 * 22:47
 * 此类用于学习集合部分的Demo
 */
public class Questions {

    public static void main(String[] args) {
        List<Integer> list  = new LinkedList<Integer>();
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(52);
        list.add(50);
        list.add(63);
        list.add(12);
        list.add(5);


        ListIterator<Integer> listIterator = list.listIterator();
        System.out.println("使用iterator从前往后输出");
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();
        System.out.println("使用iterator从后往前输出");
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");

        }
        System.out.println();


        int[] res = null;
        res=list2Array(list);
        for(int a:res){
            System.out.print(a);
            System.out.print('\t');
        }

        System.out.println("=====================================");
        /*list = array2List(res);
        for(Integer a:list){
            System.out.print(a);
            System.out.print('\t');
        }*/







    }

    //如何将list转化为int[]
    public static int[] list2Array(List list) {
        int[] result = null;
        result = ArrayUtils.toPrimitive((Integer[]) list.toArray(new Integer[0]));
        return result;
    }

    //如何将int[]转化为List
    public static  List array2List(int[] array){
        List list = null;
        list = Arrays.asList(array);
        return list;
    }

    //将List转换为Set
    public static Set list2Set(){
        Set set =null;
        return set;
    }

    //删除arraList中的重复元素



}
