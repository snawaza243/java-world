#include<stdio.h>
#include<conio.h>

int method(int str)
{
    for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            } else if (str.charAt(i) == 'e') {
                count++;
            } else if (str.charAt(i) == 'i') {
                count++;
            } else if (str.charAt(i) == 'o') {
                count++;
            } else if (str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.print(count);
}

int main(){

}