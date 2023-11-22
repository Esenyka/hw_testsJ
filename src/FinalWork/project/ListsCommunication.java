package FinalWork.project;

public class ListsCommunication{
    float numMid1;
    float numMid2;

    public ListsCommunication(WorkList wl1, WorkList wl2) {
        this.numMid1 = wl1.getMiddle();
        this.numMid2 = wl2.getMiddle();
    }

    public String makeComparison() {
        if (this.numMid1 == 0 || this.numMid2 == 0){
            return "Вы ввели что-то не то...";
        }
        else if (this.numMid1 > this.numMid2) {
            return "Первый список имеет большее среднее значение";
        }
        else if (this.numMid1 < this.numMid2) {
            return "Второй список имеет большее среднее значение";
        }
        else {
            return "Средние значения равны";
        }
    }
}
