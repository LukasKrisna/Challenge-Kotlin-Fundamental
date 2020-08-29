import java.util.*

public var input = Scanner(System.`in`);

fun main() {
    println("--------Pernghitungan Bangun Ruang--------");
    print("Masukkan Nama : ");
    var n: String? = input.nextLine();


    print("Masukkan Kelas : ");
    var k: String = input.nextLine();
    print("Masukkan Nomor Absen : ")
    var na: String = input.nextLine();
    menu()

}

// menu pemlihan opsi
fun menu(){
    println("--------Menu--------");
    println("1. Balok\n2. Bola\n3. Keluar")
    print ("Pilih Menu Diatas : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> balok()
        2 -> bola()
        3 -> keluar()
        else -> {
            println("Menu tidak ada")
            menu()
        }
    }
}


fun balok(){
    println("============BALOK===============");
    print("Masukan Panjang Balok : ");
    val panjang:Double = input.nextDouble();
    print("Masukan Lebar Balok : ");
    val lebar:Double = input.nextDouble();
    print("Masukkan Tinggi Balok : ")
    val tinggi:Double = input.nextDouble();

    //perhitungan
    val volume:Double =  panjang * lebar * tinggi;
    println ("Volume Kerucut Adalah $volume")
    System.out.printf("%.2f",volume)
    println()
    menu()
    println("=================================");
}

fun bola(){
    println("============Tabung===============");
    print("Masukan jari-jari bola: ");
    var jari:Double? = null
    jari = input.nextDouble();

    val volume = ((jari * jari * jari * 22 * 4 / 7) / 3)
    println("Volume Tabung adalah : $volume")
    System.out.printf("%.2f",volume)
    println()
    menu()
}
fun keluar(){
    System.exit(0)
}