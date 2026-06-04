public class Bottle {

  private double capacity;
  private double amount;
  
  public Bottle(double capacity) {
    this.capacity = capacity;
    amount = capacity;
  }

  public double updateAmount(double amt) {
    amount -= amt; // newAmount - 750.0 = 250.0

    if (amount < 0.25 * capacity) { // if the new amount is less than 250.0, then refill the bottle
      amount = capacity; // 250.0 is set to 1000.0 all over again
    }

    return amount;
  }
  
}
