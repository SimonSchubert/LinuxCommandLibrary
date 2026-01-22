# TLDR

Enroll new **password**

```systemd-cryptenroll --password [/dev/luks_device]```

Enroll **recovery key**

```systemd-cryptenroll --recovery-key [/dev/luks_device]```

List or enroll **PKCS#11** token

```systemd-cryptenroll --pkcs11-token-uri [list|auto|uri] [/dev/luks_device]```

List or enroll **FIDO2** device

```systemd-cryptenroll --fido2-device [list|auto|/path/to/hidraw] [/dev/luks_device]```

Enroll FIDO2 with **biometrics**

```systemd-cryptenroll --fido2-device auto --fido2-with-user-verification yes [/dev/luks_device]```

Enroll **TPM2** with PIN

```systemd-cryptenroll --tpm2-device auto --tpm2-with-pin yes [/dev/luks_device]```

**Wipe** enrollment slots

```systemd-cryptenroll --wipe-slot [empty|password|fido2|pkcs11|tpm2|recovery|all] [/dev/luks_device]```

# SYNOPSIS

**systemd-cryptenroll** [_OPTIONS_] [_DEVICE_]

# PARAMETERS

**--password**
> Enroll a new password

**--recovery-key**
> Enroll a randomly generated recovery passphrase

**--pkcs11-token-uri=** _list|auto|URI_
> List or enroll PKCS#11 token (smartcard)

**--fido2-device=** _list|auto|PATH_
> List or enroll FIDO2 device

**--fido2-with-user-verification=** _BOOL_
> Require biometric verification for FIDO2

**--tpm2-device=** _auto|PATH_
> Enroll TPM2 security chip

**--tpm2-with-pin=** _BOOL_
> Require additional PIN with TPM2

**--unlock-fido2-device=** _PATH_
> Unlock using FIDO2 device (to enroll another method)

**--wipe-slot=** _TYPE_
> Remove enrolled methods (password, fido2, pkcs11, tpm2, recovery, all, empty)

# DESCRIPTION

**systemd-cryptenroll** manages enrollment of unlock methods for LUKS2 encrypted volumes. It supports five types: passwords, recovery keys, PKCS#11 tokens (smartcards like YubiKeys), FIDO2 tokens (with hmac-secret extension), and TPM2 security chips.

The tool stores token metadata in LUKS2's JSON token area, enabling automatic unlocking during boot when configured with `/etc/crypttab` or the initramfs.

# CAVEATS

Works only with LUKS2 volumes, not LUKS1. Requires an existing unlock method to enroll new ones. TPM2 enrollments can be bound to specific PCR states, which may break if software is updated. Multiple FIDO2 tokens may require multiple PIN prompts.

# HISTORY

**systemd-cryptenroll** was added to **systemd** to provide a unified interface for modern hardware-based disk encryption unlocking. It complements **cryptsetup** and integrates with systemd's boot process for seamless encrypted root filesystem support.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8), [systemd-cryptsetup](/man/systemd-cryptsetup)(8)
