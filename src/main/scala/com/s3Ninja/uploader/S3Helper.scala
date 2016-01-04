package com.s3Ninja.uploader

import java.io.File
import com.amazonaws.services.s3.transfer.TransferManager
import org.slf4j.LoggerFactory


/**
 * Created by knoldus on 30/12/15.
 */
class S3Helper(transferManager: TransferManager) {

  val logger = LoggerFactory.getLogger(this.getClass)

  /**
   * Uploads a file to S3
   * @param bucket
   * @param file
   * @return
   */
  def uploadFile(bucket: String, file: File): Boolean = {
    try {
      transferManager.upload(bucket, "/khandal/"+file.getName, file)
      true
    } catch {
      case ex: Exception => logger.error("Exception in uploading file")
        false
    }
  }
}
