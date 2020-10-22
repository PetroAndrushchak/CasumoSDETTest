package helpers;

public class StringHelper {

  private StringHelper() {
    throw new UnsupportedOperationException();
  }

  public static boolean isVowelsInString(String string) {
    if (string == null || string.isEmpty()) {
      return false;
    }
    char[] arraysOfChars = string.toCharArray();
    boolean foundVowel = false;
    for (char arraysOfChar : arraysOfChars) {
      if (isVowel(arraysOfChar)) {
        foundVowel = true;
        break;
      }
    }
    return foundVowel;
  }

  private static boolean isVowel(char c) {
    return String.valueOf(c).matches("[AEIOUaeiou]");
  }

}
