# TAGLINE

extracts Active Directory information via LDAP, including users

# TLDR

Dump domain info with **credentials**

```ldapdomaindump -u domain\username -p password [hostname]```

Dump with **hostname resolution**

```ldapdomaindump -r -u domain\username -p password [hostname]```

Dump with **custom DNS server**

```ldapdomaindump -r -n [dns_ip] -u domain\username -p password [hostname]```

Dump to **specific directory** without JSON

```ldapdomaindump --no-json -o [path/to/dir] -u domain\username -p password [hostname]```

# SYNOPSIS

**ldapdomaindump** [_options_] **-u** _domain_\\_user_ **-p** _password_ _hostname_

# DESCRIPTION

**ldapdomaindump** extracts Active Directory information via LDAP, including users, computers, groups, operating systems, and group memberships. Output is generated in HTML, JSON, and greppable formats for analysis.

# PARAMETERS

**-u, --user DOMAIN\USER**
> Domain username for LDAP authentication

**-p, --password PASSWORD**
> Password or NTLM hash for authentication

**-r, --resolve**
> Resolve computer hostnames via DNS

**-n, --dns-server IP**
> DNS server for hostname resolution

**-o, --outdir PATH**
> Output directory for dump files

**--no-json**
> Skip JSON output generation

**--no-html**
> Skip HTML output generation

**--no-grep**
> Skip greppable output generation

# CAVEATS

Requires valid domain credentials. Designed for authorized security assessments and penetration testing only.

# SEE ALSO

[ldapsearch](/man/ldapsearch)(1), [bloodhound](/man/bloodhound)(1)
