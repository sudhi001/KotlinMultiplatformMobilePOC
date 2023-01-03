# Kotlin MultiPlatform Mobile POC

This is for analysing the KMM cross platform development.


# Run time issues when followed the KMM Official tutorial
  - IOS build not running ... Compile time issue 
    Resolved by using io.ktor:ktor-client-okhttp with ktor version as 2.1.3
  - Network data not visible in IOS with Runtime crash
    The following attributes added in gradle.properties
    ``` kotlin.native.binary.memoryModel=experimental
    kotlin.native.binary.freezing=disabled ```

