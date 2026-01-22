# TLDR

**Collect all Active Directory data**

```bloodhound-python -d [domain.local] -u [username] -p [password] -ns [dc_ip] -c all```

**Collect specific data** (users, groups, computers)

```bloodhound-python -d [domain.local] -u [username] -p [password] -c [users,groups,computers]```

**Use NTLM hash** for authentication

```bloodhound-python -d [domain.local] -u [username] --hashes [LM:NT] -ns [dc_ip] -c all```

**Output to zip file**

```bloodhound-python -d [domain.local] -u [username] -p [password] -c all --zip```

**Use Kerberos authentication**

```bloodhound-python -d [domain.local] -u [username] -p [password] -k -c all```

**Specify DNS server**

```bloodhound-python -d [domain.local] -u [username] -p [password] -ns [dns_server] -c all```

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

**--hashes** _LM:NT_
> NTLM hash for pass-the-hash authentication

**-ns, --nameserver** _ip_
> DNS server/Domain Controller IP address

**-c, --collectionmethod** _method_
> Collection methods: all, users, groups, computers, trusts, sessions, acl, objectprops

**-k, --kerberos**
> Use Kerberos authentication

**--zip**
> Compress output to a zip file

**-o, --outputdir** _dir_
> Output directory for JSON files

**--dns-tcp**
> Use TCP for DNS queries

**-v**
> Enable verbose output

# CAVEATS

Requires valid domain credentials. Some collection methods (like sessions) require specific privileges. Output is compatible with BloodHound 4.1+. Use responsibly and only on systems you have authorization to test.

# HISTORY

BloodHound was created by **@_wald0**, **@CptJesus**, and **@harmj0y** at **SpecterOps**, released in **2016**. The Python ingestor (bloodhound-python) was developed by **Dirk-jan Mollema** as a cross-platform alternative to the C# SharpHound collector.

# SEE ALSO

[ldapsearch](/man/ldapsearch)(1), [impacket](/man/impacket)(1), [crackmapexec](/man/crackmapexec)(1)
