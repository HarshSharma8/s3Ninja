package com.s3Ninja.helper

import java.io.File
import com.typesafe.config.ConfigFactory

/**
 * Created by knoldus on 30/12/15.
 */
object TestHelper {
  val config = ConfigFactory.load("test")
  val ACCESS_KEY = config.getString("NINJA_ACCESS_KEY")
  val SECRET_KEY = config.getString("NINJA_SECRET_KEY")
  val NINJA_URL = config.getString("NINJA_URL")
  val FILE = new File("src/test/resources/ninja.jpg")
  val BUCKET = "demoBucket"
}
