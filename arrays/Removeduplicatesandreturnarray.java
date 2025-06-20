class Removeduplicatesandreturnarray{
public static void main(String[] args) {
int[] a = {2, 4, 5, 2, 4, 6, 7, 5};
int[] b = new int[a.length];
int n = 0;
for (int i = 0; i < a.length; i++) {
boolean f = false;
for (int j = 0; j < n; j++) {
if (a[i] == b[j]) {
f = true;
break;
}
}
if (!f) {
b[n] = a[i];
n++;
}
}
for (int i = 0; i < n; i++) {
System.out.print(b[i] + " ");
}
}
}