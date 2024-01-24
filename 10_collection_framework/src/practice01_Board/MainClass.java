package practice01_Board;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

  public static void main(String[] args) {

    BoardService boardService = new BoardService();
   
    // 1번째 해결방법
    List<BoardVo> boardList = boardService.getBoardList();
    
    for(int i = 0, size = boardList.size(); i < size; i++) {
     System.out.println(boardList.get(i));
    }
    
    // 2번째 해결방법
    for(int i = 0, size = boardList.size(); i < size; i++) {
      System.out.println(boardList.get(i).getBoardNo());
      System.out.println(boardList.get(i).getTitle());
      System.out.println(boardList.get(i).getWriter());
      System.out.println(boardList.get(i).getCreatedAt());
    }
    
  }

}
