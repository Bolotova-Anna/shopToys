import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество  грушек, которое хотите добавить(не менее 3-х): ");
        int countJoy = scanner.nextInt();
        PriorityQueue<toy> ttt = new PriorityQueue<>(Comparator.comparingInt(toy::getLosRate));

        for (int i = 0; i < countJoy; i++) {
            toy newToy = add();
            ttt.add(newToy);
        }
        Queue<toy> list = new LinkedList<>();
        while (!ttt.isEmpty()){
            list.offer(ttt.poll());
        }
        System.out.println("новая коллекция:" + list);

    }
    private static toy add () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите name игрушки: ");
            String n = scanner.nextLine();
            System.out.println("введите losRate игрушки, учитывая," +
                    " что сумма losRate всех вместе игручшек должна быть не больше 10");
            Integer l = scanner.nextInt();
            System.out.println("введите id игрушки");
            Integer i = scanner.nextInt();
            toy t1 = new toy(i, l, n);
            System.out.println(t1.toString());
            return t1;
        }
  
}
