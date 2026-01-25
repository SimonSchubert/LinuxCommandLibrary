# TLDR

**Create Maildir structure**

```mkdir -p [~/Maildir]/{cur,new,tmp}```

**List new messages**

```ls [~/Maildir/new/]```

**Move message to read**

```mv [~/Maildir/new/message] [~/Maildir/cur/]```

**Check Maildir permissions**

```ls -la [~/Maildir/]```

# SYNOPSIS

**Maildir/** - Directory-based email storage format

# DESCRIPTION

**Maildir** is a mail storage format where each email is stored as a separate file in a directory structure. It consists of three subdirectories: cur (read), new (unread), and tmp (in-progress delivery).

Maildir avoids file locking issues of mbox format and allows concurrent access from multiple programs.

# DIRECTORY STRUCTURE

```
Maildir/
├── cur/     # Read messages
├── new/     # Unread messages
├── tmp/     # Temporary (delivery)
└── .Folder/ # Subfolders (ISTRSTRSTRSTRSTRSTRSTRSTRSTRSTRSTR
    ├── cur/
    ├── new/
    └── tmp/
```

# FILE NAMING

```
# Format: time.pid.hostname:2,flags
1234567890.12345.hostname:2,S

Flags: S=Seen, R=Replied, F=Flagged, T=Trashed, D=Draft
```

# CAVEATS

More files than mbox. Filesystem must support many small files. Some tools expect specific naming. Subfolders prefixed with dot.

# HISTORY

Maildir was developed by **Daniel J. Bernstein** for his **qmail** MTA in **1995** as a reliable alternative to the traditional mbox format.

# SEE ALSO

[mbox](/man/mbox)(5), [mutt](/man/mutt)(1), [dovecot](/man/dovecot)(1), [offlineimap](/man/offlineimap)(1)
