public class PhraseOMatic {
  public static void main (String[] args) {
    String[] wordListOne = { "Fight", " Club", "multi-tier", "7 days a week", "more words", "blah blah"};
    String[] wordListTwo = {"Awesome", "Empowered", "So Nice", "Listing", "List List", "Yay!"};
    String[] wordListThree = {"Process", " tippingpoint", "Creative", "saturday", "java", "java java", "java java java"};

    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    int rand1 = (int) Math.random() * oneLength;
    int rand2 = (int) Math.random() * twoLength;
    int rand3 = (int) Math.random() * threeLength;

    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

  }


}