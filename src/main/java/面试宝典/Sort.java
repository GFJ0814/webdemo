package 面试宝典;

/**
 * Created by acer on 2017/3/28.
 * 14:34
 */
public class Sort {


    //插入排序(针对于基本数据类型):从小到大排序
    //思想：前面的都是排好的，插入后面的元素要和前面的元素一个个的作比较，在拍好的当中找到合适的位置放进去
    public void insertSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        print(array);
    }

    //插入排序针对引用类型
    public void insertSortForObject() {

    }

    //选择排序  基本思想是：前面的已经排好，从后面选最大或者最小的放在已经排好序的最后面即可
    //如果从小到大，则取最小的和前面的交换，从大到小反之
    public void selectSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        print(array);
    }


    //归并排序:
    public void mergeSort(){

    }



    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
