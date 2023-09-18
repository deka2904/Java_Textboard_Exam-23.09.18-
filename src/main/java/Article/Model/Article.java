package Article.Model;

public class Article {
    int id;
    String title;
    String content;
    String time;
    int view_count;

    Article(int id, String title, String content, String time){
        this.id = id;
        this.title = title;
        this.content = content;
        this.time = time;
    }
    public void setView_count(int view_count) {
        this.view_count = view_count;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getView_count() {
        return view_count;
    }
    public String getTime() {
        return time;
    }
    public String getContent() {
        return content;
    }
    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
}
