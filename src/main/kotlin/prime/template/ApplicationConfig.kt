package prime.template

import java.io.Serializable
import javax.enterprise.context.ApplicationScoped
import javax.inject.Named

@Named
@ApplicationScoped
class ApplicationConfig : Serializable {

    var menuMode = "layout-static"
        set(menuMode) {
            field = menuMode

            if (this.menuMode == "layout-horizontal") {
                this.profileMode = "popup"
            }
        }

    var theme = "blue"

    var menuColor = "layout-menu-light"

    var topBarColor = "layout-topbar-blue"

    var logo = "logo"

    private var profileMode = "inline"

    var isOrientationRTL: Boolean = false

    fun setTopBarColor(topBarColor: String, logo: String) {
        this.topBarColor = topBarColor
        this.logo = logo
    }

    var isCustomizeMenu:Boolean = true

    fun getProfileMode(): String {
        return this.profileMode
    }

    fun setProfileMode(profileMode: String) {
        if (this.menuMode == "layout-horizontal") {
            this.profileMode = "popup"
        } else {
            this.profileMode = profileMode
        }
    }



    var title = ""
    var shortTitle = ""

    var indexPage = "index.xhtml"
    var loginPage = "login.xhtml"


    var emailPatternRegularExpression:String = "[\\w\\.-]*[a-zA-Z0-9_]@[\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]"

    var defaultDateFormat:String = "dd-MMM-yyyy"
    var defaultDateTimeFormat = "dd-MMM-yyyy HH:mm:ss"

}
