import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);

//		List<Integer> squareList = new ArrayList<>();
//
//		for (Integer i : numberList) {
//			squareList.add(i * i);
//		}
//		System.out.println("squareList: " + squareList);

//		List<Integer> squareList = numberList.stream().map(x -> x * x).collect(Collectors.toList());
//		System.out.println("squareList: " + squareList);

//		Set<Integer> squareSet = new HashSet<>();
//		for (Integer i : numberList) {
//			squareSet.add(i * i);
//		}
//		System.out.println("squareset: " + squareSet);

//		Set<Integer> squareSet = numberList.stream().map(x -> x * x).collect(Collectors.toSet());
//		System.out.println("squareset: " + squareSet);
//		
		List<String> languages = new ArrayList<>();
		languages.add("Scala");
		languages.add("Java");
		languages.add("Python");
//		
//		List<String> filterResult=new ArrayList<>();
//		for (String s : languages) {
//			if(s.startsWith("P")) {
//				filterResult.add(s);
//			}	
//		}
//		System.out.println("filter result: "+filterResult);

//		List<String> filterResult = languages.stream().filter(s -> s.startsWith("P")).collect(Collectors.toList());
//		System.out.println("filter result: "+filterResult);
//		
//		List<String> sortedList=languages.stream().sorted().collect(Collectors.toList());
//		System.out.println("sorted list: "+sortedList);

		System.out.println("printing all elements one by one: ");
		languages.stream().forEach(y -> System.out.println("element is: " + y));

		int sum = numberList.stream().reduce(0, (ans, i) -> ans + i);
		System.out.println("sum = " + sum);
	}
}
