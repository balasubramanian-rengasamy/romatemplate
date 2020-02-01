package prime.template

import java.io.Serializable
import javax.enterprise.context.SessionScoped
import javax.inject.Named

@Named
@SessionScoped
class AdminSession : Serializable {

    var loggedInUser: String? = null
    var loggedIn: Boolean = false
    var userRedirected: Boolean = false

}