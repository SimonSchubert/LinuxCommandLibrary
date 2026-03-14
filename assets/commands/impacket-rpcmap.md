# TAGLINE

Scan for listening DCE/RPC interfaces on a target

# TLDR

**Enumerate RPC endpoints** on a target

```impacket-rpcmap '[domain]/[user]:[password]@[192.168.1.100]'```

**Enumerate RPC endpoints** with null authentication

```impacket-rpcmap -no-pass '[192.168.1.100]'```

**Enumerate using NTLM hash** instead of password

```impacket-rpcmap -hashes ':[nthash]' '[domain]/[user]@[192.168.1.100]'```

**Scan a specific port** for RPC endpoints

```impacket-rpcmap -port [135] '[domain]/[user]:[password]@[192.168.1.100]'```

**Brute-force operation numbers** on discovered interfaces

```impacket-rpcmap -brute-opnums '[domain]/[user]:[password]@[192.168.1.100]'```

**Use a specific RPC transport** (ncacn_ip_tcp)

```impacket-rpcmap 'ncacn_ip_tcp:[192.168.1.100]'```

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

**-brute-opnums**
> Brute-force operation numbers for each discovered interface

**-brute-uuids**
> Brute-force UUIDs to find hidden interfaces

**-auth-level** _LEVEL_
> Authentication level (1-6, default: 6/PKT_PRIVACY)

# DESCRIPTION

**impacket-rpcmap** scans for listening DCE/RPC interfaces on a target system. It can query the RPC endpoint mapper (typically on port 135) or probe specific ports directly using various RPC transports (ncacn_ip_tcp, ncacn_np, ncacn_http).

The tool connects to the endpoint mapper (typically on port 135) and retrieves the list of registered RPC interfaces, including their UUIDs, versions, and binding information.

# CAVEATS

The endpoint mapper may restrict information based on authentication level. Some RPC services may not register with the endpoint mapper. Firewall rules may block access to RPC ports.

# HISTORY

Part of the **Impacket** library by SecureAuth. RPC enumeration is a fundamental reconnaissance technique for Windows environments, revealing available attack surfaces.

# SEE ALSO

[rpcclient](/man/rpcclient)(1), [impacket-getnpusers](/man/impacket-getnpusers)(1), [impacket-getadusers](/man/impacket-getadusers)(1), [nmap](/man/nmap)(1)
