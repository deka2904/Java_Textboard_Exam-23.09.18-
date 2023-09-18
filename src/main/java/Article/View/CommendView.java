package Article.View;

import Article.Model.Article;
import Article.Model.Commend;

import java.util.ArrayList;

public class CommendView {
    public void Printlist(ArrayList<Commend> list){
        System.out.println("------------------");
        for (int i = 0; i < list.size() ; i++) {
            Commend commend = list.get(i);
            System.out.println("[댓글] : " + commend.getCommend());
            System.out.println("[시간] : " + commend.getTime());
            System.out.println("------------------");
        }
    }
    public void PrintAlllist(Article article, Commend commend){
        System.out.println("------------------");;
        System.out.println("[댓글] : " + commend.getCommend());
        System.out.println("[시간] : " + commend.getTime());
        System.out.println("------------------");
    }
}
