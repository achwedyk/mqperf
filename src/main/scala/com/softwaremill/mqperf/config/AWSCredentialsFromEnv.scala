package com.softwaremill.mqperf.config

import com.amazonaws.auth.BasicAWSCredentials

object AWSCredentialsFromEnv {
  def apply() = {
    new BasicAWSCredentials(
      sys.env("AWS_ACCESS_KEY_ID"),
      sys.env("AWS_SECRET_ACCESS_KEY"))
  }
}
