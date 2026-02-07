# TAGLINE

DNS zone validator and debugger

# TLDR

**Check DNS zone** for errors

```dnswalk [domain.com.]```

**Check with verbose** output

```dnswalk -r [domain.com.]```

**Check specific zone** file

```dnswalk -l [domain.com.]```

**Debug mode**

```dnswalk -d [domain.com.]```

**Force zone transfer** attempt

```dnswalk -F [domain.com.]```

# SYNOPSIS

**dnswalk** [_options_] _domain_

# PARAMETERS

_DOMAIN_
> Domain to check (must end with dot).

**-r**
> Recursively descend subdomains.

**-l**
> Check lame delegations.

**-d**
> Debug mode (verbose).

**-F**
> Force zone transfer even if normally blocked.

**-i**
> Suppress check of invalid characters.

**-a**
> Turn on all warning flags.

**--help**
> Display help information.

# DESCRIPTION

**dnswalk** is a DNS debugger that checks zone configurations for common errors and inconsistencies. It performs zone transfers and analyzes the resulting data for problems like lame delegations, missing PTR records, and invalid data.

The tool identifies issues including orphaned CNAME records, duplicate A records, missing reverse entries, and records pointing to non-existent hosts. It helps DNS administrators maintain zone health and catch configuration errors.

dnswalk traverses the zone hierarchy, optionally recursing into subdomains to provide comprehensive validation of DNS infrastructure.

# CAVEATS

Requires zone transfer access (often restricted). Domain name must end with trailing dot. May report false positives on valid but unusual configurations. Perl dependencies required.

# HISTORY

dnswalk was written by **David Barr** in the early 1990s as a DNS debugging and maintenance tool. It remains useful for validating zone configurations and has been included in DNS administrator toolkits for decades.

# SEE ALSO

[dig](/man/dig)(1), [named-checkzone](/man/named-checkzone)(8), [nslookup](/man/nslookup)(1)
