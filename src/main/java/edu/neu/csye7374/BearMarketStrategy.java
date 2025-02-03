package edu.neu.csye7374;

class BearMarketStrategy implements PriceUpdateStrategy {
  public double updatePrice(double currentPrice, int metric) {
      return currentPrice * (1 - (metric * 0.01));
  }
}