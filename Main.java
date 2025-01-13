import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        filler();

    }

    //a little system with a HashMap:
    public static void filler() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        HashMap<String, Integer> users = new HashMap<>();

        System.out.println("What would you like your username to be?");
        String username = scanner.nextLine();

        int id = random.nextInt(100_000_000, 1_000_000_000) + 1;

        users.put(username, id);
        System.out.println(users);
    }

    public static void learnAboutArrayAndLinkedList() {
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

        //HashMap

        HashMap<String, Integer> users = new HashMap<>();
        users.put("Paul", 69420);
        users.clear(); //deletes Paul and the custom id
        System.out.println(users);
    }

}
