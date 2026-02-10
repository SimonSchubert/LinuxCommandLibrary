# TAGLINE

mail delivery agent with filtering

# TLDR

**Process mail with filter**

```maildrop [filter.rc]```

**Deliver mail**

```maildrop < [message.eml]```

**Test filter**

```maildrop -V [9] [filter.rc] < [message.eml]```

**Use specific maildir**

```maildrop -d [user] [filter.rc]```

**Show version**

```maildrop -v```

# SYNOPSIS

**maildrop** [_options_] [_filterfile_]

# PARAMETERS

_FILTERFILE_
> Mail filter rules file.

**-d** _USER_
> Deliver as user.

**-V** _LEVEL_
> Verbose level.

**-v**
> Show version.

**-f** _ADDRESS_
> From address.

**--help**
> Display help information.

# DESCRIPTION

**maildrop** is a mail delivery agent with filtering. It sorts incoming mail using rules.

The tool delivers mail to maildirs or mboxes. Filter rules support conditions and actions.

# CAVEATS

Requires filter configuration. Part of courier-maildrop. Maildir preferred format.

# HISTORY

maildrop is part of the **Courier Mail Server** project, providing flexible mail filtering and delivery.

# SEE ALSO

[procmail](/man/procmail)(1), [dovecot](/man/dovecot)(1), [postfix](/man/postfix)(1)

