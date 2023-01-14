class Picture(val title: String, val author: String)
{
    var creationYear: Int = 0
    var technique: String = ""
    var genre: String = ""

    constructor(title: String, author: String, creationYear: Int) : this(title, author)
    {
        this.creationYear = creationYear
    }

    constructor(title: String, author: String, creationYear: Int, technique: String) : this(title, author, creationYear)
    {
        this.technique = technique
    }

    constructor(title: String, author: String, creationYear: Int, technique: String, genre: String) : this(title, author, creationYear, technique)
    {
        this.genre = genre
    }
}

fun main(args: Array<String>)
{
    val pictureOne = Picture("Звездная ночь", "Ван Гог")

    println("-----Сведения о картине №1-----")
    println("Название: ${pictureOne.title}")
    println("Автор: ${pictureOne.author}")

    val pictureTwo = Picture("Мона Лиза", "Леонардо да Винчи",1506, "Масло", "Портрет")

    println("-----Сведения о картине №2-----")
    println("Название: ${pictureTwo.title}")
    println("Автор: ${pictureTwo.author}")
    println("Год создания: ${pictureTwo.creationYear}")
    println("Техника: ${pictureTwo.technique}")
    println("Жанр: ${pictureTwo.genre}")
}