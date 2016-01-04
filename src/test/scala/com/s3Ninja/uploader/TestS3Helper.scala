package com.s3Ninja.uploader

import com.amazonaws.ClientConfiguration
import com.amazonaws.auth.{AWSCredentials, BasicAWSCredentials}
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.transfer.TransferManager
import org.scalatest.FlatSpec
import com.s3Ninja.helper.TestHelper._

/**
 * Created by knoldus on 30/12/15.
 */
class TestS3Helper extends FlatSpec {

  val credentials: AWSCredentials = new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY)
  val amazonS3Client: AmazonS3Client = new AmazonS3Client(credentials, new ClientConfiguration())
  amazonS3Client.setEndpoint(NINJA_URL)

  val transferManager: TransferManager = new TransferManager(amazonS3Client)
  val testService = new S3Helper(transferManager)

  it should "upload a file on S3Ninja successfully" in {
    val isUploaded = testService.uploadFile(BUCKET, FILE)
    assert(isUploaded)
  }
}
