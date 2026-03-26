# TAGLINE

NetExec LDAP module for Active Directory enumeration

# TLDR

**Authenticate to LDAP**

```nxc ldap [target] -u [user] -p [password]```

**Authenticate with NTLM hash**

```nxc ldap [target] -u [user] -H [hash]```

**Enumerate users**

```nxc ldap [target] -u [user] -p [password] --users```

**Enumerate groups**

```nxc ldap [target] -u [user] -p [password] --groups```

**Kerberoasting**

```nxc ldap [target] -u [user] -p [password] --kerberoasting [output.txt]```

**AS-REP roasting**

```nxc ldap [target] -u [user] -p [password] --asreproast [output.txt]```

**Run custom LDAP query**

```nxc ldap [target] -u [user] -p [password] --query "([sAMAccountName=*])" --base-dn "[DC=domain,DC=com]"```

**Collect BloodHound data**

```nxc ldap [target] -u [user] -p [password] --bloodhound -c All --dns-server [dc_ip]```

# SYNOPSIS

**nxc** **ldap** _target_ [_options_]

# PARAMETERS

_TARGET_
> Domain controller IP or hostname.

**-u** _USER_
> Username for authentication.

**-p** _PASSWORD_
> Password for authentication.

**-H** _HASH_
> NTLM hash for pass-the-hash authentication.

**-k**
> Use Kerberos authentication.

**--use-kcache**
> Use Kerberos credential cache.

**-d** _DOMAIN_
> Domain to authenticate to.

**--port** _PORT_
> LDAP port (default: 389).

**--users**
> Enumerate domain users.

**--active-users**
> Enumerate active (non-disabled) domain users.

**--groups**
> Enumerate domain groups.

**--computers**
> Enumerate domain computers.

**--dc-list**
> List domain controllers.

**--get-sid**
> Get domain SID.

**--pass-pol**
> Get password policy.

**--gmsa**
> Enumerate Group Managed Service Accounts.

**--kerberoasting** _FILE_
> Perform Kerberoasting and save hashes to file.

**--asreproast** _FILE_
> Perform AS-REP roasting and save hashes to file.

**--trusted-for-delegation**
> Find accounts trusted for delegation.

**--password-not-required**
> Find accounts that do not require a password.

**--admin-count**
> Find accounts with adminCount=1.

**--bloodhound**
> Collect data for BloodHound.

**--query** _FILTER_
> Custom LDAP query filter.

**--base-dn** _DN_
> Base DN for LDAP queries.

**-M** _MODULE_
> Run a specific LDAP module.

**--continue-on-success**
> Continue on successful authentication (password spraying).

# DESCRIPTION

**nxc ldap** is the LDAP protocol module of NetExec (formerly CrackMapExec). It performs Active Directory enumeration and attacks via the LDAP protocol against domain controllers.

The module supports authentication via passwords, NTLM hashes, and Kerberos tickets. It can enumerate users, groups, computers, policies, and delegation settings, as well as perform Kerberoasting and AS-REP roasting attacks.

# CAVEATS

Security/penetration testing tool. Authorized use only. Requires valid credentials or hashes for most operations. Some features require specific AD privilege levels.

# HISTORY

NetExec (nxc) is the successor to **CrackMapExec** (cme), maintained by the community after the original project was archived. The LDAP module provides Active Directory enumeration via the LDAP protocol.

# SEE ALSO

[nxc](/man/nxc)(1), [nxc-smb](/man/nxc-smb)(1), [nxc-winrm](/man/nxc-winrm)(1), [ldapsearch](/man/ldapsearch)(1), [bloodhound](/man/bloodhound)(1)

