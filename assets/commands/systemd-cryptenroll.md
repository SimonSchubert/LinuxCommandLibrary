# TAGLINE

Enroll LUKS2 disk unlock methods

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

Enroll **TPM2** bound to specific PCR registers

```systemd-cryptenroll --tpm2-device auto --tpm2-pcrs [7+11] [/dev/luks_device]```

**List** candidate LUKS2 block devices

```systemd-cryptenroll --list-devices```

**Wipe** enrollment slots

```systemd-cryptenroll --wipe-slot [empty|password|fido2|pkcs11|tpm2|recovery|all] [/dev/luks_device]```

# SYNOPSIS

**systemd-cryptenroll** [_OPTIONS_] [_DEVICE_]

# PARAMETERS

**--password**
> Enroll a regular passphrase for volume unlocking.

**--recovery-key**
> Enroll a computer-generated recovery key with high entropy.

**--unlock-key-file=** _PATH_
> Use a file containing the unlock key instead of reading from stdin.

**--unlock-fido2-device=** _PATH_
> Unlock using a FIDO2 device to enroll another method. Supports "auto" for automatic detection.

**--unlock-tpm2-device=** _PATH_
> Unlock using a TPM2 device to enroll another method. Supports "auto" for automatic detection.

**--pkcs11-token-uri=** _list|auto|URI_
> List or enroll a PKCS#11 security token or smartcard.

**--fido2-device=** _list|auto|PATH_
> List or enroll a FIDO2 security token with hmac-secret extension.

**--fido2-credential-algorithm=** _STRING_
> COSE algorithm for credential generation. Supported: "es256" (default), "rs256", "eddsa".

**--fido2-with-client-pin=** _BOOL_
> Require PIN entry when unlocking with FIDO2. Defaults to "yes".

**--fido2-with-user-presence=** _BOOL_
> Require user presence (tapping the token) when unlocking. Defaults to "yes".

**--fido2-with-user-verification=** _BOOL_
> Require biometric user verification for FIDO2. Defaults to "no".

**--tpm2-device=** _list|auto|PATH_
> List or enroll a TPM2 security chip.

**--tpm2-pcrs=** _PCR[+PCR...]_
> Bind enrollment to specific PCR registers (range 0-23). Defaults to PCR 7.

**--tpm2-with-pin=** _BOOL_
> Require additional PIN entry for TPM2 unlocking.

**--tpm2-public-key=** _PATH_
> PEM-encoded RSA public key for signed PCR policy.

**--tpm2-public-key-pcrs=** _PCR[+PCR...]_
> PCR registers to bind the signed policy to.

**--tpm2-signature=** _PATH_
> TPM2 PCR signature file for verification.

**--wipe-slot=** _SLOT[,SLOT...]_
> Wipe specified LUKS2 key slots. Accepts numeric indexes or: "all", "empty", "password", "recovery", "pkcs11", "fido2", "tpm2".

**--list-devices**
> Display candidate block devices containing LUKS superblocks.

**-h**, **--help**
> Show help text and exit.

**--version**
> Print version information and exit.

**--no-pager**
> Do not pipe output into a pager.

# DESCRIPTION

**systemd-cryptenroll** manages enrollment of unlock methods for LUKS2 encrypted volumes. It supports five types: passwords, recovery keys, PKCS#11 tokens (smartcards like YubiKeys), FIDO2 tokens (with hmac-secret extension), and TPM2 security chips.

The tool stores token metadata in LUKS2's JSON token area, enabling automatic unlocking during boot when configured with `/etc/crypttab` or the initramfs.

# CAVEATS

Works only with LUKS2 volumes, not LUKS1. Requires an existing unlock method to enroll new ones. TPM2 enrollments bound to specific PCR states may break when firmware or boot software is updated. FIDO2 enrollment requires a token that supports the hmac-secret extension.

# HISTORY

**systemd-cryptenroll** was added to **systemd** to provide a unified interface for modern hardware-based disk encryption unlocking. It complements **cryptsetup** and integrates with systemd's boot process for seamless encrypted root filesystem support.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8), [systemd-cryptsetup](/man/systemd-cryptsetup)(8)
