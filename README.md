- [Steps of developing a mathmatical model for running time](#steps-of-developing-a-mathmatical-model-for-running-time)
- [Common types of Order of growth（算法增长介数）](#common-types-of-order-of-growth算法增长介数)
- [Order of growth for common classic algorithms](#order-of-growth-for-common-classic-algorithms)
  - [Binary search 排序队列二分查找](#binary-search-排序队列二分查找)
  - [ThreeSum 三数之和](#threesum-三数之和)
    - [Brute force 蛮力查找](#brute-force-蛮力查找)
    - [With help of binary search](#with-help-of-binary-search)
  - [Sorting 排序](#sorting-排序)
    - [Selection sort 选择排序](#selection-sort-选择排序)




# Steps of developing a mathmatical model for running time

- Determine `input model`
- Identify `inner loop`
- Define `cost model` inside the `inner loop`
- `anylasis`: determine the order of growth

# Common types of Order of growth（算法增长介数）

For input $N$, the running time is $T$, $T=f(N)$:

- 常量 `constant`: $N$ has no effect on $T$
- 对数 `logarithmic`: $T=log(N)$
- 线性 `linear`: $T=aN$, where $a$ is constant
- 线性 `linearithmic`: $T=Nlog(N)$
- 二次方 `quadratic`: $T=N^2$
- 三次方 `cubic`: $T=N^3$
- 指数 `exponential`: $T=2^N$

<div align=center><img width = '400' height ='400' src ="data/Comparison_computational_complexity.svg"/></div><br>

# Order of growth for common classic algorithms

## Binary search 排序队列二分查找

[source code](src/BinarySearch.java)

Let $T$ be the running time of binary search, $N$ be the size of the ordered array. To find specific key, the worst case running time is:
$$T=\log_{2}^{N}+1$$

## ThreeSum 三数之和

问题描述：从一个N个元素的数组中找到所有的三元素之和为0的组合个数

### Brute force 蛮力查找

[source code](src/ThreeSumBruteForce.java)

蛮力查找通过三重循环，找到所有的从N中找到3个元素的组合，并计算之和是否为0：
组合数：
$$C^3_{N} = \frac{N(N-1)(N-2)}{3!}\approx\frac{N^3}{6}$$
针对每个组合，需要访问三次数组，所以总的程序时间：
$$T(N)\approx\frac{N^3}{2}$$

### With help of binary search

[source code](src/ThreeSumFast.java)

通过最后一层循环使用二分查找代替，从而减少一介增长，因为二分查找的增长介数为$\log_{2}^{N}+1$, 所以对于三数之和，总的时间复杂度：
$$T(N)=N^2*(\log_{2}^{N}+1)\approx N^2\log^{N}_2$$
相比蛮力查找，少了一阶次的增长

## Sorting 排序

### Selection sort 选择排序

[source code](src/sorting/SelectionSort.java)

对于长度为$N$的数组，选择排序的交换次数为$N$次
比较次数计算方法，对于第$k$个元素，需要比较$N-k-1$：
$$C(N)=N-1+N-2+N-3+...+1+0=\frac{N(N-1)}{2}\approx\frac{1}{2}N^2$$

选择排序的特点如下：
- 选择排序的增长级是二次方级，不适用于$N$特别大的情形
- 稳定，选择排序总是交换$N$次，比较$\frac{1}{2}N^2$次

