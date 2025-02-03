package edu.neu.csye7374;

/**
 * 
 * @author Yesha
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

		//Add your code in between these two print statements
		PlayStockMarket.simulateMarket();
		
		System.out.println("\n\n============Main Execution End===================");
	}

}

// Output

// ============Main Execution Start===================



// Tesla Market Trends:
// Initial Value TSLA [Price=600.0, Description=Tesla Stock]
// Bid: 600.00
// Price Post BID: TSLA [Price=666.0000000000001, Description=Tesla Stock]
// Matrix: 12
// Bid: 590.00
// Price Post BID: TSLA [Price=759.2400000000002, Description=Tesla Stock]
// Matrix: 16
// Bid: -610.00
// Price Post BID: TSLA [Price=888.3108000000002, Description=Tesla Stock]
// Matrix: 18
// Bid: -614.00
// Price Post BID: TSLA [Price=728.4148560000002, Description=Tesla Stock]
// Matrix: -18
// Bid: 600.00
// Price Post BID: TSLA [Price=866.8136786400003, Description=Tesla Stock]
// Matrix: 20
// Bid: -650.00
// Price Post BID: TSLA [Price=693.4509429120003, Description=Tesla Stock]
// Matrix: -20

// Apple Market Trends:
// Initial Value Apple [Price=100.0, Description=Apple Stock]
// Bid: 105.00
// Price Post BID: Apple [Price=92.0, Description=Apple Stock]
// Matrix: 8
// Bid: -95.00
// Price Post BID: Apple [Price=92.0, Description=Apple Stock]
// Matrix: 0
// Bid: -110.00
// Price Post BID: Apple [Price=97.52000000000001, Description=Apple Stock]
// Matrix: 6
// Bid: 90.00
// Price Post BID: Apple [Price=97.52000000000001, Description=Apple Stock]
// Matrix: 0
// Bid: 115.00
// Price Post BID: Apple [Price=85.81760000000001, Description=Apple Stock]
// Matrix: 12
// Bid: 100.00
// Price Post BID: Apple [Price=79.81036800000001, Description=Apple Stock]
// Matrix: 3

// Bid History:
// [tesla: 600.00, tesla: 590.00, tesla: -610.00, tesla: -614.00, tesla: 600.00, tesla: -650.00, apple: 105.00, apple: -95.00, apple: -110.00, apple: 90.00, apple: 115.00, apple: 100.00]


// ============Main Execution End===================