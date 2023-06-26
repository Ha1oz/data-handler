# Data-handler

## Пока в данной реализации:

**Сервис А** (*service-a*). Определяет изменения в заданной директории и отправляет их в топик Kafka, 
добавляя UUID.

**Сервис B** (*service-b*). Получает строку и парсит её для получения переданного в байтовом виде файла. 
После же файл преобразуется из объекта в JSON строку и отправляется в следующий топик. 
При получении некорректных данных сервис отправляет данные без изменений в специальный топик.

**Сервис C** (*service-c*). Также получает стороку и добавляет новое поле в JSON данных. 
Данные для поля берутся из базы (локальной). После же объект преобразуется в JSON строку и отправляется
дальше в новый топик. 

