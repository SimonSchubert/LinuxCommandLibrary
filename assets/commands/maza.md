# TAGLINE

local ad blocker that works by modifying /etc/hosts

# TLDR

**Enable ad blocking**

```sudo maza start```

**Disable ad blocking**

```sudo maza stop```

**Update blocklist**

```sudo maza update```

**Show status**

```sudo maza status```

Check that an ad domain is **blocked**

```curl googleadservices.com```

# SYNOPSIS

**maza** **start** | **stop** | **update** | **status** | **--help**

# PARAMETERS

**start**
> Download the blocklist and add it to /etc/hosts (same as **update**).

**stop**
> Remove the Maza block from /etc/hosts and empty the generated dnsmasq list.

**update**
> Download the latest blocklist, apply ignore and custom lists, and rewrite the Maza block in /etc/hosts.

**status**
> Show whether blocking is enabled.

**--help**
> Show usage.

# DESCRIPTION

**maza** is a local ad blocker written in Bash that works by modifying /etc/hosts. It points advertising and tracking domains to 127.0.0.1, so connections to them fail in every browser and application on the system.

By default it downloads Peter Lowe's (pgl.yoyo.org) ad server list. Another list, such as Steven Black's hosts file, can be used by setting **URL_DNS_LIST_CUSTOM** at the top of the script. Blocked entries are written between Maza start and end markers, so **stop** removes them without touching the rest of the hosts file.

# CONFIGURATION

**~/.config/maza/ignore**
> Domains never to block (one per line). Created with safe defaults such as localhost.

**~/.config/maza/custom-domains**
> Extra domains to block (one per line).

**~/.config/maza/dnsmasq.conf**
> Generated list in dnsmasq format (address=/domain/127.0.0.1), for use with a local dnsmasq server to also block subdomains.

When run with sudo, the configuration directory is that of root (**/root/.config/maza/**). Run **maza update** after editing these files.

# CAVEATS

Requires root/sudo access, Bash 4+ and curl (macOS also needs GNU sed as gsed). The hosts file does not support wildcards, so subdomains are only blocked through the dnsmasq output. It does not back up /etc/hosts; the author recommends copying it first. Cannot block ads served from the same domain as content. Browsers using DNS over HTTPS may bypass the hosts file.

# HISTORY

**maza** was created in **2020** by **Andros Fenollosa** as a simple, local Bash alternative to Pi-hole. It reached the top of Hacker News shortly after release.

# SEE ALSO

[pihole](/man/pihole)(1), [hosts](/man/hosts)(5), [hostctl](/man/hostctl)(1), [dnsmasq](/man/dnsmasq)(8), [unbound](/man/unbound)(8)

# RESOURCES

```[Source code](https://github.com/tanrax/maza-ad-blocking)```

```[Homepage](https://maza-ad-blocking.andros.dev/)```

<!-- verified: 2026-09-29 -->
