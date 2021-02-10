package calculator;

public class Calculator {

	public static int add(String text) {
		List<Integer>  list = new ArrayList<Integer>();
		if(text.isEmpty()) {
			return 0;
		}else if(text.contains(",")) {
			String str[] = text.split(",");
			for (String sText : str) {
				list.add(convertTo(sText));
			}
			return sumOfElements(list);
		}
		else {
			list.add(convertTo(text));
			return sumOfElements(list);
		}
	}
	
	private static Integer convertTo(String text) {
		return Integer.parseInt(text);
	}
	
	private static Integer sumOfElements(List<Integer> list) {
		Integer sum = list.stream().mapToInt(i -> i).sum();
		return sum;
	}

}
