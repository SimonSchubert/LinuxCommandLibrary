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

```ini
# /etc/systemd/resolved.conf
[Resolve]
DNS=8.8.8.8 8.8.4.4
FallbackDNS=1.1.1.1 1.0.0.1
Domains=~.
DNSSEC=yes
DNSOverTLS=opportunistic
Cache=yes
DNSStubListener=yes
```

# OPTIONS

```ini
DNS=           # DNS servers
FallbackDNS=   # Fallback servers
Domains=       # Search domains
DNSSEC=        # DNSSEC validation (yes/no/allow-downgrade)
DNSOverTLS=    # DoT (yes/no/opportunistic)
Cache=         # Enable caching
DNSStubListener= # Local stub resolver
```

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
