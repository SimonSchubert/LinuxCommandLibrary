# TAGLINE

executes commands on remote Windows systems via SMB

# TLDR

**Execute command on remote host**

```impacket-psexec [domain]/[user]:[password]@[target] [command]```

**Get interactive shell**

```impacket-psexec [domain]/[user]:[password]@[target]```

**Use NTLM hash instead of password**

```impacket-psexec -hashes :[hash] [domain]/[user]@[target]```

**Specify service name**

```impacket-psexec -service-name [name] [domain]/[user]:[password]@[target]```

# SYNOPSIS

**impacket-psexec** [_options_] _target_ [_command_]

# PARAMETERS

**-hashes** _lm:nt_
> Use NTLM hashes for authentication.

**-k**
> Use Kerberos authentication.

**-service-name** _name_
> Name for the service.

**-codec** _codec_
> Output encoding.

# DESCRIPTION

**impacket-psexec** executes commands on remote Windows systems via SMB. Part of the Impacket toolkit. Works by uploading a service executable to ADMIN$ share and using Service Control Manager to start it. Requires administrator credentials. Used for authorized penetration testing and system administration.

# CAVEATS

Requires administrator access on target. Leaves artifacts on target system. For authorized security testing only.

# SEE ALSO

[impacket-smbclient](/man/impacket-smbclient)(1), [impacket-wmiexec](/man/impacket-wmiexec)(1)

