import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class RandomPrint{
	
	public static void main(String[] args){
		
		if(args.length == 0){
			System.err.println("No arguments were passed when the application was started.");
			return;
		}
		List<String> argList = Arrays.asList(args);
		Collections.shuffle(argList);
		for(String str:argList){
			System.out.println(str);
		}
		argList.stream().forEach(str -> System.out.println(str));
		
	}
	
}