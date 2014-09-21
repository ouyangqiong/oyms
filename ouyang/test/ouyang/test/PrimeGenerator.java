package ouyang.test;

/**
 * @ClassName PrimeV2
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * @date 2013-12-8 上午11:30:48
 */
public class PrimeGenerator {

	/**初始化定义*/
	//声明返回素数数组
	private static int[] result;
	//声明筛选标记数组
	private static boolean[] crossOut;
	/****************/
	public  int[] generatePrime(int maxValue){
		//小于2的数都不是素数
		if(maxValue<2){
			return new int[0];
		}else{
			initialArrayOfIntegers(maxValue);
			crossOutMultiples();
			putUnCrossedIntegersIntoResult();
			return result;
		}	
	}

	/**
	 * 
	 */
	private void putUnCrossedIntegersIntoResult() {
		result= new int[numberOfUncrossedIntegers()];
		for(int j=0,i=2;i<crossOut.length;i++){
			if(notCrossed(i)){
				result[j++]=i;
			}
		}
		
	}

	/**
	 * @return
	 */
	private int numberOfUncrossedIntegers() {
		int count=0;
		for(int i=2;i<crossOut.length;i++){
			if(notCrossed(i)){
				count++;
			}
		}
		return count;
	}

	/**
	 * 初始化数组
	 */
	private void initialArrayOfIntegers(int maxValue) {
		//declarations
		crossOut=new boolean[maxValue+1];
		//初始化数组
		for(int i=0;i<crossOut.length;i++){
			crossOut[i]=false;
		}
	}
	//获取最大素数因子
	private int calMaxPrimeFactor(int value){
		double maxPrimeFactor=Math.sqrt(value)+1;
		return (int)maxPrimeFactor;
	}
	
	private void crossOutMultiples(){
		int maxPrimeFactor=calMaxPrimeFactor(crossOut.length);
		for(int i=2;i<maxPrimeFactor;i++){
			//判定该数字是否是素数 如果不是
			if(notCrossed(i)){
				crossOutMultipleOf(i);
			}
		}
	}
	/**
	 * 功能：判定是否是素数
	 * @param i
	 */
	private void crossOutMultipleOf(int i) {
		for(int multiple=2*i;multiple<crossOut.length;multiple+=i){
			crossOut[multiple]=true;
		}
	}

	private boolean notCrossed(int i){
		return crossOut[i]==false;
	}
	public  static void main(String[] args){
		int[] re=new PrimeGenerator().generatePrime(100);
		for(int i=0;i<re.length;i++){
			if(i%10==0&&i!=0){
				System.out.println();
			}
			System.out.print(re[i]+"\t");
		}
	}
	 
}
