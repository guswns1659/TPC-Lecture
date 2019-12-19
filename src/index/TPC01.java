package index;

import kr.bit.Book;
import kr.bit.PersonVo;

/* 책과 사람이라는 객체자료형을 만들어보자
 *
 */
public class TPC01 {
    public static void main(String[] args) {
        Book book = new Book();
        PersonVo person = new PersonVo();
        book.title = "java is perfect";
        person.name = "HYUNJUN";
        System.out.printf("title : %s \n name : %s", book.title, person.name);
    }
}
