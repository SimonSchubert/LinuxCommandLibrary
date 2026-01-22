# TLDR

**Sign an application**

```codesign -s "[Developer ID]" [MyApp.app]```

**Sign with timestamp**

```codesign -s "[Developer ID]" --timestamp [MyApp.app]```

**Sign recursively (deep)**

```codesign -s "[Developer ID]" --deep [MyApp.app]```

**Force re-sign**

```codesign -s "[Developer ID]" --force [MyApp.app]```

**Verify signature**

```codesign -v [MyApp.app]```

**Display signature info**

```codesign -d -v [MyApp.app]```

**Remove signature**

```codesign --remove-signature [MyApp.app]```

# SYNOPSIS

**codesign** _operation_ [_options_] _path_...

# DESCRIPTION

**codesign** creates, verifies, and displays code signatures on macOS. Required for Gatekeeper approval and notarization. Signs applications, frameworks, plugins, and executables.

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
> Recursively sign nested content

**--timestamp**[=_url_]
> Request timestamp from server

**--options** _flags_
> Set code signing options (runtime, etc.)

**-a** _arch_, **--architecture** _arch_
> Specify architecture for fat binaries

**--all-architectures**
> Verify all architectures

**--entitlements** _file_
> Embed entitlements from file

**-r** _requirement_
> Set code requirement

**-i** _identifier_
> Set bundle identifier

**--strict**
> Strict verification

# EXIT CODES

**0**: Success

**1**: Signing/verification failed

**2**: Invalid arguments

**3**: Signature valid but requirement failed

# CAVEATS

Option order matters (verb before noun). Use --force to replace signatures. Requires valid signing identity from Keychain.

# SEE ALSO

[security](/man/security)(1), [spctl](/man/spctl)(8), [xcrun](/man/xcrun)(1)
