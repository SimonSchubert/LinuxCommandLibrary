# TAGLINE

Display mail sender information from a mailbox

# TLDR

**Show all mail senders** in your mailbox

```from```

**Show senders for a specific user**

```from [username]```

**Filter messages by sender** address/substring

```from -s [alice@example.com]```

**Count the number of messages** (GNU mailutils only)

```from -c```

**Check a specific mailbox file**

```from -f [/var/mail/user]```

# SYNOPSIS

**from** [_-f file_] [_-s sender_] [_user_]

# PARAMETERS

_USER_
> Username to check mail for (reads their system mailbox).

**-s** _SENDER_
> Only print headers from messages whose From address matches the given string. _Note:_ this does **not** show subject lines.

**-f** _FILE_
> Read from the specified mailbox file instead of the default system mailbox.

**-c**
> Print only the count of messages. _GNU mailutils only_; not available in BSD/OpenBSD **from**.

**-d**, **--debug**
> Print debugging information. _GNU mailutils only._

**-V**, **--version**
> Display version information. _GNU mailutils only._

# DESCRIPTION

**from** displays the header of each message in a mailbox, showing who mail is from (and, depending on the implementation, subject and date). It reads the system mailbox (typically /var/mail/username) and prints one line per message.

The tool provides a quick overview of pending mail without opening a full mail client. With **-s**, output is filtered to messages whose sender matches the given address or substring. This is useful for checking mail status in shell scripts, cron jobs, or quick terminal checks.

# CAVEATS

Only works with mbox format mailboxes. May not work with modern mail delivery systems (Maildir, IMAP). Limited to local mail stored in traditional Unix mbox files.

# HISTORY

**from** is a classic **BSD utility** for checking local mail, originating from 4.2BSD. It predates modern mail systems and works with traditional Unix mbox format files.

# SEE ALSO

[mail](/man/mail)(1), [biff](/man/biff)(1), [mailx](/man/mailx)(1), [sendmail](/man/sendmail)(1)
