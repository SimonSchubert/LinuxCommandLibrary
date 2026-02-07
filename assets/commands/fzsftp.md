# TAGLINE

command-line SFTP client for FileZilla

# TLDR

**Connect to server**

```fzsftp [user@host]```

**Connect with port**

```fzsftp -P [2222] [user@host]```

**Use specific key**

```fzsftp -i [key.ppk] [user@host]```

**Batch mode**

```fzsftp -b [commands.txt] [user@host]```

# SYNOPSIS

**fzsftp** [_options_] [_user@host_]

# PARAMETERS

_USER@HOST_
> SFTP server connection string.

**-P** _PORT_
> Port number.

**-i** _KEYFILE_
> Identity/private key file.

**-b** _BATCHFILE_
> Batch command file.

**-pw** _PASSWORD_
> Password (insecure).

**--help**
> Display help information.

# DESCRIPTION

**fzsftp** is FileZilla's command-line SFTP client based on PSFTP from PuTTY. It provides secure file transfer through SSH connections.

The tool supports interactive and batch modes for file operations. It handles PuTTY-format keys natively and provides familiar SFTP commands for navigation and transfer.

fzsftp enables scripted SFTP operations when FileZilla GUI isn't suitable.

# CAVEATS

Password on command line is insecure. PPK keys need conversion for other clients. Not all OpenSSH features supported.

# HISTORY

fzsftp is adapted from **PSFTP** (PuTTY SFTP) for FileZilla integration. It provides command-line SFTP capabilities alongside FileZilla's graphical interface.

# SEE ALSO

[sftp](/man/sftp)(1), [filezilla](/man/filezilla)(1), [psftp](/man/psftp)(1)
