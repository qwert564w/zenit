# Zenith (Fabric 1.21.11)

Порт клиента Zenith под Minecraft **1.21.11** (Fabric).

Исходники: `src/main/java`  
Ресурсы: `src/main/resources`  
Зависимости в `libs/`.

## Требования

- **JDK 21** (Temurin / Corretto / Oracle)
- Windows: PowerShell или cmd  
- Интернет для первой сборки (Minecraft, Yarn, Loom)

Проверка Java:
```powershell
java -version
```
Должно быть `21.x`.

## Сборка

```powershell
.\gradlew.bat clean build
```

Готовый мод:
```text
build\libs\zenith-1.0-SNAPSHOT.jar
```

Если сборка «висит» — смотри лог в консоли. Первая сборка может занять 5–20 минут.

Для подробного лога:
```powershell
.\gradlew.bat build --info
```

## Установка (jar → mods)

1. Установи Minecraft **1.21.11**
2. Установи **Fabric Loader** для 1.21.11
3. Скопируй `zenith-1.0-SNAPSHOT.jar` в папку `mods`
4. Запусти профиль **Fabric 1.21.11**

> Просто открыть jar двойным кликом нельзя — это мод для Fabric, не лаунчер.

## Dev-клиент

```powershell
.\gradlew.bat runClient
```

Рабочая папка: `run/`.

## Примечания

- Нужен Fabric API (обычно подтягивается зависимостями / кладётся рядом при необходимости)
- Не коммить папки `build/`, `.gradle/`, `run/`
