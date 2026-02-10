# TAGLINE

tests SSH credentials and executes commands

# TLDR

**Test SSH credentials**

```nxc ssh [192.168.1.0/24] -u [user] -p [password]```

**Test with key file**

```nxc ssh [target] -u [user] --key-file [id_rsa]```

**Execute command**

```nxc ssh [target] -u [user] -p [password] -x [id]```

**Test password list**

```nxc ssh [target] -u [user] -p [passwords.txt]```

# SYNOPSIS

**nxc ssh** _target_ [_options_]

# PARAMETERS

**-u** _user_
> Username or file.

**-p** _pass_
> Password or file.

**--key-file** _file_
> SSH private key.

**-x** _cmd_
> Execute command.

**--port** _port_
> SSH port.

# DESCRIPTION

**nxc ssh** tests SSH credentials and executes commands. Part of NetExec security testing framework. Supports password spraying and credential validation.

# CAVEATS

For authorized security assessments only. Requires proper authorization.

# SEE ALSO

[nxc](/man/nxc)(1), [ssh](/man/ssh)(1)

