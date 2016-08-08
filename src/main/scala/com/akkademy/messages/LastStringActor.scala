package com.akkademy.messages

import akka.actor.Actor
import akka.event.Logging

class LastStringActor extends Actor {
  var lastString = ""
  val log = Logging(context.system, this)
  def receive = {
    case s: String => lastString = s
    case o => log.info("received unknown message: {}", o);
  }
}
