# TAGLINE

netExec, a network service exploitation tool

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

**nxc** (NetExec) is a network service exploitation tool that helps automate assessing the security of large networks. It is the community-maintained successor to CrackMapExec, originally created in 2015.

The tool supports multiple protocols including SMB, SSH, LDAP, WinRM, MSSQL, RDP, FTP, and others. It enables credential testing, share enumeration, command execution, and Active Directory operations across networks. Authentication results are color-coded: green for success, red for failure, and magenta for valid credentials that were rejected.

# CAVEATS

Security tool for authorized penetration testing only. Requires Python and is typically installed via pipx. Successor to CrackMapExec.

# HISTORY

NetExec was created as the **successor to CrackMapExec** for network penetration testing, with community maintenance beginning after the original project was archived.

# SEE ALSO

[nmap](/man/nmap)(1), [crackmapexec](/man/crackmapexec)(1), [hydra](/man/hydra)(1), [impacket](/man/impacket)(1), [metasploit](/man/metasploit)(1)
