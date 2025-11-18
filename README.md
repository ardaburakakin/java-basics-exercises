# Java Temel Konular Örnek Projeleri

Bilgisayar Mühendisliği giriş seviyesindeki Java konularını pekiştirmek için
hazırlanmış küçük konsol uygulamaları.

## Kapsadığı Konular
- Değişkenler ve veri tipleri
- Karar yapıları (if / else, switch)
- Döngüler (for, while)
- Metotlar
- Basit hesaplama uygulamaları (ATM, hesap makinesi, not hesaplama)

## Örnekler
- `ATMExample` → Switch-case ve döngü kullanarak basit ATM simülasyonu
- `CalculatorExample` → Kullanıcıdan alınan değerlere göre dört işlem
- `GradeCalculator` → Vize / finalden geçme notu hesaplama
- ...

## Nasıl Çalıştırılır?
- JDK 17+
- NetBeans veya IntelliJ / VS Code
- Konsoldan çalıştırmak için:
  ```bash
  javac -d out src/tr/ardaburakakin/javaintro/**/*.java
  java -cp out tr.ardaburakakin.javaintro.calculator.CalculatorExample
