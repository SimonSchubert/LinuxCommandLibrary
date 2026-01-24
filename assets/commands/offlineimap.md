# TLDR

**Sync all accounts**

```offlineimap```

**Sync specific account**

```offlineimap -a [account_name]```

**Sync specific folder**

```offlineimap -f [INBOX]```

**Dry run** (show what would happen)

```offlineimap --dry-run```

**Quick sync** (skip flag sync)

```offlineimap -q```

**Sync once and exit**

```offlineimap -o```

**Sync with custom config**

```offlineimap -c [/path/to/config]```

**Show folder list**

```offlineimap --info```

# SYNOPSIS

**offlineimap** [_-a account_] [_-f folder_] [_-o_] [_-q_] [_options_]

# PARAMETERS

**-a** _ACCOUNT_
> Sync specific account.

**-f** _FOLDER_
> Sync specific folder.

**-o**
> One-time sync (no repeat).

**-q**, **--quick**
> Quick sync, skip flags.

**-c** _FILE_
> Configuration file.

**-u** _UI_
> User interface (quiet, basic, blinkenlights).

**--dry-run**
> Show actions without executing.

**--info**
> Show account/folder info.

**-l** _FILE_
> Log file.

**--version**
> Show version.

# DESCRIPTION

**offlineimap** synchronizes IMAP mailboxes with local Maildir storage. It enables offline access to email and backup of IMAP accounts.

Bidirectional sync keeps local and remote in agreement. New messages, deletions, and flag changes propagate both ways. Conflicts are handled according to configuration.

Maildir format stores each message as a file, enabling access by mail clients like mutt, notmuch, and others. The local copy works when offline.

Configuration defines accounts, servers, and folder mappings. Multiple accounts can sync independently. Folder filtering controls which mailboxes to mirror.

OAuth2 authentication works with Gmail and other providers requiring modern auth. Password storage can use system keyrings or external commands.

Quick mode speeds up syncs by skipping unchanged folders. One-shot mode runs once without repeated checking.

# CAVEATS

Initial sync of large mailboxes takes time. Configuration can be complex. Deprecated in favor of isstralsync. Gmail quirks may need special handling.

# HISTORY

**offlineimap** was created by **John Googin** around **2002** for syncing IMAP mail to local storage. It became essential for offline email workflows. The project is now in maintenance mode, with **isstralsync** as the recommended successor.

# SEE ALSO

[isstralsync](/man/isstralsync)(1), [mbsync](/man/mbsync)(1), [mutt](/man/mutt)(1), [notmuch](/man/notmuch)(1)
