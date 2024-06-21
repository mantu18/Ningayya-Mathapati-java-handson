package nin.com;

public class StrOperationImpl implements StringOperation {
	public static void main(String[] args) {
		StringOperation rev=(String s)->{
			StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
		};
		
		String input = "wipro Java FSD";
		String result = applyOperation(input, rev);
        System.out.println("Input string: " + input);
        System.out.println("Reversed string: " + result);
	}

	@Override
	public String StringOperate(String s) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String applyOperation(String s, StringOperation operation) {
        return operation.StringOperate(s);

	
	}
}
