# SWLab-HW6

اسکلت کلی پروژه را در قالب یک پروژه جاوا می‌نویسیم.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20184136.png?raw=true)

کلاسِ Package دارای متغییرهایی برای ذخیره state و حالتِ برنامه و constructor و getter و setter مربوط به این متغییرهاست.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20162623.png?raw=true)

## State Pattern

از الگوی state برای پیاده‌سازی وضعیت کنونی بسته (in-transit) یا (delivered) استفاده می‌کنیم. یک Interface به نام State در نظر گرفته که تابع changeState را دارد. کلاس‌های DeliveredState و TransitState این تابع را پیاده‌سازی می‌کنند و در آن وضعیت بسته را چاپ می‌کنند. همچنین در کلاس Package، هر بسته وضعیت خود را به صورت یک شیء از کلاس State (یا TransitState و یا DeliveredState) ذخیره می‌کند. هنگامی که در رابط کاربری بخواهیم تشخیص دهیم بسته دریافت شده‌ است یا نه، کافی‌ست چک کنیم که آیا وضعیت آن از نوع DeliveredState است یا خیر.

لازم به ذکر است که این پیاده‌سازی با توجه به روش TDD انجام گرفت. یعنی در ابتدا تست stateTest نوشته شد و سپس پیاده‌سازی توابع در جهت پاس شدن آن تست‌ها انجام شد.

![image](https://github.com/kiarashk8128/SWLab-HW6/assets/62250863/bc325336-3e63-403b-8b68-fadeb0d05565)

## Strategy Pattern

از الگوری استراتژی استفاده می‍کنیم و یک اینترفیس برای تحویل کالا می‌نویسیم که متدی برای محاسبه قیمت ارسال دارد.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20162845.png?raw=true)

تست مربوطه را می‌نویسیم و fail می‌شود.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20182543.png?raw=true)

حال بدنه توابع مربوطه را کامل می‌کنیم. دو کلاس StandardDelivery و ExpressDelivery اینترفیس تعریف شده را implement می‌کنند.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20185629.png?raw=true)

و اینک تست پاس می‌شود.

![](https://github.com/kiarashk8128/SWLab-HW6/blob/main/images/Screenshot%202024-05-16%20181430.png?raw=true)

## User Inteface
در کلاس Main، رابط کاربری برنامه پیاده‌سازی می‌شود. ابتدا وزن بسته از کاربر دریافت شده و براساس آن یک شیء بسته ایجاد می‌شود. سپس در یک حلقه، بررسی می‌شود که بسته آیا رسیده (delivered) است یا نه. در صورتی که بسته نرسیده باشد، از کاربر ابتدا پرسیده می‌شود که با چه سرویسی قصد دارد بسته را ارسال کند و اینکه وضعیت بسته در حال حاضر چگونه است. در انتها وقتی که بسته به مقصد برسد، هزینه ارسال بسته مطابق با آخرین انتخاب کاربر محاسبه و نمایش داده می‌شود.

![image](https://github.com/kiarashk8128/SWLab-HW6/assets/62250863/75c2488d-d55b-47e3-b241-0a9d20530979)
