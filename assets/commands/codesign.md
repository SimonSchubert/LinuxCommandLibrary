# TAGLINE

macOS code signing and verification utility

# TLDR

**Sign an application**

```codesign -s "[Developer ID]" [MyApp.app]```

**Sign with timestamp**

```codesign -s "[Developer ID]" --timestamp [MyApp.app]```

**Sign for notarization** (hardened runtime, secure timestamp, entitlements)

```codesign -s "[Developer ID Application: Name (TEAMID)]" --options runtime --timestamp --entitlements [app.entitlements] [MyApp.app]```

**Ad-hoc sign** without a certificate (local use only)

```codesign -s - --force [path/to/binary]```

**Force re-sign**

```codesign -s "[Developer ID]" --force [MyApp.app]```

**Verify** a bundle and all nested code strictly

```codesign --verify --deep --strict --verbose=2 [MyApp.app]```

**Display** signature details (identity, team, flags)

```codesign -dvvv [MyApp.app]```

**Display** embedded entitlements

```codesign -d --entitlements - [MyApp.app]```

**Remove signature**

```codesign --remove-signature [MyApp.app]```

# SYNOPSIS

**codesign** _operation_ [_options_] _path_...

# DESCRIPTION

**codesign** creates, verifies, and displays code signatures on macOS. Code signing is required for Gatekeeper approval, notarization, and distribution of applications. It cryptographically signs executables, applications, frameworks, plugins, and other code to verify their authenticity and integrity.

The tool integrates with macOS security frameworks to enforce that code comes from identified developers and hasn't been tampered with. Signing requires valid certificates from Apple stored in the Keychain. Timestamps from Apple's servers ensure signatures remain valid even after certificates expire.

Bundles with embedded frameworks, helpers and plugins must have every nested code item signed before the outer bundle is signed. Entitlements files specify security capabilities and permissions. Verification confirms signatures are valid and meet specified requirements.

# OPERATIONS

**-s** _identity_, **--sign** _identity_
> Sign code with identity

**-v**, **--verify**
> Verify code signature

**-d**, **--display**
> Display signature information

**--remove-signature**
> Remove existing signature

# PARAMETERS

**--force**, **-f**
> Replace existing signature

**--deep**
> When verifying, also check nested code. When signing, recursively sign nested code (discouraged by Apple: sign nested items individually, inside out)

**--timestamp**[=_url_]
> Request a secure timestamp from Apple's (or the given) server; **--timestamp=none** disables it

**-o**, **--options** _flags_
> Set code signing flags, e.g. **runtime** (hardened runtime, required for notarization), **library**, **kill**

**-a** _arch_, **--architecture** _arch_
> Specify architecture for fat binaries

**--all-architectures**
> Verify all architectures

**--entitlements** _file_
> Embed entitlements from file

**-r** _requirements_
> Embed internal requirements when signing

**-R** _requirement_
> When verifying, also check the code against an explicit requirement

**-i** _identifier_, **--identifier** _identifier_
> Set the signing identifier (defaults to the bundle identifier)

**--preserve-metadata**=_list_
> Keep parts of the existing signature (e.g. **entitlements,requirements,flags**) when re-signing

**--keychain** _path_
> Look up the signing identity in a specific keychain

**--verbose**[=_level_]
> Increase output detail; repeat **-v** with **-d** for more

**-v**, **--verify**, **-d**, **--display** can be combined, e.g. **-dvvv**

**--strict**
> Strict verification

# EXIT CODES

**0**: Success

**1**: Signing/verification failed

**2**: Invalid arguments

**3**: Signature valid but requirement failed

# CAVEATS

Use **--force** to replace existing signatures. Signing requires a valid identity (certificate plus private key) in the Keychain; **-s -** creates an ad-hoc signature that Gatekeeper does not trust. Modifying a bundle after signing invalidates the signature. Signing with **--deep** applies the same options and entitlements to every nested item, which is often wrong; Apple recommends signing nested code separately from the inside out. On Apple silicon all native executables must be signed (ad-hoc at minimum) to run.

# HISTORY

**codesign** was introduced with code signing support in **Mac OS X 10.5 Leopard** (2007). The hardened runtime (**--options runtime**) arrived with macOS 10.14 and became mandatory for notarized software.

# SEE ALSO

[xcrun](/man/xcrun)(1), [xcodebuild](/man/xcodebuild)(1)

# RESOURCES

```[Documentation](https://developer.apple.com/documentation/security/code-signing-services)```

<!-- verified: 2026-11-23 -->
