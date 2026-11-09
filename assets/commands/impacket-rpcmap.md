# TAGLINE

Scan for listening DCE/RPC interfaces on a target

# TLDR

**List RPC interfaces** on the endpoint mapper port, unauthenticated

```impacket-rpcmap 'ncacn_ip_tcp:[192.168.1.100][[135]]'```

**Authenticate** to the RPC interface with a password

```impacket-rpcmap -auth-rpc '[domain]/[user]:[password]' 'ncacn_ip_tcp:[192.168.1.100][[135]]'```

**Authenticate using an NTLM hash** instead of a password

```impacket-rpcmap -auth-rpc '[domain]/[user]' -hashes-rpc ':[nthash]' 'ncacn_ip_tcp:[192.168.1.100][[135]]'```

**Scan a named pipe** over SMB

```impacket-rpcmap -auth-transport '[domain]/[user]:[password]' 'ncacn_np:[192.168.1.100][[\pipe\spoolss]]'```

**Brute-force UUIDs** even if the MGMT interface is available

```impacket-rpcmap -brute-uuids 'ncacn_ip_tcp:[192.168.1.100][[135]]'```

**Brute-force operation numbers** on discovered interfaces

```impacket-rpcmap -brute-opnums -opnum-max [128] 'ncacn_ip_tcp:[192.168.1.100][[135]]'```

**Test a single interface UUID**

```impacket-rpcmap -uuid [uuid] 'ncacn_ip_tcp:[192.168.1.100][[135]]'```

# SYNOPSIS

**impacket-rpcmap** [_options_] _stringbinding_

# PARAMETERS

_stringbinding_
> Binding to connect to, e.g. ncacn_ip_tcp:192.168.0.1[135], ncacn_np:192.168.0.1[\pipe\spoolss], ncacn_http:192.168.0.1[593].

**-brute-uuids**
> Brute-force UUIDs even if the MGMT interface is available.

**-brute-opnums**
> Brute-force operation numbers for found UUIDs.

**-brute-versions**
> Brute-force major versions of found UUIDs. Cannot be combined with **-brute-opnums**.

**-opnum-max** _N_
> Brute-force opnums from 0 to N (default: 64).

**-version-max** _N_
> Brute-force versions from 0 to N (default: 64).

**-auth-level** _LEVEL_
> MS-RPCE authentication level, 1-6 (default: 6, RPC_C_AUTHN_LEVEL_PKT_PRIVACY).

**-uuid** _UUID_
> Test only this UUID.

**-auth-rpc** _[domain/]user[:password]_
> Credentials for MSRPC communication.

**-auth-transport** _[domain/]user[:password]_
> Credentials for the RPC transport (SMB or HTTP).

**-hashes-rpc** _LMHASH:NTHASH_
> NTLM hashes for MSRPC authentication.

**-hashes-transport** _LMHASH:NTHASH_
> NTLM hashes for transport authentication.

**-no-pass**
> Do not ask for passwords.

**-target-ip** _IP_
> For ncacn_np: IP address of the target when the binding uses a NetBIOS name.

**-port** _PORT_
> For ncacn_np: destination SMB port, 139 or 445 (default: 445).

**-debug**
> Turn on debug output.

**-ts**
> Add a timestamp to every logging output.

# DESCRIPTION

**impacket-rpcmap** scans for listening DCE/RPC interfaces. It binds to the MGMT interface of the given string binding and retrieves the list of interface UUIDs. If MGMT is not available, it tries to bind to each UUID in a built-in list of interfaces seen in the wild.

With **-brute-opnums**, it calls each of the first N operation numbers for every UUID and reports the outcome. Supported transports include ncacn_ip_tcp, ncacn_np, and ncacn_http, including RPC proxies.

# CAVEATS

Brute-force options can generate a burst of connections to the endpoint. Results may depend on the authentication level and credentials used. Firewall rules may block access to RPC ports. On some systems the script is installed as **rpcmap.py**.

# HISTORY

Part of the **Impacket** library, originally by SecureAuth and now maintained by **Fortra**. RPC enumeration is a fundamental reconnaissance technique for Windows environments, revealing available attack surfaces.

# SEE ALSO

[impacket-rpcdump](/man/impacket-rpcdump)(1), [rpcclient](/man/rpcclient)(1), [impacket-getnpusers](/man/impacket-getnpusers)(1), [nmap](/man/nmap)(1)

# RESOURCES

```[Source code](https://github.com/fortra/impacket)```

<!-- verified: 2026-11-09 -->
