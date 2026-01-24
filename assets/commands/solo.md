# TLDR

**Connect to device**

```solo ls```

**Update firmware**

```solo update```

**Generate credential**

```solo key credential [domain]```

**Wink device**

```solo key wink```

**Reset device**

```solo key reset```

**Show version**

```solo version```

# SYNOPSIS

**solo** _command_ [_options_]

# PARAMETERS

**ls**
> List devices.

**update**
> Update firmware.

**key**
> Key operations.

**version**
> Show version.

**wink**
> Flash LED.

**reset**
> Reset device.

**credential**
> Manage credentials.

# DESCRIPTION

**solo** manages Solo keys. It's for FIDO2 security keys.

Firmware updates. Keep device current.

Credential management. Generate and store.

Device testing. Wink to identify.

Open source key. Auditable security.

# CAVEATS

Solo key required. USB connection needed. Python based.

# HISTORY

**solo** is the CLI tool for **Solo** FIDO2 security keys, providing open-source hardware authentication.

# SEE ALSO

[fido2-token](/man/fido2-token)(1), [ykman](/man/ykman)(1), [gpg](/man/gpg)(1)
