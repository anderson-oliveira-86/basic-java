package basic.java.unit11.lesson106;

import basic.java.unit11.lesson104.HQ;

import java.util.Comparator;

public class HQByIdComparator implements Comparator<HQ> {

    @Override
    public int compare(HQ hq1, HQ hq2) {
        return hq1.getId().compareTo(hq2.getId());
    }
}
