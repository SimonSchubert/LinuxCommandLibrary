# TLDR

**Enumerate RPC endpoints** on a target

```impacket-rpcmap '[domain]/[user]:[password]@[192.168.1.100]'```

**Enumerate RPC anonymously** (null session)

```impacket-rpcmap 'anonymous@[192.168.1.100]'```

**Enumerate using NTLM hash**

```impacket-rpcmap -hashes ':[nthash]' '[domain]/[user]@[192.168.1.100]'```

**Scan specific port range** for RPC endpoints

```impacket-rpcmap -port [135] '[domain]/[user]:[password]@[192.168.1.100]'```

# SYNOPSIS

**impacket-rpcmap** [_-h_] [_-port PORT_] [_-hashes LMHASH:NTHASH_] [_-no-pass_] [_-k_] [_-aesKey KEY_] _target_

# PARAMETERS

**-port** _PORT_
> Target port to query (default: 135)

**-hashes** _LMHASH:NTHASH_
> Use NTLM hashes for authentication instead of password

**-no-pass**
> Don't ask for password

**-k**
> Use Kerberos authentication from ccache file

**-aesKey** _KEY_
> AES key to use for Kerberos authentication

# DESCRIPTION

**impacket-rpcmap** queries the RPC endpoint mapper on Windows systems to enumerate available RPC services and their associated UUIDs. This provides insight into what services are running and potentially exploitable on the target.

The tool connects to the endpoint mapper (typically on port 135) and retrieves the list of registered RPC interfaces, including their UUIDs, versions, and binding information.

# CAVEATS

The endpoint mapper may restrict information based on authentication level. Some RPC services may not register with the endpoint mapper. Firewall rules may block access to RPC ports.

# HISTORY

Part of the **Impacket** library by SecureAuth. RPC enumeration is a fundamental reconnaissance technique for Windows environments, revealing available attack surfaces.

# SEE ALSO

[rpcclient](/man/rpcclient)(1), [impacket-getadusers](/man/impacket-getadusers)(1), [nmap](/man/nmap)(1)
