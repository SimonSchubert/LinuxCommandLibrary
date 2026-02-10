# TAGLINE

manages Java keystores and certificates

# TLDR

**Generate key pair**

```keytool -genkeypair -alias [mykey] -keystore [keystore.jks]```

**List keystore contents**

```keytool -list -keystore [keystore.jks]```

**Export certificate**

```keytool -exportcert -alias [mykey] -keystore [keystore.jks] -file [cert.cer]```

**Import certificate**

```keytool -importcert -alias [trusted] -file [cert.cer] -keystore [keystore.jks]```

**Change keystore password**

```keytool -storepasswd -keystore [keystore.jks]```

**Delete entry**

```keytool -delete -alias [mykey] -keystore [keystore.jks]```

# SYNOPSIS

**keytool** _command_ [_options_]

# PARAMETERS

**-genkeypair**
> Generate key pair.

**-list**
> List keystore entries.

**-exportcert**
> Export certificate.

**-importcert**
> Import certificate.

**-alias** _NAME_
> Entry alias.

**-keystore** _FILE_
> Keystore file.

**-storepass** _PASS_
> Keystore password.

**--help**
> Display help information.

# DESCRIPTION

**keytool** is a key and certificate management utility included with the Java Development Kit. It generates cryptographic key pairs, creates certificate signing requests (CSRs), imports and exports X.509 certificates, and manages keystores that store private keys and trusted certificate chains used by Java applications for SSL/TLS, code signing, and authentication.

The tool supports multiple keystore formats including the legacy Java KeyStore (JKS) and the industry-standard PKCS#12 format. It is commonly used to configure HTTPS for Java-based web servers, establish trust relationships by importing CA certificates, and inspect the contents of existing keystores. Each entry in a keystore is identified by an alias, and access is protected by a store-level password with optional per-key passwords.

# CAVEATS

Part of JDK. Password management important. Multiple keystore formats.

# HISTORY

keytool has been part of the **JDK** since early versions, providing certificate and key management for Java applications.

# SEE ALSO

[openssl](/man/openssl)(1), [java](/man/java)(1), [jarsigner](/man/jarsigner)(1)
