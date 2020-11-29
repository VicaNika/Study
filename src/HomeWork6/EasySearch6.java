package HomeWork6;

public class EasySearch6 implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        String textLC = text.toLowerCase();


        long count = 0;
        int index = 0;

        while (index != -1) {
            index = textLC.indexOf(word,index);
            if (index != -1) {
                count++;
                index++;
            }

        }
        return count;

    }

}
