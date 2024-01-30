package pkg03_dql;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * DTO
 * 1. Data Transfer Object
 * 2. 데이터베이스의 데이터를 자바와 주고 받을 때 사용하는 객체이다.
 * 3. 기본적으로 테이블 하나당 DTO 하나를 만든다.
 * 4. 필드는 칼럼에 매칭하고 생성자와 Getter/Setter 를 만든다.
 */
//생성자와 Getter/Setter => lombok 사용 : 외부 라이브러리 이름
// project build path 에 넣고, eclipse 에 설치도 필요.
// cmd 내 명령어 java -jar lombok.jar / 설치 시 eclipse.exe 로 경로 설정
// 설치 후 이클립스가 실행이 안될 시, eclipse.ini를 열고 마지막 줄 삭제 후 저장.
//noargs: 인자가 없다.
//ResultSet 한줄씩 행단위로 찾음 rs.next() (true/false) 행마다 한번씩 호출해야함


@ToString               /* toString() */
@NoArgsConstructor      /* default constructor */
@AllArgsConstructor     /* constructor using field */
@Getter
@Setter
public class SampleDto {

  private int sample_no;
  private String sample_content;
  private String sample_editor;
  private Date sample_dt;
}
