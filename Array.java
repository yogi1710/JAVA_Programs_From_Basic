// array is an indexed collection of fixed no.of homogenious data elements.
// Index is a integer type which starts with 0 and ends with (array size - 1)
// array is a static data structure.
// array is a collection of elements of same data type that is homogenios
// The main advantage of an array is, we can represent multiple values in a
// single line.

// The main disadvantage of an array is, we can't change the size of an array
// once it is created.
// Once we create an array then we cannot increase or decrease the size of an
// array
// Arrays can hold only homogenios data elemets.

// To overcome this collection frameworks are used.
// Collection frameworks are used to represent a collection of elements of
// different data types.
// Collection frameworks are used to represent a collection of elements of same
// data type.
// Collection frameworks are used to represent a collection of elements of fixed
// size and variable size.

// Array Declaration:
// 1. Single Dimensional Array
// 2. 2D Array
// 3. Multi Dimensional Array
// 4. Jagged Array

// 1. single Dimension Array:
// int a[3];
// a[0] = 10;
// a[1] = 20;
// a[2] = 30;
// It is highly recommended, because name is separated from the type.

// 2. 2D array:
// int a[3][3] or int [][]a or int []a[];
// a[0][0] = 10;
// a[0][1] = 20;
// a[0][2] = 30;
// a[1][0] = 40;
// a[1][1] = 50;
// a[1][2] = 60;
// a[2][0] = 70;
// a[2][1] = 80;
// a[2][2] = 90;

// 3. Multi Dimensional Array:
// int a[1][1][1] or int [][][]a or int []a[][] or int [][]a[];
// a[0][0][0] = 10;
// a[0][0][1] = 20;
// a[0][1][0] = 30;
// a[1][0][0] = 40;
// a[1][0][1] = 50;
// a[1][1][0] = 60;
// a[1][1][1] = 70;

// Which of the following are the valid?
// int [] a1, b1;
// int [] a2[], b2;
// int [] []a3, b3;
// int []a4, []b4; Invalid

// Note : If we want to specify the dimension before the variable then it must
// be declared in the 1st variable only, second variable onwords we can't apply
// in the same declaration.

// Array Constrction:
// ex 1: int a[] = new int[10];
// ex 2: int [] a = new int[]; Compile time error, array dimension missing(rule
// 1)
// ex 3: int []a = new int[10];
// ex 4: int a[] = new int[-10]; // compile time error(rule 2)
// ex 5: int a[] = new int[0]; // valid, we can define the array size with
// 0(rule 3)
// ex 6: int a[] = new int[size]; // size is valid only for the int, char, byte,
// short(rule 4)
// The maximum allowed size in java is maximum value of int i.e 2147483647(rule
// 5)
// ex 7: int a[] = new int[2147483648]; // compile time
// ex 8: int a[] = new int[2147483647]; // valid

// Multi dimensional array creation:
// They are not in the form of matrix
// They are stored in the arrays of arrays
// To reduce the memory wastage we dont use the matrix form
// ex 1: int a[][] = new int[5][];
// int [0][]s1 = new int[2];
// int [1][]s2 = new int[3];

// Array Initilization:
// 1. int a[] = {10, 20, 30};
// 2. int a[] = new int[] {10, 20, 30};
// 3. int a[] = new int[3]{10, 20, 30};
// 4. int a[] = new int[3];
// a[0] = 10;
// a[1] = 20;
// a[2] = 30;

// Multi Dimesinal array initilizatoin:
// 1. int a[][] = { {10, 20}, {30, 40}}
// 2. int a[][] = new int[2][];
// a[0] = new int[] {10, 20};
// a[1] = new int[] {30, 40};
