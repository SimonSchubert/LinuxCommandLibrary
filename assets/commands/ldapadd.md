# TAGLINE

adds entries to an LDAP directory

# TLDR

**Add entry from LDIF file**

```ldapadd -x -D "[cn=admin,dc=example,dc=com]" -W -f [entry.ldif]```

**Add with simple bind**

```ldapadd -x -H ldap://[server] -D "[binddn]" -w "[password]" -f [file.ldif]```

**Add using SASL**

```ldapadd -Y EXTERNAL -H ldapi:/// -f [file.ldif]```

**Verbose output**

```ldapadd -v -x -D "[binddn]" -W -f [file.ldif]```

**Dry run**

```ldapadd -n -x -D "[binddn]" -W -f [file.ldif]```

# SYNOPSIS

**ldapadd** [_options_] [**-f** _file_]

# PARAMETERS

**-x**
> Use simple authentication instead of SASL.

**-D** _binddn_
> Bind distinguished name for authentication.

**-W**
> Prompt for bind password.

**-w** _password_
> Bind password (insecure, visible in process list).

**-H** _URI_
> LDAP server URI (e.g. ldap://host, ldaps://host, ldapi:///).

**-f** _file_
> Read entries from LDIF file instead of stdin.

**-c**
> Continue on errors (report but do not stop).

**-n**
> Dry run, show what would be done without modifying entries.

**-v**
> Verbose output.

**-d** _debuglevel_
> Set LDAP debugging level.

**-Y** _mechanism_
> SASL authentication mechanism (e.g. EXTERNAL, GSSAPI).

**-Z**
> Issue StartTLS extended operation.

**-ZZ**
> Require StartTLS to succeed.

# DESCRIPTION

**ldapadd** adds entries to an LDAP directory. It reads LDIF (LDAP Data Interchange Format) files containing new entries to add to the directory.

ldapadd is implemented as a hard link to ldapmodify with the -a flag automatically enabled. It connects to the LDAP server, binds with the provided credentials, and adds the specified entries. Without -H, it connects to the default LDAP server configured in ldap.conf.

# LDIF EXAMPLE

```ldif
dn: uid=jdoe,ou=users,dc=example,dc=com
objectClass: inetOrgPerson
uid: jdoe
cn: John Doe
sn: Doe
mail: jdoe@example.com
```

# CAVEATS

Requires appropriate permissions. LDIF syntax must be correct. Parent entries must exist. Use -W instead of -w for security.

# HISTORY

ldapadd is part of **OpenLDAP**, a free implementation of LDAP. OpenLDAP was started by Kurt Zeilenga in **1998** as a continuation of the University of Michigan LDAP project.

# SEE ALSO

[ldapmodify](/man/ldapmodify)(1), [ldapsearch](/man/ldapsearch)(1)
