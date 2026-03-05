# TAGLINE

CLI password manager with sessions

# TLDR

**Add a new entry** to the database

```kure add```

**List all entries**

```kure ls```

**Copy a password** to the clipboard

```kure copy [entry_name]```

**Generate a random password**

```kure gen```

**Start a session** to run multiple commands without re-entering the master password

```kure session```

**Export the database**

```kure export```

# SYNOPSIS

**kure** _command_ [_options_]

# DESCRIPTION

**kure** is a CLI password manager that emphasizes security and privacy by reducing the attack surface to its minimum. It works completely offline with no third-party connections. Each record is encrypted using **AES-GCM 256-bit** with a unique password derived using **Argon2id**.

The master password is never stored on disk — it is encrypted and temporarily held in a protected memory buffer that is destroyed immediately after use. Sessions allow running multiple commands by entering the master password only once, with configurable timeouts and custom scripts.

# CAVEATS

Completely offline — no built-in sync across devices. The database file must be manually transferred between systems. Losing the master password means permanent loss of stored data.

# HISTORY

**kure** was created by **GGP1** and is written in **Go**. It supports Linux, macOS, BSD, Windows, and mobile platforms.

# SEE ALSO

[pass](/man/pass)(1), [gopass](/man/gopass)(1)
