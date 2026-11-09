# TAGLINE

Configure systemd-resolved DNS resolver

# TLDR

**Edit resolved configuration**

```sudo vi /etc/systemd/resolved.conf```

**Create a drop-in directory** (preferred over editing the main file)

```sudo mkdir -p /etc/systemd/resolved.conf.d```

**Restart resolved**

```sudo systemctl restart systemd-resolved```

**Check status**

```resolvectl status```

# SYNOPSIS

**/etc/systemd/resolved.conf**, **/run/systemd/resolved.conf**, **/usr/local/lib/systemd/resolved.conf**, **/usr/lib/systemd/resolved.conf**, **/etc/systemd/resolved.conf.d/\*.conf**

# DESCRIPTION

**resolved.conf** configures systemd-resolved, the system DNS resolver service. It manages DNS servers, DNSSEC, DNS-over-TLS, and caching. Only the first main file found in the listed directories is used, and drop-ins in **resolved.conf.d/** override it.

# CONFIGURATION

**/etc/systemd/resolved.conf**
> Main configuration file for systemd-resolved, using INI format under a **[Resolve]** section.

**DNS=**
> Space-separated list of DNS server addresses to use for name resolution. Each may include a port, interface and SNI name, as in **1.1.1.1:53%eth0#example.com**.

**FallbackDNS=**
> Fallback DNS servers used when no other servers are configured.

**Domains=**
> Search domains and routing domains. Use **~.** to route all queries through the configured DNS servers.

**DNSSEC=**
> DNSSEC validation mode: **yes**, **no**, or **allow-downgrade**.

**DNSOverTLS=**
> DNS-over-TLS mode: **yes**, **no**, or **opportunistic**.

**LLMNR=**
> Link-Local Multicast Name Resolution: **yes**, **no**, or **resolve** (resolve only, do not respond).

**MulticastDNS=**
> Multicast DNS: **yes**, **no**, or **resolve** (resolve only, do not respond).

**Cache=**
> DNS response cache: **yes** (default), **no**, or **no-negative** (cache positive answers only).

**DNSStubListener=**
> Local stub resolver on 127.0.0.53 and 127.0.0.54, port 53: **yes** (default), **no**, **udp**, or **tcp**.

**DNSStubListenerExtra=**
> Additional address to listen on, optionally with protocol and port. Can be given multiple times.

**ReadEtcHosts=**
> Whether to answer from **/etc/hosts** before querying DNS servers (default: **yes**).

# EXAMPLES

```bash
# Use a drop-in with Cloudflare DNS over TLS
sudo mkdir -p /etc/systemd/resolved.conf.d
printf '[Resolve]\nDNS=1.1.1.1#cloudflare-dns.com\nDNSOverTLS=yes\n' | sudo tee /etc/systemd/resolved.conf.d/dns.conf

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

[systemd-resolve](/man/systemd-resolve)(1), [resolvectl](/man/resolvectl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/resolved.conf.html)```

<!-- verified: 2026-11-09 -->
