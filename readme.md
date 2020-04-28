Quick experiment of different Java frameworks and nodejs (Express) to build apis for container and serverless.

SpringBoot although the most widely used and popular framework for java web-apps, its boot time was a  bit slow which 
can be an issue in serverless environments where functions need to spun up for the new requests as they come in. After the start up however, the subsequent
requests are processed pretty fast. This repository contains four projects built with springboot, nodejs, and two newer java frameworks
quarkus and micronaut that are promoted as being serverless and container first. All of these projects expose same endpoint 
and process posted data by executing the same logic. After running some tests,

SpringBoot and micronaut versions had the longest cold start ~ 9.7 seconds, nodejs had very short cold start time
of just 48ms, quarkus had a comparable cold start up time of 63ms.

After the cold start however, SpringBoot was fastest with response time of 0.89ms, followed by quarkus 1.05ms, 
micronaut 1.1ms and nodejs 1.7ms.

Quarkus seems interesting and need to play with a bit more, but after a brief exploration, found it 
provides similar rapid application development experience. It also comes with very reliable and fast live reloading
so you can develop from hello world to production code without havinng to restart the local dev server.
