# TAGLINE

post-exploitation tool for Windows/AD networks

# TLDR

**Enumerate SMB shares**

```crackmapexec smb [192.168.1.0/24] -u [user] -p [password] --shares```

**Check credentials** against hosts

```crackmapexec smb [hosts.txt] -u [user] -p [password]```

**Execute command**

```crackmapexec smb [target] -u [user] -p [password] -x "[whoami]"```

**Dump SAM hashes**

```crackmapexec smb [target] -u [admin] -p [password] --sam```

**Pass the hash**

```crackmapexec smb [target] -u [user] -H [ntlm_hash]```

**Enumerate users**

```crackmapexec smb [target] -u [user] -p [password] --users```

# SYNOPSIS

**crackmapexec** _protocol_ _target_ [_options_]

# DESCRIPTION

**crackmapexec** (CME) is a post-exploitation tool for penetration testing Windows/Active Directory environments. It automates common tasks like credential validation, share enumeration, and command execution across multiple hosts.

The tool supports SMB, WinRM, LDAP, MSSQL, SSH, RDP and FTP protocols. It's designed for authorized security assessments and red team operations.

# PARAMETERS

**-u** _user_
> Username for authentication.

**-p** _password_
> Password for authentication.

**-H** _hash_
> NTLM hash for pass-the-hash.

**-d** _domain_
> Domain name.

**-x** _command_
> Execute command.

**-X** _command_
> Execute PowerShell command.

**--shares**
> Enumerate SMB shares.

**--users**
> Enumerate domain users.

**--sam**
> Dump SAM database.

**--lsa**
> Dump LSA secrets.

**--local-auth**
> Use local authentication.

**-M** _module_
> Run specific module.

# CAVEATS

Only for authorized penetration testing. May trigger security alerts. Requires valid credentials or hashes. Some features need admin privileges. Network policies may block access.

**Deprecated**: the upstream repository was archived in **December 2023** and the last release is **5.4.0** (November 2022). The community fork **NetExec** (`nxc`) is the actively maintained successor with a largely compatible command line.

# HISTORY

**crackmapexec** was created by **byt3bl33d3r** (Marcello Salvati) around **2015**. It evolved from the need for a unified tool for Windows network penetration testing. The project became one of the most widely used tools in Active Directory assessments. After the maintainers moved on, development continued in the **NetExec** fork and the original repository was archived in 2023.

# SEE ALSO

[netexec](/man/netexec)(1), [nxc](/man/nxc)(1), [impacket](/man/impacket)(1), [evil-winrm](/man/evil-winrm)(1), [smbclient](/man/smbclient)(1), [nmap](/man/nmap)(1), [enum4linux](/man/enum4linux)(1)

# RESOURCES

```[Source code](https://github.com/byt3bl33d3r/CrackMapExec)```

<!-- verified: 2026-11-23 -->
