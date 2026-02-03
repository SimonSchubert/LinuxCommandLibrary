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

**-port** _port_
> RPC port (default 135).

**-hashes** _lm:nt_
> Use NTLM hashes.

**-k**
> Use Kerberos.

# DESCRIPTION

**impacket-rpcdump** enumerates RPC endpoints on a target system. Part of the Impacket toolkit. Lists available RPC services with UUIDs and bindings. Useful for reconnaissance in penetration testing.

# SEE ALSO

[impacket-rpcmap](/man/impacket-rpcmap)(1), [rpcclient](/man/rpcclient)(1)

