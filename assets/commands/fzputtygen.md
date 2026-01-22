# TLDR

**Generate SSH key** pair

```fzputtygen -t [rsa] -o [key.ppk]```

**Convert OpenSSH to** PuTTY format

```fzputtygen [key] -o [key.ppk]```

**Export public key**

```fzputtygen [key.ppk] -L```

**Convert PuTTY to** OpenSSH

```fzputtygen [key.ppk] -O private-openssh -o [key]```

**Change passphrase**

```fzputtygen [key.ppk] -P```

# SYNOPSIS

**fzputtygen** [_options_] [_keyfile_]

# PARAMETERS

_KEYFILE_
> Key file to process.

**-t** _TYPE_
> Key type: rsa, dsa, ecdsa, ed25519.

**-o** _FILE_
> Output file.

**-O** _FORMAT_
> Output format.

**-L**
> Output public key.

**-P**
> Change passphrase.

**--help**
> Display help information.

# DESCRIPTION

**fzputtygen** is FileZilla's key generator and converter based on PuTTYgen. It creates SSH keys and converts between PuTTY (.ppk) and OpenSSH formats.

The tool generates RSA, DSA, ECDSA, and Ed25519 keys for SSH authentication. It handles format conversion needed when switching between PuTTY and OpenSSH clients.

fzputtygen enables key management for FileZilla SFTP connections.

# CAVEATS

PPK format not universal. Passphrase protection recommended. Key type support varies.

# HISTORY

fzputtygen is adapted from **PuTTYgen** for use with FileZilla. It provides key generation and format conversion supporting FileZilla's SFTP functionality.

# SEE ALSO

[ssh-keygen](/man/ssh-keygen)(1), [puttygen](/man/puttygen)(1), [filezilla](/man/filezilla)(1)
