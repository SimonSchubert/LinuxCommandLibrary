# TAGLINE

display DNS domain name

# TLDR

Show the system's **DNS domain name**

```dnsdomainname```

# SYNOPSIS

**dnsdomainname**

# DESCRIPTION

**dnsdomainname** displays the DNS domain name portion of the system's fully qualified domain name (FQDN). It uses gethostname() to retrieve the hostname, then getaddrinfo() to resolve it to the canonical name via DNS lookup.

The domain name is extracted as everything after the first dot in the FQDN. For example, if the FQDN is "server.example.com", dnsdomainname returns "example.com". This differs from tools like domainname which display the NIS/YP domain. The command requires proper DNS configuration and name resolution to work correctly. If the system hostname doesn't include a domain component or DNS resolution fails, it returns an empty result.

# CAVEATS

Returns empty if the system hostname doesn't include a domain name or DNS resolution fails. Requires proper DNS configuration.

# SEE ALSO

[hostname](/man/hostname)(1), [domainname](/man/domainname)(1), [hostnamectl](/man/hostnamectl)(1)
