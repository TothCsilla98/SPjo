package dp_lab2;

public class StatisticsCommand implements Command{
	  public void execute() {
		    BookStatistics stats = new BookStatistics();
		    DocumentManager.getInstance().getBook().accept(stats);
		    stats.printStatistics();
 }

}
