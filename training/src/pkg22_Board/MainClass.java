package pkg22_Board;

import java.util.List;

public class MainClass {

  public static void main(String[] args) {
    
    BoardService boardService = new BoardService();
    
    List<BoardVo> boardList = boardService.getBoardList();
    
    for(int i = 0, size = boardList.size(); i < size; i++) {
      System.out.println(boardList.get(i));
    }
    
    for(int i = 0, size = boardList.size(); i < size; i++) {
      System.out.print(boardList.get(i).getBoardNo() + ",");
      System.out.print(boardList.get(i).getTitle() + ",");
      System.out.print(boardList.get(i).getWriter() + ",");
      System.out.print(boardList.get(i).getCreatedAt() + ",");
      System.out.println();
    }
    
  }

}
