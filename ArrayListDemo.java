import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);

        long startTime = System.nanoTime();
        list.add(0, 100);
        long endTime = System.nanoTime();
        System.out.println("ArrayList头部增加的运行时间： " + (endTime - startTime) + "纳秒");
        System.out.println(list);

        startTime = System.nanoTime();
        list.add(200);
        endTime = System.nanoTime();
        System.out.println("ArrayList尾部增加的运行时间： " + (endTime - startTime) + "纳秒");
        System.out.println(list);

        startTime = System.nanoTime();
        list.remove(0);
        endTime = System.nanoTime();
        System.out.println("ArrayList头部删除的运行时间： " + (endTime - startTime) + "纳秒");  
        System.out.println(list);

        startTime = System.nanoTime();
        list.remove(2);
        endTime = System.nanoTime();
        System.out.println("ArrayList尾部删除的运行时间： " + (endTime - startTime) + "纳秒");  
        System.out.println(list);
    }
}
