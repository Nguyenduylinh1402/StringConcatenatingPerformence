public final class AvoidConcatenation {
	// PRIVATE
	private static int fNumIterations = 1;

	public static void main(String... arguments) {
		// fNumIterations = Integer.parseInt(arguments[0]);

		long start = System.nanoTime();
		doWithConcatenationOperator();
		long finish = System.nanoTime();

		System.out.println("Num iterations: " + fNumIterations);
		StringBuilder message = new StringBuilder();
		message.append("Task using + operator: ");
		message.append(finish - start);
		message.append(" nanoseconds");
		System.out.println(message);

		start = System.nanoTime();
		doWithConcatenation();
		finish = System.nanoTime();

		message = new StringBuilder("Task using concat(): ");
		message.append(finish - start);
		message.append(" nanoseconds");
		System.out.println(message);

		start = System.nanoTime();
		doWithStringBuilder();
		finish = System.nanoTime();

		message = new StringBuilder("Task using StringBuilder.append: ");
		message.append(finish - start);
		message.append(" nanoseconds");
		System.out.println(message);
	}

	private static String doWithConcatenationOperator() {
		String result = "start";
		for (int idx = 0; idx < fNumIterations; idx++) {
			result = result + "blah";
		}
		return result;
	}

	private static String doWithConcatenation() {
		String result = "start";
		for (int idx = 0; idx < fNumIterations; idx++) {
			result = result.concat("blah");
		}
		return result;
	}

	private static String doWithStringBuilder() {
		StringBuilder result = new StringBuilder("start");
		for (int idx = 0; idx < fNumIterations; idx++) {
			result.append("blah");
		}
		return result.toString();
	}
}
