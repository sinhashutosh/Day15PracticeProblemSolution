package org.example;

public class MyHashMapMain {
    public static void main(String[] args) {
        given_Sentence_When_Word_Are_Added_To_List_Should_Return_Word_Frequency();
    }

    private static void given_Sentence_When_Word_Are_Added_To_List_Should_Return_Word_Frequency() {
        String sentance = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] word = sentance.toLowerCase().split(" ");
        for (String itr : word) {
            Integer value = myHashMap.get(itr);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(itr, value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
        System.out.println("Frequency of give word 'to' is " + frequency);
    }
}
