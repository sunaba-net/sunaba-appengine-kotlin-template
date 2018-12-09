import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(urlPatterns = ["/"])
class HelloServlet : HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        resp?.characterEncoding = "UTF-8"
        resp?.contentType = "text/plain?charaset=UTF-8"
        resp?.writer?.println("ハロー App Engine!!")
    }
}