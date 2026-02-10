# TAGLINE

command-line interface for KeePassXC password manager

# TLDR

**List entries in database**

```keepassxc-cli ls [database.kdbx]```

**Show entry details**

```keepassxc-cli show [database.kdbx] [entry]```

**Copy password to clipboard**

```keepassxc-cli clip [database.kdbx] [entry]```

**Add new entry**

```keepassxc-cli add [database.kdbx] [entry]```

**Generate password**

```keepassxc-cli generate -L [20]```

**Create new database**

```keepassxc-cli db-create [database.kdbx]```

**Search entries**

```keepassxc-cli search [database.kdbx] [query]```

# SYNOPSIS

**keepassxc-cli** _command_ [_options_]

# PARAMETERS

**ls** _database_ [_group_]
> List entries in database or group.

**show** _database_ _entry_
> Show entry details.

**clip** _database_ _entry_
> Copy password to clipboard.

**add** _database_ _entry_
> Add new entry.

**edit** _database_ _entry_
> Edit existing entry.

**rm** _database_ _entry_
> Remove entry.

**generate**
> Generate random password.

**db-create** _database_
> Create new database.

**search** _database_ _term_
> Search entries.

**analyze** _database_
> Analyze password strength.

# DESCRIPTION

**keepassxc-cli** is the command-line interface for KeePassXC password manager. It allows querying and modifying KeePass database entries (.kdbx format) from the terminal. Supports password generation, clipboard operations, and database management.

# CAVEATS

Avoid using --password on shared systems. Close the GUI before making CLI edits to prevent database corruption.

# SEE ALSO

[keepassxc](/man/keepassxc)(1), [pass](/man/pass)(1)

