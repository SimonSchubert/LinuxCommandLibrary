# TLDR

Scan and save to **SQLite database**

```dnsrecon -d [example.com] --db [path/to/database.sqlite]```

Perform **zone transfer**

```dnsrecon -d [example.com] -n [nameserver.example.com] -t axfr```

**Brute-force** subdomains

```dnsrecon -d [example.com] -D [path/to/dictionary.txt] -t brt```

**Reverse lookup** from SPF, save to JSON

```dnsrecon -d [example.com] -s -j```

**Google enumeration**, save to CSV

```dnsrecon -d [example.com] -g -c```

**Cache snooping**

```dnsrecon -d [example.com] -t snoop -n [nameserver.example.com] -D [path/to/dictionary.txt]```

**Zone walking**

```dnsrecon -d [example.com] -t zonewalk```

# SYNOPSIS

**dnsrecon** [_options_]

# DESCRIPTION

**dnsrecon** is a comprehensive DNS enumeration tool. It performs various DNS reconnaissance techniques including zone transfers, brute-force subdomain discovery, cache snooping, and zone walking.

Widely used in penetration testing and security assessments.

# PARAMETERS

**-d, --domain** _domain_
> Target domain

**-n, --name_server** _ns_
> Specific nameserver

**-t, --type** _type_
> Scan type (std, axfr, brt, snoop, zonewalk)

**-D, --dictionary** _file_
> Dictionary for brute force

**-j, --json**
> Output to JSON

**-c, --csv**
> Output to CSV

**--db** _file_
> SQLite database output

# CAVEATS

Use only against authorized targets. Zone transfers often blocked. Brute-force can be slow depending on dictionary size.

# SEE ALSO

[dnsmap](/man/dnsmap)(1), [dig](/man/dig)(1), [nslookup](/man/nslookup)(1)
