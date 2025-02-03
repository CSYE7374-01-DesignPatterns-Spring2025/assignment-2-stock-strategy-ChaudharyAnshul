package edu.neu.csye7374;

public interface PriceUpdateStrategy {
  double updatePrice(double currentPrice, int metric);
}
