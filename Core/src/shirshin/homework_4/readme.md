1. реализовать логику приложения Магазин из описания к уроку.

2. Добавить перечисление с гендерами. В класс покупателя добавить свойство «пол» со значением созданного перечисления. Добавить геттеры, сеттеры.

3. Добавить в приложение Магазин учет цены товара - в Заказ добавить поле стоимость. Добавить перечисление с размерами скидок - 0, 5, 10, 15, 20%.

4. Написать метод, при вызове которого на переданный тип товара незначается рандомная скидка из перечисления (меняем значение поля price)

5. *Товарам добавить категорию. Задать категории Стандарт и Премиум. Если на товар категории Премиум назначилась скидка более 15%, выбросить исключение TooMuchSaleException(msg), сообщение с ошибкой вывести в консоль, цену товара не менять.


## Решение задания

1. Папка controllers:
    1. класс ShopController - содержит принимает данные, которые пользователь вводит с клавиатуры и передает в класс ShopService для дальнейшей обработки.
2. Папка exceptions:
    1. класс ShopServiceException - родительский класс исключение для всех остальных исключений в пакете, наследует RuntimeException
   2. класс AmountException - наследник класса исключения ShopServiceException
   3. класс ProductException - наследник класса исключения ShopServiceException
   4. класс CustomerException - наследник класса исключения ShopServiceException
   5. класс TooMuchSaleException - наследник класса исключения ShopServiceException
3. Папка models:
   1. класс Customer - описание покупателя.
   2. класс Product - описание продукта.
   3. класс Order - описание заказа.
   4. перечисление Gender - описание гендера покупателя
   5. перечисление Discount - описание скидки на заказ
   6. перечисление ProductCategory - описание категорий продуктов
4. Папка services:
   1. класс ShopServices - основная логика работы приложения, принимает и обрабатывает данные из класса ShopController.