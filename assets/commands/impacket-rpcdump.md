# TAGLINE

enumerates RPC endpoints on a target system

# TLDR

**Dump RPC endpoints**

```impacket-rpcdump [target]```

**Dump with authentication**

```impacket-rpcdump [domain]/[user]:[password]@[target]```

**Specify port**

```impacket-rpcdump -port [135] [target]```

# SYNOPSIS

**impacket-rpcdump** [_options_] _target_

# PARAMETERS

**-port** _PORT_
> RPC endpoint port (default _135_).

**-target-ip** _IP_
> Override the IP used for the connection (useful when the target is given as a hostname).

**-hashes** _LMHASH:NTHASH_
> Authenticate via Pass-the-Hash instead of supplying a password.

**-no-pass**
> Don't prompt for a password (use **-hashes** or **-k** alone).

**-k**
> Use Kerberos authentication. Credentials are read from **ccache** (set by **kinit**).

**-aesKey** _HEX_
> AES key for Kerberos authentication.

**-dc-ip** _IP_
> IP of the domain controller for Kerberos.

**-debug**
> Print verbose protocol-level output.

# DESCRIPTION

**impacket-rpcdump** queries the Microsoft RPC endpoint mapper (port 135 by default) and prints every registered endpoint, its UUID, and the bindings (named pipes, TCP/UDP ports) it speaks. It is the Python/Impacket equivalent of Microsoft's classic **rpcdump.exe** and is commonly used to enumerate exposed Active Directory services during authorized engagements.

When credentials are supplied (clear-text password, NTLM hash, or Kerberos ticket), additional services that require authentication may appear in the listing; an unauthenticated dump usually returns only the small set of endpoints reachable anonymously.

# CAVEATS

For **authorized testing only**. Some services restrict anonymous endpoint enumeration on modern Windows builds (e.g., **RestrictRemoteSAM**), so empty output does not mean no services are running.

# INSTALL

```pacman: sudo pacman -S impacket```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[impacket-rpcmap](/man/impacket-rpcmap)(1), [rpcclient](/man/rpcclient)(1)

