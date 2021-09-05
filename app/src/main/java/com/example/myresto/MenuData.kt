package com.example.myresto

import java.util.ArrayList


object MenuData {
    var data = arrayOf(
        arrayOf(
            "Mie Aceh",
            """Masakan nusantara khas Aceh ini punya tekstur yang tebal dan dicampur dengan irisan daging serta bumbu rempah yang kuat. Mie Aceh biasa disajikan dengan digoreng, direbus atau ditumis. Tentunya, bisa juga disajikan dengan tambahan seafood seperti kepiting, udang dan cumi.""".trimIndent(),
            "https://asset.kompas.com/crops/7tBNI9-TCa-oOq8tQTahf0ua1fg=/0x0:968x645/750x500/data/photo/2021/01/27/6010ce2cc1805.jpg"
        ),
        arrayOf(
            "Rendang",
            """Masakan nusantara dari Sumatera Barat ini pernah dinobatkan sebagai makanan terlezat di dunia. Makanan dari daging sapi yang dimasak menggunakan santan kelapa serta bumbu rempah selama berjam-jam ini memang begitu terkenal. Rasanya yang gurih dan juga nikmat, sukses membuat makanan khas daerah Sumatera Barat ini begitu disukai banyak orang."""".trimIndent(),
            "https://akcdn.detik.net.id/community/media/visual/2020/11/24/rendang-3_169.jpeg?w=700&q=90"
        ),
        arrayOf(
            "Gulai Belacan",
            """Gulai Belacan adalah masakan nusantara dari Riau. Belacan sendiri adalah nama lain dari terasi yang begitu dikenal oleh orang Sumatera. Makanan khas Riau ini dibuat dari bahan dasar kuah yang dicampur terasi. Di dalamnya ada isian berupa daging, udang atau ikan.""".trimIndent(),
            "https://img-global.cpcdn.com/recipes/25fbdfeba9fe5d3c/1200x630cq70/photo.jpg"
        ),
        arrayOf(
            "Bika Ambon",
            """
              Meski namanya Bika Ambon, tapi masakan nusantara ini bukan berasal dari Ambon. Kue ini berasal dari Sumatera Utara dan banyak dijual di Kota Medan sebagai oleh-oleh. Kue berwarna kuning ini punya tekstur yang lembut dan manis.
              """.trimIndent(),
            "https://cdns.klimg.com/merdeka.com/i/w/news/2020/01/30/1144060/670x335/resep-bika-ambon-khas-medan-yang-bersarang-rev-1.jpg"
        ),
        arrayOf(
            "Otak-otak",
            """Masakan nusantara lain masih dari Kepulauan Riau yaitu otak-otak. Masakan ini terbuat dari bahan utama seafood dan merupakan makanan hasil laut yang diolah serta dibungkus dengan daun pisang.""".trimIndent(),
            "http://kbu-cdn.com/dk/wp-content/uploads/otak-otak-goreng-ala-kobe.jpg"
        ),
        arrayOf(
            "Gulai Ikan Patin",
            """Masakan nusantara dari Jambi ini punya keunikan dari cara memasaknya. Cara masaknya dicampur dengan daging buah durian yang sudah difermentasi atau dikenal dengan tempoyak. Tapi penggunaan tempoyak bisa diganti dengan santan.""".trimIndent(),
            "https://asset.kompas.com/crop/209x60:931x541/750x500/data/photo/2019/06/07/2823890915.jpeg"
        ),
        arrayOf(
            "Mie Bangka",
            """Masakan nusantara dari daerah Bangka ini berbahan dasar mi. Dihidangkan dengan campuran kuah dari bumbu ikan, udang, atau cumi, lalu ditaburi dengan kecambah serta mentimun.""".trimIndent(),
            "https://assets-pergikuliner.com/FwOieD20ttVIp6Q_UqcxjRYr2w4=/fit-in/1366x768/smart/filters:no_upscale()/https://assets-pergikuliner.com/uploads/image/picture/217020/picture-1462868774.JPG"
        ),
        arrayOf(
            "Seruit",
            """Seruit adalah masakan nusantara yang berasal dari Lampung. Makanan ini terbuat dari ikan yang dibakar dan disajikan dengan sambal terasi atau tempoyak atau mangga. Jika sedang berkunjung ke Lampung, tak ada salahnya untuk mencicipi kuliner satu ini.""".trimIndent(),
            "https://asset.kompas.com/crop/116x0:1018x601/750x500/data/photo/2019/05/03/3776094973.jpg"
        ),
        arrayOf(
            "Pempek",
            """Makanan khas Sumatera Selatan ini sudah dikenal dengan kelezatannya. Masakan nusantara ini dibuat dari olahan ikan yang dicampur dengan sagu. Dilengkapi kuah cuko atau cuka yang begitu menggoda selera membuat banyak orang menggemarinya.""".trimIndent(),
            "https://asset.kompas.com/crops/UlNzTgTGP7jQqHkUpgyyGnRAtVE=/92x0:938x564/750x500/data/photo/2020/02/25/5e552581b5371.jpg"
        )
    )
    val listData: ArrayList<Menu>
        get() {
            val list: ArrayList<Menu> = ArrayList<Menu>()
            for (aData in data) {
                val menu = Menu()
                menu.name = aData[0]
                menu.detail = aData[1]
                menu.photo = aData[2]
                list.add(menu)
            }
            return list
        }
}