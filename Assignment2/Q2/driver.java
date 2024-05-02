package Assignment2.Q2;

  class Book{
    int bookId;
    String bookName;
    double price;
    Book(int bookId, String bookName, double price){
        this.bookId=bookId;
        this.bookName=bookName;
        this.price=price;
    }
    public int getbookId(){
        return this.bookId;
    }
    public String getbookName(){
        return this.bookName;
    }
    public double getprice(){
        return this.price;
    }
    public void setbookId(int bookId){
        this.bookId=bookId;
    }
    public void setbookName(String bookName){
        this.bookName=bookName;
    }
    public void setprice(double price){
        this.price=price;
    }
    @Override
    public String toString(){
        return "Book Id: "+this.bookId+"\nBook Name: "+this.bookName+"\nPrice: "+this.price;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book that = (Book) obj;
        return Double.compare(this.price, that.price) == 0;
    }
}
public class driver {
    public static void main(String[] args) {
        Book b1=new Book(1,"Java",200);
        Book b2=new Book(2, "Full Stack Development", 450);
        System.out.println(b1+"\n"+b2);

        System.out.println("Is price equal:"+b1.equals(b2));
    }
    

}
