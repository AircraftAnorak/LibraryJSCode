package libarysystem;

public class Books {
        String bookName;
        int bookcaseIndex;
        double bookPrice;

    public Books(String bookName, int bookcaseIndex, double bookPrice) {
        this.bookName = bookName;
        this.bookcaseIndex = bookcaseIndex;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookcaseIndex() {
        return bookcaseIndex;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookcaseIndex(int bookcaseIndex) {
        this.bookcaseIndex = bookcaseIndex;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
    
}
