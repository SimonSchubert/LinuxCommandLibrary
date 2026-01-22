# TLDR

**Authenticate to LDAP**

```nxc ldap [target] -u [user] -p [password]```

**Enumerate users**

```nxc ldap [target] -u [user] -p [password] --users```

**Enumerate groups**

```nxc ldap [target] -u [user] -p [password] --groups```

**Kerberoasting**

```nxc ldap [target] -u [user] -p [password] --kerberoasting [output.txt]```

**AS-REP roasting**

```nxc ldap [target] -u [user] -p [password] --asreproast [output.txt]```

# SYNOPSIS

**nxc** **ldap** [_target_] [_options_]

# PARAMETERS

_TARGET_
> Domain controller address.

**-u** _USER_
> Username.

**-p** _PASSWORD_
> Password.

**--users**
> Enumerate domain users.

**--groups**
> Enumerate domain groups.

**--kerberoasting** _FILE_
> Dump Kerberos hashes.

**--asreproast** _FILE_
> AS-REP roasting attack.

**--help**
> Display help information.

# DESCRIPTION

**nxc ldap** is the NetExec LDAP module. Tests Active Directory via LDAP.

The tool enumerates and attacks AD. Used for domain penetration testing.

nxc ldap tests Active Directory.

# CAVEATS

Security tool. Authorized use only. Targets Active Directory.

# HISTORY

nxc ldap provides **Active Directory penetration testing** via LDAP protocol.

# SEE ALSO

[nxc](/man/nxc)(1), [ldapsearch](/man/ldapsearch)(1), [bloodhound](/man/bloodhound)(1)

