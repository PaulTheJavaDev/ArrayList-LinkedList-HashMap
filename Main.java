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
        namesArrayList.add(3, "Paul");
        
        //methods for ArrayList
        namesArrayList.add("Nick");
        namesArrayList.add("Ben");
        namesArrayList.add(1, "Paul"); //is set between Nick and Ben
        System.out.println(namesArrayList.get(1));
        System.out.println(namesArrayList.size());
        System.out.println(namesArrayList.contains("Ben"));
        System.out.println(namesArrayList.remove("Paul")); //String in this case
        System.out.println(namesArrayList.remove(1)); //removes Paul
        //and many more useful methods


        //faster at adding and removing an item for example namesLinkedList.add("Sebastian");
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Nick");
        namesLinkedList.add("Paul");
        namesLinkedList.add("Nicole");
        namesLinkedList.add("Daniel");

        //methods for LinkedList
        namesLinkedList.addFirst("Sebastian");
        namesLinkedList.addLast("Frederik");
        //System.out.println(namesLinkedList.removeFirst());
        //System.out.println(namesLinkedList.removeLast());
        System.out.println(namesLinkedList.getFirst());
        System.out.println(namesLinkedList.getLast());
        namesLinkedList.add(3, "Paulus");
        //and many more useful methods
    }

}
