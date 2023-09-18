package Article.Model;

import java.util.ArrayList;
import util.util;
public class ArticleFunction {
    ArrayList<Article> articles = new ArrayList<>();
    public ArticleFunction(){
        Article a1 = new Article(1, "Java", "객체지향 프로그래밍", util.time());
        Article a2 = new Article(2, "C", "절차지향 프로그래밍", util.time());
        Article a3 = new Article(3, "C++", "객체지향 프로그래밍", util.time());

        articles.add(a1);
        articles.add(a2);
        articles.add(a3);
    }
    int id = 4;
    public void insert(String title, String content){
        Article article = new Article(id, title, content, util.time());
        articles.add(article);
        id++;
    }

    public void delete(Article article){
        articles.remove(article);
    }
    public ArrayList<Article> findArticlelist(){
        return articles;
    }

    public Article findById(int id){
        Article target = null;
        for (int i = 0; i < articles.size() ; i++) {
            Article article = articles.get(i);
            if(id == article.getId()){
                target = article;
            }
        }
        return target;
    }

    public ArrayList<Article> findByTitle (String keyword){
        ArrayList<Article> searchedTitle = new ArrayList<>();
        for (int i = 0; i < articles.size() ; i++) {
            Article article = articles.get(i);
            String title = article.getTitle();

            if(title.contains(keyword)){
                searchedTitle.add(article);
            }
        }
        return searchedTitle;
    }
}
