package prime.template


import java.io.IOException

import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.FilterConfig
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

class CharacterEncodingFilter : Filter {

    @Throws(IOException::class, ServletException::class)
    override fun doFilter(req: ServletRequest, resp: ServletResponse, chain: FilterChain) {
        req.characterEncoding = "UTF-8"
        resp.characterEncoding = "UTF-8"
        chain.doFilter(req, resp)
    }

    @Throws(ServletException::class)
    override fun init(filterConfig: FilterConfig?) {

    }

    override fun destroy() {

    }

}
