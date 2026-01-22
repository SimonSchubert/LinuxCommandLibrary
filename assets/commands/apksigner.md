# TLDR

**Sign** an APK

```apksigner sign --ks [keystore.jks] [app.apk]```

Sign with **specific key alias**

```apksigner sign --ks [keystore.jks] --ks-key-alias [alias] [app.apk]```

**Verify** APK signature

```apksigner verify [app.apk]```

Verify with **details**

```apksigner verify --verbose --print-certs [app.apk]```

Sign with **v1, v2, v3** schemes

```apksigner sign --v1-signing-enabled --v2-signing-enabled --v3-signing-enabled --ks [keystore.jks] [app.apk]```

# SYNOPSIS

**apksigner** _command_ [_options_] _apk_

# DESCRIPTION

**apksigner** is the official Android SDK tool for signing APK files. It supports multiple signature schemes (v1/JAR, v2, v3, v4) and can sign aligned APKs produced by zipalign.

The tool ensures APKs meet Android's signing requirements for installation and updates, with newer schemes providing better security and verification speed.

# PARAMETERS

**sign**
> Sign an APK

**verify**
> Verify APK signatures

**--ks** _file_
> Keystore file

**--ks-key-alias** _alias_
> Key alias in keystore

**--ks-pass** _pass_
> Keystore password (pass: or file:)

**--key-pass** _pass_
> Key password

**--out** _file_
> Signed APK output path

**--v1-signing-enabled** _bool_
> Enable JAR signing (v1)

**--v2-signing-enabled** _bool_
> Enable APK Signature Scheme v2

**--v3-signing-enabled** _bool_
> Enable APK Signature Scheme v3

**--verbose**
> Verbose output

**--print-certs**
> Print certificate details

# CAVEATS

APK must be zipaligned before signing with v2+. v1-only signing is deprecated for Android 11+. Key rotation requires v3 signing. Private key security is critical.

# HISTORY

**apksigner** was introduced in Android SDK Build Tools 24.0.3 (**2016**) alongside APK Signature Scheme v2, replacing jarsigner as the recommended signing tool.

# SEE ALSO

[zipalign](/man/zipalign)(1), [keytool](/man/keytool)(1), [jarsigner](/man/jarsigner)(1)
