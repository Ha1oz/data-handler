# Data-handler

## Пока в данной реализации:

**Сервис А** (*service-a* в проекте), который представляет из себя producer, 
мониторящий изменения в папке (путь и интервал задается через properties) и отправляющий их в topic Kafka.

**Сервис B** (*service-b*), который лишь получает строку и парсит её для получения переданного в байтовом виде файла. 
После же файл преобразуется в объект байтовой строки (ByteString). Это неполная реализация микросервиса.
