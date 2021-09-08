package prob5;


public class Prob5 {

	public static void main(String[] args) {
		
		 //chkNum 실행 값의 시작
        for(int chkNum = 1 ;chkNum <100;chkNum++) {
            
            //문자열로 형변환
            String strCnt = String.valueOf(chkNum);
            System.out.print(strCnt);
            //형변환된 값의 길이 만큼 반복
            for(int j=0;j <strCnt.length(); j++) {

                char chk = strCnt.charAt(j); 
                if(chk == '3' || chk == '6' || chk == '9') {
                    System.out.print("짝");
                }
            }
            //줄바꿈
            System.out.println();
		}
		
	}
	
	
}
