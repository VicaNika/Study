package HomeWork5;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        String textLC = text.toLowerCase();
        String word1 = " " + word;

        long count = 0;
        int index = 0;

       while (index != -1) {
            index = textLC.indexOf(word1, index);
            if (index != -1) {
                count++;
                index++;
            }

        }
        return count;
    }
    
}
