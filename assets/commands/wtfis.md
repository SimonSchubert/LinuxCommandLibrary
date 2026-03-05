# TAGLINE

Passive hostname, domain and IP lookup tool

# TLDR

**Look up a domain**

```wtfis [example.com]```

**Look up an IP with Shodan enrichment**

```wtfis -s [8.8.8.8]```

**Enable all enrichments**

```wtfis -A [example.com]```

# SYNOPSIS

**wtfis** [_options_] _hostname_|_domain_|_IP_

# DESCRIPTION

**wtfis** gathers and presents information about domains, hostnames, and IP addresses using OSINT services like VirusTotal, IP2Whois, and Shodan in a colorized, human-readable format. It minimizes API calls to avoid hitting free-tier rate limits.

# HISTORY

**wtfis** was created by **pirxthepilot** (Joon) and is written in **Python**.

# SEE ALSO

[whois](/man/whois)(1), [nslookup](/man/nslookup)(1), [dig](/man/dig)(1)
