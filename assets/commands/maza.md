# TAGLINE

local ad blocker that works by modifying /etc/hosts

# TLDR

**Enable ad blocking**

```maza start```

**Disable ad blocking**

```maza stop```

**Update blocklist**

```maza update```

**Show status**

```maza status```

# SYNOPSIS

**maza** [_start_] [_stop_] [_update_] [_status_]

# PARAMETERS

**start**
> Enable ad blocking.

**stop**
> Disable ad blocking.

**update**
> Update the blocklist.

**status**
> Show current status.

# DESCRIPTION

**maza** is a local ad blocker that works by modifying /etc/hosts. It redirects advertising and tracking domains to 127.0.0.1, preventing connections.

The tool downloads blocklists from sources like Steven Black's hosts project, which aggregates multiple sources. Updates fetch the latest lists.

Start mode backs up the existing hosts file and appends blocking entries. Stop mode restores the original hosts file, removing all blocks.

This approach works system-wide, blocking ads in all applications, not just browsers. It's lightweight with no daemon or browser extension required.

DNS caching may delay changes taking effect. Flushing the DNS cache or restarting network services speeds up propagation.

# CAVEATS

Requires root/sudo access. Large hosts files may slow DNS resolution slightly. Some sites detect ad blocking. Can't block ads served from same domain as content. VPNs may bypass hosts file.

# HISTORY

**maza** was created around **2019** as a simple shell script alternative to Pi-hole and other ad-blocking solutions. It provides basic functionality without requiring additional services or infrastructure.

# SEE ALSO

[pihole](/man/pihole)(1), [dnsmasq](/man/dnsmasq)(8), [unbound](/man/unbound)(8)
