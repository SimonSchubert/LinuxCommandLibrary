# TAGLINE

modifies LDAP directory entries

# TLDR

**Modify entry from LDIF**

```ldapmodify -x -D "[cn=admin,dc=example,dc=com]" -W -f [changes.ldif]```

**Add entry (like ldapadd)**

```ldapmodify -a -x -D "[binddn]" -W -f [entry.ldif]```

**Interactive mode**

```ldapmodify -x -D "[binddn]" -W```

**Delete attribute**

```ldapmodify -x -D "[binddn]" -W -f [delete.ldif]```

**Using LDAPS**

```ldapmodify -x -H ldaps://[server] -D "[binddn]" -W -f [file.ldif]```

# SYNOPSIS

**ldapmodify** [_options_] [**-f** _file_]

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
> LDIF file with modifications.

**-a**
> Add mode (like ldapadd).

**-c**
> Continue on errors.

**-M**
> Enable manage DSA IT control.

**-n**
> Dry run.

# DESCRIPTION

**ldapmodify** modifies LDAP directory entries. It supports adding, replacing, and deleting attributes based on LDIF input.

# LDIF MODIFICATION TYPES

```ldif
# Replace attribute
dn: uid=jdoe,ou=users,dc=example,dc=com
changetype: modify
replace: mail
mail: newemail@example.com

# Add attribute
dn: uid=jdoe,ou=users,dc=example,dc=com
changetype: modify
add: telephoneNumber
telephoneNumber: 555-1234

# Delete attribute
dn: uid=jdoe,ou=users,dc=example,dc=com
changetype: modify
delete: telephoneNumber
```

# CAVEATS

Schema must allow modifications. Use correct changetype. Hyphen (-) separates multiple operations.

# SEE ALSO

[ldapadd](/man/ldapadd)(1), [ldapsearch](/man/ldapsearch)(1), [ldapdelete](/man/ldapdelete)(1)
