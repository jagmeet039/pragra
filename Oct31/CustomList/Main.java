package Oct31.CustomList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        list.add(new Student("Jagmeet1",42));
        list.add(new Student("Jagmeet2",39));
        list.add(new Student("Jagmeet3",45));
        list.add(new Student("Jagmeet4",32));

        Iterator<Student> iterator = list.iterator();

        while (iterator.hasNext()){
            Student st = iterator.next();
            if(st.getAge() > 40){
                System.out.println(st.getName());
            }
        }
    }
}
