package ru.braguntsov.java.basic.homeworks.homework10;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook extends ArrayList<String> {

    @Override
    public void add(int index, String element) {
        super.add(index, element);
    }
}
//Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;
//Метод add() должен позволять добавлять запись имя-телефон;
//Метод find() выполнять поиск номер(-а, -ов) телефона по имени;
//Под одним именем может быть несколько телефонов (в случае однофамильцев, или наличии у одного человека нескольких номеров), тогда при запросе такой фамилии должны выводиться все телефоны;
//Метод containsPhoneNumber должен проверять наличие телефона в справочнике.