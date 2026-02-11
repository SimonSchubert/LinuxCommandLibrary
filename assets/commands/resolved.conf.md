# TAGLINE

Configure systemd-resolved DNS resolver

# TLDR

**Edit resolved configuration**

```sudo vi /etc/systemd/resolved.conf```

**Restart resolved**

```sudo systemctl restart systemd-resolved```

**Check status**

```resolvectl status```

# SYNOPSIS

**/etc/systemd/resolved.conf** configuration file

# DESCRIPTION

**resolved.conf** configures systemd-resolved, the system DNS resolver service. It manages DNS servers, DNSSEC, DNS-over-TLS, and caching.

# CONFIGURATION

**/etc/systemd/resolved.conf**
> Main configuration file for systemd-resolved, using INI format under a **[Resolve]** section.

**DNS=**
> Space-separated list of DNS server addresses to use for name resolution.

**FallbackDNS=**
> Fallback DNS servers used when no other servers are configured.

**Domains=**
> Search domains and routing domains. Use **~.** to route all queries through the configured DNS servers.

**DNSSEC=**
> DNSSEC validation mode: **yes**, **no**, or **allow-downgrade**.

**DNSOverTLS=**
> DNS-over-TLS mode: **yes**, **no**, or **opportunistic**.

**Cache=**
> Enable or disable the DNS response cache.

**DNSStubListener=**
> Controls the local stub resolver listener on 127.0.0.53.

# EXAMPLES

```bash
# Use Cloudflare DNS
sudo sed -i 's/#DNS=/DNS=1.1.1.1 1.0.0.1/' /etc/systemd/resolved.conf

# Enable DNS-over-TLS
sudo sed -i 's/#DNSOverTLS=/DNSOverTLS=yes/' /etc/systemd/resolved.conf

# Restart
sudo systemctl restart systemd-resolved

# Check status
resolvectl status
```

# CAVEATS

Requires systemd-resolved running. May conflict with NetworkManager DNS. Changes need service restart.

# HISTORY

systemd-resolved was introduced in **systemd 213** as an integrated DNS resolver service.

# SEE ALSO

[systemd-resolved](/man/systemd-resolved)(8), [resolvectl](/man/resolvectl)(1), [resolved.conf](/man/resolved.conf)(5)
