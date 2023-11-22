package FinalWork.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkList {
    float size;
    float count;
    String[] nums;

    public WorkList(String numbers) {
        this.nums = numbers.split(",");
    }

    public float getMiddle() {
        try {
            this.size = this.nums.length;
            for (int i = 0; i <= this.nums.length - 1; i++) {
                this.count = this.count + Integer.parseInt(this.nums[i]);
            }
            return this.count / this.size;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
