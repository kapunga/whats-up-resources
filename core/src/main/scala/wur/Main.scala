package wur


object Hello:
  def world: String = io.Source.fromResource("hello.txt").getLines.mkString("\n")

@main def run = println(Hello.world)
