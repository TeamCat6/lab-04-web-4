# Лабораторна робота №4
## Тема: EL, JSTL
## Виконав(-ли): Макасєєва Марія Олексіївна, Горлач Дарʼя Дмитрівна, Соколова Поліна Сергіївна
---
### **Хід роботи:**
Для виконання роботи ми повторили хід роботи попередніх лабораторних робіт:
Cпочатку ми добавляємо в pom всі потрібні залежності для того, щоб працювати з сервлетави.
Cтворюємо папку webapp і налаштовуємо Tomcat.
Модель це класи Comment, Video і VideoBlog, і HarryPotterVideoBlog це бізнес логіка де ми отримуємо дані про всі моделі з попередньої лабораторної роботи №10 (відео блог...).
Сервлети (CommentIsGreaterThanVideoLikes, VideoTotalWatchServlet, VideoWithMostDislikesServlet) це контролери які отримують бізнес логіку і передають у JSP сторінки (View).
В JSP сторінках відображаємо моделі за допомогою EL (Expression Language) і JSTL(Jakarta Standard Tag Library). В JSP точніше використовуємо EL і JSTL для відображення логіки і з лабораторної роботи №10.
Також на головній сторінці (index.html) є навігація на інші сторінки.

### **Висновки:** 
Використання MVC шаблону допомагає розділити модель (Model), клас який відповідає за web (Controller) та дані які треба відобразити в JSP (View).
Також використання EL і JSTL було дуже корисним для уникнення використання коду Java в View. Якщо в нас не має доступу в JSP до коду Java, наш додаток набагато більш забезпечений (security) від, наприклад, Security Leaks. 

```
