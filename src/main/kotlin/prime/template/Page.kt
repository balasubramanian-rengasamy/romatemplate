package prime.template


import org.omnifaces.util.Faces

import javax.enterprise.context.RequestScoped
import javax.inject.Named

@Named
@RequestScoped
class Page {

    fun redirect(url: String) {
        Faces.redirect(Faces.getRequestContextPath() + "/" + url)
    }

    fun forward(url: String): String {
        return Faces.getRequestContextPath() + "/" + url
    }

}
