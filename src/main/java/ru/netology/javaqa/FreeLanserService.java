
package ru.netology.javaqa;


public class FreeLanserService        // Создаем сервис для вычисления накопленных средств
{
    public int calculate(int income, int expenses, int threshold)  // Описание сервиса (входящие данные)
    {
        int money = 0;                 // Нет денег
        int counter = 0;               // Число месяцув "отдыха" (не работал)
        for (int i = 0; i < 12; i++)   // Организуем цыкл рассчета условия переборки месяцев в году
        {
            if (money >= threshold)    // Остаток денег при котором "отдыхаем" (остановка цикла)
            {
                money -= expenses;     // Всего накопленных средств   ( +=, -=, /=, *= )
                money /= 3;            // Тратится денег во время месячного "отдыха"
                counter++;             // Число месяцев "отдыха" втечение 12 месяцев
            }
            else                        // Условие, при котором "работаем"
            {
                money += income;        // Доходы в месяц
                money -= expenses;      // Расходы в месяц
            }
        }
        return counter;                 // Возвращаем данные для пересчета в тестовый сервис
    }
}