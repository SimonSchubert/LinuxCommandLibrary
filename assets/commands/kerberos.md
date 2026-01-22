# TLDR

**Get ticket**

```kinit [principal]```

**List tickets**

```klist```

**Destroy tickets**

```kdestroy```

**Change password**

```kpasswd```

**Forward ticket**

```kinit -f [principal]```

**Renew ticket**

```kinit -R```

# SYNOPSIS

Kerberos commands: **kinit**, **klist**, **kdestroy**, **kpasswd**

# PARAMETERS

**kinit** _PRINCIPAL_
> Get Kerberos ticket.

**klist**
> List cached tickets.

**kdestroy**
> Destroy tickets.

**kpasswd**
> Change Kerberos password.

**-f**
> Get forwardable ticket.

**-R**
> Renew existing ticket.

**-l** _LIFETIME_
> Ticket lifetime.

# DESCRIPTION

**Kerberos** is a network authentication protocol. It uses tickets to authenticate users and services.

The protocol provides single sign-on across networked services. Common commands include kinit, klist, and kdestroy.

Kerberos authenticates via tickets.

# CAVEATS

Requires KDC infrastructure. Time synchronization critical. Network configuration needed.

# HISTORY

Kerberos was developed at **MIT** as part of Project Athena. Version 5 is the current standard.

# SEE ALSO

[kinit](/man/kinit)(1), [klist](/man/klist)(1), [kdestroy](/man/kdestroy)(1), [kpasswd](/man/kpasswd)(1)
