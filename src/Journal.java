public class Journal implements Resource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void borrow(String name){
        System.out.println(name + " is borrowing a journal titled " + title);
    }
}