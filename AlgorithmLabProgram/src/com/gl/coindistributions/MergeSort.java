package com.gl.coindistributions;

public class MergeSort {
	public void merge(int arr[], int left, int mid, int right) {
		// Find sizes of two subarrays to be merged
		int subarray1 = mid - left + 1;
		int subarray2 = right - mid;

		/* Create temp arrays */
		int Left[] = new int[subarray1];
		int Right[] = new int[subarray2];

		/* Copy data to temporary arrays */

		for (int i = 0; i < subarray1; ++i) {
			Left[i] = arr[left + i];
		}
		for (int j = 0; j < subarray2; ++j) {
			Right[j] = arr[mid + 1 + j];
		}

		/* Merge the temporary  arrays */

		// Initial indexes of first and second subarrays and merged array
		int i = 0, j = 0, k = 0;

		while (i < subarray1 && j < subarray2) {
			if (Left[i] >= Right[j]) {
				arr[k] = Left[i];
				i++;
			} else {
				arr[k] = Right[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of Left[] if any */
		while (i < subarray1) {
			arr[k] = Left[i];
			i++;
			k++;
		}

		/* Copy remaining elements of Right[] if any */
		while (j < subarray2) {
			arr[k] = Right[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[left..right] using
	// merge()
	public void mergeSort(int arr[], int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = left + (right - left) / 2;

			// partition the first half and second half
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			// Merge the sorted halves
			merge(arr, left, mid, right);
		}
	}
}
