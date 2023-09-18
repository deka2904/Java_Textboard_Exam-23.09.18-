package Article.Controller;

import java.util.Scanner;

public class BoardApp {
    ArticleController articleController = new ArticleController();
    public void start(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("명령어 : ");
            String func = scanner.nextLine();
            if(func.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else if(func.equals("add")){
                articleController.add();
            }else if(func.equals("list")){
                articleController.list();
            }else if(func.equals("update")){
                articleController.update();
            }else if(func.equals("delete")){
                articleController.delete();
            }else if(func.equals("detail")){
                articleController.detail();
            }else if(func.equals("search")){
                articleController.search();
            }
        }
    }
}
