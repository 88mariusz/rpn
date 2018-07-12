import java.util.LinkedList;
import java.util.List;

public class LuxoftMainApp {

	public static void main(String[] args) {

		LuxoftMainApp mainApp = new LuxoftMainApp();
		mainApp.task1();

	}

	private void task1() {

		List<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		l.stream().filter(n -> n >2).forEach(System.out::println);
		
		System.out.println("hello Luxoft");
		System.out.println(null == null);

	}

}
