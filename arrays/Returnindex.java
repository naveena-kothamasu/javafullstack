class Returnindex {
public static void main(String[] args) {
int arr[] = {12, 13, 14, 15};
int value = 15;
int i;
for (i = 0; i < arr.length; i++) {
if (arr[i] == value) {
System.out.println("Found at index: " + i);
}
}
if (i == arr.length) {
System.out.println("Not found");
}

}
}

