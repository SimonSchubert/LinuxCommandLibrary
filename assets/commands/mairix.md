# TAGLINE

fast mail indexing and searching tool for Maildir and MH mailboxes

# TLDR

**Index mail folders**

```mairix```

**Search for subject**

```mairix s:[search term]```

**Search by sender**

```mairix f:[sender@example.com]```

**Search by date range**

```mairix d:[1w-]```

**Combined search**

```mairix s:[report] f:[boss] d:[1m-]```

**Search body content**

```mairix b:[keyword]```

# SYNOPSIS

**mairix** [_options_] [_search-terms_...]

# PARAMETERS

**-f** _config_
> Config file path.

**-p**
> Purge results folder.

**-F**
> Force full re-index.

**-v**
> Verbose output.

**-Q**
> Quick (stop at 100 matches).

**-t**
> Include threads.

# DESCRIPTION

**mairix** is a fast mail indexing and searching tool for Maildir and MH mailboxes. It creates an index database for rapid searching and links matching messages to a results folder.

Search terms use prefixes: s: (subject), f: (from), t: (to), b: (body), d: (date).

# CONFIGURATION

```
# ~/.mairixrc
base=/home/user/mail
maildir=Maildir
mfolder=search
database=/home/user/.mairix_db
```

# DATE SYNTAX

```
d:1w-      # Last week
d:-2m      # Older than 2 months
d:1y-6m    # Between 1 year and 6 months ago
```

# CAVEATS

Index must be updated after new mail. Results are symlinks. Only Maildir and MH formats. Full reindex needed if database corrupted.

# HISTORY

mairix was created by **Richard Curnow** as a fast alternative to grep-based mail searching.

# SEE ALSO

[notmuch](/man/notmuch)(1), [mu](/man/mu)(1), [mutt](/man/mutt)(1), [maildir](/man/maildir)(5)
