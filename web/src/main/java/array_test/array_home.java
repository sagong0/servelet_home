package array_test;

import java.util.*;

public class array_home {

	public static void main(String[] args) {
		new array_home().test();
	}
	
	
	public void test() {
		/*
		 * 숙제 : 해당 두개의 배열 데이터가 있습니다. 각 배열별로 인덱스가 같은 번호를
		 * 더하여 짝수, 홀수 인지를 배열 결과 데이터로 재설정하여 출력하시오.
		 * 
		 * Adata = 5 17 19 22 23
		 * Bdata = 1 2 3 4 5
		 * 
		 * 결과 예시) :
		 * 			["짝수","홀수","짝수","짝수","짝수"]
		 * */
		
		Integer adata[] = {5,17,19,22,23};
		Integer bdata[] = {1,2,3,4,5};
		
		ArrayList<Integer> adataArray = new ArrayList<Integer>(Arrays.asList(adata));
		ArrayList<Integer> bdataArray = new ArrayList<Integer>(Arrays.asList(bdata));		
		ArrayList<Integer> sumAr = new ArrayList<Integer>();
		ArrayList<String> fianlAr = new ArrayList<String>();
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		
		for(int i = 0; i < 5 ; i++) {
			if(i == 0) {
				sum1 = adata[i] + bdata[i];
			}else if(i == 1) {
				sum2 = adata[i] + bdata[i];
			}else if(i == 2) {
				sum3 = adata[i] + bdata[i];
			}else if(i == 3) {
				sum4 = adata[i] + bdata[i];
			}else if(i == 4) {
				sum5 = adata[i] + bdata[i];
			}
		}
		
		
		sumAr.add(sum1);
		sumAr.add(sum2);
		sumAr.add(sum3);
		sumAr.add(sum4);
		sumAr.add(sum5);
		//System.out.println(sumAr);
		
		int finalNo = 0;
		
		for(int k =0; k < sumAr.size(); k++) {
			if(sumAr.get(k) % 2 == 0) {
				// 짝수
				fianlAr.add("짝수");
			}else {
				fianlAr.add("홀수");
			}
		}
		
		System.out.println(fianlAr);
	}
}