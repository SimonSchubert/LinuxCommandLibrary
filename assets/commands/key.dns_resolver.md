# TLDR

**Resolve DNS key**

```key.dns_resolver [domain]```

**Resolve DNSSEC key**

```key.dns_resolver -t DNSKEY [domain]```

# SYNOPSIS

**key.dns_resolver** [_options_] _domain_

# PARAMETERS

_DOMAIN_
> Domain to resolve key for.

**-t** _TYPE_
> Key type (DNSKEY, DS).

**--help**
> Display help information.

# DESCRIPTION

**key.dns_resolver** resolves DNS keys for the kernel keyring. It's used for DNSSEC validation.

The tool fetches DNSKEY records and adds them to the kernel keyring. It supports DNS-based authentication.

key.dns_resolver fetches DNS keys.

# CAVEATS

Kernel keyring integration. DNSSEC infrastructure required. Linux-specific.

# HISTORY

key.dns_resolver is part of the **Linux kernel** keyring utilities, supporting DNS-based key resolution for DNSSEC.

# SEE ALSO

[keyctl](/man/keyctl)(1), [dig](/man/dig)(1), [dnssec-keygen](/man/dnssec-keygen)(8)
