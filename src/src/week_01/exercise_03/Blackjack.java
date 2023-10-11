package week_01.exercise_03;

public class Blackjack {

public int parseCard (String card) {

   switch (card) {
      case "ace" -> {
         return 11;
      }
      case "ten", "king", "queen", "jack" -> {
         return 10;
      }
      case "nine" -> {
         return 9;
      }
      case "eight" -> {
         return 8;
      }
      case "seven" -> {
         return 7;
      }
      case "six" -> {
         return 6;
      }
      case "five" -> {
         return 5;
      }
      case "four" -> {
         return 4;
      }
      case "three" -> {
         return 3;
      }
      case "two" -> {
         return 2;
      }
      default -> {
         return 0;
      }
   }
}

public String firstTurn (String firstCard,
                         String secondCard,
                         String dealerCard) {

   int parseDealerCard = parseCard(dealerCard);
   int parseFirstCard = parseCard(firstCard);
   int parseSecondCard = parseCard(secondCard);
   int firstHand = parseFirstCard + parseSecondCard;
   String result;

   if (firstHand > 20) {
      result = largeHand(isBlackjack(firstCard, secondCard), parseDealerCard);
      if (firstCard.equals("ace") && secondCard.equals("ace")) {
         result = "P";
      }
      return result;
   }
   return smallHand(firstHand, parseDealerCard);
}

public boolean isBlackjack (String firstCard,
                            String secondCard) {

   int card1 = parseCard(firstCard);
   int card2 = parseCard(secondCard);
   int sum = card1 + card2;

   return sum == 21;
}

public String largeHand (boolean isBlackJack,
                         int dealerScore) {

   if (isBlackJack && (! (dealerScore >= 10))) {
      return "W";
   }
   else {
      return "S";
   }
}

public String smallHand (int handScore,
                         int dealerScore) {

   if (handScore >= 17) {
      return "S";
   }
   else if (handScore <= 11) {
      return "H";
   }
   else if (handScore > 11 && handScore < 17) {
      if (dealerScore >= 7) {
         return "H";
      }
      else {
         return "S";
      }
   }
   return "S";
}

}
