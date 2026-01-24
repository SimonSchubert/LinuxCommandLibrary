# TLDR

**Sign JAR file**

```jarsigner -keystore [keystore.jks] [app.jar] [alias]```

**Verify signature**

```jarsigner -verify [app.jar]```

**Verify with details**

```jarsigner -verify -verbose -certs [app.jar]```

**Sign APK file**

```jarsigner -keystore [keystore.jks] -signedjar [signed.apk] [unsigned.apk] [alias]```

**Sign with specific algorithm**

```jarsigner -sigalg SHA256withRSA -digestalg SHA-256 [app.jar] [alias]```

# SYNOPSIS

**jarsigner** [_options_] _jar-file_ _alias_

# DESCRIPTION

**jarsigner** signs and verifies Java Archive (JAR) files. It adds digital signatures to ensure authenticity and integrity, required for Java applets, Android apps, and signed JARs.

The tool uses certificates stored in keystores for signing. Verification checks that contents haven't been modified and validates the signer's certificate.

# PARAMETERS

**-keystore** _file_
> Keystore location.

**-storepass** _pass_
> Keystore password.

**-keypass** _pass_
> Key password.

**-signedjar** _file_
> Output signed JAR name.

**-sigalg** _algo_
> Signature algorithm.

**-digestalg** _algo_
> Digest algorithm.

**-verify**
> Verify signature.

**-verbose**
> Verbose output.

**-certs**
> Show certificates.

**-tsa** _url_
> Timestamp authority URL.

# CAVEATS

Weak algorithms deprecated. Keystores need protection. Timestamp recommended for longevity. Android has specific requirements.

# HISTORY

**jarsigner** has been part of the **JDK** since Java's early days. JAR signing became important for Java applets in browsers and later for Android application distribution. The tool has evolved to support stronger cryptographic algorithms.

# SEE ALSO

[keytool](/man/keytool)(1), [jar](/man/jar)(1), [apksigner](/man/apksigner)(1), [openssl](/man/openssl)(1)
