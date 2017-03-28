import org.junit.Test;
import 面试宝典.Sort;

/**
 * Created by acer on 2017/3/28.
 * 14:43
 */
public class TestSort {

    @Test
    public void test(){
        Sort sort = new Sort();
        int[] array =new int[]{1,3,0,5,2,9,4};
        //插入排序
        System.out.println("这是插入排序的结果:");
        sort.insertSort(array);
        System.out.println("这是未排序的数组");
        array =new int[]{1,3,0,5,2,9,4};
        Sort.print(array);
        System.out.println("这是选择排序的结果");
        sort.selectSort(array);
    }
}
