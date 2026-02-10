# TAGLINE

requests a Kerberos Ticket Granting Ticket from an Active Directory domain

# TLDR

**Request a TGT** for a domain user with password

```impacket-gettgt '[domain]/[user]:[password]'```

**Request TGT** and save to a specific file

```impacket-gettgt -dc-ip [192.168.1.100] '[domain]/[user]:[password]'```

**Request TGT using NTLM hash**

```impacket-gettgt -hashes ':[nthash]' '[domain]/[user]'```

**Request TGT using AES key**

```impacket-gettgt -aesKey '[aes256key]' '[domain]/[user]'```

# SYNOPSIS

**impacket-gettgt** [_-h_] [_-dc-ip IP_] [_-hashes LMHASH:NTHASH_] [_-aesKey KEY_] _target_

# PARAMETERS

**-dc-ip** _IP_
> IP address of the domain controller (KDC)

**-hashes** _LMHASH:NTHASH_
> Use NTLM hashes for authentication instead of password

**-aesKey** _KEY_
> AES key to use for Kerberos authentication (128 or 256 bit)

# DESCRIPTION

**impacket-gettgt** requests a Kerberos Ticket Granting Ticket (TGT) from an Active Directory domain controller. The TGT is saved to a ccache file that can be used for subsequent Kerberos authentication with other tools.

This tool is useful for obtaining Kerberos tickets when you have valid credentials (password, hash, or AES key) and need to authenticate to Kerberos-enabled services. The resulting ccache file can be exported via the KRB5CCNAME environment variable.

# CAVEATS

Requires valid domain credentials in some form (password, NTLM hash, or AES key). The domain controller must be reachable and Kerberos ports (88/tcp) must be accessible. Time synchronization between client and KDC is critical for Kerberos to function.

# HISTORY

Part of the **Impacket** library by SecureAuth, implementing the Kerberos protocol for penetration testing. TGT retrieval is a fundamental operation in Kerberos-based attacks and authentication workflows.

# SEE ALSO

[impacket-getst](/man/impacket-getst)(1), [kinit](/man/kinit)(1), [klist](/man/klist)(1), [impacket-secretsdump](/man/impacket-secretsdump)(1)
