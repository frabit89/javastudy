package pkg01_has_a;

public class Gun {
  
  public final static int MAX_BULLET = 20;
  private int bullet;
  
  public Gun() {
   bullet = 10;
  }

  public int getBullet() {
    return bullet;
  }

  public void setBullet(int bullet) {
    this.bullet = bullet;
  }
  
  public void shoot() {
    if(bullet == 0) {
      System.out.println("총알없음");
      return;
    }
    System.out.println("발사됨. 현재 총알:" + --bullet + "개");
  }
  
  public void reload(int bullet) {
    
    if(bullet <= 0) {
      System.out.println("총알이 제대로 안들어감");
      return;
    }
    if(this.bullet + bullet > MAX_BULLET) {
      System.out.println("총알 과다");
      return;
    }
    this.bullet += bullet;
    System.out.println(bullet + "발 장전. 현재" + this.bullet + "발 있음.");
  }
}
