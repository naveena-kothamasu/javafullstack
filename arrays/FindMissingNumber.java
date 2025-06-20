class FindMissingNumber {
public static int findMissingNumber(int[] arr) {
for (int i = 0; i < arr.length; i++) {
if (arr[i] != i + 1) {
return i + 1;
}
}
return 100;
}
public static void main(String[] args) {
int[] numbers = new int[99];
int missing = 57;
int index = 0;
for (int num = 1; num <= 100; num++) {
if (num != missing) {
numbers[index] = num;
index++;
}
}
int result = findMissingNumber(numbers);
System.out.println("Missing number is: " + result);
}
}