package homework_third.service;

import homework_third.data.Potok;
import homework_third.data.StreamComparator;
import homework_third.data.StudentGroup;

import java.util.ArrayList;
import java.util.List;

public class PotokService {

    private Potok potok;

    public void createPotokService(List<StudentGroup> listGroups) {
        this.potok = new Potok(listGroups);
    }

    public List<Potok> sortBySize(List<Potok> potokList) {
        List<Potok> list = new ArrayList<>(potokList);
        list.sort(new StreamComparator());
        return list;
    }


}
