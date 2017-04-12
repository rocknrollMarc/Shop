import com.google.inject.{ AbstractModule, Provides }
import net.codingwell.scalaguice.ScalaModule
//import play.api.Configuration
//import play.api.libs.concurrent.Execution.Implicits._
//import com.typesafe.config.ConfigFactory
import services.{SimpleUUIDGenerator, UUIDGenerator}

/**
 * The Guice module which wires all dependencies.
 */
class MainModule extends AbstractModule with ScalaModule {

  /**
   * Configures the module.
   * Bind types such that whenever UUIDGenerator is required, an instance of SimpleUUIDGenerator will be used.
   */
  def configure() {
      bind(classOf[UUIDGenerator]).to(classOf[SimpleUUIDGenerator])
  }
}
