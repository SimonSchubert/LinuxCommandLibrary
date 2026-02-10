# TAGLINE

converts OpenLDAP schemas to LDIF

# TLDR

**Convert OpenLDAP schema**

```oLschema2ldif -i [schema.schema] -o [output.ldif]```

**Convert multiple schemas**

```oLschema2ldif -i [schema1.schema] -i [schema2.schema] -o [output.ldif]```

**Specify base DN**

```oLschema2ldif -b "[cn=config]" -i [schema.schema]```

# SYNOPSIS

**oLschema2ldif** [_options_]

# PARAMETERS

**-i** _FILE_
> Input schema file.

**-o** _FILE_
> Output LDIF file.

**-b** _DN_
> Base DN for schema.

**--help**
> Display help information.

# DESCRIPTION

**oLschema2ldif** converts OpenLDAP schemas to LDIF. Migrates schema format.

The tool transforms schema definitions. Used for LDAP configuration.

# CAVEATS

Part of Samba tools. Schema format specific.

# HISTORY

oLschema2ldif was created for **schema migration** in LDAP environments.

# SEE ALSO

[ldapadd](/man/ldapadd)(1), [slapd](/man/slapd)(1), [ldapmodify](/man/ldapmodify)(1)

