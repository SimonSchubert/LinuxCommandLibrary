# TAGLINE

SFTP connection handler of FileZilla

# TLDR

**Display version information**

```fzsftp -V```

**Connect to a server**

```fzsftp [user@host]```

**Connect on a specific port**

```fzsftp -P [2222] [user@host]```

**Use a specific private key file**

```fzsftp -i [key.ppk] [user@host]```

**Run commands from a batch file**

```fzsftp -b [commands.txt] [user@host]```

**Connect with verbose output**

```fzsftp -v [user@host]```

# SYNOPSIS

**fzsftp** [_options_] [_user@host_]

# PARAMETERS

**-V**
> Print version information and exit.

**-P** _port_
> Connect to specified port.

**-l** _user_
> Connect with specified username.

**-pw** _password_
> Login with specified password (insecure).

**-i** _keyfile_
> Private key file for user authentication.

**-b** _file_
> Use specified batch file.

**-bc**
> Output batch file commands.

**-be**
> Don't stop batch file processing on errors.

**-batch**
> Disable all interactive prompts.

**-v**
> Show verbose messages.

**-C**
> Enable compression.

**-1**, **-2**
> Force use of SSH protocol version 1 or 2.

**-4**, **-6**
> Force use of IPv4 or IPv6.

**-load** _session_
> Load settings from saved session.

**-noagent**
> Disable use of Pageant.

**-agent**
> Enable use of Pageant.

**-hostkey** _fingerprint_
> Manually specify a host key (may be repeated).

**-proxycmd** _command_
> Use command as local proxy.

**-sshlog** _file_
> Log protocol details to a file.

# DESCRIPTION

**fzsftp** is the SFTP backend module of FileZilla, based on the **psftp** component of PuTTY. It is called internally by the FileZilla GUI to handle SSH File Transfer Protocol connections and is not intended for direct interactive use.

The tool communicates with the FileZilla process via stdin/stdout. It supports PuTTY-format (.ppk) keys natively, batch file processing, and various SSH connection options inherited from PuTTY.

# CAVEATS

Not intended to be used directly; it is called internally by FileZilla. Password on command line is insecure and visible in process listings. PPK keys need conversion for use with other SSH clients.

# SEE ALSO

[sftp](/man/sftp)(1), [filezilla](/man/filezilla)(1), [scp](/man/scp)(1), [ssh](/man/ssh)(1)
