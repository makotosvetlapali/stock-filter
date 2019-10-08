
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;


public class MakeMeRich {
	public static final List<String> symbols = Arrays.asList("AMD", "HPQ",
			"IBM", "TXN", "VMW", "XRX", "AAPL", "ADBE", "AMZN", "CRAY", "CSCO",
			"SNE", "GOOG", "INTC", "INTU", "MSFT", "ORCL", "TIBX", "VRSN",
			"YHOO");

	public static void main(String[] args) {
		
		symbols.stream().forEach((Each) ->
				System.out.print(Each + ", "));
		symbols.stream().forEach((Each) ->
				System.out.println(StockUtil.getPrice(Each)));

				List<StockInfo> StockP = new ArrayList<StockInfo>();
				for (String str1ng : symbols) {
					StockP.add(StockUtil.getPrice(str1ng));}
				System.out.println(StockP);
		
	}

}
