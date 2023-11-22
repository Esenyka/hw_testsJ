package FinalWork.test;

import FinalWork.project.ListsCommunication;
import FinalWork.project.WorkList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectTest {
    @Test
    void getMidTest(){
        WorkList wl1 = new WorkList("1,2,3");
        WorkList wl2 = new WorkList("1,2,3,4");
        WorkList wl3 = new WorkList("1,2,3,f");

        assertThat(wl1.getMiddle()).isEqualTo(2.0f);
        assertThat(wl2.getMiddle()).isEqualTo(2.5f);
        assertThat(wl3.getMiddle()).isEqualTo(0);

    }
    @Test
    void ListsCommunicationTest() {
        WorkList wl1 = new WorkList("1,2,3");
        WorkList wl2 = new WorkList("1,2,3");
        WorkList wl3 = new WorkList("1,2,3,d");
        WorkList wl4 = new WorkList("1,2,3,4");
        WorkList wl5 = new WorkList("1,2,3,4,5");
        WorkList wl6 = new WorkList("1,2,3,4,5");

        ListsCommunication lc1 = new ListsCommunication(wl1, wl4);
        ListsCommunication lc2 = new ListsCommunication(wl1, wl3);
        ListsCommunication lc3 = new ListsCommunication(wl4, wl2);
        ListsCommunication lc4 = new ListsCommunication(wl5, wl6);

        assertThat(lc1.makeComparison()).isEqualTo("Второй список имеет большее среднее значение");
        assertThat(lc2.makeComparison()).isEqualTo("Вы ввели что-то не то...");
        assertThat(lc3.makeComparison()).isEqualTo("Первый список имеет большее среднее значение");
        assertThat(lc4.makeComparison()).isEqualTo("Средние значения равны");

    }
}
