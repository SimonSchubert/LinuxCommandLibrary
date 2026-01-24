# TLDR

**Find subdomains** for a domain

```findomain -t [example.com]```

**Output to file**

```findomain -t [example.com] -o```

**Use all sources**

```findomain -t [example.com] -a```

**Check for live subdomains**

```findomain -t [example.com] --resolved```

**Output in JSON**

```findomain -t [example.com] --json```

**Read domains from file**

```findomain -f [domains.txt]```

# SYNOPSIS

**findomain** [_options_] -t _domain_

# DESCRIPTION

**findomain** is a cross-platform subdomain enumerator. It queries multiple data sources to discover subdomains for a target domain, useful for reconnaissance in security assessments.

The tool aggregates results from certificate transparency logs, search engines, and other passive sources without making direct requests to the target.

# PARAMETERS

**-t** _domain_
> Target domain.

**-f** _file_
> Read domains from file.

**-o**
> Output to file.

**-a**, **--all-apis**
> Use all available APIs.

**--resolved**
> Show only resolving subdomains.

**--ip**
> Show IP addresses.

**--json**
> Output in JSON format.

**-q**, **--quiet**
> Suppress informational output.

**-u**, **--unique**
> Remove duplicates.

# CAVEATS

API keys needed for some sources. Results depend on available data. Does not perform active scanning. Rate limits may apply.

# HISTORY

**findomain** was created by **Eduard Tolosa** as a fast subdomain enumeration tool. Written in Rust for performance, it emerged as an alternative to tools like Sublist3r and Amass. The project focuses on speed and reliability in passive reconnaissance.

# SEE ALSO

[amass](/man/amass)(1), [subfinder](/man/subfinder)(1), [sublist3r](/man/sublist3r)(1), [dnsx](/man/dnsx)(1)
