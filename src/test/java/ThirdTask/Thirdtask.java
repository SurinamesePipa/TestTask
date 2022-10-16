package ThirdTask;

import java.util.ArrayList;

public class Thirdtask {

    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles()); //переаем в лист функцию которая возвращает Id вкладки
    driver.switchTo().window(tabs.get(1)); //выбираем вкладку 2
    driver.close(); //закрываем вкладку
    driver.switchTo().window(tabs.get(0)); // выбираем вкладку 1
}
