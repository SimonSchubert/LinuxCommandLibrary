# TLDR

**List certificates in database**

```certutil -L -d [~/.pki/nssdb]```

**Add certificate to database**

```certutil -A -n "[alias]" -t "CT,," -d [~/.pki/nssdb] -i [cert.pem]```

**Generate key pair**

```certutil -G -d [~/.pki/nssdb] -n "[keyname]"```

**Delete certificate**

```certutil -D -n "[alias]" -d [~/.pki/nssdb]```

**Create self-signed certificate**

```certutil -S -n "[alias]" -x -t "CT,," -d [~/.pki/nssdb] -s "CN=[hostname]"```

**Display certificate details**

```certutil -L -d [~/.pki/nssdb] -n "[alias]"```

# SYNOPSIS

**certutil** [_options_]

# DESCRIPTION

**certutil** manages keys and certificates in NSS databases. Creates, modifies, lists, and deletes certificates. Used by Firefox, Thunderbird, and other NSS-based applications.

# PARAMETERS

**-A**
> Add certificate to database

**-D**
> Delete certificate from database

**-L**
> List certificates

**-G**
> Generate new key pair

**-S**
> Create and add self-signed certificate

**-R**
> Generate certificate request

**-C**
> Create certificate from request

**-K**
> List keys in database

**-d** _dir_
> Database directory (use sql: prefix for SQLite)

**-n** _name_
> Certificate nickname/alias

**-t** _trust_
> Trust flags (e.g., "CT,,")

**-i** _file_
> Input file

**-o** _file_
> Output file

**-x**
> Self-sign certificate

**-s** _subject_
> Subject DN string

**-v** _months_
> Validity period in months

# DATABASE TYPES

**sql:dir**: SQLite database (preferred)

**dbm:dir**: Legacy BerkeleyDB format

# TRUST FLAGS

Format: "SSL,Email,Object Signing" (e.g., "CT,,")

**C**: Trusted CA

**T**: Trusted for client auth

**p**: Valid peer

# CAVEATS

Requires nss-tools package. Use sql: prefix for modern databases. Handles sensitive keys; run with minimal privileges.

# SEE ALSO

[openssl](/man/openssl)(1), [pk12util](/man/pk12util)(1), [modutil](/man/modutil)(1)
