package dp_lab2;

public class DocumentManager {
  private static DocumentManager s = null;
  private static Carte book = null;

  public static DocumentManager getInstance() {
    if (s == null) {
      s = new DocumentManager();
    }
    return s;
  }

  public void setBook(Carte book) {
    this.book = book;
  }

  public static Carte getBook() {
    return book;
  }
}
