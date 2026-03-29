# TAGLINE

comprehensive DNS reconnaissance tool

# TLDR

Perform **standard enumeration** of a domain

```dnsrecon -d [example.com]```

Perform **zone transfer**

```dnsrecon -d [example.com] -n [nameserver.example.com] -t axfr```

**Brute-force** subdomains using a dictionary

```dnsrecon -d [example.com] -D [path/to/dictionary.txt] -t brt```

Perform **reverse lookup** on an IP range

```dnsrecon -r [192.168.1.0/24]```

Scan and save results to a **JSON file**

```dnsrecon -d [example.com] -j [path/to/results.json]```

**Cache snooping** against a nameserver

```dnsrecon -d [example.com] -t snoop -n [nameserver.example.com] -D [path/to/dictionary.txt]```

**DNSSEC zone walking**

```dnsrecon -d [example.com] -t zonewalk```

Standard enumeration with **SPF reverse lookup** and save to **SQLite database**

```dnsrecon -d [example.com] -s --db [path/to/database.sqlite]```

# SYNOPSIS

**dnsrecon** [_options_]

# DESCRIPTION

**dnsrecon** is a comprehensive DNS reconnaissance tool that performs multiple enumeration techniques to map DNS infrastructure. It combines zone transfers (AXFR), brute-force subdomain discovery, cache snooping, DNSSEC zone walking, and reverse lookups into a single tool.

The tool supports various scan types: standard enumeration, zone transfers to extract complete zone data, brute-force with custom dictionaries to discover subdomains, cache snooping to check for cached records on nameservers, and DNSSEC zone walking which exploits NSEC records to enumerate zones. Results can be exported to multiple formats including JSON, CSV, and SQLite databases for analysis. It can also perform Google enumeration to find subdomains through search engine results and SPF record analysis to discover related IP ranges. Widely used in penetration testing and security assessments to thoroughly map an organization's DNS footprint.

# PARAMETERS

**-d**, **--domain** _DOMAIN_
> Target domain.

**-n**, **--name_server** _NS_SERVER_
> Domain server to use. If none is given, the SOA of the target will be used.

**-r**, **--range** _RANGE_
> IP range for reverse lookup brute force in formats (first-last) or (range/bitmask).

**-t**, **--type** _TYPE_
> Enumeration type: std, rvl, brt, srv, axfr, bing, yand, crt, snoop, tld, zonewalk.

**-D**, **--dictionary** _DICTIONARY_
> Dictionary file of subdomain and hostnames to use for brute force.

**-a**
> Perform AXFR with standard enumeration.

**-s**
> Perform reverse lookup of IPv4 ranges in the SPF record with standard enumeration.

**-z**
> Perform DNSSEC zone walk with standard enumeration.

**-f**
> Filter out wildcard-resolved records from brute force results.

**--threads** _THREADS_
> Number of threads to use for parallel processing.

**--lifetime** _LIFETIME_
> Time in seconds to wait for a server to respond to a query (default: 3).

**--tcp**
> Use TCP protocol to make queries.

**-j**, **--json** _JSON_
> JSON file to save found records.

**-c**, **--csv** _CSV_
> Comma separated value file to save found records.

**-x**, **--xml** _XML_
> XML file to save found records.

**--db** _DB_
> SQLite 3 file to save found records.

**-v**
> Enable verbose output.

**-V**
> Display version information.

# CAVEATS

Use only against authorized targets. Zone transfers are often blocked by nameservers. Brute-force can be slow depending on dictionary size. Google enumeration may be rate-limited.

# SEE ALSO

[dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [host](/man/host)(1), [dnsmap](/man/dnsmap)(1), [dnsenum](/man/dnsenum)(1), [fierce](/man/fierce)(1)
