# TLDR

**Generate TOTP code from secret**

```oathtool --totp --base32 [SECRET_KEY]```

**Generate HOTP code** (counter-based)

```oathtool --hotp --counter [1] --base32 [SECRET_KEY]```

**Generate 8-digit code**

```oathtool --totp --base32 --digits [8] [SECRET_KEY]```

**Validate a TOTP code**

```oathtool --totp --base32 [SECRET_KEY] [123456]```

**Generate code with time window**

```oathtool --totp --base32 --now "[2024-01-15 12:00:00 UTC]" [SECRET_KEY]```

**Use SHA256 algorithm**

```oathtool --totp=sha256 --base32 [SECRET_KEY]```

**Show verbose output**

```oathtool --totp --base32 -v [SECRET_KEY]```

# SYNOPSIS

**oathtool** [_--totp_[=_alg_]|_--hotp_] [_--base32_] [_--digits num_] [_--counter num_] [_options_] _secret_ [_otp_]

# PARAMETERS

**--totp**[=_ALG_]
> Generate time-based OTP (sha1, sha256, sha512).

**--hotp**
> Generate counter-based OTP.

**-b**, **--base32**
> Secret is base32 encoded.

**-d** _NUM_, **--digits** _NUM_
> Number of digits (default: 6).

**-c** _NUM_, **--counter** _NUM_
> Counter value for HOTP.

**-s** _SEC_, **--time-step-size** _SEC_
> Time step in seconds (default: 30).

**-S** _TIME_, **--start-time** _TIME_
> Start time for TOTP (Unix timestamp or ISO).

**-N** _TIME_, **--now** _TIME_
> Use specified time instead of current.

**-w** _NUM_, **--window** _NUM_
> Window for validation.

**-v**, **--verbose**
> Show detailed output.

# DESCRIPTION

**oathtool** generates and validates one-time passwords for two-factor authentication. It supports both HOTP (RFC 4226, counter-based) and TOTP (RFC 6238, time-based) algorithms.

TOTP is the standard used by authenticator apps (Google Authenticator, Authy, etc.). The secret key is typically provided as a base32 string during 2FA setup. Running oathtool with this secret generates the same codes as the authenticator app.

For validation, provide both the secret and the code to verify. The window option allows for clock skew by accepting codes from adjacent time periods.

HOTP uses an incrementing counter instead of time. Each code generation should increment the counter. This mode is less common but useful for hardware tokens.

Different services use different parameters - some require 8 digits or SHA256. The verbose flag shows the calculation details for debugging setup issues.

# CAVEATS

Secrets must be kept secure - anyone with the secret can generate codes. System time must be accurate for TOTP. No built-in secret storage - integrate with password managers. Command history may expose secrets - use environment variables or files for scripting.

# HISTORY

**oathtool** is part of the **OATH Toolkit** project, implementing the Initiative for Open Authentication (OATH) standards. It was developed to provide open-source HOTP and TOTP implementations. The toolkit also includes PAM modules for system authentication and a library for developers.

# SEE ALSO

[pass-otp](/man/pass-otp)(1), [2fa](/man/2fa)(1), [gpg](/man/gpg)(1), [openssl](/man/openssl)(1)
