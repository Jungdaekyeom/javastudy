//package Stack;
//
//public class MyStack {
//
//	private String[] str;
//	private int num;
//	private int count = 0;
//
//	public MyStack(int num) {
//		this.num = num;
//		str = new String[this.num];
//	}
//	
//	public void push(String s) {
//		//공간이 있는지 확인
//		if (count < this.num) {
//			str[count] = s;
//			// str[count] = new String(s);
//			count++;
//		} else {
//
//			System.out.println(str.length);
//
//			String[] temp = new String[str.length + 1];
//
//			for (int i = 0; i < str.length; i++) {
//				temp[i] = str[i];
//			}
//
//			temp[count] = s;
//			str = temp;
//			count++;
//		}
//	}
//
//	public String pop() throws MyStackException{
//		
//		// 0일때랑  비어있을때
//		
//		if(isEmpty()) {
//		if(str.length == 0) {
//			throw new MyStackException("stack is empty");
//		}
//		
//		count--;
//		String mypop = str[count];
//
//		String[] temp = new String[count];
//
//		for (int i = 0; i < count; i++) {
//			temp[i] = str[i];
//		}
//
//		str = temp;
//
//		return mypop;
//	}
//
//	public boolean isEmpty() {
//		if (str.length == 0) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//}
