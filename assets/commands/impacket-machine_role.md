# TAGLINE

determine a remote Windows host's domain role via Impacket

# TLDR

**Query a host** with domain credentials

```impacket-machine_role [domain]/[user]:[password]@[target]```

**Use pass-the-hash** authentication

```impacket-machine_role -hashes [LMHASH]:[NTHASH] [domain]/[user]@[target]```

**Use Kerberos** from a ccache (no password prompt)

```impacket-machine_role -k -no-pass [domain]/[user]@[target]```

**Set the target IP** when the name does not resolve

```impacket-machine_role -target-ip [192.168.1.10] [domain]/[user]:[password]@[hostname]```

**Connect on SMB port 139**

```impacket-machine_role -port 139 [domain]/[user]:[password]@[target]```

# SYNOPSIS

**impacket-machine_role** [_options_] _[[domain/]username[:password]@]target_

# PARAMETERS

_target_
> Target in Impacket form: `[[domain/]username[:password]@]targetName or address`.

**-target-ip** _IP_
> IP address of the target. Defaults to the host in _target_. Useful when the name does not resolve.

**-dc-ip** _IP_
> Domain controller IP used for Kerberos. If omitted, the domain from _target_ is used.

**-port** _{139,445}_
> SMB port (default: `445`).

**-hashes** _LMHASH:NTHASH_
> NTLM hashes instead of a password.

**-no-pass**
> Do not prompt for a password (use with **-k** or **-hashes**).

**-k**
> Kerberos authentication. Credentials are taken from `KRB5CCNAME` when possible.

**-aesKey** _HEX_
> AES-128 or AES-256 key for Kerberos (implies **-k**).

**-debug**
> Enable debug output.

**-ts**
> Prefix log lines with a timestamp.

# DESCRIPTION

**impacket-machine_role** is the packaged entry point for Impacket's **machine_role.py**. It talks MS-DSSP (`DsRolerGetPrimaryDomainInformation`) over the `lsarpc` named pipe and prints the host's machine role plus primary domain details.

Roles reported are standalone workstation, domain-joined workstation, standalone server, domain-joined server, backup domain controller, or primary domain controller. The same call returns the NetBIOS domain name, DNS domain name, forest name, and domain GUID.

Use this during reconnaissance when later steps should skip domain controllers, or when you need to confirm whether a host is domain-joined before targeting it.

# CAVEATS

Needs network access to SMB (usually TCP 445) and a bind to `lsarpc`. Credentials must be accepted by the target. Does not apply to non-Windows hosts or Samba in the same way. Intended for authorized security testing only.

# HISTORY

Part of the **Impacket** suite, originally by SecureAuth and now maintained by Fortra. The script was written by Simon Decosse.

# SEE ALSO

[machine_role.py](/man/machine_role.py)(1), [impacket-getarch](/man/impacket-getarch)(1), [impacket-smbclient](/man/impacket-smbclient)(1), [impacket-getadusers](/man/impacket-getadusers)(1), [nmap](/man/nmap)(1)

# RESOURCES

```[Source code](https://github.com/fortra/impacket)```

```[Documentation](https://github.com/fortra/impacket/blob/master/examples/machine_role.py)```

<!-- verified: 2026-09-07 -->
