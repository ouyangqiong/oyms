package ouyang.sort;

/**
 * @ClassName SortMgr
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * @date 2014-2-16 下午04:53:24
 */
public class SortMgr {

	// 升序排列 冒泡 排序
	// 排序 比较临近的两个数 如果前面一个数 大于后一个数 则交换 每次轮训都会排好一个
	public static void bubbleSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	// 选择排序 ，每次排序 找到 最大（最小)的数 放在最后。
	// 升序排列
	public static void selectSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int index = i;
			for (int j = i + 1; j < len; j++) {
				if (arr[index] > arr[j]) {
					index = j;
				}
			}
			if (index != i) {
				// 交换两个数的位置
			}
		}
	}

	// 选择一个中见
	public static void quickSort() {

	}

	// 插入排序
	// 假定两个序列 ，一个有序 一个 无序。从无序的队列中找一个数插入到有序的队列的的相对位置。
	public static void insertSort() {

	}

	public int getMiddle(Integer[] list, int low, int high) {
		int tmp = list[low]; // 数组的第一个作为中轴
		while (low < high) {
			while (low < high && list[high] > tmp) {
				high--;
			}
			list[low] = list[high]; // 比中轴小的记录移到低端
			while (low < high && list[low] < tmp) {
				low++;
			}
			list[high] = list[low]; // 比中轴大的记录移到高端
		}
		list[low] = tmp; // 中轴记录到尾
		return low; // 返回中轴的位置
	}

	public void _quickSort(Integer[] list, int low, int high) {
		if (low < high) {
			int middle = getMiddle(list, low, high); // 将list数组进行一分为二
			_quickSort(list, low, middle - 1); // 对低字表进行递归排序
			_quickSort(list, middle + 1, high); // 对高字表进行递归排序
		}
	}

	public void quick(Integer[] str) {
		if (str.length > 0) { // 查看数组是否为空
			_quickSort(str, 0, str.length - 1);
		}
	}

}
