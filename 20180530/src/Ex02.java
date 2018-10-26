import java.util.Arrays;
import java.util.List;

interface CheckElement{
	boolean check(Integer i);
}

public class Ex02 {
	public static void doprint(List<Integer> list, CheckElement check){
		for(int ele : list){
			if(check.check(ele)){
				System.out.println(ele);
			}
		}
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(300,100,200,600,400);
		
		doprint(list, new CheckElement() {
			@Override
			public boolean check(Integer i) {
				return true;
			}
		});
		System.out.println();
		doprint(list, (i)->{
			if(i>=300)
				return true;
			else
				return false;
		});
	}
	
	
}





