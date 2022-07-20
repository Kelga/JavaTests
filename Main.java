import java.util.Arrays;
import java.util.stream.*;

public class Main{

    public static void main(String[] args) {
        
        String[] text = new String[]{"Я коней", "Я люблю коней", "Я котов", "Ты конь", "кони", "коты", "собаки"};
        String[] words = new String[]{"КОн"};
        Stream<String> texts = Arrays.stream(text);

        Stream<String> result = finding(texts, words);
        result.forEach(System.out::println );

        texts.close();

    }

    public static Stream<String> finding(Stream<String> texts, String[] words){

        boolean first = true;
    
        for(String word : words){


            texts = texts.filter(s -> s.toLowerCase().contains(word.toLowerCase()));
                
        }

        return texts;

    }

}