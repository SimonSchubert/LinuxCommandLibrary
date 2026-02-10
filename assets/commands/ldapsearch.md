# TAGLINE

queries LDAP directories

# TLDR

**Search for user**

```ldapsearch -x -H ldap://[server] -b "[dc=example,dc=com]" "(uid=[username])"```

**Search with authentication**

```ldapsearch -x -D "[cn=admin,dc=example,dc=com]" -W -b "[dc=example,dc=com]" "(objectClass=*)"```

**Return specific attributes**

```ldapsearch -x -b "[dc=example,dc=com]" "(uid=[user])" cn mail```

**Search with TLS**

```ldapsearch -x -ZZ -H ldap://[server] -b "[base]" "[filter]"```

**Output in LDIF format**

```ldapsearch -x -b "[base]" -LLL "(uid=[user])"```

# SYNOPSIS

**ldapsearch** [_options_] [_filter_] [_attrs_...]

# DESCRIPTION

**ldapsearch** queries LDAP directories. It connects to an LDAP server, performs searches based on filters, and returns matching entries.

The tool is essential for directory administration, user lookup, and debugging LDAP configurations.

# PARAMETERS

**-x**
> Simple authentication.

**-H** _uri_
> LDAP server URI.

**-b** _dn_
> Search base DN.

**-D** _dn_
> Bind DN.

**-W**
> Prompt for password.

**-w** _pass_
> Bind password.

**-s** _scope_
> Search scope (base, one, sub).

**-Z**
> Start TLS.

**-ZZ**
> Require TLS.

**-L**
> LDIF output format.

**-LL**
> No comments in output.

**-LLL**
> No comments or version.

# CAVEATS

Filter syntax must be correct. Base DN must match directory structure. Credentials needed for many operations. TLS recommended for security.

# HISTORY

**ldapsearch** is part of **OpenLDAP**, which began in **1998** as an open source LDAP implementation. The LDAP protocol itself emerged from X.500 directory services in the early **1990s**.

# SEE ALSO

[ldapadd](/man/ldapadd)(1), [ldapmodify](/man/ldapmodify)(1), [ldapdelete](/man/ldapdelete)(1), [slapd](/man/slapd)(8)
