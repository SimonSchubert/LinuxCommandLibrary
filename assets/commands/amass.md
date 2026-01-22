# TLDR

**Enumerate** subdomains passively

```amass enum -passive -d [example.com]```

**Active** enumeration with DNS resolution

```amass enum -active -d [example.com]```

Enumerate with **output file**

```amass enum -d [example.com] -o [output.txt]```

Use **all sources** for maximum coverage

```amass enum -d [example.com] -src -ip```

# SYNOPSIS

**amass** _command_ [_options_]

# DESCRIPTION

**amass** is an OWASP project for in-depth attack surface mapping and asset discovery. It performs DNS enumeration, subdomain brute-forcing, and leverages numerous data sources including search engines, certificate transparency logs, and APIs.

The tool builds a comprehensive map of an organization's external network footprint, identifying subdomains, related domains, and network blocks.

# PARAMETERS

**enum**
> Perform enumeration and network mapping

**intel**
> Collect intelligence on target organization

**track**
> Track changes to discovered infrastructure

**db**
> Manage the graph database

**viz**
> Visualize collected data

**-d** _domain_
> Target domain

**-passive**
> Only use passive data sources (no DNS queries)

**-active**
> Use active methods including DNS brute-forcing

**-ip**
> Show IP addresses of discovered names

**-src**
> Show source of each discovered name

**-brute**
> Enable subdomain brute-forcing

**-o** _file_
> Output file path

**-dir** _path_
> Directory for output files

**-config** _file_
> Configuration file

# CAVEATS

Active enumeration generates significant DNS traffic and may be detected. Many data sources require API keys for full access. Results vary based on configured sources.

# HISTORY

**amass** was created by Jeff Foley and became an official OWASP project. It gained widespread adoption in the security community for reconnaissance and bug bounty hunting.

# SEE ALSO

[subfinder](/man/subfinder)(1), [dnsenum](/man/dnsenum)(1), [nmap](/man/nmap)(1)
