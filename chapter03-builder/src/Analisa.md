## ANALISA PRAKTIKUM
### analisa pada program Robot.java

- Baris 1-54 : Ini mendefinisikan kelas `Robot` beserta properti-properti dan metode-metodenya.
Robot punya atribut-atribut seperti shield, sword, gun, dan brainchip. 
Metode-metode setter dan getter digunakan untuk mengatur dan mendapatkan nilai-nilai atribut tersebut.
Metode `toString()` digunakan untuk mengembalikan string yang berisi detail properti dari robot.

- Baris 56-71 : Ini adalah definisi kelas `RobotBuilder`.
Kelas ini bertanggung jawab untuk membangun objek `Robot`. 
Setiap metode di dalamnya mengatur nilai dari atribut-atribut robot dengan memanggil setter yang sesuai. 
Metode `getResult()` digunakan untuk mengembalikan objek `Robot` yang sudah selesai dibangun.

- Baris 73-91 : Ini mendefinisikan kelas `RobotDirector`.
Kelas ini bertindak sebagai direktur untuk memandu proses pembuatan objek `Robot`.
Di dalamnya, ada beberapa metode seperti `CasualRobot()`, `IntelligentRobot()`, dan `RereRobot()`, yang masing-masing memiliki skenario pembangunan objek robot dengan konfigurasi yang berbeda.

- Pada `main` program : Program dimulai dengan mencetak judul "PROGRAM ROBOT".
Kemudian, ada tiga skenario pembuatan objek robot yang ditampilkan secara berurutan:
  - Pembuatan objek robot menggunakan konstruktor dengan mengatur nilai properti secara langsung.
  - Pembuatan objek robot menggunakan Builder Pattern dengan langsung memanggil metode pada builder untuk mengatur nilai properti.
  - Pembuatan objek robot menggunakan Builder Pattern dengan menggunakan direktor untuk mengarahkan proses pembangunan objek dengan konfigurasi tertentu.

### analisa pada program Rumah.java

- Baris 1-37 : Ini mendefinisikan kelas `Rumah` beserta propertinya seperti pondasi, dinding, atap, jendela, dan pintu.
Setiap properti punya metode setter dan getter untuk mengatur dan mendapatkan nilainya.
Terakhir, ada metode `toString()` untuk mengembalikan string yang berisi detail properti rumah.

- Baris 39-63 : Ini adalah definisi kelas `RumahBuilder`.
Kelas ini bertugas membangun objek `Rumah`. 
Setiap metode di dalamnya mengatur nilai properti rumah dengan memanggil setter yang sesuai. 
Metode `hasilkan()` digunakan untuk mengembalikan objek `Rumah` yang sudah jadi.

- Baris 65-87 : Ini mendefinisikan kelas `DirekturRumah`. 
Kelas ini bertindak sebagai direktur untuk memandu proses pembuatan objek `Rumah`. 
Di dalamnya, ada beberapa metode seperti `buatRumahModern()`, `buatRumahKabin()`, dan `buatRumahTiny()`, yang masing-masing memiliki skenario pembangunan objek rumah dengan konfigurasi yang berbeda.

- Pada `main` program :Program dimulai dengan mencetak judul "PROGRAM RUMAH". 
Kemudian, ada tiga skenario pembuatan objek rumah yang ditampilkan secara berurutan:
  - Pembuatan objek rumah menggunakan konstruktor dengan mengatur nilai properti secara langsung.
  - Pembuatan objek rumah menggunakan Builder Pattern dengan langsung memanggil metode pada builder untuk mengatur nilai properti.
  - Pembuatan objek rumah menggunakan Builder Pattern dengan menggunakan direktur untuk mengarahkan proses pembangunan objek dengan konfigurasi tertentu.
  
### analisa pada program ComputerSet.java

- Baris 1-36 : Mendefinisikan kelas `ComputerSet` dengan properti-propertinya seperti keyboard, mouse, speaker, dan monitor.
Metode getter dan setter digunakan untuk mengatur dan mendapatkan nilai-nilai properti. 
Terakhir, metode `toString()` digunakan untuk mengembalikan string yang berisi detail properti dari `ComputerSet`.

- Baris 38-64: Ini adalah definisi kelas `ComputerSetBuilder`. 
Kelas ini bertanggung jawab untuk membangun objek `ComputerSet`.
Setiap metode di dalamnya mengatur nilai dari properti `ComputerSet` dengan memanggil setter yang sesuai.
Metode `getResult()` digunakan untuk mengembalikan objek `ComputerSet` yang sudah selesai dibangun.

- Baris 66-92: Mendefinisikan kelas `ComputerSetDirector`.
Kelas ini bertindak sebagai direktur untuk memandu proses pembuatan objek `ComputerSet`.
Di dalamnya, ada beberapa metode seperti `BasicSet()`, `GamingSet()`, dan `MultimediaSet()`, yang masing-masing memiliki skenario pembangunan objek `ComputerSet` dengan konfigurasi yang berbeda.

- Pada `main` program dimulai dengan mencetak judul "PROGRAM COMPUTERSET". 
Kemudian, ada tiga skenario pembuatan objek `ComputerSet` yang ditampilkan secara berurutan:
  - Pembuatan objek `ComputerSet` menggunakan konstruktor dengan mengatur nilai properti secara langsung.
  - Pembuatan objek `ComputerSet` menggunakan Builder Pattern dengan langsung memanggil metode pada builder untuk mengatur nilai properti.
  - Pembuatan objek `ComputerSet` menggunakan Builder Pattern dengan menggunakan direktur untuk mengarahkan proses pembangunan objek dengan konfigurasi tertentu.