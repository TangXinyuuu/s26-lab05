package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *
     * @param froggerId frogger identity record
     * @return Return false if the record has existed. Else, return true.
     */
    public boolean addRecord(FroggerID froggerId) {
        for (FroggerID row : this.records) {
            if (row.equals(froggerId)) {
                return false;
            }
        }
        this.records.add(froggerId);
        return true;
    }
}