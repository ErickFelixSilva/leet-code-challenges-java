package felix.silva.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TagContentExtractor {
    public String extract(String line) {
        List<String> result = new ArrayList<>();

        List<String> openingTags = new ArrayList<>();
        List<String> closingTags = new ArrayList<>();
        StringBuilder tagType = new StringBuilder();
        StringBuilder tagContent = new StringBuilder();
        boolean insideTag = false;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '>') {
                insideTag = false;
                if (tagType.indexOf("/", 0) == -1) {
                    if (!openingTags.isEmpty()) {
                        tagContent.setLength(0);
                    }
                    openingTags.add(tagType.toString());
                } else {
                    closingTags.add(tagType.toString());
                }
                tagType.setLength(0);
            } else if (line.charAt(i) == '<') {
                insideTag = true;
            } else {
                if (insideTag) {
                    tagType.append(line.charAt(i));
                } else {
                    tagContent.append(line.charAt(i));
                }
            }

            if (!openingTags.isEmpty() && openingTags.size() == closingTags.size()) {
                Iterator<String> it = openingTags.iterator();
                while (it.hasNext()) {
                    String tag = it.next();
                    String closingTag = "/" + tag;
                    if (!tag.isEmpty() && closingTags.contains(closingTag)) {
                        it.remove();
                        closingTags.remove(closingTag);
                    }
                }
                if (openingTags.isEmpty() && closingTags.isEmpty() && !tagContent.toString().isEmpty()) {
                    result.add(tagContent.toString());
                } else {
                    openingTags = new ArrayList<>();
                    closingTags = new ArrayList<>();
                }
                tagContent.setLength(0);
            }
        }

        if (result.isEmpty()) {
            return "None";
        }
        return String.join("\n", result);
    }
}
