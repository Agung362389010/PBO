public class Agung_Wicaksono_TugasPBO_1_3 {
    // Deklarasi class Person di dalam class Tugas_3
    public static class Person {
        // Menggunakan modifier public
        public int age;
        public double weight;
        public char gender;
        public boolean isMarried;
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas Person
        Person person = new Person();

        // Menggunakan operator penugasan untuk memberikan nilai ke variabel
        person.age = 23;
        person.weight = 67.5;
        person.gender = 'M';
        person.isMarried = false;

        // Menggunakan operator aritmatika dalam metode
        person.age = person.age + 1; // Menambah umur

        // Menampilkan hasil dalam bentuk tabel
        System.out.println("\n-----------------------------");
        System.out.println("| Umur | Berat | Gender | Menikah |");
        System.out.println("-----------------------------");
        System.out.println("| " + person.age + " | " + person.weight + " | " + person.gender + " | " + (person.isMarried ? "Ya" : "Tidak") + " |");
        System.out.println("-----------------------------");

        // Menggunakan operator pembanding
        if (person.weight > 60.0) {
            System.out.println("Berat badan di atas rata-rata");
        } else {
            System.out.println("Berat badan di bawah rata-rata");
        }

        // Menggunakan operator logika
        if (person.gender == 'M' && person.isMarried == false) {
            System.out.println("Pria lajang");
        } else {
            System.out.println("Bukan pria lajang");
        }
    }
}
// Java Document