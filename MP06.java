// 홍혁수 202310998

class WordsCounter {
    private WordArray wordarray;
    private String string;
    private char[] delimiters;

    WordsCounter(String s, char[] delims) {
        string = s;
        delimiters = delims;
        splitWords(s);
    };
    
    public boolean hasWords() {
        if (wordarray.getCount() > 0) {
            return true;
        }
        return false;
    };

    public void splitWords(String s) {
        String[] strs = s.split(" ");
        addWords(strs);
    };

    public String toString() {
        String result = "";
        for (String s: string.split(" ")) {
            result += s + "\n\n";
        }
        return result;
    };

    private boolean isDelimiter(char ch) {
        for (char c: delimiters) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    };

    private String trimWords(String s) {
        return s.trim();
        // 특수문자 제거
    };

    private void addWords(String[] strs) {
        wordarray = new WordArray(strs.length);
        for (String str: strs) {
            if (str != "") {
                wordarray.add(trimWords(str).toLowerCase());
            }
        }
    };
}

class Word {
    private String word;
    private int count;

    Word(String w) {
        word = w;
        count = 1;
    };

    public void increaseCount() {
        count++;
    };

    public boolean equals(String s) {
        return word.equals(s);
    };

    public String toString() {
        return word + Integer.toString(count);
    };
}

class WordArray {
    private Word[] wordarray;
    private int maxcount;
    private int count = 0;

    WordArray(int maxCount) {
        wordarray = new Word[maxCount];
        maxcount = maxCount;
    };

    public int getCount() {
        return count;
    };

    public Word get(int idx) {
        if (0 < idx && idx < maxcount) {
            return wordarray[idx];
        }
        else {
            return null;
        }
    };

    public void add(String s) {
        for (int i = 0; i < count; i++) {
            if (wordarray[i].equals(s)) {
                wordarray[i].increaseCount();
            }
        }
        Word word = new Word(s);
        if (getCount() < maxcount) {
            wordarray[getCount()] = word;
            count++;
        }
        else {
            System.out.println("wordarray가 꽉참.");
        }
    };
}

public class MP06 {
    public static void main(String[] args) {
        String text1 = "I suppose, however, that the majority of at least competent votes would, all things considered, be divided between Emma and the present book; and perhaps the vulgar verdict (if indeed a fondness for Miss Austen be not of itself a patent of exemption from any possible charge of vulgarity) would go for Emma. It is the larger,  the more varied, the more popular;  ; the author had by the time of its composition seen rather more of the world, and had improved her general, though not her most peculiar and characteristic dialogue; such figures as Miss Bates, as the Eltons, cannot but unite the suffrages of everybody.";
        String text2 = "The goodness of the minor characters in Pride and Prejudice has been already alluded to, and it makes a detailed dwelling on their beauties difficult in any space, and impossible in this. Mrs. Bennet we have glanced at, and it is not easy to say whether she is more exquisitely amusing or more horribly true. Much the same may be said of Kitty and Lydia; but it is not every author, even of genius, who would have differentiated with such unerring skill the effects of folly and vulgarity of intellect and disposition working upon the common weaknesses of woman at such different ages.";
        
        char[] delimiters = { '.', '(', ',', ')', ';' };

        WordsCounter wc = new WordsCounter(text1, delimiters);
        if (wc.hasWords()) {
            System.out.println(wc);
        }
        wc.splitWords(text2);
        if (wc.hasWords()) {
            System.out.println(wc);
        }
    }
}