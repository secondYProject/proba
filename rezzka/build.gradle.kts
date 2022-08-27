// use an integer for version numbers
version = 1


cloudstream {
    language = "ru"
    // All of these properties are optional, you can safely remove them

    // description = "Rezzka"
    // authors = listOf("JJu1c3")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "Anime",
        "Cartoon",
        "TvSeries",
        "Movie",
        "TvSeries",
    )
    iconUrl = "https://www.google.ru/search?q=%D0%B8%D0%BA%D0%BE%D0%BD%D0%BA%D0%B0+%D1%84%D0%B8%D0%BB%D1%8C%D0%BC%D0%B0&newwindow=1&tbm=isch&ved=2ahUKEwiwoYLa6-b5AhWI_CoKHVkrCXwQ_AUoAXoECAEQAw#imgrc=TRzEhxZTEZiPUM"
}