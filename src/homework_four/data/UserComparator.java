package homework_four.data;


import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class UserComparator <T extends User> implements Comparator<T> {

    @Override
    public int compare(@NotNull T o1, @NotNull T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
