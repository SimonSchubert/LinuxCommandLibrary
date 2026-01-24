# TLDR

**Show mailbox status**

```doveadm mailbox status -u [user@example.com] all '*'```

**List user mailboxes**

```doveadm mailbox list -u [user@example.com]```

**Search messages**

```doveadm search -u [user@example.com] mailbox INBOX subject "[test]"```

**Expunge deleted messages**

```doveadm expunge -u [user@example.com] mailbox Trash all```

**Force user reindex**

```doveadm index -u [user@example.com] INBOX```

**Show user quota**

```doveadm quota get -u [user@example.com]```

**Sync mailboxes**

```doveadm sync -u [user@example.com] [remote_host]```

# SYNOPSIS

**doveadm** [_options_] _command_ [_args_]

# DESCRIPTION

**doveadm** is the administration tool for Dovecot IMAP/POP3 server. It provides commands for managing mailboxes, users, and server operations without directly manipulating mail storage.

The tool handles tasks like mailbox maintenance, message search and manipulation, quota management, and replication control.

# PARAMETERS

**-u** _user_
> Target user for operation.

**-A**
> Apply to all users.

**-D**
> Enable debug output.

**-v**
> Verbose output.

**-f** _format_
> Output format (flow, pager, tab, table).

**-o** _setting=value_
> Override configuration.

# COMMANDS

**mailbox list/status/create/delete/rename**: Mailbox management
**search**: Find messages
**fetch**: Retrieve message data
**expunge**: Delete messages
**index**: Reindex mailboxes
**quota**: Quota operations
**sync**: Dsync replication
**user**: User information

# CAVEATS

Requires proper Dovecot configuration. Some commands need root or dovecot user. Operations on large mailboxes can be slow. User must exist in Dovecot's user database.

# HISTORY

**doveadm** was introduced in **Dovecot 2.0** around **2010**, replacing older administrative scripts. **Dovecot** itself was created by **Timo Sirainen** in **2002** as a secure, high-performance IMAP server. Doveadm unified various administrative tasks into a single, consistent interface.

# SEE ALSO

[dovecot](/man/dovecot)(1), [dsync](/man/dsync)(1), [postfix](/man/postfix)(1), [mutt](/man/mutt)(1)
