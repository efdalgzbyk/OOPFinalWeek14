# OOPFinalWeek14
🎓 Student Scoring System

Bu proje, farklı öğrenci türlerinin (Bachelor, Master, PhD) akademik başarılarının nesne yönelimli programlama (OOP) prensipleri kullanılarak hesaplanmasını amaçlar. Sistem; abstract class, interface, inheritance ve polymorphism kavramlarını temel alır.

📌 UML Diyagram Özeti

Sistem aşağıdaki ana bileşenlerden oluşur:

🧩 Abstract Class

Student

Ortak özellikler: id, mid, fin

Ortak metotlar:

computeBaseScore()

computeTotalScore() (abstract)

🔌 Interface’ler

ProjectScoreBehaviour

float projectScore()

ConferenceScoreBehaviour

float conferenceScore()

ArticleScoreBehaviour

float articleScore()

Bu interface’ler, öğrencilerin akademik aktivitelerine göre ek puan hesaplamasını sağlar.

👨‍🎓 Öğrenci Türleri
🎓 BachelorStudent

Student sınıfından türetilir

ProjectScoreBehaviour interface’ini uygular

Proje puanına göre toplam skor hesaplar

Metotlar:

computeTotalScore()

projectScore()

🎓 MasterStudent

Student sınıfından türetilir

ConferenceScoreBehaviour interface’ini uygular

Ek özellik:

numberOfConf

Metotlar:

computeTotalScore()

conferenceScore()

🎓 PhDStudent

MasterStudent sınıfından türetilir

ArticleScoreBehaviour interface’ini uygular

Ek özellik:

numberOfArticles

Metotlar:

computeTotalScore()

articleScore()

▶️ StudentApp

Programın çalıştırıldığı ana sınıftır.

public class StudentApp {
    public static void main(String[] args) {
        // Test senaryoları burada çalıştırılır
    }
}

🧠 Kullanılan OOP Kavramları

✅ Abstraction → Student

✅ Inheritance → extends

✅ Interface Implementation → implements

✅ Polymorphism → computeTotalScore()

📂 Önerilen Proje Yapısı
src/
 ├── Student.java
 ├── BachelorStudent.java
 ├── MasterStudent.java
 ├── PhDStudent.java
 ├── ProjectScoreBehaviour.java
 ├── ConferenceScoreBehaviour.java
 ├── ArticleScoreBehaviour.java
 └── StudentApp.java

🚀 Amaç

Bu proje, üniversite OOP dersleri, UML → kod dönüşümü ve interface kullanımını öğrenmek için tasarlanmıştır.
