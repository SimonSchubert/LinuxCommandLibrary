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
> SSH port (default: 22).

**--continue-on-success**
> Keep testing credentials after the first valid login (useful for spraying).

**--sudo-check**
> Check whether the account has sudo privileges.

# DESCRIPTION

**nxc ssh** tests SSH credentials and executes commands. Part of the NetExec security testing framework (the maintained successor to CrackMapExec). Supports password spraying and credential validation across a range of targets (CIDR, host list file, or single host).

Usernames and passwords can be given inline or as files; combining a user list with a password list performs a spray. By default NetExec stops after the first success per host, so use **--continue-on-success** to enumerate every valid pair.

# CAVEATS

For authorized security assessments only. Only use against systems you have explicit written permission to test.

# SEE ALSO

[nxc](/man/nxc)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/Pennyw0rth/NetExec)```

```[Documentation](https://www.netexec.wiki)```

<!-- verified: 2026-11-07 -->

