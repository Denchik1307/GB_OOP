package homework_third.data;

import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<StudentGroup>{
    private int counter;
    private final List<StudentGroup> studentGroups;

    public Potok(List<StudentGroup> studentGroups) {
        this.counter = 0;
        this.studentGroups = studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            @Override
            public boolean hasNext() {
                counter++;
                return counter < studentGroups.size() -1;
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()){
                    return null;
                }
                return studentGroups.get(counter);
            }
        };
    }
    public void removeGroup(){
        this.studentGroups.remove(counter);
    }

    public void setCounterToZero(){
        this.counter = 0;
    }


    public List<StudentGroup> innerGroups() {
        return studentGroups;
    }

    public int howMachStudentGroups(){
        return studentGroups.size();
    }
}
