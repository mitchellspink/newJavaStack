public class StringManipulator {
    public String trimAndConcat (String string1, String string2) {
        String new1 = string1.trim();
        String new2 = string2.trim();
        return new1 + new2;
    }

    public Integer getIndexOrNull (String string1, char findChar) {
        int index = string1.indexOf(findChar);
        if(index == -1) return null;
        else return index;
    }

    public Integer getIndexOrNull (String string1, String findChar) {
        int index = string1.indexOf(findChar);
        if(index == -1) return null;
        else return index;
    }

    public String concatSubstring(String string1, int num1, int num2, String string2) {
        String new1 = string1.substring(num1, num2);
        return new1 + string2;
    }
}