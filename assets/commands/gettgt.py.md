# TLDR

**Get TGT for** user

```getTGT.py [domain]/[username]:[password] -dc-ip [dc_ip]```

**Using NTLM hash**

```getTGT.py [domain]/[username] -hashes :[ntlm_hash] -dc-ip [dc_ip]```

**Using AES key**

```getTGT.py [domain]/[username] -aesKey [aes_key] -dc-ip [dc_ip]```

**Save to file**

```getTGT.py [domain]/[username]:[password] -dc-ip [dc_ip] -o [ticket.ccache]```

# SYNOPSIS

**getTGT.py** _domain_/_user_ [_options_]

# PARAMETERS

_DOMAIN/USER_
> Domain and username.

**-dc-ip** _IP_
> Domain controller IP.

**-hashes** _LMHASH:NTHASH_
> NTLM hashes.

**-aesKey** _KEY_
> AES encryption key.

**-o** _FILE_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**getTGT.py** is an Impacket tool that requests Kerberos TGT (Ticket Granting Tickets) from Active Directory domain controllers. It authenticates using passwords, hashes, or AES keys.

The tool obtains tickets for use in Kerberos-based attacks or legitimate authentication. Tickets can be exported in ccache format for use with other tools.

getTGT.py enables Kerberos ticket acquisition in penetration testing.

# CAVEATS

**Authorized testing only.** Requires valid credentials. Tickets have limited lifetime.

# HISTORY

getTGT.py is part of **Impacket**, the Python network protocol toolkit for Active Directory security testing.

# SEE ALSO

[getST.py](/man/getST.py)(1), [GetNPUsers.py](/man/GetNPUsers.py)(1)
