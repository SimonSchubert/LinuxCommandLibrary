# TAGLINE

Status and progress bar for rsync

# TLDR

**Sync files with a visual progress bar**

```rsyncy -a [/source/] [/destination/]```

**Remote sync with progress display**

```rsyncy -avz [remote:/path/] [/local/]```

# SYNOPSIS

**rsyncy** [_rsync-options_] _source_ _destination_

# DESCRIPTION

**rsyncy** wraps rsync to display a visual progress bar showing transfer progress, speed, elapsed time, and file counts. You run it with the same arguments as rsync and it adds the necessary **--info** flags automatically.

# HISTORY

**rsyncy** was created by **Christian Zangl** (laktak) and is written in **Go**.

# SEE ALSO

[rsync](/man/rsync)(1), [progress](/man/progress)(1), [pv](/man/pv)(1)
