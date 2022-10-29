package com.chirikualii.materi_recyclerview

object DataDummy  {

    // TODO add data dummy
    val listProfile = listOf<Profile>(
        Profile(
            name = "yanto",
            phone = "0812315645",
            Image = "data:image/jpeg;base64,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",
        ),
        Profile(
            name = "Wawan",
            phone = "0812315645",
            Image = "https://avatars.githubusercontent.com/u/14894726?v=4",
        ),
        Profile(
            name = "Rudi",
            phone = "0812315645",
            Image = "https://avatars.githubusercontent.com/u/14894766?v=4",
        ),
        Profile(
            name = "Didin",
            phone = "0812315645",
            Image = "https://avatars.githubusercontent.com/u/14894712?v=4",
        ),
        Profile(
            name = "Musli",
            phone = "0812315645",
            Image = "https://avatars.githubusercontent.com/u/12874126?v=4",
        ),
        Profile(
            name = "Anom",
            phone = "0812315645",
            Image = "https://avatars.githubusercontent.com/u/14494531?v=4",
        ),
        Profile(
            name = "jojo",
            phone = "0812315645",
            Image = "https://avatars.githubusercontent.com/u/14892473?v=4",
        ),
        Profile(
            name = "redi",
            phone = "0812315645",
            Image = "https://avatars.githubusercontent.com/u/14894431?v=4",
        ),
        Profile(
            name = "rodo",
            phone = "0812315645",
            Image = "https://avatars.githubusercontent.com/u/14894248?v=4",
        ),
        Profile(
            name = "antok",
            phone = "0812315645",
            Image = "https://avatars.githubusercontent.com/u/14894562?v=4",
        ),
        Profile(
            name = "rodi",
            phone = "0812315645",
            Image = "https://avatars.githubusercontent.com/u/14894982?v=4",
        ),
        Profile(
            name = "rewe",
            phone = "0812315645",
            Image = "https://avatars.githubusercontent.com/u/14894126?v=4",
        ),

    )
}