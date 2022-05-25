# jks-util
Utilities for manipulating JKS files

## Remove expiring entries from a JKS file
* `Jks.removeExpiringCertificates(file, password, expiryTime)`
* `Jdk.main` with arguments `"removeExpiring", "<filename>", "<password>", "<days-to-expire-from-now>"`
