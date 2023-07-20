## Jawaban Nomor 3
Untuk jawaban nomor 3, kompleksitas dari algoritma tersebut ialah O(n)
untuk logic nya sendiri yaitu
- dilakukan perulangan for loop pada string bracket berdasarkan ukurannya, kita beri nama index i
- kemudian, jika pada index i di array stringbracket ialah antara {, [ atau (, maka akan dilakukan push ke stack
- sedangkan jika pada index i ialah char }, akan dilakukan pengecekan apakah stack kosong dan jika stack di peek ialah {, maka stack di pop, jika kosong atau bukan peek yang dimaksud, maka return NO
- sedangkan jika pada index i ialah char ], akan dilakukan pengecekan apakah stack kosong dan jika stack di peek ialah [, maka stack di pop, jika kosong atau bukan peek yang dimaksud, maka return NO
- sedangkan jika pada index i ialah char ), akan dilakukan pengecekan apalah stack kosong dan jika stack di peek ialah (, maka stack di pop, jika kosong atau bukan peek yang dimaksud, maka return NO

- terakhir setelah selesai for loop, jika stack kosong return YES, tapi jika tidak return NO
