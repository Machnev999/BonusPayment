public class main {

  public static void main(String[] args) {
    int balance = 100;
    int payment = 1700;
    int outcome;

    int bonus = (payment > 1000) ? (payment / 100) : 0;

    if (payment > 1000) {
      outcome = payment / 100 + balance + payment;
    } else {
      outcome = 0 + balance + payment;
    }

    System.out.println(outcome);
    System.out.println(bonus);

  }
}