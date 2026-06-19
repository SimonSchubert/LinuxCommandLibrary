# TAGLINE

Collect Active Directory data for BloodHound analysis

# TLDR

**Collect all Active Directory data**

```bloodhound-python -d [domain.local] -u [username] -p [password] -ns [dc_ip] -c all```

**Collect specific data** (comma-separated methods)

```bloodhound-python -d [domain.local] -u [username] -p [password] -c [Group,LocalAdmin,Session]```

**Use NTLM hash** for authentication

```bloodhound-python -d [domain.local] -u [username] --hashes [LM:NT] -ns [dc_ip] -c all```

**Output to zip file**

```bloodhound-python -d [domain.local] -u [username] -p [password] -c all --zip```

**Use Kerberos authentication**

```bloodhound-python -d [domain.local] -u [username] -p [password] -k -c all```

**Specify DNS server**

```bloodhound-python -d [domain.local] -u [username] -p [password] -ns [dns_server] -c all```

**Collect against BloodHound CE** (use the CE ingestor)

```bloodhound-ce-python -d [domain.local] -u [username] -p [password] -ns [dc_ip] -c all --zip```

# SYNOPSIS

**bloodhound-python** [_options_]

# DESCRIPTION

**bloodhound-python** is a Python-based ingestor for BloodHound, an Active Directory security analysis tool. It collects information about AD objects (users, computers, groups) and their relationships, outputting JSON files for import into the BloodHound graph database.

The tool uses graph theory to identify attack paths in Active Directory environments that would be difficult to detect manually, helping both attackers and defenders understand domain security.

# PARAMETERS

**-d, --domain** _domain_
> Target Active Directory domain

**-u, --username** _user_
> Username for authentication

**-p, --password** _pass_
> Password for authentication

**--hashes** _LMHASH:NTHASH_
> NTLM hashes for pass-the-hash authentication. The LM portion may be left blank

**--auth-method** _auto|ntlm|kerberos_
> Authentication method to use (default: auto)

**-aesKey** _hexkey_
> AES key for Kerberos authentication (128 or 256 bit)

**-no-pass**
> Do not prompt for a password (use with -k and a ccache, or -no-pass for null sessions)

**-ns, --nameserver** _ip_
> DNS server to query, usually a Domain Controller in the target domain

**-dc** _host_
> Override the Domain Controller hostname to query (default: detected via DNS)

**-gc** _host_
> Override the Global Catalog hostname to query

**-c, --collectionmethod** _method_
> Comma-separated collection methods: Default, Group, LocalAdmin, RDP, DCOM, PSRemote, Session, LoggedOn, Trusts, ACL, Container, ObjectProps, DCOnly, All

**-k, --kerberos**
> Use Kerberos authentication. Grabs credentials from the ccache file (KRB5CCNAME environment variable)

**--zip**
> Compress the JSON output into a single zip file

**-o, --outputdir** _dir_
> Output directory for JSON files

**-w** _workers_
> Number of computer enumeration workers (default: 10)

**--dns-tcp**
> Use TCP instead of UDP for DNS queries

**--use-ldaps**
> Use LDAP over TLS (port 636) for the connection

**-v**
> Enable verbose output

# CAVEATS

Requires valid domain credentials. Some collection methods (like Session and LoggedOn) require local administrator rights on the target hosts. The **bloodhound-python** command (legacy ingestor) targets BloodHound 4.2 and 4.3, while the separate **bloodhound-ce-python** command produces output for BloodHound Community Edition. Do not mix legacy and CE collector output. Use responsibly and only on systems you are authorized to test.

# HISTORY

BloodHound was created by **@_wald0**, **@CptJesus**, and **@harmj0y** at **SpecterOps**, released in **2016**. The Python ingestor (bloodhound-python) was developed by **Dirk-jan Mollema** as a cross-platform alternative to the C# SharpHound collector.

# SEE ALSO

[ldapsearch](/man/ldapsearch)(1), [impacket](/man/impacket)(1), [netexec](/man/netexec)(1), [crackmapexec](/man/crackmapexec)(1)

# RESOURCES

```[Source code](https://github.com/dirkjanm/BloodHound.py)```

```[Homepage](https://bloodhound.specterops.io/)```

<!-- verified: 2026-06-19 -->
