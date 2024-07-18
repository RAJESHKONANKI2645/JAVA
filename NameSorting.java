import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameSorting
{
    public static void main(String[] args)
	{   
        List<String> names = new ArrayList<>();
        names.add("Banana");
        names.add("Carrot");
        names.add("Apple");
        names.add("Radish");
        Collections.sort(names);
        System.out.println("Names in ascending order:");
        for (String name : names) 
{
            System.out.println(name);
        }
    }
}
