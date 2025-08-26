
import java.util.List;
import java.util.NoSuchElementException;

public class SearchEngine {

    Searchable findBestMatch(List<? extends Searchable> items, String search) {
        if (items == null || items.isEmpty() || search == null || search.isEmpty()) {
            throw new IllegalArgumentException("Items list or search string cannot be empty");
        }

        Searchable bestItem = null;
        int maxCount = -1;

        for (Searchable item : items) {
            int count = countOccurrences(item.getSearchTerm(), search);
            if (count > maxCount) {
                maxCount = count;
                bestItem = item;
            }
        }

        if (bestItem == null) {
            throw new NoSuchElementException("No matching element found");
        }

        return bestItem;
    }


    private int countOccurrences(String text, String subText) {
        int count = 0;
        int startIndex = 0;
        while ((startIndex = text.indexOf(subText, startIndex)) != -1) {
            count++;
            startIndex += subText.length(); // Переходим дальше после найденного совпадения
        }
        return count;
    }
}

