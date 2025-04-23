#include <stdio.h>
#include <limits.h>

void MatrixChainOrder(int p[], int n) {
    int m[n][n];
    int s[n][n];
    for (int i = 1; i < n; i++) {
        m[i][i] = 0;
    }
    for (int l = 2; l < n; l++) {
        for (int i = 1; i < n - l + 1; i++) {
            int j = i + l - 1;
            m[i][j] = INT_MAX;
            for (int k = i; k < j; k++) {
                int q = m[i][k] + m[k+1][j] + p[i-1] * p[k] * p[j];
                if (q < m[i][j]) {
                    m[i][j] = q;
                    s[i][j] = k;
                }
            }
        }
    }
    printf("Minimum number of multiplications is %d\n", m[1][n-1]);
    printf("Optimal parenthesization: ");
    printOptimalParenthesis(s, 1, n-1);
    printf("\n");
}

void printOptimalParenthesis(int s[][100], int i, int j) {
    if (i == j)
        printf("A%d", i);
    else {
        printf("(");
        printOptimalParenthesis(s, i, s[i][j]);
        printOptimalParenthesis(s, s[i][j] + 1, j);
        printf(")");
    }
}

int main() {
    int p[] = {1, 2, 3, 4, 3};
    int n = sizeof(p)/sizeof(p[0]);
    MatrixChainOrder(p, n);
    return 0;
}
