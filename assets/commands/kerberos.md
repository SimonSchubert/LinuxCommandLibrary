# TAGLINE

network authentication protocol

# TLDR

**Get ticket**

```kinit [principal]```

**List tickets**

```klist```

**Destroy tickets**

```kdestroy```

**Change password**

```kpasswd```

**Request a forwardable ticket** valid for 10 hours

```kinit -f -l [10h] [user@EXAMPLE.COM]```

**Renew ticket**

```kinit -R```

**Get a ticket from a keytab** (non-interactive, for services and scripts)

```kinit -k -t [/path/to/file.keytab] [principal]```

**List keys in a keytab**

```klist -k [/etc/krb5.keytab]```

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

**kinit -f**
> Request a forwardable ticket (needed for delegation, e.g. SSH GSSAPI forwarding).

**kinit -R**
> Renew an existing renewable ticket.

**kinit -l** _LIFETIME_
> Requested ticket lifetime (e.g. **10h**, **1d**); capped by KDC policy.

**kinit -k** [**-t** _KEYTAB_]
> Authenticate with a key from a keytab instead of a password.

**klist -k**
> List the keys in a keytab instead of the credential cache.

# DESCRIPTION

**Kerberos** is a network authentication protocol. Clients receive a time-limited Ticket-Granting Ticket (TGT) from a Key Distribution Center (KDC) after presenting credentials, then exchange the TGT for service tickets to access individual network services. All authentication exchanges are encrypted, and the user's password never traverses the network after the initial **kinit**.

The user-facing CLI is built around four small commands: **kinit** (request a TGT), **klist** (inspect the credential cache), **kdestroy** (clear cached tickets), and **kpasswd** (change the password held by the KDC). Service tickets are obtained transparently by Kerberos-aware applications (SSH, NFSv4, HTTP via SPNEGO, LDAP, SMB).

# CONFIGURATION

**/etc/krb5.conf**
> Client configuration: realms, KDC addresses, default principal, forwardable flag, encryption types.

**/etc/krb5.keytab** (or **$KRB5_KTNAME**)
> Service-side keytab containing long-term keys for daemon principals.

**$KRB5CCNAME**
> Path or backend for the credentials cache (e.g. **FILE:/tmp/krb5cc_$UID**, **KEYRING:persistent:$UID**, **KCM:**).

# CAVEATS

Clocks between client, KDC, and target service must agree to within a few minutes (default skew: 5 minutes), otherwise requests fail with **Clock skew too great**. Service principals are derived from host names, so wrong DNS names or mismatched reverse DNS commonly cause **Server not found in Kerberos database**. Realm names are case-sensitive and conventionally uppercase.

# HISTORY

Kerberos was developed at **MIT** as part of **Project Athena** in the 1980s; version 4 was published in 1989. **Kerberos v5** was first specified in RFC 1510 (1993) and is now defined by RFC 4120 (2005); v4 is obsolete and removed from modern Linux distributions. The two interoperable implementations in widespread use are **MIT Kerberos** and **Heimdal**.

# SEE ALSO

[kinit](/man/kinit)(1), [smbclient](/man/smbclient)(1), [ldapsearch](/man/ldapsearch)(1)

# RESOURCES

```[Homepage](https://web.mit.edu/kerberos/)```

```[Source code](https://github.com/krb5/krb5)```

```[Documentation](https://web.mit.edu/kerberos/krb5-latest/doc/)```

<!-- verified: 2026-11-23 -->
