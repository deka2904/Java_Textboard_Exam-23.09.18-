package Article.View;

import Article.Model.Article;

import java.util.ArrayList;

public class ArticleView {
    public void Printlist(ArrayList<Article> list){
        System.out.println("------------------");
        for (int i = 0; i < list.size() ; i++) {
            Article article = list.get(i);
            System.out.println("[번호] : " + article.getId());
            System.out.println("[제목] : " + article.getTitle());
            System.out.println("------------------");
        }
    }
    public void PrintAlllist(Article article){
        System.out.println("------------------");;
        System.out.println("[번호] : " + article.getId());
        System.out.println("[제목] : " + article.getTitle());
        System.out.println("[내용] : " + article.getContent());
        System.out.println("[시간] : " + article.getTime());
        System.out.println("[조회수] : " + article.getView_count());
        System.out.println("------------------");
    }
}

