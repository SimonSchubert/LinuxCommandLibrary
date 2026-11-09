# TAGLINE

authenticates against Berkeley DB

# TLDR

**Authenticate against DB**

```auth required pam_userdb.so db=/path/to/userdb```

**Case insensitive password check** (plaintext databases only)

```auth required pam_userdb.so db=/path/to/userdb icase```

**Create user database** (input has alternating username and password lines)

```db_load -T -t hash -f users.txt /path/to/userdb.db```

# SYNOPSIS

**pam_userdb.so** [_options_]

# PARAMETERS

**db=**_PATH_
> Database file path, without the .db suffix. There is no default; the module returns PAM_IGNORE if no database is given.

**icase**
> Make password verification case insensitive. Only works with plaintext password storage.

**crypt=**_TYPE_
> Password encryption type: _none_ (plaintext) or _crypt_ (crypt(3)-hashed).

**try_first_pass**
> Try the previously entered password before prompting.

**use_first_pass**
> Use only the previously entered password; do not prompt.

**dump**
> Dump database contents to log (debugging, insecure).

**debug**
> Print debug information. Password hashes from the database and the computed ones are written to syslog.

**unknown_ok**
> Do not return an error for users not in the DB, so that several pam_userdb modules can be stacked.

**key_only**
> The database key is the concatenation _username-password_ with a random value; the user is valid if that key exists. Useful when usernames are not unique but username and password pairs are.

# DESCRIPTION

**pam_userdb** authenticates users against credentials stored in a Berkeley DB database, independent of the system account files. The database maps usernames (keys) to passwords (values), allowing application-specific or service-specific authentication without creating system accounts.

Commonly used to provide separate credentials for services such as FTP, VPN, or web applications. The module provides the **auth** and **account** types.

# CAVEATS

Requires Berkeley DB. Database format specific. Custom user management. With **crypt=none**, passwords are stored in plaintext, so restrict access to the database file.

# HISTORY

pam_userdb enables **database-backed authentication** separate from system accounts.

# SEE ALSO

[pam](/man/pam)(8), [pam.d](/man/pam.d)(5), [db_load](/man/db_load)(1)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man8/pam_userdb.8.html)```

<!-- verified: 2026-11-09 -->
