#include <stdio.h>
int main()
{
    int b, a, i, flag;
    printf("Enter two numbers ");
    scanf("%d %d", &b, &a);
    printf("Prime numbers between %d and %d are", b, a);
    while (b < a)
    {
        flag = 0;

        for(i = 2; i <= b/2; ++i)
        {
            if(b % i == 0)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            printf("%d ", b);

        ++b;
    }

    return 0;
}
