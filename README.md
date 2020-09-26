# Klists

Klists is a library for merging k sorted lists in sorted order.

## Usage

```java
double[][]test = {{1.1, 4.4, 5.5},{1.1, 3.3, 4.4},{2.2, 6.6}};
KLists lists = new KLists();
lists.mergeKLists(test);
```
## Notes
I wasn't able to complete the lab in time. I'm able to merge the lists in sorted order, but I'm having trouble dealing with subarray lengths. This is as far as I got

## Complexity

### Time
I think that the time complexity should come out to be around that of merge sort. The algorithm loops through all n elements, but makes log n comparisons as it moves further along. So the time complexity should be O(n log n). Although, calculation of the size of the output array takes O(n), so that leaves me at O(n^2 log n).

### Space
I create an output array of length n and an index array of the length of the number of subarrays. So overall I think that the space complexity is O(2n) or O(n).


## Contributers
Dunham McBride
