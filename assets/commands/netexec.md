# TLDR

**Enumerate SMB shares**

```netexec smb [192.168.1.0/24] -u [user] -p [password] --shares```

**Check credentials**

```netexec smb [target] -u [user] -p [password]```

**Execute command**

```netexec smb [target] -u [admin] -p [password] -x "[whoami]"```

**Pass the hash**

```netexec smb [target] -u [user] -H [hash]```

**Enumerate users**

```netexec smb [target] -u [user] -p [password] --users```

**Spray passwords**

```netexec smb [target] -u [users.txt] -p [password]```

**WinRM access**

```netexec winrm [target] -u [user] -p [password]```

**LDAP enumeration**

```netexec ldap [target] -u [user] -p [password] --users```

# SYNOPSIS

**netexec** _protocol_ _target_ [_-u user_] [_-p pass_] [_-H hash_] [_options_]

# PARAMETERS

**smb**
> SMB protocol.

**winrm**
> WinRM protocol.

**ldap**
> LDAP protocol.

**ssh**
> SSH protocol.

**mssql**
> MSSQL protocol.

**-u** _USER_
> Username or file.

**-p** _PASS_
> Password or file.

**-H** _HASH_
> NTLM hash.

**-d** _DOMAIN_
> Domain name.

**-x** _CMD_
> Execute command.

**-X** _PS_CMD_
> Execute PowerShell.

**--shares**
> Enumerate shares.

**--users**
> Enumerate users.

**--groups**
> Enumerate groups.

**--local-auth**
> Use local authentication.

**--sam**
> Dump SAM database.

**--lsa**
> Dump LSA secrets.

# DESCRIPTION

**netexec** (formerly CrackMapExec) is a network security tool for Windows/Active Directory environments. It tests credentials, enumerates resources, and executes commands across networks.

Multiple protocols are supported: SMB, WinRM, LDAP, SSH, MSSQL, and more. Each protocol has specific enumeration and exploitation modules.

Credential testing validates usernames and passwords across targets. Pass-the-hash uses NTLM hashes directly. Password spraying tests one password against many accounts.

Share enumeration reveals accessible network shares. User and group enumeration maps Active Directory structure. These provide reconnaissance for security assessments.

Command execution requires appropriate privileges. Results are collected across all targets for analysis.

The tool is designed for authorized penetration testing and security assessments.

# CAVEATS

Only use with authorization. May trigger security alerts. Some features require administrative access. Heavy scanning can cause lockouts.

# HISTORY

**NetExec** is the successor to **CrackMapExec** (CME), created by **byt3bl33d3r** around **2015**. After CrackMapExec's development slowed, NetExec forked the project in **2023** to continue maintenance and development.

# SEE ALSO

[smbclient](/man/smbclient)(1), [rpcclient](/man/rpcclient)(1), [ldapsearch](/man/ldapsearch)(1), [nmap](/man/nmap)(1)
