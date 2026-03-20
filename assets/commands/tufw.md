# TAGLINE

Terminal UI for UFW firewall management

# TLDR

**Launch the firewall management TUI**

```sudo tufw```

# SYNOPSIS

**sudo tufw**

# DESCRIPTION

**tufw** wraps the Uncomplicated Firewall (UFW) in a terminal-based interface with dropdown menus and form-based rule editing. Every action translates into regular UFW commands behind the scenes. It works perfectly over SSH connections.

# CAVEATS

Must be run as root.

# HISTORY

**tufw** was created by **Thomas Pellegatta** (peltho) and is written in **Go**.

# SEE ALSO

[ufw](/man/ufw)(8), [iptables](/man/iptables)(8), [firewalld](/man/firewalld)(1)
