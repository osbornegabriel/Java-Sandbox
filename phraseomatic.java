public class PhraseOMatic {
  public static void main (String[] args) {
    // make three sets of words to choose from
    String[] wordListOne = { "Fight", " Club", "multi-tier", "7 days a week", "more words", "blah blah"};
    String[] wordListTwo = {"Awesome", "Empowered", "So Nice", "Listing", "List List", "Yay!"};
    String[] wordListThree = {"Process", " tippingpoint", "Creative", "saturday", "java", "java java", "java java java"};

    // Find out how many words are in each list
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    // generate three random numbers
    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    // now build a phrase
    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

    // print out the phrase
    System.out.println("What we need is a " + phrase);

  }


}