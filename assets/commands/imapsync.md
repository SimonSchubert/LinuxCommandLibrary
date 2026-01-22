# TLDR

**Sync mailboxes**

```imapsync --host1 [src] --user1 [user] --password1 [pass] --host2 [dst] --user2 [user] --password2 [pass]```

**Dry run**

```imapsync --dry --host1 [src] --user1 [user] ...```

**Exclude folders**

```imapsync --exclude "Trash|Spam" --host1 [src] ...```

**SSL connections**

```imapsync --ssl1 --ssl2 --host1 [src] ...```

**Delete source after sync**

```imapsync --delete1 --host1 [src] ...```

# SYNOPSIS

**imapsync** [_options_]

# PARAMETERS

**--host1** _HOST_
> Source IMAP server.

**--user1** _USER_
> Source username.

**--password1** _PASS_
> Source password.

**--host2** _HOST_
> Destination server.

**--user2** _USER_
> Destination username.

**--dry**
> Dry run mode.

**--ssl1**, **--ssl2**
> Use SSL.

**--help**
> Display help information.

# DESCRIPTION

**imapsync** synchronizes IMAP mailboxes between servers. It copies emails, folders, and flags from source to destination.

The tool handles mail migrations and backups. It supports incremental sync, filtering, and various authentication methods.

imapsync migrates IMAP mailboxes.

# CAVEATS

Can be slow for large mailboxes. Memory usage scales with size. Commercial version available.

# HISTORY

imapsync was created by **Gilles Lamiral** for IMAP mailbox migration and synchronization.

# SEE ALSO

[offlineimap](/man/offlineimap)(1), [mbsync](/man/mbsync)(1), [fetchmail](/man/fetchmail)(1)
