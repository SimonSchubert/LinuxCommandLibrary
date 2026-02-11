# TAGLINE

Uncomplicated Firewall management interface

# TLDR

**Enable** ufw

```sudo ufw enable```

**Disable** ufw

```sudo ufw disable```

Show **rules** with numbers

```sudo ufw status numbered```

**Allow** incoming traffic on a port

```sudo ufw allow 5432 comment "Service"```

Allow **TCP traffic** from specific IP

```sudo ufw allow proto tcp from 192.168.0.4 to any port 22```

**Deny** traffic on a port

```sudo ufw deny 80```

Deny **UDP** traffic on port range

```sudo ufw deny proto udp from any to any port 8412:8500```

**Delete** a rule by number

```sudo ufw delete rule_number```

# SYNOPSIS

**ufw** [_--dry-run_] _command_ [_rule_]

# DESCRIPTION

**ufw** (Uncomplicated Firewall) is a frontend for iptables designed to make firewall configuration easier. It provides a user-friendly interface for managing netfilter firewall rules while supporting both simple and complex rule specifications.

# PARAMETERS

**enable**
> Enable the firewall and load rules on boot

**disable**
> Disable the firewall and unload rules

**reload**
> Reload the firewall configuration

**reset**
> Reset to installation defaults

**status**
> Show firewall status and rules

**status verbose**
> Show detailed status with logging and default policies

**status numbered**
> Show rules with line numbers for deletion

**--dry-run**
> Show changes without applying them

**--force**
> Execute without confirmation prompts

# RULE COMMANDS

**allow**
> Permit matching traffic

**deny**
> Block matching traffic silently

**reject**
> Block matching traffic and notify sender

**limit**
> Rate-limit connections (blocks after 6+ attempts in 30 seconds)

**delete**
> Remove a rule by specification or number

**insert NUM**
> Add rule at specified position

**prepend**
> Add rule before all others of same IP type

# RULE SYNTAX

**Simple**: ufw allow 22/tcp
**With comment**: ufw allow 80 comment 'HTTP'
**Port range**: ufw allow 6000:6007/tcp
**Multiple ports**: ufw allow 80,443/tcp
**From address**: ufw allow from 192.168.1.0/24
**Full syntax**: ufw allow proto tcp from any to any port 80

# LOGGING

**logging off**
> Disable logging

**logging on**
> Enable logging (low level)

**logging low|medium|high|full**
> Set logging verbosity level

# CONFIGURATION

**/etc/ufw/ufw.conf**
> Main configuration file controlling enable/disable state, logging level, and IPv6 support.

**/etc/ufw/before.rules**
> Custom iptables rules applied before ufw-managed rules.

**/etc/ufw/after.rules**
> Custom iptables rules applied after ufw-managed rules.

**/etc/default/ufw**
> Default policy settings and input/output/forward policy configuration.

# CAVEATS

Default policies are deny incoming, allow outgoing, deny forwarding. Enabling ufw may disrupt existing connections if rules are not configured first. Use **--dry-run** to preview changes before applying.

# HISTORY

**ufw** was developed by Canonical for Ubuntu to simplify iptables firewall management. It was first released in Ubuntu 8.04 (2008) and has become a popular firewall tool across many Linux distributions.

# SEE ALSO

[iptables](/man/iptables)(8), [ip6tables](/man/ip6tables)(8), [ufw-framework](/man/ufw-framework)(8)
