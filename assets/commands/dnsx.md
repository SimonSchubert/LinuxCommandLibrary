# TLDR

**Resolve A records** for domains

```cat [domains.txt] | dnsx -a```

**Resolve multiple** record types

```cat [domains.txt] | dnsx -a -aaaa -mx -ns```

**Resolve with** custom resolver

```cat [domains.txt] | dnsx -r [8.8.8.8]```

**Output in JSON** format

```cat [domains.txt] | dnsx -json```

**Brute force subdomains**

```dnsx -d [domain.com] -w [wordlist.txt]```

**Reverse DNS** lookups

```cat [ips.txt] | dnsx -ptr```

**Rate limit requests**

```cat [domains.txt] | dnsx -rate-limit [100]```

# SYNOPSIS

**dnsx** [_options_]

# PARAMETERS

**-a**
> Query A records.

**-aaaa**
> Query AAAA records.

**-mx**
> Query MX records.

**-ns**
> Query NS records.

**-ptr**
> Query PTR records.

**-cname**
> Query CNAME records.

**-d** _DOMAIN_
> Target domain for subdomain brute force.

**-w** _FILE_
> Wordlist for brute force.

**-r** _RESOLVER_
> Custom DNS resolver.

**-json**
> Output in JSON format.

**-rate-limit** _N_
> Max queries per second.

**-help**
> Display help information.

# DESCRIPTION

**dnsx** is a fast, multi-purpose DNS toolkit designed for security reconnaissance. It runs DNS queries efficiently, supporting multiple record types, custom resolvers, and high-performance parallel execution.

The tool excels at bulk DNS operations including resolution, reverse lookups, and subdomain brute forcing. It accepts input from stdin, making it easy to integrate into reconnaissance pipelines with other tools.

dnsx supports wildcard filtering, retries, and various output formats. Its focus on performance makes it suitable for large-scale DNS enumeration tasks.

# CAVEATS

High query rates may trigger rate limiting or blocks. Only perform on authorized targets. Large wordlists consume time and may be detected. DNS responses may be cached or manipulated.

# HISTORY

dnsx was developed by **ProjectDiscovery**, creators of other security tools like nuclei and httpx. It was released as part of their open-source security toolkit to provide fast, reliable DNS operations for reconnaissance workflows.

# SEE ALSO

[dig](/man/dig)(1), [massdns](/man/massdns)(1), [shuffledns](/man/shuffledns)(1)
