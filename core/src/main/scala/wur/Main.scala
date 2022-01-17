package wur

import com.typesafe.config.{Config, ConfigFactory}

object Hello:
  val config: Config = ConfigFactory.load()
  val world: String = config.getString("hello.world")

@main def run = println(Hello.world)
