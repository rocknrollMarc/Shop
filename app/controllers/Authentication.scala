



object Authentication extends Controller {

  val loginForm = Form(
    tuple(
      "email" -> text,
      "password" -> text
    ) verifying ("invalid email or password", result => result
      match {
        case(email, password) => check(email, password)
      })
  )

  def check(username: String, password: String) = {
    (username == "marc.bluemner@gmail.com" && password == "meinefrau011280")
  }

  def login = Action { implicit request => 
    Ok(html.login(loginForm))
  }
  
  def authenticate = Action { implicit request => 
    loginForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.login(formWithErrors)),
      user => Redirect(routes.Application.index).withSession(Security.username -> user._1)
    )
  }

  def logout = Action {
    Redirect(routes.Authentication.login).withNewSession.flashing(
      "success" -> "You are now logged out." 
    )
  }
  
}
