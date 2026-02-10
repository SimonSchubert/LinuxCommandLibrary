# TAGLINE

resolves DNS keys for the kernel keyring

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

**key.dns_resolver** is a Linux kernel utility that resolves DNS security keys and stores them in the kernel keyring. It is primarily used for DNSSEC validation, fetching DNSKEY and DS records from DNS servers and making them available to kernel subsystems that need to verify the authenticity of DNS responses.

The tool operates as a helper program invoked by the kernel's key management facility (request-key) rather than being called directly by users in most cases. When the kernel needs a DNS key for authentication purposes, it triggers key.dns_resolver to perform the lookup and populate the keyring automatically. This mechanism supports DNS-based authentication of named entities (DANE) and other security protocols that rely on cryptographic keys published in DNS.

# CAVEATS

Kernel keyring integration. DNSSEC infrastructure required. Linux-specific.

# HISTORY

key.dns_resolver is part of the **Linux kernel** keyring utilities, supporting DNS-based key resolution for DNSSEC.

# SEE ALSO

[keyctl](/man/keyctl)(1), [dig](/man/dig)(1), [dnssec-keygen](/man/dnssec-keygen)(8)
