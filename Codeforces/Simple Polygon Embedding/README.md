# Codeforces Round #640 (Div. 4)
# C1. Simple Polygon Embedding

You are given a regular polygon with 2⋅n vertices (it's convex and has equal sides and equal angles) and all its sides have length 1. Let's name it as 2n-gon.

Your task is to find the square of the minimum size such that you can embed 2n-gon in the square. Embedding 2n-gon in the square means that you need to place 2n-gon in the square in such way that each point which lies inside or on a border of 2n-gon should also lie inside or on a border of the square.

You can rotate 2n-gon and/or the square.

## Input
The first line contains a single integer T (1≤T≤200) — the number of test cases.

Next T lines contain descriptions of test cases — one per line. Each line contains single even integer n (2≤n≤200). Don't forget you need to embed 2n-gon, not an n-gon.

## Output
Print T real numbers — one per test case. For each test case, print the minimum length of a side of the square 2n-gon can be embedded in. Your answer will be considered correct if its absolute or relative error doesn't exceed 10−6.

## Example
### input
```
3
2
4
200
```
## output
```
1.000000000
2.414213562
127.321336469
```