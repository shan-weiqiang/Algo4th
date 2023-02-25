- [Steps of developing a mathmatical model for running time](#steps-of-developing-a-mathmatical-model-for-running-time)
- [Common types of Order of growth（算法增长介数）](#common-types-of-order-of-growth算法增长介数)
- [Order of growth for common classic algorithms](#order-of-growth-for-common-classic-algorithms)
  - [Binary search 排序队列二分查找](#binary-search-排序队列二分查找)
  - [ThreeSum 三数之和](#threesum-三数之和)
    - [Brute force 蛮力查找](#brute-force-蛮力查找)




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

<div align=center><img width = '400' height ='400' src ="data/order_of_growth.png"/></div><br>
<div align=center>Common order of growth</div>

# Order of growth for common classic algorithms

## Binary search 排序队列二分查找

Let $T$ be the running time of binary search, $N$ be the size of the ordered array. To find specific key, the worst case running time is:
$$T=\log_{2}^{N}+1$$

## ThreeSum 三数之和

问题描述：从一个N个元素的数组中找到所有的三元素之和为0的组合个数

### Brute force 蛮力查找

蛮力查找通过三重循环，找到所有的从N中找到3个元素的组合，并计算之和是否为0：
组合数：
$$C^3_{N} = \frac{N(N-1)(N-2)}{3!}\approx\frac{N^3}{6}$$
针对每个组合，需要访问三次数组，所以总的程序时间：
$$T(N)\approx\frac{N^3}{2}$$

