public class Books {

    private String title;
            String author;
            int year;
            String category;
            int pos;

    public Books(String title, String author, int year, String category, int pos){
        this.title = title;
        this.author = author;
        this.year = year;
        this.category = category;
        this.pos = pos;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setPos(int pos){
        this.pos = pos;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String getCategory() {
        return this.category;
    }

    public int getPos() {
        return this.pos;
    }

}
