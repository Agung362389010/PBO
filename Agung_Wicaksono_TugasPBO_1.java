public class Agung_Wicaksono_TugasPBO_1 {

    public static void main(String[] args) {
        
        //Deklarasi variabel untuk tipe data integer
        int a = 10;
        int b = 5;
        int Penjumlahan = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int modulus = a % b;
        int age = 25;

        //Deklarasi variabel untuk tipe data Boolean
        boolean lebihbesar = (a > b); //true
        boolean samadengan = (a == b); //false
        boolean logikadan = (lebihbesar && samadengan);
        boolean logikaatau = (lebihbesar || samadengan);
        boolean isTrue = true;
        
        double weight = 60.5;
        char gender = 'M';
        

        // Variabel
        int x = 5;
        int y = x + 3;
        int z = x * y;

        int privateVariable;
        double PI = 3.14159;


        System.out.println("Penjumlahan: " + lebihbesar);
        System.out.println("Pengurangan: " + difference);
        System.out.println("Perkalian: " + product);
        System.out.println("Pembagian: " + quotient);
        System.out.println("Modulus: " + modulus);

        System.out.println("Apakah a lebih besar dari b? " + lebihbesar);
        System.out.println("Apakah a sama dengan b? " + samadengan);
        System.out.println("Hasil operator logika AND: " + logikadan);
        System.out.println("Hasil operator logika OR: " + logikaatau);

        System.out.println("Umur: " + age);
        System.out.println("Berat: " + weight);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("isTrue: " + isTrue);

        System.out.println("Nilai z: " + z);
        
    }
}
