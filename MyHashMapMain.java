package org.example;

public class MyHashMapMain {
    public static void main(String[] args) {
        given_Sentence_When_Word_Are_Added_To_List_Should_Return_Word_Frequency();
    }

    private static void given_Sentence_When_Word_Are_Added_To_List_Should_Return_Word_Frequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid "
                + "but because they keep putting themselves "
                + "deliberately into paranoid avoidable situations";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(word, value);
        }
        System.out.println("Hash Map before deleting avoidable");
        System.out.println(myHashMap);
        System.out.println("*********************************");
        myHashMap.removeKey("avoidable");
        System.out.println("Hash Map after deleting avoidable");
        System.out.println(myHashMap);
    }
}
