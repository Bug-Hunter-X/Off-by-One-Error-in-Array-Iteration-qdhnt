# Off-by-One Error in Array Iteration

This example demonstrates a common off-by-one error in Java when iterating over arrays.
The error occurs when the loop condition `i <= array.length` is used.  Arrays in Java are zero-indexed, meaning the valid indices range from 0 to `array.length - 1`.  Therefore, accessing `array[array.length]` results in an `ArrayIndexOutOfBoundsException`.

The solution involves correcting the loop condition to `i < array.length`.