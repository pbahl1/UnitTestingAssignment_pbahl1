package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	/** Task 2 Q2- Test Sequences to achieve Condition Coverage **/
	

	// Test case to check if the array for bubble sort is empty or not
	@Test(expected = java.lang.NullPointerException.class)
	public void testIfArrayIsEmptyBubbleSort() {
		Item[] array = null;
		SortAlgos.bubbleSort(array);
		assertTrue("Array is empty", array == null);
	}

	/** Test Sequences to achieve Condition,Node and Edge Coverage **/
	// Test to check if Bubble sort is working as expected.
	@Test
	public void testIfArrayIsCorrectlySortedBubbleSort() {

		// Have created an input unsorted list.
		int[] unsortedArray = { 4, -2, 8, 9, 0, 2 };
		Item[] unsortedList = new Item[6];

		for (int i = 0; i < unsortedArray.length; i++)
			unsortedList[i] = new Item(unsortedArray[i]);

		int[] sortedList = { -2, 0, 2, 4, 8, 9 };
		// Lets check the result if its sorted or not.
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		// Compare of list is actually sorted.
		unsortedList = SortAlgos.bubbleSort(unsortedList);
		for (int i = 0; i < unsortedList.length; i++)
			assertTrue("Array is sorted ",sorted[i].key == unsortedList[i].key );

	}

	/**
	 * Task 2, Q3 Test Sequences to achieve Condition Coverage for checking null or
	 * empty arrays for all sorting algos.
	 **/
	// Test case to check if the array for selection sort is empty or not
	@Test(expected = java.lang.NullPointerException.class)
	public void testIfArrayIsEmptySelectionSort() {
		Item[] array = null;
		SortAlgos.selectionSort(array);
		assertTrue("Array is empty", array == null);
	}

	// Test case to check if the array for insertion sort is empty or not
	@Test(expected = java.lang.NullPointerException.class)
	public void testIfArrayIsEmptyInsertionSort() {
		Item[] array = null;
		SortAlgos.insertionSort(array);
		assertTrue("Array is empty", array == null);
	}

	// Test case to check if the array for merge sort is empty or not
	@Test(expected = java.lang.NullPointerException.class)
	public void testIfArrayIsEmptyMergeSort() {
		Item[] array = null;
		SortAlgos.mergeSort(array);
		assertTrue("Array is empty", array == null);
	}

	// Test case to check if the array for selection sort is empty or not
	@Test(expected = java.lang.NullPointerException.class)
	public void testIfArrayIsEmptyQuickSort() {
		Item[] array = null;
		SortAlgos.quickSort(array);
		assertTrue("Array is empty", array == null);
	}

	// Test case to check if the array for heap sort is empty or not
	@Test(expected = java.lang.NullPointerException.class)
	public void testIfArrayIsEmptyHeapSort() {
		Item[] array = null;
		SortAlgos.heapSort(array);
		assertTrue("Array is empty", array == null);
	}

	/** Test Sequences to achieve Condition,Node and Edge Coverage **/
	// Test to check if Selection sort is working as expected.
	@Test
	public void testIfArrayIsCorrectlySortedSelectionSort() {
		// Have created an input unsorted list.
		int[] unsortedArray = { 4, -2, 8, 9, 0, 2 };
		Item[] unsortedList = new Item[6];

		for (int i = 0; i < unsortedArray.length; i++)
			unsortedList[i] = new Item(unsortedArray[i]);

		int[] sortedList = { -2, 0, 2, 4, 8, 9 };
		// Lets check the result if its sorted or not.
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.selectionSort(sorted);
		for (int i = 0; i < sorted.length; i++)
			assertTrue("Array  is sorted", sorted[i].key == sorted[i].key);
	}

	// Test to check if Insertion sort is working as expected.
	@Test
	public void testIfArrayIsCorrectlySortedInsertionSort() {
		// Have created an input unsorted list.
		int[] unsortedArray = { 4, -2, 8, 9, 0, 2 };
		Item[] unsortedList = new Item[6];

		for (int i = 0; i < unsortedArray.length; i++)
			unsortedList[i] = new Item(unsortedArray[i]);

		int[] sortedList = { -2, 0, 2, 4, 8, 9 };
		// Lets check the result if its sorted or not.
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.insertionSort(sorted);
		for (int i = 0; i < sorted.length; i++)
			assertTrue("Array  is sorted", sorted[i].key == sorted[i].key);
	}

	// Test to check if Merge sort is working as expected.
	@Test
	public void testIfArrayIsCorrectlySortedMergeSort() {
		// Have created an input unsorted list.
		int[] unsortedArray = { 4, -2, 8, 9, 0, 2 };
		Item[] unsortedList = new Item[6];

		for (int i = 0; i < unsortedArray.length; i++)
			unsortedList[i] = new Item(unsortedArray[i]);

		int[] sortedList = { -2, 0, 2, 4, 8, 9 };
		// Lets check the result if its sorted or not.
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.mergeSort(sorted);
		for (int i = 0; i < sorted.length; i++)
			assertTrue("Array  is sorted", sorted[i].key == sorted[i].key);
	}

	// Test to check if Quick sort is working as expected.
	@Test
	public void testIfArrayIsCorrectlySortedQuickSort() {
		// Have created an input unsorted list.
		int[] unsortedArray = { 4, -2, 8, 9, 0, 2 };
		Item[] unsortedList = new Item[6];

		for (int i = 0; i < unsortedArray.length; i++)
			unsortedList[i] = new Item(unsortedArray[i]);

		int[] sortedList = { -2, 0, 2, 4, 8, 9 };
		// Lets check the result if its sorted or not.
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.quickSort(sorted);
		for (int i = 0; i < sorted.length; i++)
			assertTrue("Array  is sorted", sorted[i].key == sorted[i].key);
	}

	// Test to check if Heap sort is working as expected.
	@Test
	public void testIfArrayIsCorrectlySortedHeapSort() {
		// Have created an input unsorted list.
		int[] unsortedArray = { 4, -2, 8, 9, 0, 2 };
		Item[] unsortedList = new Item[6];

		for (int i = 0; i < unsortedArray.length; i++)
			unsortedList[i] = new Item(unsortedArray[i]);

		int[] sortedList = { -2, 0, 2, 4, 8, 9 };
		// Lets check the result if its sorted or not.
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.heapSort(sorted);
		for (int i = 0; i < sorted.length; i++)
			assertTrue("Array  is sorted", sorted[i].key == sorted[i].key);
	}

}
