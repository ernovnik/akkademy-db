import org.scalatest.{BeforeAndAfterEach, FunSpecLike, Matchers}
import akka.testkit.TestActorRef
import akka.actor.ActorSystem
import com.akkademy.AkkademyDb
import com.akkademy.messages.LastStringActor

class LastStringActorSpec extends FunSpecLike with Matchers with
  BeforeAndAfterEach {

  implicit val system = ActorSystem()
  describe("LastStringActor") {
    describe("given String") {
      describe("my test description") {
        it("should store String") {
          val actorRef = TestActorRef(new LastStringActor)
            actorRef ! "i love akka & scala"
            val lastStringActor = actorRef.underlyingActor
            lastStringActor.lastString should equal("i love akka & scala")
        }
      }
      describe("my test 2 description") {
        it("should store String") {
          val actorRef = TestActorRef(new LastStringActor)
          actorRef ! "i love akka & scala"
          val lastStringActor = actorRef.underlyingActor
          lastStringActor.lastString should equal("i love akka & scala")

          actorRef ! "i love akka & scala 2"
          lastStringActor.lastString should equal("i love akka & scala 2")
        }
      }
    }
  }
}
