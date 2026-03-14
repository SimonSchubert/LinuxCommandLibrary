# TAGLINE

Mail indexer and searcher for Maildir

# TLDR

**Index mail**

```mu index```

**Search for messages**

```mu find [from:john subject:report]```

**View message**

```mu view [path/to/message]```

**Search with output format**

```mu find --format=links [query]```

**Initialize database**

```mu init --maildir=[~/Maildir]```

**Show message count for a query**

```mu find --summary-len=0 [query]```

**Search by date range**

```mu find date:2024-01-01..2024-12-31```

**Extract attachments from a message**

```mu extract [path/to/message]```

# SYNOPSIS

**mu** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Operation to perform.

**index**
> Index mail messages.

**find** _QUERY_
> Search for messages.

**view** _FILE_
> Display message content.

**init**
> Initialize database.

**--maildir** _PATH_
> Mail directory location.

**extract** _FILE_
> Extract attachments from a message.

**cfind** [_QUERY_]
> Search contacts from indexed messages.

**--format** _FORMAT_
> Output format (plain, links, xml, sexp, json).

**--sortfield** _FIELD_
> Sort by field (date, from, to, subject, size).

**--reverse**
> Reverse sort order.

**--help**
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

