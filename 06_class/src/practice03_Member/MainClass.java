package practice03_Member;

public class MainClass {
  public static void main(String[] args) {
    
    
    // 임의의 정보를 가지는 Member 1명을 만들고, 정보 출력하기

    // 필드를 이용한 생성자
    Address address = new Address("12345", "a", "b" , "c", "d", true);
    Contact contact = new Contact("02", "010");
    
    // 디폴트 형식 생성자 + setter
    
    //Member member = new Member("AA", new Contact(), new Address());
    Member member = new Member();
    //member.setId(null);
    //member.setAddress(new Address());
    //member.setContact(new Contact());
    member.setId("elsa");
    member.setAddress(address);
    member.setContact(contact);
    
    System.out.println("아이디:" +member.getId());
    System.out.println("주소:" + member.getAddress().getPostCode());
    System.out.println("도로명:" + member.getContact());
    System.out.println("지번:" + member.getAddress().getJibunAddress() );
    System.out.println("상세:" + member.getAddress().getDetailAddress());
    System.out.println("추가:" + member.getAddress().getExtraAddress());
    System.out.println("기본주소여부:" + member.getAddress().isBasicAddress());
    System.out.println("집전화:" + member.getContact().getTel());
    System.out.println("휴대전화:" + member.getContact().getMobile());
    // or
    // 필드를 이용한 생성자
    
    
    
    
    
  }
}
