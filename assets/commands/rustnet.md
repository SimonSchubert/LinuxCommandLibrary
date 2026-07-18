# TAGLINE

Per-process network monitor with deep packet inspection

# TLDR

**Start** the interactive network TUI

```rustnet```

**Show help** / options

```rustnet --help```

# SYNOPSIS

**rustnet** [*options*]

# DESCRIPTION

**rustnet** is a terminal UI for live, per-process network activity on Linux/macOS/Windows. It attributes connections and traffic to processes and can perform deep packet inspection for richer protocol insight. Cross-platform and designed with sandboxing considerations for safer packet access.

# PARAMETERS

Most controls are interactive inside the TUI after launch. CLI flags select interface, refresh rate, and filter modes—see **rustnet --help** for the installed version.

Root or **CAP_NET_RAW** / packet-capture permissions may be required for full DPI.

# CAVEATS

Packet capture may need elevated privileges and can be sensitive on shared machines. Performance cost grows with traffic volume. Not a replacement for **wireshark** for deep forensic analysis.

# SEE ALSO

[ss](/man/ss)(8), [iftop](/man/iftop)(1), [nethogs](/man/nethogs)(8), [tcpdump](/man/tcpdump)(1)

# RESOURCES

```[Source code](https://github.com/domcyrus/rustnet)```

<!-- verified: 2026-07-19 -->
