import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(11);
        list.add(22);

        long startTime = System.nanoTime();
        list.addFirst(100);
        long endTime = System.nanoTime();
        System.out.println("LinkedList头部增加的运行时间： " + (endTime - startTime) + "纳秒");
        System.out.println(list);

        startTime = System.nanoTime();
        list.addLast(200);
        endTime = System.nanoTime();
        System.out.println("LinkedList尾部增加的运行时间： " + (endTime - startTime) + "纳秒");
        System.out.println(list);

        startTime = System.nanoTime();
        list.removeFirst();
        endTime = System.nanoTime();
        System.out.println("LinkedList头部删除的运行时间： " + (endTime - startTime) + "纳秒");  
        System.out.println(list);
        
        startTime = System.nanoTime();
        list.removeLast();
        endTime = System.nanoTime();
        System.out.println("LinkedList尾部删除的运行时间： " + (endTime - startTime) + "纳秒");        
        System.out.println(list);
    }
}
