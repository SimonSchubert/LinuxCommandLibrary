# TAGLINE

Kerberos ticket granting ticket requester

# TLDR

**Get a TGT with** a password

```getTGT.py [domain]/[username]:[password] -dc-ip [dc_ip]```

**Get a TGT using** an NTLM hash

```getTGT.py [domain]/[username] -hashes :[nthash] -dc-ip [dc_ip]```

**Get a TGT using** an AES key

```getTGT.py [domain]/[username] -aesKey [aes_key] -dc-ip [dc_ip]```

**Prompt for the password** instead of passing it inline

```getTGT.py [domain]/[username] -dc-ip [dc_ip]```

# SYNOPSIS

**getTGT.py** _domain_/_user_[:_password_] [_options_]

# PARAMETERS

_DOMAIN/USER_[:_PASSWORD_]
> Target identity. The password is optional and is prompted for if omitted.

**-dc-ip** _IP_
> IP address of the domain controller. Defaults to the domain FQDN if omitted.

**-hashes** _LMHASH:NTHASH_
> NTLM hashes to authenticate with. The LM half may be left empty (`:NTHASH`).

**-aesKey** _KEY_
> AES key (128 or 256 bit) for Kerberos authentication.

**-k**
> Use Kerberos credentials from the ccache file (KRB5CCNAME), falling back to the supplied credentials.

**-no-pass**
> Do not prompt for a password, useful together with -k.

**-debug**
> Turn on DEBUG output.

**-ts**
> Add a timestamp to each log line.

# DESCRIPTION

**getTGT.py** is an Impacket example script that requests a Kerberos Ticket Granting Ticket (TGT) from an Active Directory domain controller, given a password, an NTLM hash, or an AES key. The official description reads: "Given a password, hash or aesKey, it will request a TGT and save it as ccache."

The resulting ticket is written to a ccache file named after the principal (for example `username.ccache`). Set the **KRB5CCNAME** environment variable to that file and other Impacket tools, or native utilities, can reuse the ticket for pass-the-ticket authentication.

There is no dedicated output flag: the ccache filename is derived from the username automatically.

# CAVEATS

**Authorized testing only.** Requires valid credentials and clock sync with the domain controller, since large time skew breaks Kerberos. Tickets have a limited lifetime.

# HISTORY

getTGT.py is part of **Impacket**, the Python network protocol toolkit for Active Directory security testing, originally by Core Security and now maintained by Fortra.

# SEE ALSO

[GetNPUsers.py](/man/GetNPUsers.py)(1), [getuserspns.py](/man/getuserspns.py)(1), [kerberos](/man/kerberos)(7), [kinit](/man/kinit)(1)
