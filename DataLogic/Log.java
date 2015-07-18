package DataLogic;

import java.sql.Time;
import java.time.LocalTime;

public class Log {
	Instrument inst;
	String symbol;
	Time entryTime, exitTime;
	String type;
	double size;
	Price entryPrice, exitPrice, stopLoss, takeProfit;
	Price tax, commission, swap, profit;
	String result;
	
	LocalTime time;
	
	public Log() {
		this.inst = Instrument.FOREX;
		this.symbol = "";
		this.entryTime = Time.valueOf(time);
		this.type = "BUY";
		this.size = 0.0;
		this.entryPrice = 
	}
}
