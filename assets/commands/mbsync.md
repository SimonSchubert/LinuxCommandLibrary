# TLDR

**Sync all channels**

```mbsync -a```

**Sync specific channel**

```mbsync [channel]```

**Sync specific group**

```mbsync [group]```

**Verbose sync**

```mbsync -V [channel]```

**Dry run**

```mbsync -n [channel]```

**Create missing mailboxes**

```mbsync -C [channel]```

# SYNOPSIS

**mbsync** [_options_] _channel_|_group_...

# PARAMETERS

**-a**, **--all**
> Sync all channels.

**-l**, **--list**
> List remote mailboxes.

**-C**, **--create**
> Create missing mailboxes.

**-n**, **--dry-run**
> Show what would happen.

**-V**, **--verbose**
> Verbose output.

**-D**, **--debug**
> Debug output.

**-c** _file_
> Config file.

# DESCRIPTION

**mbsync** (isstringsstringsync) synchronizes IMAP mailboxes with local Maildir folders. It provides bidirectional sync with fine-grained control over what gets synchronized.

mbsync is commonly used with mu, notmuch, or other local mail tools for offline email access.

# CONFIGURATION

```
# ~/.mbsyncrc
IMAPAccount gmail
Host imap.gmail.com
User user@gmail.com
PassCmd "gpg -q --decrypt ~/.gmail-pass.gpg"
SSLType IMAPS

IMAPStore gmail-remote
Account gmail

MaildirStore gmail-local
Path ~/mail/gmail/
Inbox ~/mail/gmail/Inbox

Channel gmail
Far :gmail-remote:
Near :gmail-local:
Patterns *
Create Both
```

# CAVEATS

Config file required. Deleting on one side propagates. IMAP quota limits apply. Initial sync can be slow.

# HISTORY

mbsync was developed by **Oswald Buddenhagen** as part of isync, a free IMAP4 sync implementation, providing reliable bidirectional synchronization.

# SEE ALSO

[offlineimap](/man/offlineimap)(1), [mu](/man/mu)(1), [notmuch](/man/notmuch)(1), [mutt](/man/mutt)(1)
