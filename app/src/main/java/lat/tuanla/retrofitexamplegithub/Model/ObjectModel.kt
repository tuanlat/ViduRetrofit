package lat.tuanla.retrofitexamplegithub.Model

/**
 * Json
 * {
"total_count": 1,
"incomplete_results": false,
"items": [
{
"login": "anhuituan",
"id": 13481907,
"node_id": "MDQ6VXNlcjEzNDgxOTA3",
"avatar_url": "https://avatars1.githubusercontent.com/u/13481907?v=4",
"gravatar_id": "",
"url": "https://api.github.com/users/anhuituan",
"html_url": "https://github.com/anhuituan",
"followers_url": "https://api.github.com/users/anhuituan/followers",
"following_url": "https://api.github.com/users/anhuituan/following{/other_user}",
"gists_url": "https://api.github.com/users/anhuituan/gists{/gist_id}",
"starred_url": "https://api.github.com/users/anhuituan/starred{/owner}{/repo}",
"subscriptions_url": "https://api.github.com/users/anhuituan/subscriptions",
"organizations_url": "https://api.github.com/users/anhuituan/orgs",
"repos_url": "https://api.github.com/users/anhuituan/repos",
"events_url": "https://api.github.com/users/anhuituan/events{/privacy}",
"received_events_url": "https://api.github.com/users/anhuituan/received_events",
"type": "User",
"site_admin": false,
"score": 138.63148
}
]
}
 */
import com.google.gson.annotations.SerializedName

object ObjectModel {
    //khai bao toan bo model
    data class User(
        var id : Int,
        var login : String,
        var score : Float
    )

    data class UserList(
        @SerializedName("items")
        var userList : List<User>
        )
}