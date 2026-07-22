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

**-hashes** _LMHASH:NTHASH_
> Use NTLM hashes for authentication (LM hash may be empty).

**-k**
> Use Kerberos authentication. Grabs credentials from ccache file (KRB5CCNAME).

**-no-pass**
> Don't ask for password (useful with -k).

**-aesKey** _HEX_
> AES key for Kerberos authentication (128 or 256 bits).

**-dc-ip** _IP_
> IP of the domain controller.

**-target-ip** _IP_
> Target IP (overrides target hostname resolution).

**-service-name** _NAME_
> Name for the SMB server share.

**-remote-binary-name** _NAME_
> Custom remote binary name on target (default: random).

**-codec** _CODEC_
> Output codec used to decode remote stdout (default: locale-aware).

**-debug**
> Enable verbose debug output.

# DESCRIPTION

**impacket-psexec** executes commands on remote Windows systems via SMB. Part of the Impacket toolkit. Works by uploading a service executable to ADMIN$ share and using Service Control Manager to start it. Requires administrator credentials. Used for authorized penetration testing and system administration.

# CAVEATS

Requires administrator access on target. Leaves artifacts on target system. For authorized security testing only.

# INSTALL

```pacman: sudo pacman -S impacket```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[impacket-smbclient](/man/impacket-smbclient)(1)

