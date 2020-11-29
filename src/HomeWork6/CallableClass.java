package HomeWork6;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.List;

public class CallableClass implements Callable<Integer> {

private ISearchEngine search = new RegExSearch6();
private final String text;
private final String word;

    public CallableClass(ISearchEngine search, String text, String word) {

        this.search = search;
        this.text = text;
        this.word = word;

    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int count = (int) search.search(text, word);


        return count;
    }
}
