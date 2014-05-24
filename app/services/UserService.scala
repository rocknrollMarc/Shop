package services

import securesocial.core.{UserId, SocialUser, UserService}
import securesocial.core.providers.Token
import play.api.{Plugin, Application}

class UserService(val app: Application) extends UserService with Plugin {
  
  var users: Map[UserId, SocialUser] = Map()

  var tokens: Map[String, Token] = Map()

  def find(id: UserId): Option[SocialUser] = {
    users.get(id)
  }

  def findByEmailAndProvider(email: String, providerId: String) = {
    users.values.find { user => 
      user.id.providerId == providerId && 
        user.email == Some(email)
    }
  }

  def save(user: Identity): Identity = {
    val socialUser: SocialUser = SocialUser(user)
    users = users + (user.id -> socialUser)
    socialUser
  }

  def save(token: Token) {
    tokens = tokens + (token.uuid -> token)
  }

  def findToken(token: String) = {
    tokens.get(token)
  }

  def deleteToken(uuid: String) {
    tokens = tokens - uuid
  }

  def deleteExpiredToken() {
    tokens = tokens.filter {  !_._2.isExpired }
  }

}
