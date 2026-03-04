# TAGLINE

2FA TOTP token manager TUI for the terminal

# TLDR

**Open an Aegis encrypted backup**

```andcli -t aegis [path/to/backup.json]```

**Open an andOTP backup file**

```andcli [path/to/backup.json]```

**Open a KeePass database**

```andcli -t keepass [path/to/database.kdbx]```

**Specify a custom clipboard command**

```andcli -c [pbcopy] [path/to/backup]```

**Read password from stdin**

```echo "[password]" | andcli --passwd-stdin [path/to/backup]```

# SYNOPSIS

**andcli** [_options_] _file_

# PARAMETERS

**-t**, **--type** _type_
> Vault type: aegis, andotp, twofas, stratum, keepass, or proton

**-c**, **--clipboard-cmd** _command_
> Custom clipboard command (e.g., xclip, pbcopy)

**--passwd-stdin**
> Read decryption password from stdin

**-v**, **--version**
> Print version information

**-h**, **--help**
> Print help information

# DESCRIPTION

**andcli** is a terminal user interface for managing TOTP two-factor authentication tokens. It reads encrypted backup files exported from popular authenticator apps including andOTP, Aegis, 2FAS, Stratum/Authenticator Pro, KeePass (.kdbx), and ProtonPass, then displays the tokens in an interactive TUI. All data remains in memory and is never written to disk.

Written in Go using the Bubbletea TUI framework, it supports vim-style navigation (j/k), fuzzy search (/), token visibility toggling (Enter), and clipboard copying (c/y).

# CAVEATS

Only TOTP entries are supported; HOTP and other OTP types are not. Requires a password-protected encrypted backup file from a supported authenticator app.

# HISTORY

**andcli** was created by **tjblackheart** as an open-source Go project under the MIT license. The name derives from andOTP, one of the originally supported vault formats.

# SEE ALSO

[oathtool](/man/oathtool)(1), [pass](/man/pass)(1)
