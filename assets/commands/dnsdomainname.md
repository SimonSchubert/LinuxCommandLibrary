# TLDR

Show the system's **DNS domain name**

```dnsdomainname```

# SYNOPSIS

**dnsdomainname**

# DESCRIPTION

**dnsdomainname** displays the DNS domain name portion of the system's fully qualified domain name (FQDN). It uses gethostname() to get the hostname and getaddrinfo() to resolve it to a canonical name.

The domain name is the part after the first dot in the FQDN.

# CAVEATS

Returns empty if the system hostname doesn't include a domain name or DNS resolution fails. Requires proper DNS configuration.

# SEE ALSO

[hostname](/man/hostname)(1), [domainname](/man/domainname)(1), [hostnamectl](/man/hostnamectl)(1)
