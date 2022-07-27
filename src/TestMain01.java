public class TestMain01 {
	public static void main(String[] args) {
		int num = 8;
		int bin = 0;
		int zeroCount = 0;
		boolean flagStop = false; 
		
		while(num > 0){
			if((num % 2) == 0 && !flagStop) {
				zeroCount++;
			} else {
				flagStop = true;
			}
			bin = (bin * 10) + (num % 2); 
			num = num / 2;
		}
		
		int tmpBin = bin;
		int revBin = 0;
		while(tmpBin > 0) {
			revBin = (revBin * 10) + (tmpBin%10);
			tmpBin = tmpBin / 10;
		}
		int m = 1;
		for(int i = 0; i < zeroCount; i++) {
			m = m * 10;
		}
		System.out.println(bin);
		System.out.println(revBin * m );
	}
}



