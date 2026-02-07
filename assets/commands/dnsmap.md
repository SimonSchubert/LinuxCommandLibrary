# TAGLINE

subdomain brute-force scanner

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

**dnsmap** is a subdomain brute-force enumeration tool that uses DNS queries to discover subdomains not listed in public DNS records. It works by attempting to resolve potential subdomain names from a wordlist, identifying which ones successfully resolve to IP addresses.

The tool comes with a built-in wordlist of common subdomain names (www, mail, ftp, etc.), but custom wordlists can be specified for more thorough enumeration. DNS wildcard configurations can cause false positives where all subdomains resolve to the same IP; the -i flag allows filtering out these known wildcard addresses. Results can be saved to CSV format for further analysis. The tool is commonly used in penetration testing reconnaissance to map an organization's DNS footprint and discover potential attack surfaces like development servers, staging environments, or forgotten subdomains.

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
