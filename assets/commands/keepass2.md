# TLDR

**Open KeePass**

```keepass2```

**Open specific database**

```keepass2 [database.kdbx]```

**Open database with keyfile**

```keepass2 [database.kdbx] -keyfile:[keyfile.key]```

# SYNOPSIS

**keepass2** [_options_] [_database_]

# PARAMETERS

**-keyfile:**_file_
> Use key file for authentication.

**-pw:**_password_
> Database password (insecure).

**-minimize**
> Start minimized.

**-auto-type**
> Perform auto-type.

# DESCRIPTION

**keepass2** is a free, open-source password manager that stores passwords in an encrypted database. Supports strong encryption, password generation, and browser integration. The database file can be secured with a master password and/or key file.

# CAVEATS

Avoid using -pw: on command line as it exposes the password in process lists and shell history.

# SEE ALSO

[keepassxc](/man/keepassxc)(1), [keepassxc-cli](/man/keepassxc-cli)(1)

