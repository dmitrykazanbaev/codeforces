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

Первая и единственная строка каждого набора входных данных содержит одно целое число ![equation](https://latex.codecogs.com/svg.latex?n(1<=n<=100)).

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