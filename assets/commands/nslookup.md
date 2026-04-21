# TAGLINE

queries DNS servers for hostname and IP information

# TLDR

**Lookup IP address**

```nslookup [example.com]```

**Lookup using specific DNS server**

```nslookup [example.com] [8.8.8.8]```

**Reverse DNS lookup**

```nslookup [192.168.1.1]```

**Query specific record type**

```nslookup -type=[MX] [example.com]```

**Query all records**

```nslookup -type=[ANY] [example.com]```

**Use TCP instead of UDP**

```nslookup -vc [example.com]```

**Interactive mode**

```nslookup```

**Debug mode**

```nslookup -debug [example.com]```

# SYNOPSIS

**nslookup** [_options_] [_host_] [_server_]

# DESCRIPTION

**nslookup** queries DNS servers for hostname and IP information. It can perform forward and reverse lookups, query specific record types, and diagnose DNS issues.

The tool operates in interactive or non-interactive mode, with interactive mode allowing multiple queries.

# PARAMETERS

**-type=**_type_
> Record type (A, AAAA, MX, NS, TXT, SOA, PTR, ANY, CNAME, SRV).

**-query=**_type_
> Alias for -type.

**-class=**_class_
> DNS class (IN, CH, HS, ANY). Default is IN.

**-debug**
> Show debug information (full response packets).

**-port=**_port_
> DNS server port (default 53).

**-timeout=**_seconds_
> Query timeout.

**-retry=**_n_
> Number of retries before giving up.

**-vc**
> Use TCP instead of UDP for queries.

**-nosearch**
> Do not append the search list to unqualified names.

**-norecurse**
> Do not request recursive resolution from the server.

**-version**
> Print version and exit.

# INTERACTIVE COMMANDS

**server** _name_: Set default DNS server (uses current server to resolve it)
**lserver** _name_: Set default server using the initial server
**set type=**_type_: Set query type
**set class=**_class_: Set query class
**set debug** / **set nodebug**: Toggle debug output
**set all**: Display current option settings
**exit**: Quit

# CAVEATS

Deprecated in favor of dig. Behavior varies by implementation. Interactive mode differs from command line. Some features implementation-specific.

# HISTORY

**nslookup** was written by **Andrew Cherenson** at UC Berkeley as part of BIND. While still included in most systems, the BIND documentation recommends using dig for DNS queries due to more consistent behavior.

# SEE ALSO

[dig](/man/dig)(1), [host](/man/host)(1), [drill](/man/drill)(1), [getent](/man/getent)(1)
