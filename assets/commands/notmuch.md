# TLDR

**Initial setup**

```notmuch setup```

**Index new mail**

```notmuch new```

**Search messages**

```notmuch search [from:sender@example.com]```

**Show message**

```notmuch show [thread:id]```

**Tag messages**

```notmuch tag +[important] [search-terms]```

**Count messages**

```notmuch count [tag:inbox]```

**Reply to message**

```notmuch reply [thread:id]```

# SYNOPSIS

**notmuch** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Notmuch subcommand.

**setup**
> Initial configuration.

**new**
> Index new messages.

**search** _QUERY_
> Search messages.

**show** _ID_
> Display message.

**tag** _TAGS_ _QUERY_
> Modify tags.

**--help**
> Display help information.

# DESCRIPTION

**notmuch** is a mail indexer and searcher. Provides fast full-text search.

The tool indexes Maildir messages. Used with various email clients.

notmuch indexes and searches mail.

# CAVEATS

Maildir format only. Xapian backend. Frontend clients available.

# HISTORY

notmuch was created by **Carl Worth** for fast email search, inspired by Gmail's search.

# SEE ALSO

[mu](/man/mu)(1), [mairix](/man/mairix)(1), [mutt](/man/mutt)(1)

