# Java-Array
### **Java Arrays**

An **array** in Java is a data structure used to store multiple values of the same type in a single variable. Arrays are indexed, and each element is accessed using its index starting from `0`.

---

### **Key Features of Arrays in Java**

1. **Fixed Size**:  
   - Once an array is created, its size is fixed and cannot be changed dynamically. 
   - Example: `int[] arr = new int[5];` creates an array of size 5.

2. **Homogeneous Elements**:  
   - Arrays can only hold elements of the same type. For example, an array of `int` can only store integers.

3. **Indexed Access**:  
   - Elements in an array are accessed using an index, starting from `0`.
   - Example: For `arr[3]`, `3` is the index, representing the fourth element.

4. **Stored in Contiguous Memory**:  
   - All elements are stored in contiguous memory locations, making array traversal fast.

5. **Supports Primitive and Object Types**:  
   - Arrays can store both primitive types (e.g., `int`, `float`) and objects (e.g., `String`, `Integer`).

---

### **How to Declare and Initialize Arrays**

#### **Declaration**
- `dataType[] arrayName;`  
  OR  
- `dataType arrayName[];`  

#### **Initialization**
1. **At Declaration**:  
   `int[] arr = {1, 2, 3, 4, 5};`
   
2. **With `new` Keyword**:  
   ```java
   int[] arr = new int[5]; // Creates an array of size 5 with default values (0 for int).
   arr[0] = 10;            // Assign values later.
   ```

---

### **Default Values in Arrays**
- **Numeric Types (e.g., `int`, `double`)**: `0`
- **Boolean**: `false`
- **Object References**: `null`

---

### **Accessing and Modifying Array Elements**
- Access elements using the index:
  ```java
  int[] arr = {10, 20, 30};
  System.out.println(arr[1]); // Output: 20
  ```
- Modify elements:
  ```java
  arr[1] = 50;
  System.out.println(arr[1]); // Output: 50
  ```

---

### **Types of Arrays**
1. **One-Dimensional Array**:  
   A simple linear collection of elements.
   ```java
   String[] names = {"Alice", "Bob", "Charlie"};
   ```

2. **Multi-Dimensional Array**:  
   Arrays with more than one dimension (e.g., 2D arrays). Commonly used to represent matrices.
   ```java
   int[][] matrix = {
       {1, 2, 3},
       {4, 5, 6},
       {7, 8, 9}
   };
   System.out.println(matrix[1][2]); // Output: 6 (row 1, column 2)
   ```

---

### **Common Operations**
1. **Iterating through Arrays**:
   - Using a `for` loop:
     ```java
     int[] arr = {1, 2, 3, 4, 5};
     for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
     }
     ```
   - Using an enhanced `for` loop:
     ```java
     for (int num : arr) {
         System.out.println(num);
     }
     ```

2. **Finding the Length**:
   - Use the `length` property:
     ```java
     int[] arr = {1, 2, 3};
     System.out.println(arr.length); // Output: 3
     ```

3. **Copying an Array**:
   - Use `System.arraycopy` or `Arrays.copyOf`:
     ```java
     int[] original = {1, 2, 3};
     int[] copy = Arrays.copyOf(original, original.length);
     ```

---

### **Advantages of Arrays**
- **Efficient Data Access**: Accessing elements via index is fast.
- **Simplified Code**: Arrays reduce the need for multiple variables to store related data.
- **Homogeneous Data Storage**: Ensures that all elements are of the same type.

---

### **Limitations of Arrays**
1. **Fixed Size**: Cannot resize an array after creation.
2. **No Built-in Methods for Complex Operations**: Arrays lack methods for sorting, searching, etc., compared to collections like `ArrayList`.
3. **Inefficient for Insertion/Deletion**: Adding or removing elements requires manual effort and often shifting of elements.

---

### **Example: Basic Array Usage**
```java
public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print all elements
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Modify an element
        numbers[2] = 35;
        System.out.println("After Modification: " + numbers[2]);

        // Find the length
        System.out.println("Array Length: " + numbers.length);
    }
}
```

---

### **Real-Life Applications of Arrays**
1. **Storing Data**: Used in games, simulations, or systems requiring fixed-size data storage (e.g., high scores in a game).
2. **Matrix Operations**: Representing grids or matrices (e.g., in scientific computing).
3. **Sorting and Searching**: Arrays are often the starting point for algorithms like bubble sort, quick sort, or binary search.

Arrays are one of the most fundamental data structures in Java, forming the basis for many advanced collections and algorithms.
