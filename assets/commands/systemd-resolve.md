# TLDR

**View** documentation for the renamed command

```tldr resolvectl```

# SYNOPSIS

**systemd-resolve** [_options_] [_hostname_|_address_|_record_]

# DESCRIPTION

**systemd-resolve** has been renamed to **resolvectl** in newer versions of systemd. The functionality for resolving domain names, IPv4/IPv6 addresses, DNS resource records, and services is now provided by the resolvectl command.

# CAVEATS

This command is deprecated. Use **resolvectl** instead for DNS resolution and management of systemd-resolved.

# SEE ALSO

[resolvectl](/man/resolvectl)(1), [systemd-resolved](/man/systemd-resolved)(8)
