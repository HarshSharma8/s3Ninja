package com.s3Ninja.uploader

import com.amazonaws.ClientConfiguration
import com.amazonaws.auth.{BasicAWSCredentials, AWSCredentials}
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.transfer.TransferManager
import com.s3Ninja.constants.Constants._

/**
 * Created by knoldus on 30/12/15.
 */
object S3Uploader extends App {

  /**
   * Uploads a file to Amazon S3
   * @param args
   */
  override def main(args: Array[String]) {
    val credentials: AWSCredentials = new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY)
    val amazonS3Client: AmazonS3Client = new AmazonS3Client(credentials, new ClientConfiguration())
    val transferManager: TransferManager = new TransferManager(amazonS3Client)
    new S3Helper(transferManager).uploadFile(BUCKET, FILE)
  }
}
