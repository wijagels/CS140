package lab07;

public class Book2
{
    private String title;
    private int pageCount;
    private boolean required;
    private int bookmark;

    public Book2(String title, int pageCount, boolean required, int bookmark) {
        this.title = title;
        this.pageCount = pageCount;
        this.required = required;
        this.bookmark = bookmark;
    }

    public boolean hasBeenRead()
    {
        return bookmark == pageCount;
    }

    public double computeCompleted()
    {
        return (double)bookmark / pageCount;
    }

    public void setBookmark(int newPageNumber)
    {
        bookmark = newPageNumber;
    }

    public String getTitle() {

        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean isRequired() {
        return required;
    }

    public int getBookmark() {
        return bookmark;
    }

    public String toString()
    {
        return title + ", " + pageCount +
                ", " + (isRequired() ? "" : "not ") + // Conditional Operator
                "required" +
                ", currently up to page " + bookmark +
                ", " + computeCompleted() * 100 + "% completed";
    }
}