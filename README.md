# SWLab-HW6

اسکلت کلی پروژه را در قالب یک پروژه جاوا می‌نویسیم.

![image](https://github.com/kiarashk8128/SWLab-HW6/assets/62250863/d498aec7-cc16-4d10-93ab-c638081365b5)

کلاسِ Package دارای متغییرهایی برای ذخیره state و حالتِ برنامه و constructor و getter و setter مربوط به این متغییرهاست.

![image](https://github.com/kiarashk8128/SWLab-HW6/assets/62250863/dda0fe75-ef92-4ce0-98c5-4d47d357c374)

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



## Questions

### Question 1

الگوهای طراحی GoF به سه دسته تقسیم می‌شوند:

الگوهای ایجادی یا creational: الگوهای طراحی که با ایجاد اشیاء و objectها سروکار دارند.

الگوهای ساختاری: الگوهای طراحی در این دسته با ساختار کلاس‌ها مانند وراثت و ترکیب و تعامل و ارتباط کلاس‌ها سروکار دارند.

الگوهای رفتاری: این نوع الگوهای طراحی راه‌حل‌هایی برای تعامل بهتر بین اشیاء، نحوه ارائه کمترین وابستگی و انعطاف‌پذیری برای توسعه، تکمیل و گسترش در آینده فراهم می‌کنند.

### Question 2

الگوهای strategy و state از نوع behavioral یا رفتاری هستند زیرا به ارتباط و تعامل objectها تاکید دارند.

### Question 3

الگوری Singleton، زیرا فقط یک بسته داریم فلذا می‌شود یک کلاسِ Singleton و دارای یک instance تعریف کرد که بسته ماست. می‌توان constructor کلاس را خصوصی کرد و به طور static آن instance که فقط یک بار ایجاد می‌شود را ذخیره نمود، تا در کل برنامه به آن دسترسی وجود داشته باشد.

### Question 4

**Single-responsibility Principle (SRP):**

تحقق: الگوی Singleton می‌تواند SRP را تحقق بخشد اگر تنها مسئولیت آن مدیریت تک نمونه خود باشد.
عدم تحقق: اغلب، Singleton‌ها تمایل دارند مسئولیت‌های اضافی فراتر از مدیریت نمونه را به عهده بگیرند و SRP را با ترکیب ایجاد شیء با منطق کسب و کار نقض می‌کنند.

**Open-closed Principle (OCP):**

عدم تحقق: الگوی Singleton معمولاً OCP را نقض می‌کند زیرا به راحتی قابل گسترش نیست. اگر نیاز باشد که کلاس را برای تغییر نحوه مدیریت تک نمونه اصلاح کنید، باید کد موجود را تغییر دهید، که برخلاف ایده باز برای گسترش و بسته برای اصلاح است.

**Liskov Substitution Principle (LSP):**

تحقق: الگوی Singleton خود به خود LSP را نقض نمی‌کند تا زمانی که کلاس Singleton بتواند بدون تأثیر بر درستی برنامه توسط هر زیرکلاس جایگزین شود.
عدم تحقق: در عمل، از آنجا که Singleton‌ها اغلب به روش دریافت نمونه خود (مثلاً یک متد استاتیک getInstance) محکم متصل هستند، جایگزینی Singleton با یک زیرکلاس می‌تواند مشکل‌ساز باشد و ممکن است LSP را نقض کند.

**Interface Segregation Principle (ISP):**

تحقق: الگوی Singleton به طور مستقیم ISP را نقض نمی‌کند زیرا نحوه استفاده یا طراحی واسط‌ها را دیکته نمی‌کند. این الگو بر مدیریت نمونه تمرکز دارد نه طراحی واسط.
عدم تحقق: در عمل، Singleton‌ها ممکن است بیش از حد گسترده شوند و ممکن است به طور غیرمستقیم به نقض ISP منجر شوند اگر سعی کنند چندین قابلیت را از طریق یک نمونه فراهم کنند.

**Dependency Inversion Principle (DIP)**:

عدم تحقق: الگوی Singleton اغلب DIP را نقض می‌کند زیرا به یک کلاس concrete وابسته است و نه abstract. کدی که به یک کلاس Singleton وابسته است، به interface یا کلاس abstract وابسته نیست، که این امر جدا کردن وابستگی‌ها و جایگزینی Singleton با یک پیاده‌سازی جایگزین را دشوار می‌کند.
