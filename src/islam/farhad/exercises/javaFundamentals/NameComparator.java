package islam.farhad.exercises.javaFundamentals;

import java.util.Comparator;

class NameComparator implements Comparator<islam.farhad.exercises.javaFundamentals.Student> {

    @Override
    public int compare(islam.farhad.exercises.javaFundamentals.Student o1, islam.farhad.exercises.javaFundamentals.Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
