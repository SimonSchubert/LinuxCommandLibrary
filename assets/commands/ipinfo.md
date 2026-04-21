# TAGLINE

official command-line client for the IPinfo API

# TLDR

**Look up your own IP address**

```ipinfo myip```

**Look up details for a specific IP address**

```ipinfo [8.8.8.8]```

**Look up ASN information**

```ipinfo [AS15169]```

**Bulk lookup** multiple IPs or CIDR ranges

```ipinfo bulk [1.1.1.0/30] [8.8.8.8]```

**Extract a specific field** (city, country, org, hostname, etc.)

```ipinfo [8.8.8.8] -f [city]```

**Output in CSV format**

```cat ips.txt | ipinfo -c```

**Authenticate with an API token** for higher rate limits

```ipinfo init [your_token]```

**Summarize details for a list of IPs**

```cat ips.txt | ipinfo summarize```

# SYNOPSIS

**ipinfo** [_command_] [_IP_|_ASN_] [_options_]

# PARAMETERS

**init** _token_
> Save an API token for authenticated requests.

**myip**
> Look up details for your own IP address.

**bulk** _ips_
> Process multiple IPs or CIDR ranges.

**summarize** _ips_
> Produce a summary report for a list of IPs.

**-f**, **--field** _FIELD_
> Return only the specified field (e.g., ip, city, region, country, org, hostname).

**-c**, **--csv**
> Output results in CSV format.

**--nocolor**
> Disable colored output (or set the `NO_COLOR` environment variable).

**--token** _TOKEN_
> Pass an API token for this invocation.

**completion**
> Generate shell completions (bash, zsh, fish).

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**ipinfo** is the official command-line client for the IPinfo.io API. It returns IP intelligence data including geographic location, ISP, organization, ASN, hostname, and abuse contact information.

The tool accepts IP addresses (IPv4/IPv6), ASNs, and CIDR ranges. Multiple inputs can be queried at once or piped in from another command. Output can be rendered as human-readable text, JSON, or CSV, and specific fields can be extracted for use in scripts.

The CLI ships with several helper binaries such as **grepip**, **prips**, **cidr2range**, **cidr2ip**, **range2cidr**, and **mmdb** for working with IP lists and MMDB databases.

# CAVEATS

Requires internet connectivity to reach ipinfo.io. Anonymous requests are heavily rate-limited; register for a free token via `ipinfo init` for higher quotas. Private, reserved, and multicast addresses cannot be geolocated. Geolocation accuracy varies by region and network type.

# HISTORY

Developed by **IPinfo.io**, a geolocation data provider founded in **2013**. The CLI is written in Go and wraps the same public API used by the web service.

# SEE ALSO

[curl](/man/curl)(1), [whois](/man/whois)(1), [dig](/man/dig)(1), [jq](/man/jq)(1)
