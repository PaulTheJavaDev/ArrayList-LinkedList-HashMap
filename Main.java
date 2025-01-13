import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //faster at getting an item for example namesArrayList.get(index);
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Nick");
        namesArrayList.add("Paul");
        namesArrayList.add("Nicole");
        namesArrayList.add("Daniel");
        namesArrayList.add(3, "Paulus");

        //faster at adding and removing an item for example namesLinkedList.add("Sebastian");
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Nick");
        namesLinkedList.add("Paul");
        namesLinkedList.add("Nicole");
        namesLinkedList.add("Daniel");

        //methods for LinkedList
        namesLinkedList.addFirst("Sebastian");
        namesLinkedList.addLast("Frederik");
        namesLinkedList.removeFirst();
        namesLinkedList.removeLast();
        namesLinkedList.getFirst();
        namesLinkedList.getLast();
        namesLinkedList.add(3, "Paulus");

      //HashMap soon
    }

}
