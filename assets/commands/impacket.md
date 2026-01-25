# TLDR

**Get TGT with password**

```impacket-getTGT [domain/user:password]```

**Remote command execution**

```impacket-psexec [domain/user:password@target]```

**WMI execution**

```impacket-wmiexec [domain/user:password@target]```

**SMB execution**

```impacket-smbexec [domain/user:password@target]```

**Dump secrets**

```impacket-secretsdump [domain/user:password@target]```

**AS-REP roasting**

```impacket-GetNPUsers [domain/] -usersfile [users.txt] -no-pass```

# SYNOPSIS

**impacket-**_tool_ [_options_] [_target_]

# DESCRIPTION

**Impacket** is a collection of Python classes for working with network protocols. It includes numerous tools for penetration testing, particularly useful for Windows network attacks and assessments.

The toolkit provides implementations of SMB, MSRPC, Kerberos, LDAP, and other protocols commonly used in Windows environments.

# COMMON TOOLS

```
psexec         Remote command execution via SMB
wmiexec        Remote execution via WMI
smbexec        Remote execution via SMB
secretsdump    Dump SAM/NTDS secrets
getTGT         Get Kerberos TGT
GetNPUsers     AS-REP roasting
GetUserSPNs   Kerberoasting
ntlmrelayx     NTLM relay attacks
```

# AUTHENTICATION FORMATS

```
domain/user:password
domain/user:LMhash:NThash
domain/user@target -k (Kerberos)
```

# CAVEATS

For authorized testing only. May trigger security alerts. Requires Python. Some tools need local admin on target. Windows Defender may detect tools.

# HISTORY

Impacket was created by **SecureAuth** (now part of Delinea). It's widely used in penetration testing and red team operations for Windows network exploitation.

# SEE ALSO

[crackmapexec](/man/crackmapexec)(1), [mimikatz](/man/mimikatz)(1), [responder](/man/responder)(1)
