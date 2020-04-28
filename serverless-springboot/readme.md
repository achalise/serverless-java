# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/gradle-plugin/reference/html/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

# To deploy to AWS

* update `build.gradle` with the correct `Main-Class`

  ```jar {
   	manifest {
   		attributes 'Main-Class': 'com.example.serverlessspringboot.ServerlessSpringbootApplication'
   	}
   }```
   
* Create a Custome handler for the function we want to expose, in our case `TransactionServiceRequestHandler`

* Set Environment Variable `FUNCTION_NAME`, (in this caese `saveTransaction` as registered
  via application context initializer) to the function name if there are more than one functions in the uploaded
  jar file
     
