# TAGLINE

Display mail sender information from a mailbox

# TLDR

**Show all mail senders** in your mailbox

```from```

**Show senders for a specific user**

```from [username]```

**Show sender and subject lines**

```from -s```

**Count the number of messages**

```from -c```

**Check a specific mailbox file**

```from -f [/var/mail/user]```

# SYNOPSIS

**from** [_options_] [_user_]

# PARAMETERS

_USER_
> Username to check mail for (reads their system mailbox).

**-s**
> Show the Subject line along with the sender.

**-c**
> Print only the count of messages.

**-f** _FILE_
> Read from the specified mailbox file instead of the default.

# DESCRIPTION

**from** displays a summary of the "From" lines in a mailbox, showing who mail is from. It reads the system mailbox (typically /var/mail/username) and displays sender information for each message.

The tool provides a quick overview of pending mail without opening a full mail client. With **-s**, it also shows subject lines for quick scanning of message content. This is useful for checking mail status in shell scripts, cron jobs, or quick terminal checks.

# CAVEATS

Only works with mbox format mailboxes. May not work with modern mail delivery systems (Maildir, IMAP). Limited to local mail stored in traditional Unix mbox files.

# HISTORY

**from** is a classic **BSD utility** for checking local mail, originating from 4.2BSD. It predates modern mail systems and works with traditional Unix mbox format files.

# SEE ALSO

[mail](/man/mail)(1), [biff](/man/biff)(1), [mailx](/man/mailx)(1)
