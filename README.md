Autotests for Joom online store
1. Тестиируемое приложение - интернет магазин Joom.
2. .apk файл находится в папке app и имеет название app-debug.apk.
3. Модель эмулируемого устройства (AVD) Pixel 4. С разрешением экрана 1080х2280. Версия Android 12.0.
4. Используется Java 18, Selenium 4.5.0, TestNG 2.19.0, Appium 8.2.0.

Запуск теста
Настроить `Edit Configurations`: добавить новую конфигурацию: `+` и выбрать`TestNG`:
- `Configuration`: name: **название тестового класса**; class: выбрать нужное в выпадающем меню
- `JDK Settings`: VM options: **-ea -DplatformName=Android или iOS -Ddevice="имя устройства" -Dversion="версия платформы"**;
  **Пример:** -ea -DplatformName="Android" -Ddevice="Pixel_4_API_31" -Dversion="12.0"
- `Working directory`: *$MODULE_WORKING_DIR$*
- `Use classpath of module`: выбрать нужное в выпадающем меню
- `Shorten commandLine`: none
