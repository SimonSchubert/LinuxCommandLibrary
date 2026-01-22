# TLDR

Scan for subdomains using **internal wordlist**

```dnsmap [example.com]```

Specify **custom wordlist**

```dnsmap [example.com] -w [path/to/wordlist.txt]```

Store results to **CSV file**

```dnsmap [example.com] -c [path/to/file.csv]```

**Ignore** false positive IPs

```dnsmap [example.com] -i [123.45.67.89,98.76.54.32]```

# SYNOPSIS

**dnsmap** _domain_ [_options_]

# DESCRIPTION

**dnsmap** scans a domain for common subdomains using DNS queries. It attempts to resolve subdomain names from a wordlist to discover hidden or unlisted subdomains.

Used in security testing and reconnaissance to map an organization's DNS infrastructure.

# PARAMETERS

**-w** _wordlist_
> Use custom wordlist file

**-c** _file_
> Output results to CSV file

**-i** _IPs_
> Comma-separated IPs to ignore (false positives)

**-d** _delay_
> Delay between queries (milliseconds)

**-r** _file_
> Save results to regular file

# CAVEATS

Use only against authorized domains. May trigger security alerts. DNS wildcards can cause false positives; use -i to filter.

# SEE ALSO

[dnsrecon](/man/dnsrecon)(1), [fierce](/man/fierce)(1), [nslookup](/man/nslookup)(1)
