package com.s3Ninja.constants

import java.io.File

import com.typesafe.config.ConfigFactory

/**
 * Created by knoldus on 30/12/15.
 */
object Constants {
  val config = ConfigFactory.load()
  val ACCESS_KEY = config.getString("AWS_ACCESS_KEY")
  val SECRET_KEY = config.getString("AWS_SECRET_KEY")
  val FILE = new File("src/main/resources/ninja.jpg")
  val BUCKET = "myBucket"
}
