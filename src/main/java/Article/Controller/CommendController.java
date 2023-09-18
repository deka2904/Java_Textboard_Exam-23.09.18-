package Article.Controller;

import Article.Model.Commend;
import Article.Model.CommendFuction;

import java.util.ArrayList;
import java.util.Scanner;

public class CommendController {
    ArrayList<Commend> commends = new ArrayList<>();
    CommendFuction commendFuction = new CommendFuction();
    Scanner scanner = new Scanner(System.in);
    public void commendAdd(){
        System.out.print("댓글 내용 : ");
        String commend = scanner.nextLine();

        commendFuction.insert(commend);
        System.out.println("댓글 추가 되었습니다.");
    }
}
