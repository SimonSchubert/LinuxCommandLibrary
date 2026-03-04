# TAGLINE

TUI for LDAP directory browsing

# TLDR

**Connect** to LDAP server

```godap [ldap://server:389]```

**Connect** with authentication

```godap -D [bind-dn] -W [ldap://server]```

**Search** specific base DN

```godap -b [ou=users,dc=example,dc=com] [ldap://server]```

# SYNOPSIS

**godap** [_options_] [_ldap-uri_]

# PARAMETERS

**-D, --bind-dn** _DN_
> Bind DN for authentication

**-W**
> Prompt for bind password

**-w, --password** _PASSWORD_
> Bind password (insecure)

**-b, --base-dn** _DN_
> Base DN for search

**-H, --uri** _URI_
> LDAP server URI

**-Z, --starttls**
> Use StartTLS

**-x, --simple-auth**
> Use simple authentication

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**godap** is a terminal user interface for browsing LDAP directories. It allows users to navigate the directory tree, view entries, and perform searches interactively.

The tool supports various LDAP authentication methods, TLS/SSL connections, and displays LDAP entries in a readable format.

# KEYBINDINGS

**↑/↓**
> Navigate entries

**Enter**
> View entry details

**n**
> New search

**/ or s**
> Search current context

**b**
> Go back

**q**
> Quit

# CAVEATS

Requires LDAP server access. Bind credentials must have appropriate permissions. Large directories may have performance issues. TLS certificate validation depends on system configuration.

# HISTORY

**godap** was created to provide an interactive way to browse LDAP directories from the terminal, similar to GUI LDAP browsers.

# SEE ALSO

[ldapsearch](/man/ldapsearch)(1), [ldapvi](http://www.lichteblau.com/ldapvi/), [jxplorer](http://jxplorer.org/)