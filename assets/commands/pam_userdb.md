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
> Database file path (without .db extension on some systems).

**icase**
> Case insensitive username matching.

**crypt=**_TYPE_
> Password encryption type: _none_ (plaintext) or _crypt_ (crypt(3)-hashed).

**try_first_pass**
> Try the previously entered password before prompting.

**use_first_pass**
> Use only the previously entered password; do not prompt.

**dump**
> Dump database contents to log (debugging, insecure).

**unknown_ok**
> Do not fail authentication for users not in the DB (skip module).

**key_only**
> Authenticate based on username presence alone, ignoring password.

# DESCRIPTION

**pam_userdb** authenticates users against credentials stored in a Berkeley DB database, independent of the system account files. The database maps usernames (keys) to passwords (values), allowing application-specific or service-specific authentication without creating system accounts.

Commonly used to provide separate credentials for services such as FTP, VPN, or web applications.

# CAVEATS

Requires Berkeley DB. Database format specific. Custom user management.

# HISTORY

pam_userdb enables **database-backed authentication** separate from system accounts.

# SEE ALSO

[pam](/man/pam)(8), [db_load](/man/db_load)(1)

