package com.ilyagubarev.concepts.scalaboot.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

object Application extends App {

  SpringApplication.run(classOf[Configuration], args:_*)

  @SpringBootApplication
  private class Configuration {

  }
}
