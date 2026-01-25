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
> Simple authentication.

**-D** _binddn_
> Bind DN.

**-W**
> Prompt for password.

**-w** _password_
> Password (insecure).

**-H** _URI_
> LDAP server URI.

**-f** _file_
> LDIF file.

**-c**
> Continue on errors.

**-n**
> Dry run (no changes).

**-v**
> Verbose output.

**-Y** _mechanism_
> SASL mechanism.

# DESCRIPTION

**ldapadd** adds entries to an LDAP directory. It reads LDIF (LDAP Data Interchange Format) files containing new entries to add to the directory.

ldapadd is equivalent to ldapmodify -a. It connects to the LDAP server, binds with credentials, and adds the specified entries.

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

[ldapmodify](/man/ldapmodify)(1), [ldapsearch](/man/ldapsearch)(1), [ldapdelete](/man/ldapdelete)(1)
