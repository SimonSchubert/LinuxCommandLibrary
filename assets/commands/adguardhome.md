# TLDR

**Start** AdGuard Home

```sudo adguardhome -s start```

**Install** as a system service

```sudo adguardhome -s install```

**Uninstall** the system service

```sudo adguardhome -s uninstall```

Check service **status**

```sudo adguardhome -s status```

Start with **custom config**

```adguardhome -c [/path/to/config.yaml]```

# SYNOPSIS

**adguardhome** [_-c config_] [_-w workdir_] [_-h host_] [_-p port_] [_-s command_]

# DESCRIPTION

**AdGuard Home** is a network-wide software for blocking ads, tracking, and malicious domains. It operates as a DNS server, filtering requests based on blocklists and custom rules before forwarding legitimate queries upstream.

The application provides a web interface for configuration and statistics, supports DNS-over-HTTPS, DNS-over-TLS, and DNS-over-QUIC, and can replace your router's DHCP server.

# PARAMETERS

**-s** _command_
> Service control: start, stop, restart, status, install, uninstall

**-c** _path_
> Path to configuration file

**-w** _path_
> Path to working directory

**-h** _host_
> Web interface bind host

**-p** _port_
> Web interface bind port

**--no-check-update**
> Don't check for updates

**--pidfile** _path_
> Path to PID file

**--verbose**
> Enable verbose logging

# CAVEATS

Running as a DNS server requires port 53, which may conflict with systemd-resolved or other DNS services. First-time setup requires accessing the web interface to complete configuration.

# HISTORY

**AdGuard Home** was developed by AdGuard Software Limited, first released in **2018** as an open-source network-wide ad blocker. It was designed as a self-hosted alternative to Pi-hole with additional features like encrypted DNS protocols.

# SEE ALSO

[pihole](/man/pihole)(1), [dnsmasq](/man/dnsmasq)(8), [unbound](/man/unbound)(8)
