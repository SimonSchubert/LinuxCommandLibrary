# TAGLINE

Configure YubiKey authentication slots

# TLDR

**Show YubiKey status**

```ykpersonalize -v```

**Program slot 1 with Yubico OTP**

```ykpersonalize -1```

**Program slot 2 with challenge-response**

```ykpersonalize -2 -ochal-resp -ochal-hmac```

**Set static password in slot 2**

```ykpersonalize -2 -ostatic-ticket```

**Set CCID mode**

```sudo ykpersonalize -m 86```

**Program with specific AES key**

```ykpersonalize -1 -a[hex_key]```

**Set access code to protect configuration**

```ykpersonalize -oaccess=[hex_code]```

# SYNOPSIS

**ykpersonalize** [_options_]

# PARAMETERS

**-1** / **-2**
> Program slot 1 or slot 2.

**-a** _key_
> Set AES key (hex encoded).

**-c** _code_
> Current access code to unlock.

**-oaccess=** _code_
> Set new access code.

**-ochal-resp**
> Enable challenge-response mode.

**-ochal-hmac**
> Use HMAC-SHA1 for challenge-response.

**-ostatic-ticket**
> Enable static password mode.

**-m** _mode_
> Set USB mode (OTP, CCID, etc.).

**-v**
> Verbose output.

**-y**
> Auto-confirm operations.

# DESCRIPTION

**ykpersonalize** configures YubiKey hardware tokens from Yubico. It can program the two configuration slots with various authentication modes including Yubico OTP, HMAC-SHA1 challenge-response, and static passwords.

Each YubiKey has two slots: slot 1 activates on short touch, slot 2 on long touch. Slots can be independently configured for different use cases like OTP authentication and disk encryption.

Access codes can protect configuration from unauthorized changes. The tool requires direct USB access to the YubiKey.

# CAVEATS

Programming overwrites existing slot configuration. Access codes prevent reconfiguration without the code. Some operations require root. Superseded by ykman for newer features.

# HISTORY

**ykpersonalize** was developed by Yubico as part of the yubikey-personalization package for configuring YubiKey tokens. While still functional, Yubico now recommends ykman (YubiKey Manager) for newer YubiKey models and features.

# SEE ALSO

[ykman](/man/ykman)(1), [ykchalresp](/man/ykchalresp)(1), [ykinfo](/man/ykinfo)(1)
