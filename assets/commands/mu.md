# TAGLINE

Mail indexer and searcher for Maildir

# TLDR

**Initialize the database**

```mu init --maildir=[~/Maildir]```

**Index mail messages**

```mu index```

**Search for messages**

```mu find [from:john subject:report]```

**View a message**

```mu view [path/to/message]```

**Search with a specific output format**

```mu find --format=links [query]```

**Search by date range**

```mu find date:2024-01-01..2024-12-31```

**Extract attachments from a message**

```mu extract [path/to/message]```

**Search contacts from indexed messages**

```mu cfind [john]```

# SYNOPSIS

**mu** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Operation to perform.

**init**
> Initialize the mu database.

**index**
> (Re)index mail messages in a Maildir.

**find** _QUERY_
> Search for messages in the database.

**view** _FILE_
> Display message content.

**extract** _FILE_
> Extract attachments and other MIME parts from a message.

**cfind** [_QUERY_]
> Search contacts from indexed messages.

**add** _FILE_
> Add specific messages to the database.

**remove** _FILE_
> Remove specific messages from the database.

**mkdir** _DIR_
> Create a new Maildir.

**info**
> Show information about the mu database.

**--maildir** _PATH_
> Mail directory location (default: ~/Maildir).

**--format** _FORMAT_
> Output format (plain, links, xml, sexp, json).

**--sortfield** _FIELD_
> Sort by field (date, from, to, subject, size).

**--reverse**
> Reverse sort order.

**-d**, **--debug**
> Generate extra debug information.

**-q**, **--quiet**
> Suppress informational messages and progress output.

**--nocolor**
> Disable ANSI color output.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**mu** is a mail indexer and searcher for Maildir-format mailboxes. It indexes messages for fast full-text searching using the Xapian search engine. Queries support fields like `from:`, `to:`, `subject:`, `date:`, `flag:`, `mime:`, and boolean operators (`and`, `or`, `not`).

The tool serves as the backend for the **mu4e** Emacs mail client, but is fully functional as a standalone command-line tool.

# CAVEATS

Maildir format only. Requires Xapian library. The database must be re-indexed after changes to the Maildir (run `mu index`). Query syntax changed between major versions (pre-1.0 vs post-1.0).

# HISTORY

**mu** was created by **Dirk-Jan C. Binnema** as a fast mail search tool, forming the backend for the **mu4e** Emacs mail client. It was designed as a lightweight alternative to notmuch with a focus on simplicity and speed.

# SEE ALSO

[notmuch](/man/notmuch)(1), [mairix](/man/mairix)(1), [mutt](/man/mutt)(1), [neomutt](/man/neomutt)(1)

