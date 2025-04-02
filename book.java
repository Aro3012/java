class Book {
    private String Author;
    private String Title;
    private double Price;

    Book(String Author,String Title, double Price){
        this.Author=Author;
        this.Title=Title;
        this.Price=Price;
    }
    void display(){
        System.out.println("the Author of the book " +Title+" is "+Author+" and the price is "+Price);
    }
}
class bookDetail{
    public static void main(String[] args){
        Book bk = new Book("Ar","The life", 156.32);
        Book bk1 = new Book("Ar1","The lif1e", 15116.32);
        bk1.display();
        bk.display();
    }

}

