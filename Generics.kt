fun main(args:Array<String>) {
   val footballPlayer=FootballPlayer("Football player 1")
   val footballPlayer2=FootballPlayer("Football player 2")
   val footballPlayer3=FootballPlayer("Football player 3")

   val baseballPlayer=BaseballPlayer("Baseball player 1")
   val baseballPlayer2=BaseballPlayer("Baseball player 2")

   val footballTeam=Team<FootballPlayer>("Football team",mutableListOf(footballPlayer))
   footballTeam.addPlayers(footballPlayer2)
}

class Team<T>(val name:String,val players: MutableList<T>){//<T> means This team can hold any one type of player. Example: Team<FootballPlayer> → football team ,Team<BaseballPlayer> → baseball team
   fun addPlayers(player : T){
       if(players.contains(player)){
           println("Player: ${(player as Player).name} is already in the team ${this.name}")
       }else{
           players.add(player)
           println("Player: ${(player as Player).name} added successfully in the team ${this.name}")
       }
   }
}
open class Player(val name:String)

class FootballPlayer(name: String):Player(name)
class BaseballPlayer(name: String):Player(name)


//<------------------------------------------------------------------------>
//same code of above but in easy way

fun main(args:Array<String>) {
   val p1 = FootballPlayer("Messi")
   val p2 = FootballPlayer("Ronaldo")
   val p3 = FootballPlayer("Messi")

   val team = FootballTeam("Dream Team")

   team.addPlayer(p1)
   team.addPlayer(p2)
   team.addPlayer(p3)
}
class FootballTeam(val name: String) {

   private val players = mutableListOf<FootballPlayer>()

   fun addPlayer(player: FootballPlayer) {
       if (players.any { it.name == player.name }) {
           println("${player.name} is already in the team")
       } else {
           players.add(player)
           println("${player.name} added to the team")
       }
   }
}
open class Player(open val name: String)
class FootballPlayer(name: String) : Player(name)


//<------------------------------------------------------------------------>

fun main(args:Array<String>) {
   val mixedList=mutableListOf(1,2,360,'a','b','c',"hello","world")
   val specificList=getSpecificTypes<Int>(mixedList)

   for(element in specificList){
       println(element)
   }
}
inline fun <reified T> getSpecificTypes(list: List<Any>):List<T>{//reified :Allows checking element is T, inline is Required to use reified
   val specificList=mutableListOf<T>()
   for(element in list){
       if(element is T){
           specificList.add(element)
       }
   }
   return specificList
}
