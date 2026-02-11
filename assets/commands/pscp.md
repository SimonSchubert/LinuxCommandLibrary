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

# EXAMPLES

```bash
# Upload file
pscp file.txt user@server:/home/user/

# Download file
pscp user@server:/home/user/file.txt .

# Recursive directory
pscp -r project/ user@server:/var/www/

# With key authentication
pscp -i mykey.ppk file.txt user@server:

# Non-standard port
pscp -P 2222 file.txt user@server:

# Multiple files
pscp *.txt user@server:/backup/
```

# CAVEATS

Windows-specific (part of PuTTY). Uses PPK key format. On Unix, use scp instead.

# HISTORY

pscp is part of **PuTTY**, the SSH client suite for Windows created by **Simon Tatham** in 1999.

# SEE ALSO

[scp](/man/scp)(1), [putty](/man/putty)(1), [psftp](/man/psftp)(1), [plink](/man/plink)(1)
