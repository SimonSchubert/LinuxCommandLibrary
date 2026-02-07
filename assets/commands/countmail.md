# TAGLINE

Mailbox message counter

# TLDR

**Count messages** in the default mailbox

```countmail```

**Count messages in a specific** mailbox file

```countmail [/var/mail/user]```

**Count messages in a Maildir**

```countmail [~/Maildir]```

**Show unread message count** only

```countmail --unread```

**Display count for multiple** mailboxes

```countmail [mailbox1] [mailbox2]```

**Output in machine-readable** format

```countmail --quiet [mailbox]```

# SYNOPSIS

**countmail** [_options_] [_mailbox_...]

# PARAMETERS

_MAILBOX_
> Path to mailbox file or Maildir to count. Uses default mailbox if omitted.

**--unread**
> Count only unread messages.

**--read**
> Count only read messages.

**--quiet**
> Output only the number, no labels.

**--mbox**
> Treat the path as mbox format.

**--maildir**
> Treat the path as Maildir format.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**countmail** is a simple utility for counting messages in mailboxes. It supports both traditional mbox format files and Maildir directories, automatically detecting the format when possible.

The tool is useful for status bars, scripts, and notifications that need to display unread mail counts. It can process multiple mailboxes and output results suitable for parsing by other programs.

countmail reads mailbox headers efficiently without loading entire messages, making it fast even for large mailboxes. It can distinguish between read and unread messages based on standard mail flags.

# CAVEATS

Mailbox format detection may fail for unusual configurations; use explicit **--mbox** or **--maildir** flags when needed. File locking is not performed, so counts may be slightly off if the mailbox is being modified concurrently.

# HISTORY

countmail is part of the tradition of simple Unix mail utilities. Various implementations exist to provide this basic functionality, often as part of larger mail handling toolkits or as standalone scripts for desktop integration.

# SEE ALSO

[mail](/man/mail)(1), [mutt](/man/mutt)(1), [fetchmail](/man/fetchmail)(1), [procmail](/man/procmail)(1)
