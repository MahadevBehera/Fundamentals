import java.util.*;

public class CollectionRotateLogic {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sun Mon Tue Wed Thu Fri Sat".split(" "));
		System.out.println(list);
		Collections.rotate(list, 3); // 0th index element will be move to 3rd index and rest of all also
		System.out.println(list);
	}

}
