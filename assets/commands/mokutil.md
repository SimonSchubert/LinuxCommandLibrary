# TAGLINE

manages Machine Owner Keys stored in the shim database

# TLDR

Show if **Secure Boot is enabled**

```mokutil --sb-state```

**Enable** Secure Boot validation

```mokutil --enable-validation```

**Disable** Secure Boot validation

```mokutil --disable-validation```

**List enrolled** keys

```mokutil -l```

**Enroll a new key**

```mokutil -i [path/to/key.der]```

**List keys pending** enrollment

```mokutil -N```

**Delete** a key

```mokutil -d [path/to/key.der]```

**Test** if a key is enrolled

```mokutil -t [path/to/key.der]```

# SYNOPSIS

**mokutil** [**--sb-state**] [**-l**] [**-i** _keyfile_] [**-d** _keyfile_] [**--enable-validation**] [**--disable-validation**] [_options_]

# PARAMETERS

**--sb-state**
> Display current Secure Boot state

**-l, --list-enrolled**
> List currently enrolled keys

**-N, --list-new**
> Show keys pending enrollment

**-D, --list-delete**
> Show keys marked for deletion

**-i, --import _keyfile_**
> Add key (DER format) to enrollment queue

**-d, --delete _keyfile_**
> Queue key for removal

**-x, --export**
> Extract stored keys from MokListRT

**-t, --test-key _keyfile_**
> Verify if a key is enrolled

**--enable-validation**
> Enable shim validation (Secure Boot)

**--disable-validation**
> Disable shim validation

**--reset**
> Clear the MOK list

**-p, --password**
> Set MokManager password

**-c, --clear-password**
> Remove password protection

**-P, --root-pw**
> Use root password hash from /etc/shadow

**--pk, --kek, --db, --dbx**
> List keys in various Secure Boot databases

**--timeout _seconds_**
> Set MOK prompt duration at boot

**-X, --mokx**
> Operate on MOK blacklist instead of standard list

# DESCRIPTION

**mokutil** manages Machine Owner Keys (MOK) stored in the shim database. MOKs are cryptographic keys used in the Secure Boot process to verify the authenticity of boot components on UEFI systems.

The tool allows importing, deleting, and managing keys that authorize kernel modules, bootloaders, and other signed code. Changes to the MOK database require a reboot, during which the MokManager prompts for confirmation with the configured password.

# CAVEATS

Operations that modify the MOK database (import, delete, enable/disable validation) require a reboot to take effect. A password must be entered at boot time via MokManager to confirm changes. Keys must be in DER format for import. Improper key management can render the system unbootable with Secure Boot enabled.

# HISTORY

**mokutil** is part of the **shim** project, developed to enable Secure Boot on Linux systems. Shim is a first-stage bootloader signed by Microsoft, allowing Linux distributions to boot on UEFI systems with Secure Boot enabled by using MOKs to authorize distribution-specific signing keys.

# SEE ALSO

[sbsign](/man/sbsign)(1), [sbverify](/man/sbverify)(1), [efibootmgr](/man/efibootmgr)(8)
