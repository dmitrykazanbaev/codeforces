# Codeforces

## Задачи:

<details>
  <summary>
    <b>Специфичные вкусы Андре - SpecificTastesOfAndre</b>
  </summary>

У Андре очень специфические вкусы. Недавно он начал влюбляться в массивы.

Андре называет непустой массив ![equation](https://latex.codecogs.com/svg.latex?b) **хорошим**, 
если сумма его элементов делится на длину этого массива. Например, массив ![equation](https://latex.codecogs.com/svg.latex?[2,3,1]) 
хороший, так как сумма его элементов — ![equation](https://latex.codecogs.com/svg.latex?6) — делится на 
![equation](https://latex.codecogs.com/svg.latex?3), но массив ![equation](https://latex.codecogs.com/svg.latex?[1,1,2,3]) 
не хороший, так как ![equation](https://latex.codecogs.com/svg.latex?7) не делится на ![equation](https://latex.codecogs.com/svg.latex?4).

Андре вызывает массив ![equation](https://latex.codecogs.com/svg.latex?a) длиной ![equation](https://latex.codecogs.com/svg.latex?n) 
**прекрасным**, если выполняются следующие условия:
 - Каждый непустой подмассив этого массива является **хорошим**.
 - Для каждого ![equation](https://latex.codecogs.com/svg.latex?i(1<=i<=n),1<=a_{i}<=100).
 
Для данного положительное целого числа ![equation](https://latex.codecogs.com/svg.latex?n) 
выведите любой **прекрасный** массив длины ![equation](https://latex.codecogs.com/svg.latex?n). 
Можно показать, что при заданных ограничениях такой массив всегда существует.

Массив ![equation](https://latex.codecogs.com/svg.latex?c) является подмассивом массива ![equation](https://latex.codecogs.com/svg.latex?d),
если ![equation](https://latex.codecogs.com/svg.latex?c) может быть получен из ![equation](https://latex.codecogs.com/svg.latex?d) 
удалением нескольких (возможно, ни одного или всех) элементов из начала и нескольких (возможно, ни одного или всех)
элементов из конца.

#### Входные данные
Каждый тест содержит несколько наборов входных данных. В первой строке указано количество наборов входных данных
![equation](https://latex.codecogs.com/svg.latex?t(1<=t<=100)). Описание наборов входных данных приведено ниже.

Первая и единственная строка каждого набора входных данных содержит одно целое число 
![equation](https://latex.codecogs.com/svg.latex?n(1<=n<=100))

#### Выходные данные
Для каждого набора входных данных выводите в отдельной строке любой **прекрасный** массив длиной
 ![equation](https://latex.codecogs.com/svg.latex?n).

Примеры:
```
Ввод	

3
1
2
4

Вывод

24
19 33
7 37 79 49

```

</details>

<details>
  <summary>
    <b>Валерий против всех - ValeriiAgainstEveryone</b>
  </summary>

Вам дан массив ![equation](https://latex.codecogs.com/svg.latex?b) длиной ![equation](https://latex.codecogs.com/svg.latex?n). 
Определим другой массив ![equation](https://latex.codecogs.com/svg.latex?a), также длиной ![equation](https://latex.codecogs.com/svg.latex?n), 
в котором ![equation](https://latex.codecogs.com/svg.latex?a_{i}=2^{b^{i}}(1<=i<=n)).

Валерий утверждает, что любые два непересекающихся подмассива ![equation](https://latex.codecogs.com/svg.latex?a) 
имеют разную сумму элементов. Вы хотите определить, ошибается ли он. Более формально, необходимо определить, 
существуют ли четыре целых числа ![equation](https://latex.codecogs.com/svg.latex?l_{1},r_{1},l_{2},r_{2}), 
которые удовлетворяют следующим условиям:
 - ![equation](https://latex.codecogs.com/svg.latex?1<=l_{1}<=r_{1}<=l_{2}<=r_{2}<=n);
 - ![equation](https://latex.codecogs.com/svg.latex?a_{l_{1}}+a_{l_{1}+1}+...+a_{r_{1}-1}+a_{r_{1}}=a_{l_{2}}+a_{l_{2}+1}+...+a_{r_{2}-1}+a_{r_{2}}).
 
Если такие четыре целых числа существуют, вы докажете, что Валерий ошибается. Существуют ли они?

Массив ![equation](https://latex.codecogs.com/svg.latex?c) является подмассивом массива ![equation](https://latex.codecogs.com/svg.latex?d),
если ![equation](https://latex.codecogs.com/svg.latex?c) может быть получен из ![equation](https://latex.codecogs.com/svg.latex?d) 
удалением нескольких (возможно, ни одного или всех) элементов из начала и нескольких (возможно, ни одного или всех)
элементов из конца.

#### Входные данные
Каждый тест содержит несколько наборов входных данных. В первой строке указано количество наборов входных данных
![equation](https://latex.codecogs.com/svg.latex?t(1<=t<=100)). Описание наборов входных данных приведено ниже.

Первая и единственная строка каждого набора входных данных содержит одно целое 
![equation](https://latex.codecogs.com/svg.latex?n(2<=n<=1000))

Вторая строка набора входных данных содержит ![equation](https://latex.codecogs.com/svg.latex?n) целых чисел
![equation](https://latex.codecogs.com/svg.latex?b_{1},b_{2},...,b_{n}(0<=b_{i}<=10^{9}))

#### Выходные данные
Для каждого набора входных данных, если в ![equation](https://latex.codecogs.com/svg.latex?a) есть два
 непересекающихся подмассива, которые имеют одинаковую сумму, выведите *YES* в отдельной строке. 
 В противном случае выведите *NO* в отдельной строке.

Также обратите внимание, что каждая буква может быть в любом регистре.

Примеры:
```
Ввод	

2
6
4 3 0 1 2 0
2
2 5

Вывод

YES
NO

```

#### Примечание

В первом случае ![equation](https://latex.codecogs.com/svg.latex?a=[16,8,1,2,4,1]). Значения 
![equation](https://latex.codecogs.com/svg.latex?l_{1}=1,r_{1}=1,l_{2}=2,r_{2}=6) подходят, потому что 
![equation](https://latex.codecogs.com/svg.latex?16=(8+1+2+4+1)).

Во втором случае можно проверить, что такие подмассивы выбрать невозможно.

</details>