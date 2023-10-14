package assignment;
	import java.util.*;

	public class ShuffleArray {
	    public static void main(String[] args) {
	        Integer[] array = {11, 2, 23, 44, 15, 36, 17};
	        List<Integer> list = Arrays.asList(array);
	        Collections.shuffle(list);
	        array = list.toArray(new Integer[0]);
	        System.out.println(Arrays.toString(array));
	    }
	}
