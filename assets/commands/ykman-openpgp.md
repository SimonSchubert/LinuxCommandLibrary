# TAGLINE

Manage YubiKey OpenPGP keys

# TLDR

**Show OpenPGP info**

```ykman openpgp info```

**Set PIN**

```ykman openpgp access change-pin```

**Set Admin PIN**

```ykman openpgp access change-admin-pin```

**Reset OpenPGP**

```ykman openpgp reset```

# SYNOPSIS

**ykman** **openpgp** _command_ [_options_]

# PARAMETERS

**info**
> Show OpenPGP information.

**access** _cmd_
> Manage PINs and access.

**certificates** _cmd_
> Manage certificates.

**keys** _cmd_
> Manage keys.

**reset**
> Reset OpenPGP application.

# DESCRIPTION

**ykman openpgp** manages OpenPGP on YubiKey. Configure PGP keys for encryption, signing, and authentication. Hardware-backed GPG key storage.

# CAVEATS

Reset permanently removes all OpenPGP keys from the device.

# INSTALL

```dnf: sudo dnf install yubikey-manager```

```pacman: sudo pacman -S yubikey-manager```

```apk: sudo apk add yubikey-manager```

```zypper: sudo zypper install yubikey-manager```

```brew: brew install ykman```

```nix: nix profile install nixpkgs#yubikey-manager```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ykman](/man/ykman)(1), [gpg](/man/gpg)(1)

