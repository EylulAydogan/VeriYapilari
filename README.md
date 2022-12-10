# VeriYapilari

Huffman sıkıştırma algoritması kayıpsız bir veri sıkıştırma tekniğini içerir. Bu yüzden bu yöntemin en elverişli olduğu veriler metin tabanlı verilerdir. 

Huffman algoritması, bir veri kümesinde daha çok rastlanan sembolü daha düşük uzunluktaki kodla, daha az rastlanan sembolleri daha yüksek uzunluktaki kodlarla temsil etme mantığı üzerine kurulmuştur.

Bir veri kümesini Huffman tekniği ile sıkıştırabilmek için veri kümesinde bulunan her bir sembolün ne sıklıkta tekrarlandığını bilmemiz gerekir. Örneğin bir metin dosyasını sıkıştırıyorsak her bir karakterin metin içerisinde kaç adet geçtiğini bilmemiz gerekiyor. Her bir sembolün ne sıklıkta tekrarlandığını gösteren tablo frekans tablosu olarak adlandırılmaktadır.
Dolayısıyla sıkıştırma işlemine geçmeden önce frekans tablosunu çıkarmamız gerekmektedir. 

Ben de koduma frekans hesaplamayla başladım. (26 - 39 satırları arası)
Sonra hesapladığım frekansları frekans adlı bir dizide tuttum. Str dizisinde ise girilen stringlerdeki elemanları tuttum. (40 - 46)
Daha sonra frekansları sıraladım. (50 - 70)
Str dizisinde stringlerimiz random yerlerde bulunuyor. Bunları doğru indexlere yerlestiriyoruz. Yerlestirdiğimiz indexlerin frekanslarını da aynı sekilde aynı indexlere yerlestirmemiz gerek. (Bu yüzden 72 - 85 arası onu yapıyorum.)
En son da kod bulma kısmına geçiyorum. (96 - 115)
Sağ çocuklara giderken 1, sol çocuklara giderken 0 biti ile gideriz. Bu yüzden 2 tane farklı string olusturalım. Ağaç yapısı kullanmadığımız için kökümüze 0 bitini atayalim.

Bu şekilde ağaç yapısı kullanılmadan huffman sıkıştırılma algoritması düzeneğinde ödevimiz hazırlanmış oluyor.

Aşağıya bazı örnekleri ekliyorum.

1-) Tekli düzgün yazım
![2022-12-10 (6)](https://user-images.githubusercontent.com/102043836/206870038-f0fdc8a4-3954-4efc-ae69-0af3394f0000.png)

2-) Tekli tersten yazım
![2022-12-10 (7)](https://user-images.githubusercontent.com/102043836/206870109-379e0312-33bd-49f2-a340-376ebe036b76.png)

3-) Tekrarlı yazım
![2022-12-10 (9)](https://user-images.githubusercontent.com/102043836/206870135-5eb999b7-328f-43df-97ec-431e96969163.png)

4-) 8 taneli hali
![2022-12-10 (8)](https://user-images.githubusercontent.com/102043836/206870163-31634c51-071d-48ff-877f-a998b0369851.png)

