package ouyang.test;

/**
 * @ClassName Prime
 * @Description TODO(素数的行为和属性)
 * @author 欧阳琼
 * @date 2013-12-7 下午04:37:29
 */
public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arry=generatePrimes_v1(100);
		print(arry);
	}
	/**
	 * 生成素数(素数 是比1 大 且不能被1和本身以外的数整除的数）version 1
	 * @param maxValue
	 * @return 素数数组
	 */
	public static int[] generatePrimes_v1(int maxValue){
		//声明一个计数器 计算素数的个数
		int count=0;
		//声明一个boolean型数组初始化所有值为素数 （true)
		int len=maxValue+1;//因为还有一个0  所以数组大小要多一个
		boolean[] f=new boolean[len];
		for(int i=0;i<len;i++){
			f[i]=true;
		}
		//0 和1 不是素数
		f[0]=f[1]=false;
		//遍历数值，如果能被本身 和1 以外的数字整除的数 就不是素数
		
		for(int i=2;i<Math.sqrt(len)+1;i++){//例如 25内被整除的数 肯定要比 25的平方根为5，那么不需要遍历 6以上的数字
			//所有被i整除的数 并且比len小的数 都不是素数  例如（i=2的时候 判定所有被2 整除且小于len的数，
			//i=3时 ，判定所有被3 且小于len的数
			for(int j=2*i;j<len;j+=i){
				f[j]=false;
			}
		}
		//计算素数个数
		for(int i=0;i<len;i++){
			if(f[i]){
				count++;
			}
		}
		//声明一个保存素数的数组
		int[] primes=new int[count];
		//把所有素数保存到数组中
		for(int i=0,j=0;i<len;i++){
			if(f[i]){
				primes[j++]=i;
			}
		}
		return primes;
	}
	//输出方法
	public static void print(int[] array){
		for(int i=0;i<array.length;i++){
			if(i%10==0){
				System.out.println();
			}
			System.out.print(array[i]+"\t");
		}
	}
	public static int add(int a,int b){
		return a+b;
	}

}
