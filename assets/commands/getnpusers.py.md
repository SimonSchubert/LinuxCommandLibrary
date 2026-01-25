# TLDR

**Query domain users** with Kerberos pre-auth disabled (with credentials)

```GetNPUsers.py [DOMAIN]/[username]:[password] -request -format hashcat -outputfile [hashes.txt]```

**Check specific users** from a file (no credentials needed)

```GetNPUsers.py [DOMAIN]/ -usersfile [users.txt] -format hashcat -outputfile [hashes.txt] -dc-ip [DC_IP]```

**Request TGT for a specific user** without password

```GetNPUsers.py [DOMAIN]/[username] -no-pass -dc-ip [DC_IP]```

**Use pass-the-hash** authentication

```GetNPUsers.py [DOMAIN]/[username] -hashes [LMhash]:[NThash] -request```

**Output in John format** for cracking

```GetNPUsers.py [DOMAIN]/[username]:[password] -request -format john```

# SYNOPSIS

**GetNPUsers.py** [_DOMAIN_]/[_USER_]:[_PASSWORD_] [_OPTIONS_]

**GetNPUsers.py** [_DOMAIN_]/ **-usersfile** _FILE_ [_OPTIONS_]

# PARAMETERS

**-request**
> Request TGT for users found with pre-auth disabled.

**-format** _FORMAT_
> Output format for hashes: hashcat or john.

**-outputfile** _FILE_
> Write AS-REP hashes to specified file.

**-usersfile** _FILE_
> File containing list of usernames to check.

**-dc-ip** _IP_
> IP address of the domain controller.

**-no-pass**
> Use empty password or no password.

**-hashes** _LMHASH_:_NTHASH_
> Use NTLM hash for pass-the-hash authentication.

**-k**
> Use Kerberos authentication from ccache (set KRB5CCNAME).

**-debug**
> Enable debug output.

# DESCRIPTION

**GetNPUsers.py** is an Impacket tool that identifies Active Directory users with Kerberos pre-authentication disabled and retrieves their AS-REP (Authentication Service Response) encrypted data. This data can be cracked offline to recover user passwords, an attack known as **AS-REP Roasting**.

When pre-authentication is disabled for a user, anyone can request a TGT on their behalf without knowing the password. The domain controller returns encrypted data using the user's password hash, which can be brute-forced offline.

The tool can query all domain users via LDAP (requires credentials) or check specific usernames from a file (no credentials required if usernames are known).

# CAVEATS

This tool is for authorized security testing, CTF competitions, and defensive security research only. Unauthorized use against systems you do not own or have permission to test is illegal. Retrieved hashes require cracking with tools like hashcat (-m 18200) or John the Ripper.

# HISTORY

GetNPUsers.py is part of **Impacket**, a collection of Python classes for working with network protocols. Impacket was created by SecureAuth (now Fortra) and is widely used in penetration testing and security research. AS-REP Roasting became a well-known attack technique after research into Kerberos pre-authentication weaknesses.

# SEE ALSO

[GetUserSPNs.py](/man/GetUserSPNs.py)(1), [secretsdump.py](/man/secretsdump.py)(1), [hashcat](/man/hashcat)(1), [john](/man/john)(1)
