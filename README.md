# SWLab-HW6

اسکلت کلی پروژه را در قالب یک پروژه جاوا می‌نویسیم.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20184136.png?raw=true)

کلاسِ Package دارای متغییرهایی برای ذخیره state و حالتِ برنامه و constructor و getter و setter مربوط به این متغییرهاست.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20162623.png?raw=true)

## Strategy Pattern

از الگوری استراتژی استفاده می‍کنیم و یک اینترفیس برای تحویل کالا می‌نویسیم که متدی برای محاسبه قیمت ارسال دارد.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20162845.png?raw=true)

تست مربوطه را می‌نویسیم و fail می‌شود.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20182543.png?raw=true)

حال بدنه توابع مربوطه را کامل می‌کنیم. دو کلاس StandardDelivery و ExpressDelivery اینترفیس تعریف شده را implement می‌کنند.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20185629.png?raw=true)

و اینک تست پاس می‌شود.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20181430.png?raw=true)



## Questions

### Question 1

الگوهای طراحی GoF به سه دسته تقسیم می‌شوند:

الگوهای تولیدی: الگوهای طراحی که با ایجاد اشیاء و objectها سروکار دارند.

الگوهای ساختاری: الگوهای طراحی در این دسته با ساختار کلاس‌ها مانند وراثت و ترکیب و تعامل و ارتباط کلاس‌ها سروکار دارند.

الگوهای رفتاری: این نوع الگوهای طراحی راه‌حل‌هایی برای تعامل بهتر بین اشیاء، نحوه ارائه کمترین وابستگی و انعطاف‌پذیری برای توسعه، تکمیل و گسترش در آینده فراهم می‌کنند.
