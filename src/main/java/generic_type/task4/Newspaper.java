package generic_type.task4;

public class Newspaper extends  GenericItem{

    private int pages;

    public Newspaper(String title, int pages) {
        super(title);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String
    toString() {
        return "Newspaper{" +
                "pages=" + pages +
                '}';
    }
}
