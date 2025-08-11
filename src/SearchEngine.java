import java.util.List;

public class SearchEngine {

    public Searchable findBestMatch(List<? extends Searchable> items, String search) {
        if (items == null || items.isEmpty() || search == null || search.isEmpty()) {
            return null; // Обработка граничных случаев
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

        return bestItem;
    }

    private int countOccurrences(String text, String subText) {
        int count = 0;
        int startIndex = 0;
        while ((startIndex = text.indexOf(subText, startIndex)) >= 0) {
            count++;
            startIndex += subText.length();
        }
        return count;
    }
}