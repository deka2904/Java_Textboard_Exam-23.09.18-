package Article.Model;

import util.util;

import java.util.ArrayList;

public class CommendFuction {
    ArrayList<Commend> commends = new ArrayList<>();

    public void insert(String commend){
        Commend c1 = new Commend(commend, util.time());
        commends.add(c1);

    }

    public ArrayList<Commend> findCommendlist(Article article){
        int id = article.getId();
        return commends;
    }
}
