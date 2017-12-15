package inmutablestate.functional

import inmutablestate.data.User

fun main(args: Array<String>) {
    val activeUserNames = activeUserNames(users)

    println(activeUserNames)
}

fun activeUserNames(users: List<User>) : List<String>{
    return users
            .filter { it -> it.active }
            .sortedBy { (id) -> id }//.sortedBy { (id, name, active) -> id }
            .map{ it -> it.name }
}

val users = listOf(
        User(1, "Bruce", false),
        User(2, "Rachel", false),
        User(3, "Brian", true),
        User(4, "Susan", false),
        User(5, "Louise", true),
        User(6, "Deborah", false),
        User(7, "Jennifer", false),
        User(8, "Joyce", false),
        User(9, "Julie", false),
        User(10, "Lillian", true),
        User(11, "Wanda ", false),
        User(12, "Phyllis", false),
        User(13, "Justin", false),
        User(14, "Christopher", true),
        User(15, "Martha", true),
        User(16, "Rachel", false),
        User(17, "Shirley", true),
        User(18, "Phyllis", false),
        User(19, "Todd", false),
        User(20, "Eric", true),
        User(21, "Jonathan", false),
        User(22, "Frank", true),
        User(23, "Ernest", false),
        User(24, "Christine", false),
        User(25, "Helen", true),
        User(26, "Albert", false),
        User(27, "Carol", false),
        User(28, "Harold", false),
        User(29, "Arthur", false),
        User(10, "Stephen", false)
)

//fun activeUserNames() : List<String>{
//    val activeUsers = users.filter { user -> user.active }
//    val sortedUsers = activeUsers.sortedBy { user -> user.id }
//    val activeUserNames = sortedUsers.map { user -> user.name }
//    return activeUserNames
//}

//fun activeUserNames() : List<String>{
//    return users
//            .filter { user -> user.active }
//            .sortedBy { user -> user.id }
//            .map{ user -> user.name }
//}