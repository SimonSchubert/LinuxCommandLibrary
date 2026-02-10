# TAGLINE

command-line tool for reading and writing to KDE Wallet

# TLDR

List **all entries** in Passwords folder

```kwallet-query kdewallet --list-entries```

List entries in **specific folder**

```kwallet-query kdewallet --list-entries --folder [folder_name]```

List **all folders**

```kwallet-query kdewallet --list-entries --folder ""```

Display **help**

```kwallet-query --help```

# SYNOPSIS

**kwallet-query** _wallet_ [_options_]

# DESCRIPTION

**kwallet-query** is a command-line tool for reading and writing to KDE Wallet. It allows scripts and command-line users to access stored passwords and secrets without the graphical interface.

# PARAMETERS

**wallet**
> Wallet name to query (typically "kdewallet")

**-l, --list-entries**
> List entries in the specified folder

**-f, --folder FOLDER**
> Specify folder to query (empty string lists all folders)

**-r, --read-password ENTRY**
> Read password for specified entry

**-w, --write-password ENTRY**
> Write password for specified entry

**-h, --help**
> Display help information

# CAVEATS

Wallet must be unlocked before querying. Sensitive data will be displayed in plaintext when reading entries.

# SEE ALSO

[kwalletmanager](/man/kwalletmanager)(1), [secret-tool](/man/secret-tool)(1)
