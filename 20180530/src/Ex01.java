import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 오전
 * 람다식..
 * httpconnection 로또번호확인..
 * Socket string 서버랑 통신
 * 
 * 오후
 * JQeury 메서드 3~4
 */
public class Ex01 {
	//list 내용을 출력하는 static 
	public static void doPrint(List<Integer> list){
		for(int i =0; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
	}
	public static void doPrint2(List<Integer> list){
		for(int element:list){
			if(element>=300)
				System.out.println(element);
		}
	}
	public static void main(String[] args) {
//		List li = new ArrayList<>();
//		li.add(100);
//		li.add(200);
//		li.add(300);
		
		List<Integer> list = Arrays.asList(100,200,300,600,400);
		doPrint(list);
		System.out.println();
		doPrint2(list);
	}
}
