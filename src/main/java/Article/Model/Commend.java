package Article.Model;

public class Commend {
    int id;
    String commend;
    String time;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public Commend(String commend, String time){
        this.commend = commend;
        this.time = time;
    }
    public void setCommend(String commend) {
        this.commend = commend;
    }

    public String getCommend() {
        return commend;
    }
}
