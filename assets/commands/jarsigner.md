# TAGLINE

signs and verifies Java Archive files

# TLDR

**Sign a JAR file** with a key from a keystore

```jarsigner -keystore [keystore.jks] [app.jar] [alias]```

**Verify signature**

```jarsigner -verify [app.jar]```

**Verify with details** and signer certificates

```jarsigner -verify -verbose -certs [app.jar]```

**Write the signed output to a new file** instead of signing in place

```jarsigner -keystore [keystore.jks] -signedjar [signed.jar] [unsigned.jar] [alias]```

**Sign an Android App Bundle** with the upload key

```jarsigner -keystore [upload.jks] [app-release.aab] [upload]```

**Sign with specific algorithms**

```jarsigner -keystore [keystore.jks] -sigalg SHA256withRSA -digestalg SHA-256 [app.jar] [alias]```

**Sign with a timestamp** so the signature stays valid after the certificate expires

```jarsigner -keystore [keystore.jks] -tsa [http://timestamp.digicert.com] [app.jar] [alias]```

**Verify strictly**, treating warnings as errors

```jarsigner -verify -strict [app.jar]```

# SYNOPSIS

**jarsigner** [_options_] _jar-file_ _alias_

**jarsigner** **-verify** [_options_] _jar-file_ [_alias_...]

# DESCRIPTION

**jarsigner** signs and verifies Java Archive (JAR) files. It adds digital signatures to ensure authenticity and integrity, required for signed JARs, Java Web Start style deployments, and Android App Bundles.

The tool uses private keys and certificate chains stored in keystores (created with **keytool**). Signing adds a signature file (.SF) and a signature block (.RSA, .DSA or .EC) under META-INF. Verification checks that contents haven't been modified and validates the signer's certificate chain.

# PARAMETERS

**-keystore** _url_
> Keystore location. Defaults to **.keystore** in the user's home directory.

**-storepass** _pass_
> Keystore password. Prompted for if omitted; also accepts **:env** _VAR_ or **:file** _path_ suffixes.

**-storetype** _type_
> Keystore type (e.g. PKCS12, JKS, PKCS11).

**-keypass** _pass_
> Private key password, if different from the store password.

**-signedjar** _file_
> Name of the signed JAR to write. Without it, the input JAR is overwritten.

**-sigfile** _file_
> Base name for the generated .SF and signature block files.

**-sigalg** _algo_
> Signature algorithm (e.g. SHA256withRSA, SHA384withECDSA). The default depends on the key type and size.

**-digestalg** _algo_
> Digest algorithm for the JAR entries (e.g. SHA-256).

**-certchain** _file_
> Alternative certificate chain file, when the keystore does not contain the full chain.

**-verify**
> Verify a signed JAR file.

**-verbose**[**:all**|**:grouped**|**:summary**]
> Verbose output when signing or verifying.

**-certs**
> Show certificates (with **-verify** and **-verbose**).

**-revCheck**
> Enable certificate revocation checking.

**-strict**
> Treat warnings as errors.

**-tsa** _url_
> Timestamp authority URL.

**-tsacert** _alias_
> Keystore alias of the TSA's public key certificate.

**-tsadigestalg** _algo_
> Digest algorithm used in the timestamping request.

**-providerName** _name_, **-addprovider** _name_, **-providerClass** _class_
> Use or add a security provider (e.g. SunPKCS11 for hardware tokens).

**-conf** _url_
> Read options from a preconfigured options file.

# CAVEATS

Weak algorithms (MD5, SHA-1 signatures, small RSA/DSA keys) are disabled or treated as unsigned by current JDKs. Without **-tsa**, signatures are considered invalid once the signing certificate expires. Passing **-storepass** on the command line exposes it in the process list; prefer the prompt or **:env**/**:file**.

For **APK** files, jarsigner only produces the legacy v1 (JAR) scheme; modern Android versions require APK Signature Scheme v2 or later, so use **apksigner** for APKs. jarsigner remains the standard tool for signing **.aab** bundles.

# HISTORY

**jarsigner** has been part of the **JDK** since **JDK 1.2** (1998), replacing the earlier **javakey** tool. JAR signing became important for Java applets in browsers and later for Android application distribution. The tool has evolved to support stronger cryptographic algorithms and timestamping.

# SEE ALSO

[keytool](/man/keytool)(1), [jar](/man/jar)(1), [apksigner](/man/apksigner)(1), [openssl](/man/openssl)(1)

# RESOURCES

```[Source code](https://github.com/openjdk/jdk)```

```[Homepage](https://openjdk.org/)```

```[Documentation](https://docs.oracle.com/en/java/javase/25/docs/specs/man/jarsigner.html)```

<!-- verified: 2026-09-29 -->
