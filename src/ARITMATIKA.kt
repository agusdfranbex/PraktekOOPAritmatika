class operasi{
    var angka1:Int = 0
    var angka2:Int = 0


    fun pilihan(){
        var op=operasi()
        println("apakah anda ingin mengulangi?(Y/N) : ")
        var pilihan:String
        pilihan= readLine()!!.toString()

        if (pilihan=="Y"||pilihan=="y"){
            op.utama()
        }else if (pilihan=="N"||pilihan=="n"){
            print("Terima kasih telah mencoba aplikasi ini")
        }else{
            println("parameter andasalah")
            return pilihan()
        }

    }

    fun jumlah(){
        println("----anda memilih penjumlahan---")
        print("masukkan angka pertama : ")
        angka1= readLine()!!.toInt()
        print("masukkan angka pertama : ")
        angka2= readLine()!!.toInt()

        var hasil:Int=0
        hasil = angka1+angka2

        println("hasil penjumlahan $angka1 dan $angka2 adalah $hasil")
        pilihan()

    }

    fun kurang(){
        println("----anda memilih pengurangan---")
        print("masukkan angka pertama : ")
        angka1= readLine()!!.toInt()
        print("masukkan angka pertama : ")
        angka2= readLine()!!.toInt()

        var hasil:Int=0
        hasil = angka1-angka2

        println("hasil pengurangan $angka1 dan $angka2 adalah $hasil")
        pilihan()
    }

    fun kali(){
        println("----anda memilih perkalian---")
        print("masukkan angka pertama : ")
        angka1= readLine()!!.toInt()
        print("masukkan angka pertama : ")
        angka2= readLine()!!.toInt()

        var hasil:Int=0
        hasil = angka1*angka2

        println("hasil perkalian $angka1 dan $angka2 adalah $hasil")
        pilihan()
    }

    fun bagi(){
        println("----anda memilih pembagian---")
        print("masukkan angka pertama : ")
        var db1:Double
        db1= readLine()!!.toDouble()
        print("masukkan angka pertama : ")
        var db2:Double
        db2= readLine()!!.toDouble()

        var hasil:Double
        hasil = db1/db2

        println("hasil pembagian $db1 dan $db2 adalah $hasil")
        pilihan()
    }

    fun utama(){
        var op=operasi()
        println("operasi yang diinginkan : ")
        println("1. penjulahan ")
        println("2. pengurangan ")
        println("3. perkalian ")
        println("4. pembagian ")

        println("masukkan pilihan anda (1/2/3/4) : ")
        var pilih:Int=0
        pilih= readLine()!!.toInt()

        if (pilih==1){
            op.jumlah()
        }else if (pilih==2){
            op.kurang()
        }else if (pilih==3){
            op.kali()
        }else if (pilih==4){
            op.bagi()
        }else {
            println("maaf pilihan anda tidak dikenali")
            println("----silahkan masukkan pilihan yang benar----")
            println()
            utama()
        }
    }
}

fun main(args: Array<String>) {
    var op=operasi()
    op.utama()
}