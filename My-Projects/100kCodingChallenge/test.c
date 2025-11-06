#include <stdio.h>

int main(){
    
    int a , b , sum = 0;
    printf("-----This program will add your numbers.-----\n");
    printf("Enter the two numbers: ");
    scanf("%d%d",&a,&b);
    sum = a + b;
    printf("The sum of %d and %d is `%d`",a,b,sum);

    return 0;
}
