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

The tool supports SMB, WinRM, LDAP, MSSQL, and SSH protocols. It's designed for authorized security assessments and red team operations.

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

# HISTORY

**crackmapexec** was created by **byt3bl33d3r** (Marcello Salvati) around **2015**. It evolved from the need for a unified tool for Windows network penetration testing. The project is widely used in the security community and is actively maintained.

# SEE ALSO

[impacket](/man/impacket)(1), [mimikatz](/man/mimikatz)(1), [nmap](/man/nmap)(1), [enum4linux](/man/enum4linux)(1)
