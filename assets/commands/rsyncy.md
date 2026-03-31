# TAGLINE

Status and progress bar for rsync

# TLDR

**Sync files with a visual progress bar**

```rsyncy -a [/source/] [/destination/]```

**Remote sync with progress display**

```rsyncy -avz [remote:/path/] [/local/]```

**Sync with delete and compression**

```rsyncy -avz --delete [/source/] [/destination/]```

**Dry run to preview** changes

```rsyncy -avn [/source/] [/destination/]```

# SYNOPSIS

**rsyncy** [_rsync-options_] _source_ _destination_

# PARAMETERS

All standard **rsync** options are supported and passed through to rsync. rsyncy adds the necessary **--info** flags automatically for progress display.

# DESCRIPTION

**rsyncy** wraps rsync to display a visual progress bar showing overall transfer progress, speed, elapsed time, and file counts. You run it with the same arguments as rsync and it adds the necessary **--info** flags automatically. Unlike rsync's built-in **--progress** flag which shows per-file progress, rsyncy shows overall progress across all files.

# HISTORY

**rsyncy** was created by **Christian Zangl** (laktak) and is written in **Go**.

# SEE ALSO

[rsync](/man/rsync)(1), [progress](/man/progress)(1), [pv](/man/pv)(1)
