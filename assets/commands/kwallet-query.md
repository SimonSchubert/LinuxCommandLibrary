# TAGLINE

command-line tool for reading and writing to KDE Wallet

# TLDR

List **all entries** in the default folder

```kwallet-query kdewallet --list-entries```

List entries in a **specific folder**

```kwallet-query kdewallet --list-entries --folder [folder_name]```

List **all folders** in a wallet

```kwallet-query kdewallet --list-entries --folder ""```

**Read a password** entry from a folder

```kwallet-query kdewallet --folder [folder] --read-password [entry]```

**Write a password** to a folder (reads value from stdin)

```kwallet-query kdewallet --folder [folder] --write-password [entry] < [secret.txt]```

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

Wallet must be unlocked before querying. Sensitive data will be displayed in plaintext when reading entries. The wallet daemon **kwalletd** must be running, otherwise queries will fail to connect.

# HISTORY

**KWallet** is the credential storage subsystem of **KDE**, introduced in the early 2000s as KDE's equivalent to GNOME Keyring. **kwallet-query** was added to provide a non-interactive, scriptable interface to wallet contents for scripts and headless setups, complementing the graphical **kwalletmanager**.

# SEE ALSO

[secret-tool](/man/secret-tool)(1)
