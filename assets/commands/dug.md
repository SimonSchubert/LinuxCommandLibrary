# TAGLINE

Global DNS propagation checker

# TLDR

**Check** DNS propagation globally

```dug [domain]```

**Check** specific record type

```dug [domain] [A|AAAA|MX|TXT|NS|CNAME]```

**Check** against specific resolvers

```dug [domain] --resolvers [resolver1,resolver2]```

**Output** results as JSON

```dug [domain] --json```

# SYNOPSIS

**dug** [_options_] _domain_ [_record_type_]

# PARAMETERS

**-t, --type** _TYPE_
> Record type: A, AAAA, MX, TXT, NS, CNAME, SOA, PTR (default: A)

**-r, --resolvers** _LIST_
> Comma-separated list of resolvers to query

**--json**
> Output results in JSON format

**--csv**
> Output results in CSV format

**-v, --verbose**
> Enable verbose output

**--timeout** _SECONDS_
> Query timeout (default: 5)

**-h, --help**
> Display help and exit

**--version**
> Display version and exit

# DESCRIPTION

**dug** is a command-line tool for checking DNS propagation across the globe. It queries multiple DNS resolvers worldwide to determine if a DNS record has propagated and shows response times from different geographic locations.

The tool is useful for verifying DNS changes after updating records, diagnosing DNS issues, and understanding how DNS caching affects record visibility. It can check various record types against a default set of public resolvers or custom ones.

# OUTPUT

Shows results from resolvers including:
- Resolver location/name
- Resolved IP(s) or record data
- Query response time
- Status indicator (match/differ)

# CAVEATS

Dependent on external DNS resolvers being available. Network latency affects query times. Some resolvers may rate-limit queries. Results show propagation trends but may not represent all geographic regions.

# HISTORY

**dug** was developed to help system administrators and developers verify DNS changes have propagated globally before completing migrations or updates. It provides visibility into the distributed nature of DNS.

# SEE ALSO

[dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [host](/man/host)(1), [dog](/man/dog)(1)