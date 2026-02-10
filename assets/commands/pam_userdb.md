# TAGLINE

authenticates against Berkeley DB

# TLDR

**Authenticate against DB**

```auth required pam_userdb.so db=/path/to/userdb```

**Case insensitive**

```auth required pam_userdb.so db=/path/to/userdb icase```

**Create user database**

```db_load -T -t hash -f users.txt /path/to/userdb.db```

# SYNOPSIS

**pam_userdb.so** [_options_]

# PARAMETERS

**db=**_PATH_
> Database file path.

**icase**
> Case insensitive username.

**crypt=**_TYPE_
> Password encryption type.

**try_first_pass**
> Try previous password.

# DESCRIPTION

**pam_userdb** authenticates against Berkeley DB. Custom user database.

The module uses DB files. Alternative to /etc/passwd.

# CAVEATS

Requires Berkeley DB. Database format specific. Custom user management.

# HISTORY

pam_userdb enables **database-backed authentication** separate from system accounts.

# SEE ALSO

[pam](/man/pam)(8), [db_load](/man/db_load)(1)

