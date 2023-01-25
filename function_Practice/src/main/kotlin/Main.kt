class Song(title: String, artist: String, yearPublished: Int, playCount: Int){

   private val songTitle = title
   private val songArtist = artist
   private val songPublishYear = yearPublished
   private val playCount = playCount
    fun popular( ) {
        if (this.playCount > 1000){
            println("Popular Song")
        }else {
            println("Not so popular song")
        }
    }

    fun songDescription(){
        println("${songTitle}, performed by $songArtist. was released in $songPublishYear")
    }
}

fun main(){
    val brunoSong = Song("We Don't Talk About Bruno", "En canto Cast", 2022, 1_000_000)
    brunoSong.songDescription() // We Don't Talk About Bruno, performed by En canto Cast. was released in 2022
    brunoSong.popular() // Popular Song

}