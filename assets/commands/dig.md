# TLDR

**Query** DNS

```dig [example.com]```

**Specific** record type

```dig [example.com] [A]```

**Short** answer

```dig [example.com] +short```

**Reverse** lookup

```dig -x [8.8.8.8]```

**Query** specific nameserver

```dig [@8.8.8.8] [example.com]```

# SYNOPSIS

**dig** [_@server_] [_name_] [_type_]

# DESCRIPTION

**dig** (Domain Information Groper) is a DNS lookup utility. It queries DNS servers for various record types, provides detailed responses, and is the preferred tool for DNS troubleshooting and analysis.

The command has largely replaced older tools like nslookup.

# PARAMETERS

**@**_server_
> Query specific DNS server

**+short**
> Brief output (just answer)

**+noall +answer**
> Show only answer section

**-x** _ip_
> Reverse lookup

**-t** _type_
> Record type (A, AAAA, MX, NS, etc.)

**+trace**
> Trace DNS delegation path

**+dnssec**
> Request DNSSEC records

**-4** / **-6**
> Use IPv4 / IPv6 only

# RECORD TYPES

**A**
> IPv4 address

**AAAA**
> IPv6 address

**MX**
> Mail exchange

**NS**
> Name servers

**TXT**
> Text records

**CNAME**
> Canonical name (alias)

**SOA**
> Start of authority

**PTR**
> Reverse lookup pointer

**SRV**
> Service locator

**ANY**
> All available records

# WORKFLOW

```bash
# Basic lookup (A record)
dig example.com

# Specific record type
dig example.com MX
dig example.com AAAA

# Short answer only
dig example.com +short

# Multiple queries
dig example.com A AAAA MX

# Query specific DNS server
dig @8.8.8.8 example.com
dig @1.1.1.1 example.com

# Reverse lookup
dig -x 8.8.8.8

# Trace delegation
dig example.com +trace

# Show only answer
dig example.com +noall +answer

# Query all records
dig example.com ANY
```

# DNS SERVERS

Common public DNS:
- **8.8.8.8** - Google DNS
- **1.1.1.1** - Cloudflare DNS
- **9.9.9.9** - Quad9

# ADVANCED QUERIES

```bash
# Check DNSSEC
dig example.com +dnssec

# Query specific port
dig -p 5353 example.com

# Batch file queries
dig -f domains.txt

# TCP instead of UDP
dig +tcp example.com

# Show query time
dig example.com +stats
```

# OUTPUT SECTIONS

**QUESTION** - Query sent
**ANSWER** - Response records
**AUTHORITY** - Authoritative nameservers
**ADDITIONAL** - Additional information

# CAVEATS

Requires network connectivity. Default uses system DNS. Complex output for beginners. Some ISPs intercept DNS. DNSSEC validation requires proper setup. Large queries may timeout.

# HISTORY

**dig** was developed by Steve Hotz and Paul Mockapetris in the late **1980s**, becoming part of BIND and the standard DNS debugging tool.

# SEE ALSO

[host](/man/host)(1), [nslookup](/man/nslookup)(1), [drill](/man/drill)(1)
