# TAGLINE

Manage Solo FIDO2 security keys

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

**solo** is the command-line management tool for Solo FIDO2 security keys, open-source hardware authenticators used for passwordless login and two-factor authentication. It handles firmware updates, credential management, and device diagnostics.

The tool can list connected Solo devices, update their firmware, generate FIDO2 credentials for specific domains, and test device functionality. The wink command flashes the device LED to help identify a specific key when multiple are connected.

Solo keys are fully open-source (both hardware and firmware), allowing independent security audits. The CLI tool is Python-based and communicates with the key over USB HID.

# CAVEATS

Solo key required. USB connection needed. Python based.

# HISTORY

**solo** is the CLI tool for **Solo** FIDO2 security keys, providing open-source hardware authentication.

# SEE ALSO

[fido2-token](/man/fido2-token)(1), [ykman](/man/ykman)(1), [gpg](/man/gpg)(1)
