# TAGLINE

Real-time TUI monitor for InfiniBand networks

# TLDR

**Launch ibtop** to monitor InfiniBand ports

```ibtop```

# SYNOPSIS

**ibtop** [_options_]

# DESCRIPTION

**ibtop** is a terminal-based real-time monitor for **InfiniBand** high-speed interconnects, similar to htop but for network fabric monitoring. It displays live port statistics including throughput, packet rates, and errors with continuous updates. The interface is built with **Ratatui** for a modern TUI experience.

# CAVEATS

Only useful on systems with InfiniBand hardware. Requires appropriate permissions to read InfiniBand port counters.

# HISTORY

**ibtop** was created by **JannikSt** and is written in **Rust**.

# SEE ALSO

[htop](/man/htop)(1), [ibstat](/man/ibstat)(8)
