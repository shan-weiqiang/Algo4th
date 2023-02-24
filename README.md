# Steps of developing a mathmatical model for running time

- Determine `input model`
- Identify `inner loop`
- Define `const model` inside the `inner loop`
- `anylasis`: determine the order of growth

# Common Order of growth

For input $N$, the running time is $T$, $T=f(N)$:

- `constant`: $N$ has no effect on $T$
- `logarithmic`: $T=log(N)$
- `linear`: $T=aN$, where $a$ is constant
- `linearithmic`: $T=Nlog(N)$
- `quadratic`: $T=N^2$
- `cubic`: $T=N^3$
- `exponential`: $T=2^N$

<div align=center><img width = '400' height ='400' src ="data/order_of_growth.png"/><br>
<div>Common order of growth</div>