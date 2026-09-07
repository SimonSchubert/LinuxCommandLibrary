# TAGLINE

determine a remote Windows host's domain role (Impacket)

# TLDR

**Query a host** with domain credentials

```machine_role.py [domain]/[user]:[password]@[target]```

**Use pass-the-hash** authentication

```machine_role.py -hashes [LMHASH]:[NTHASH] [domain]/[user]@[target]```

**Use Kerberos** from a ccache (no password prompt)

```machine_role.py -k -no-pass [domain]/[user]@[target]```

**Set the domain controller IP** for Kerberos

```machine_role.py -dc-ip [192.168.1.1] [domain]/[user]:[password]@[target]```

**Set the target IP** when the name does not resolve

```machine_role.py -target-ip [192.168.1.10] [domain]/[user]:[password]@[hostname]```

# SYNOPSIS

**machine_role.py** [_options_] _[[domain/]username[:password]@]target_

# PARAMETERS

_target_
> Target in Impacket form: `[[domain/]username[:password]@]targetName or address`.

**-target-ip** _IP_
> IP address of the target. Defaults to the host in _target_.

**-dc-ip** _IP_
> Domain controller IP used for Kerberos.

**-port** _{139,445}_
> SMB port (default: `445`).

**-hashes** _LMHASH:NTHASH_
> NTLM hashes instead of a password.

**-no-pass**
> Do not prompt for a password (use with **-k** or **-hashes**).

**-k**
> Kerberos authentication from `KRB5CCNAME` when possible.

**-aesKey** _HEX_
> AES-128 or AES-256 key for Kerberos (implies **-k**).

**-debug**
> Enable debug output.

**-ts**
> Prefix log lines with a timestamp.

# DESCRIPTION

**machine_role.py** is an Impacket example that retrieves a Windows host's machine role and primary domain information through MS-DSSP (`DsRolerGetPrimaryDomainInformation`) on the `lsarpc` pipe.

It prints one of: standalone workstation, domain-joined workstation, standalone server, domain-joined server, backup domain controller, or primary domain controller, plus NetBIOS domain name, DNS domain name, forest name, and domain GUID.

Distro packages often install the same tool as **impacket-machine_role**. The two names share the same script and options.

# CAVEATS

Needs SMB access (typically TCP 445) and credentials the target accepts. Not a general Unix/Samba inventory tool. For authorized security testing only.

# HISTORY

Part of the **Impacket** suite, originally by SecureAuth and now maintained by Fortra. Written by Simon Decosse.

# INSTALL

```apk: sudo apk add py3-impacket```

<!-- packages: 2026-09-07 -->

# SEE ALSO

[impacket-machine_role](/man/impacket-machine_role)(1), [impacket-getarch](/man/impacket-getarch)(1), [impacket-smbclient](/man/impacket-smbclient)(1), [impacket](/man/impacket)(1)

# RESOURCES

```[Source code](https://github.com/fortra/impacket)```

```[Documentation](https://github.com/fortra/impacket/blob/master/examples/machine_role.py)```

<!-- verified: 2026-09-07 -->
