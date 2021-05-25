# Sber Тест 

###  Задание 

Необходимо реализовать standalone Java приложение, которое предоставляет Rest-сервис для получения телефона сотрудника
(вид справочника – плоская таблица с данными, список телефонов сотрудников (ФИО, телефон)).

Необходимо реализовать два метода – поиск телефона по ФИО, и получение списка телефонов.

Необходимо предусмотреть, что в качестве хранилища данных могут выступать как реляционная СУБД 
(для задания можно использовать Apache Derby), так и файл (например, csv).

Обновление (обновление, удаление и вставка) данных должно происходить с помощью специализированной процедуры, 
которая считывает данные из XML-файла и обновляет данные в хранилище.


### Реализация 

Запуск: 
```
$ git clone https://github.com/valkoltu/sbertest.git
$ cd sbertest/
$ ./gradlew bootRun
```

`GET` `localhost:8080/get_phones` - вернет список всех телефонов в виде JSON.

`GET` `localhost:8080/find_phone_by_name?fio=name` - вернет список всех телефонов, которые принадлежат персонам, в имени которых есть name в виде JSON.

