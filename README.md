# jks-util
<a href="https://github.com/davidmoten/jks-util/actions/workflows/ci.yml"><img src="https://github.com/davidmoten/jks-util/actions/workflows/ci.yml/badge.svg"/></a><br/>
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.davidmoten/jks-util/badge.svg?style=flat)](https://maven-badges.herokuapp.com/maven-central/com.github.davidmoten/jks-util)<br/>
[![codecov](https://codecov.io/gh/davidmoten/jks-util/branch/master/graph/badge.svg)](https://codecov.io/gh/davidmoten/jks-util)<br/>

Utilities for manipulating JKS files.

**Status**: *released to Maven Central*

## Remove expiring entries from a JKS file
* `Jks.removeExpiringCertificates(file, password, expiryTime)`
* `Jdk.main` with arguments `"removeExpiring", "<filename>", "<password>", "<days-to-expire-from-now>"`

### Example using exec-maven-plugin
Add this to your pom.xml:

```xml
<dependencies>
  <dependency>
    <groupId>com.github.davidmoten</groupId>
    <artifactId>jks-util</artifactId>
    <version>VERSION_HERE</version>
  </dependency>
</dependencies>

<build>
  <plugins>
    <plugin>
     <groupId>org.codehaus.mojo</groupId>
     <artifactId>exec-maven-plugin</artifactId>
     <version>3.0.0</version>
       <executions>
         <execution>
           <goals>
             <goal>java</goal>
           </goals>
           <configuration>
             <mainClass>com.github.davidmoten.jks.Jks</mainClass>
             <arguments>
               <argument>removeExpiring</argument>
               <argument>src/main/jks/cacerts.jks</argument>
               <argument>changeit</argument>
               <argument>90</argument>
             </arguments>
           </configuration>
         </execution>
       </executions>
     </plugin>
  </plugins>
</build>
```

Then call `mvn exec:java`
