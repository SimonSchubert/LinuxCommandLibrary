# TLDR

**SMB authentication check**

```nxc smb [target] -u [user] -p [password]```

**Enumerate shares**

```nxc smb [target] -u [user] -p [password] --shares```

**Execute command**

```nxc smb [target] -u [user] -p [password] -x "[command]"```

**Scan multiple hosts**

```nxc smb [targets.txt] -u [user] -p [password]```

**Use hash for auth**

```nxc smb [target] -u [user] -H [hash]```

# SYNOPSIS

**nxc** [_protocol_] [_target_] [_options_]

# PARAMETERS

_PROTOCOL_
> Protocol module (smb, ssh, ldap, etc.).

_TARGET_
> Target host or file.

**-u** _USER_
> Username.

**-p** _PASSWORD_
> Password.

**-H** _HASH_
> NT hash for pass-the-hash.

**--shares**
> Enumerate shares.

**-x** _COMMAND_
> Execute command.

**--help**
> Display help information.

# DESCRIPTION

**nxc** is NetExec, a network service exploitation tool. Successor to CrackMapExec.

The tool tests credentials across networks. Used for penetration testing.

nxc executes network attacks.

# CAVEATS

Security tool. Authorized use only. Successor to CrackMapExec.

# HISTORY

NetExec was created as the **successor to CrackMapExec** for network penetration testing.

# SEE ALSO

[nmap](/man/nmap)(1), [impacket](/man/impacket)(1), [metasploit](/man/metasploit)(1)

