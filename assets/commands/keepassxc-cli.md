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

## General Options

**-k**, **--key-file** _path_
> Specify path to a key file for unlocking the database.

**--no-password**
> Deactivate the password key for the database.

**-q**, **--quiet**
> Silence password prompt and other secondary outputs.

## Commands

**ls** _database_ [_group_]
> List entries in database or group. Use **-R** for recursive listing.

**show** _database_ _entry_
> Show entry details. Use **-a** to select specific attributes.

**clip** _database_ _entry_ [_timeout_]
> Copy password to clipboard. Clears after timeout (default 10s).

**add** _database_ _entry_
> Add new entry. Use **-g** to generate a password, **-u** to set username.

**edit** _database_ _entry_
> Edit existing entry.

**rm** _database_ _entry_
> Remove entry.

**generate**
> Generate random password. Use **-L** to set length (default 16).

**db-create** _database_
> Create new database.

**search** _database_ _term_
> Search entries.

**analyze** _database_
> Analyze password strength.

**merge** _database1_ _database2_
> Merge two databases. The first database is overwritten with the result.

**import** _database_ _xml_
> Import contents of an XML export into a new database.

**export** _database_
> Export database content to stdout (xml or csv format).

**open** _database_
> Open database in interactive shell mode.

**attachment-export** _database_ _entry_ _name_ _export-file_
> Export an attachment to a file.

**attachment-import** _database_ _entry_ _name_ _import-file_
> Import a file as an attachment into an entry.

# DESCRIPTION

**keepassxc-cli** is the command-line interface for KeePassXC password manager. It allows querying and modifying KeePass database entries (.kdbx format) from the terminal. Supports password generation, clipboard operations, and database management.

# CAVEATS

Avoid using --password on shared systems. Close the GUI before making CLI edits to prevent database corruption.

# SEE ALSO

[pass](/man/pass)(1)

