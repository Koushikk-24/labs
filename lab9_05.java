//Write a program that reads a five-letter word from the user and produces all possible three letter words that can be derived from the letters of the five letter word. For example, the three letter words produced from the word “bathe” include the commonly used words “ate,” “bat,” “bet,” “tab,”, “hat,” “the” and “tea.” 
public class lab9_05 {
    public static void main(String[] args) {
        String word = "bathe";
        String arr[] = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            arr[i] = word.substring(i, i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    System.out.println(arr[i] + arr[j] + arr[k]);
                }
            }
        }

}
}