# TAGLINE

Sign and verify Android APK files

# TLDR

**Sign** an APK

```apksigner sign --ks [keystore.jks] [app.apk]```

Sign with **specific key alias**

```apksigner sign --ks [keystore.jks] --ks-key-alias [alias] [app.apk]```

**Verify** APK signature

```apksigner verify [app.apk]```

Verify with **details**

```apksigner verify --verbose --print-certs [app.apk]```

Sign with a **PKCS #8 key and certificate** (no keystore)

```apksigner sign --key [key.pk8] --cert [cert.x509.pem] [app.apk]```

Sign targeting a **minimum SDK version**

```apksigner sign --ks [keystore.jks] --min-sdk-version [21] [app.apk]```

# SYNOPSIS

**apksigner** **sign** [_options_] _apk_

**apksigner** **verify** [_options_] _apk_

**apksigner** **rotate** [_options_]

**apksigner** **lineage** [_options_]

# DESCRIPTION

**apksigner** is the official Android SDK tool for signing APK files. It supports multiple signature schemes (v1/JAR, v2, v3, v4) and can sign aligned APKs produced by zipalign.

The tool ensures APKs meet Android's signing requirements for installation and updates, with newer schemes providing better security and verification speed.

# PARAMETERS

**sign**
> Sign an APK.

**verify**
> Verify APK signatures.

**rotate**
> Rotate a signing key, producing a new lineage from an old key to a new one.

**lineage**
> Inspect or update a signing certificate lineage.

**--ks** _file_
> Keystore file. Use **NONE** for a keystore type that needs no file (e.g. some PKCS #11).

**--ks-key-alias** _alias_
> Key alias in keystore.

**--ks-pass** _spec_
> Keystore password (pass:, env:, file:, or stdin).

**--key-pass** _spec_
> Key password (same input formats as --ks-pass).

**--key** _file_
> PKCS #8 private key file (alternative to --ks).

**--cert** _file_
> X.509 certificate chain file (used with --key).

**--out** _file_
> Signed APK output path.

**--min-sdk-version** _int_
> Lowest API level for which the signature is verified. Defaults to the manifest minSdkVersion.

**--max-sdk-version** _int_
> Highest API level for which the signature is verified.

**--v1-signing-enabled** _bool_
> Enable JAR signing (v1).

**--v2-signing-enabled** _bool_
> Enable APK Signature Scheme v2.

**--v3-signing-enabled** _bool_
> Enable APK Signature Scheme v3.

**--v4-signing-enabled** _bool|only_
> Enable APK Signature Scheme v4, producing a separate .idsig file.

**--verbose**, **-v**
> Verbose output.

**--print-certs**
> Print certificate details (verify only).

# CAVEATS

APK must be zipaligned before signing with v2+. v1-only signing is deprecated for Android 11+. Key rotation requires v3 signing. Private key security is critical.

# HISTORY

**apksigner** was introduced in Android SDK Build Tools 24.0.3 (**2016**) alongside APK Signature Scheme v2, replacing jarsigner as the recommended signing tool.

# INSTALL

```nix: nix profile install nixpkgs#apksigner```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[zipalign](/man/zipalign)(1), [keytool](/man/keytool)(1), [jarsigner](/man/jarsigner)(1), [aapt](/man/aapt)(1)

# RESOURCES

```[Source code](https://android.googlesource.com/platform/tools/apksig/)```

```[Documentation](https://developer.android.com/tools/apksigner)```

<!-- verified: 2026-06-11 -->
