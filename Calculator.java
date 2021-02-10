package calculator;

public class Calculator {

	public static int add(String text) {
		List<Integer>  list = new ArrayList<Integer>();
		if(text.isEmpty()) {
			return 0;
		}else {
			String [] str = splitter(text);
			for (String element : str) {
				list.add(convertTo(element));	
			}
			return sumOfElements(list);
		}
	}
	
	private static String[] splitter(String text) {
		if(text.contains("//")) {
		   Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		   String custom = m.group(1);
		   String number = m.group(2);
		   return number.split(custom);
		}else {
			return text.split(",|\n");
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
