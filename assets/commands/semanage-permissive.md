# TAGLINE

Manage per-domain SELinux permissive mode

# TLDR

**List** all process types in permissive mode

```sudo semanage permissive -l```

**Set** permissive mode for a domain

```sudo semanage permissive -a [httpd_t]```

**Unset** permissive mode for a domain

```sudo semanage permissive -d [httpd_t]```

# SYNOPSIS

**semanage permissive** [**-l**|**-a**|**-d**] [_domain_]

# PARAMETERS

**-l, --list**
> List all domains in permissive mode

**-a, --add**
> Add a domain to permissive mode

**-d, --delete**
> Remove a domain from permissive mode

# DESCRIPTION

**semanage permissive** manages per-domain permissive mode in SELinux. When a domain is set to permissive, SELinux logs policy violations but does not enforce them for processes in that domain.

This provides more granular control than global permissive mode (**setenforce 0**), allowing specific services to be unconfined while the rest of the system remains in enforcing mode.

# CAVEATS

Permissive domains are effectively unconfined and should only be used for troubleshooting. For production systems, configure proper SELinux policy rules instead of leaving domains in permissive mode. Requires root privileges.

# SEE ALSO

[semanage](/man/semanage)(8), [setenforce](/man/setenforce)(8), [getenforce](/man/getenforce)(8), [audit2allow](/man/audit2allow)(1)
