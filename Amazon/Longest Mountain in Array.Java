class Solution {
    public int longestMountain(int[] arr) {
    int n = arr.length;
	if (n < 3)
		return 0;
	int maxLength = 0;
	int i = 0;

	while (i < n) {
		int startOfMountain = i;
		
		while (i + 1 < n && arr[i] < arr[i + 1])
			i++;

		if (startOfMountain == i) {
			i++;
			continue;
		}

		int topOfMountain = i;
		while (i + 1 < n && arr[i] > arr[i + 1])
			i++;

		if (topOfMountain == i) {
			i++;
			continue;
		}
		maxLength = Math.max(maxLength, i - startOfMountain + 1);
	}
	return maxLength;
        
    }
}
