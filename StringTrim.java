import java.util.*;

public class StringTrim{
	
	public static void main(String[] args){
		
		List<String> strings = Arrays.asList(args);
		strings.stream().forEach(str -> System.out.println(str.trim()));
		
	}
	
}