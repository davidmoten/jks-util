# jks-util
<a href="https://github.com/davidmoten/jks-util/actions/workflows/ci.yml"><img src="https://github.com/davidmoten/jks-util/actions/workflows/ci.yml/badge.svg"/></a><br/>
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.davidmoten/jks-util/badge.svg?style=flat)](https://maven-badges.herokuapp.com/maven-central/com.github.davidmoten/jks-util)<br/>
[![codecov](https://codecov.io/gh/davidmoten/jks-util/branch/master/graph/badge.svg)](https://codecov.io/gh/davidmoten/jks-util)<br/>

Utilities for manipulating JKS files

## Remove expiring entries from a JKS file
* `Jks.removeExpiringCertificates(file, password, expiryTime)`
* `Jdk.main` with arguments "removeExpiring", "<filename>", "<password>", "<days-to-expire-from-now>"
