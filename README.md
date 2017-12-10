# javaPractice2017
## Эмуляция работы лифта

Чтобы запустить программу необходимо выполнить следующую команду:
1) mvn clean install exec:java

Пояснение к работе алгоритма:
1) Если пассажир будет находится на недоступном этаже (ни один лифт не может туда добраться), то пассажир так и останется стоять на этаже до конца работы
2) Пассажир может не зайти в подходящий лифт в 2 случаях:
    а) лифт перегружен
    б) вероятность отказа пассажира сработала
3) При вызове лифта выбирается близжайший и следующий в том же направлении (если такой есть)

Пояснение к визуализации:
1) Цифра внутри лифта - текущее количество пассажиров
2) Цифра на этаже - текущее количество пассажиров, ожидающих лифт
3) <0> - двери лифта открыты
4) ˅ ˄ - стрелочки на этаже указывают куда вызвали лифт

![alt text](/docs/grafic.png)