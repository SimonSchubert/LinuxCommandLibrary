# TAGLINE

obtains Kerberos tickets from the Key Distribution Center

# TLDR

**Get Kerberos ticket**

```kinit [username]```

**Get ticket for specific principal**

```kinit [username@REALM]```

**Specify keytab file**

```kinit -k -t [keytab.file] [principal]```

**Get forwardable ticket**

```kinit -f [username]```

**Set ticket lifetime**

```kinit -l [1h] [username]```

**Renew existing ticket**

```kinit -R```

# SYNOPSIS

**kinit** [_options_] [_principal_]

# DESCRIPTION

**kinit** obtains Kerberos tickets from the Key Distribution Center (KDC). The ticket-granting ticket (TGT) enables authentication to Kerberos-protected services without repeated password entry.

The tool is essential for Kerberos authentication in enterprise environments, accessing services like NFS, SSH, and Active Directory.

# PARAMETERS

**-k**
> Use keytab file.

**-t** _keytab_
> Keytab file path.

**-l** _lifetime_
> Ticket lifetime.

**-r** _lifetime_
> Renewable lifetime.

**-f**
> Get forwardable ticket.

**-F**
> Non-forwardable ticket.

**-p**
> Get proxiable ticket.

**-R**
> Renew existing ticket.

**-c** _cache_
> Credentials cache.

**-S** _service_
> Service principal.

# CAVEATS

Requires KDC access. Tickets expire and need renewal. Keytabs need protection. Clock sync required.

# HISTORY

**kinit** is part of **MIT Kerberos** and **Heimdal** implementations. Kerberos was developed at **MIT** in the **1980s** as part of Project Athena, named after the three-headed dog guarding Hades in Greek mythology.

# SEE ALSO

[klist](/man/klist)(1), [kdestroy](/man/kdestroy)(1), [kpasswd](/man/kpasswd)(1), [krb5.conf](/man/krb5.conf)(5)
