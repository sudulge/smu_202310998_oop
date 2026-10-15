class HashValue {
    private String str;
    private long hashValue;

    public HashValue(String str, long value) {
        this.str = str;
        this.hashValue = value;
    };
    public long getValue() {
        return hashValue;
    };
    public String getString() {
        return str;
    };
}


class Hash {
    private int hashBase; // final이 들어갈수도
    private int hashSize;

    public Hash(int hashBase, int hashSize) {
        this.hashBase = hashBase;
        this.hashSize = hashSize;
    };
    public long getHashValue(String str) {
        double result = 1.0;
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i)* Math.pow((double) hashBase, str.length()-i-1);
        }
        return (long) (result % hashSize);
    };
}


public class MP05 {
    private HashValue[] hashValues;
    private Hash hash;

    MP05(int hashBase, int hashSize, String s) {
        createHash(hashBase, hashSize);
        setString(s);
    };
    
    
    public void setString(String str) {
        String[] strs = str.split(" ");
        hashValues = new HashValue[strs.length];
    
        for (int i = 0; i < strs.length; i++) {
            String k = strs[i].trim();
            // k의 끝에 마침표 쉼표 세미콜론 제거;
            char ch = k.charAt(k.length()-1);
            if (ch == ',' || ch == '.' || ch==';') {
                k = k.substring(0, k.length()-1);
            }
            long idx = hash.getHashValue(k);
            hashValues[i] = new HashValue(k, idx);
        }
    };

    public void printHashValues() {
        for (HashValue data: hashValues) {
            System.out.printf("%s: %d\n", data.getString(), data.getValue());
        }
    };

    public boolean isInWords(String s) {
        long hash_ = hash.getHashValue(s);
        for (HashValue data: hashValues) {
            if (data.getValue()==hash_) {
                if (s.equals(data.getString())) {
                    return true;
                }
                return false;
            }
        }
        return false;
    };

    void createHash(int hashBase, int hashSize) {
        hash = new Hash(hashBase, hashSize);
    };
    

    public static void main(String[] args) {
        String s1 = "There was no lack of material; boys happened along every little while; they came to jeer, but remained to whitewash.";
        String s2 = "Tom gave up the brush with reluctance in his face, but alacrity in his heart.";

        MP05 midterm = new MP05(3, 47, s1);
        midterm.printHashValues();
        System.out.println(midterm.isInWords("remained"));
        System.out.println(midterm.isInWords("gave"));

        System.out.println("\n\nCreates a new hash and sets a new string");

        midterm.createHash(3, 37);
        midterm.setString(s2);
        midterm.printHashValues();
        System.out.println(midterm.isInWords("remained"));
        System.out.println(midterm.isInWords("gave"));
    }
}
