# TAGLINE

extends pass with TOTP/HOTP support

# TLDR

**Generate OTP code**

```pass otp [path/to/entry]```

**Insert OTP secret**

```pass otp insert [path/to/entry]```

**Insert from URI**

```pass otp insert -u [path/to/entry]```

**Append OTP to existing entry**

```pass otp append [path/to/entry]```

**Show OTP URI**

```pass otp uri [path/to/entry]```

**Copy OTP to clipboard**

```pass otp -c [path/to/entry]```

**Validate OTP configuration**

```pass otp validate [path/to/entry]```

# SYNOPSIS

**pass otp** [_options_] _command_ [_entry_]

# PARAMETERS

**insert**
> Add new OTP entry.

**append**
> Add OTP to existing entry.

**uri**
> Show OTP URI.

**validate**
> Validate configuration.

**-c**, **--clip**
> Copy to clipboard.

**-q**, **--qrcode**
> Display QR code.

**-u**, **--uri**
> Read from otpauth URI.

**-s**, **--secret**
> Prompt for secret only.

# DESCRIPTION

**pass-otp** extends pass (password-store) with TOTP/HOTP support. It generates time-based one-time passwords.

OTP secrets are stored encrypted alongside passwords. The standard otpauth:// URI format is supported.

Token generation uses the current time for TOTP. Codes refresh every 30 seconds by default.

QR code display enables backup to authenticator apps. URIs can be imported from other authenticators.

Clipboard integration copies codes for easy pasting. Codes clear automatically after timeout.

# CAVEATS

Requires pass (password-store) installed. OTP secrets should be backed up separately. Time synchronization affects TOTP accuracy.

# HISTORY

**pass-otp** was created as an extension to **pass** (password-store) by **zx2c4**. It brings two-factor authentication capabilities to the Unix password manager.

# SEE ALSO

[pass](/man/pass)(1), [oathtool](/man/oathtool)(1), [gpg](/man/gpg)(1)
