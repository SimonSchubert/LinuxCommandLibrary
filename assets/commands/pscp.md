# TAGLINE

PuTTY secure file copy client

# TLDR

**Copy file to remote**

```pscp [file] [user]@[host]:[path]```

**Copy from remote**

```pscp [user]@[host]:[file] [local_path]```

**Copy directory recursively**

```pscp -r [directory] [user]@[host]:[path]```

**Use specific key**

```pscp -i [key.ppk] [file] [user]@[host]:[path]```

**Specify port**

```pscp -P [2222] [file] [user]@[host]:[path]```

# SYNOPSIS

**pscp** [_options_] [_source_] [_destination_]

# PARAMETERS

**-r**
> Copy directories recursively.

**-i** _key_
> Private key file (PPK format).

**-P** _port_
> SSH port.

**-l** _user_
> Login username.

**-pw** _password_
> Password (insecure).

**-q**
> Quiet mode.

**-v**
> Verbose mode.

# DESCRIPTION

**pscp** is PuTTY's SCP (Secure Copy) client for Windows. It transfers files over SSH, similar to the Unix scp command but using PuTTY's connection code.

# CAVEATS

Windows-specific (part of PuTTY). Uses PPK key format. On Unix, use scp instead.

# HISTORY

pscp is part of **PuTTY**, the SSH client suite for Windows created by **Simon Tatham** in 1999.

# SEE ALSO

[scp](/man/scp)(1), [putty](/man/putty)(1), [plink](/man/plink)(1)
