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

**Show message counts**

```mu find --summary [query]```

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

**--help**
> Display help information.

# DESCRIPTION

**mu** is a mail indexer and searcher. It indexes Maildir format messages for fast searching.

The tool uses Xapian for full-text search. Works with mu4e Emacs mail client.

mu is mail indexer and searcher.

# CAVEATS

Maildir format only. Xapian-based index. Pairs well with mu4e in Emacs.

# HISTORY

mu was created as a **fast mail search** tool, forming the backend for the mu4e Emacs mail client.

# SEE ALSO

[notmuch](/man/notmuch)(1), [mairix](/man/mairix)(1), [mutt](/man/mutt)(1)

