# qrscanner_ptk
=======  
Aplikasi android untuk melakukan pencarian ptk melalui qr code.  
Librari yang digunakan :
* Google Firebase Vision untuk scan qr code
* Retrofit untuk http request

No pegawai(ptk_id) ditampilkan dalam format qr code. Hasil scan qr code berupa ptk_id digunakan untuk melakukan pencarian informasi pegawai. URL untuk melakukan pencarian adalah http://cari.padamu.siap.web.id/cari/detail dengan method GET. Contohnya hasil scan qr code adalah 20253484185001, maka dilakukan http request ke http://cari.padamu.siap.web.id/cari/detail?ptk_id=20253484185001. Hasil request adalah detail informasi pegawai yang kemudian ditampilkan dalam tampilan tabulasi. Untuk menghasilkan qr code bisa menggunakan situs https://www.qr-code-generator.com  
--(0)--
 
