# TLDR

**Launch Reddit Terminal Viewer**

```rtv```

**Open specific subreddit**

```rtv -s [linux]```

**Open user page**

```rtv -s /u/[username]```

**Open post by URL**

```rtv [https://reddit.com/r/...]```

# SYNOPSIS

**rtv** [_options_] [_link_]

# PARAMETERS

**-s**, **--subreddit** _name_
> Open subreddit.

**-l**, **--link** _url_
> Open submission.

**--log** _file_
> Log file.

**--config** _file_
> Config file.

**--ascii**
> ASCII-only mode.

**--theme** _name_
> Color theme.

# DESCRIPTION

**rtv** (Reddit Terminal Viewer) is a terminal interface for Reddit. It displays subreddits, posts, and comments in a text-based interface with vim-like navigation.

Note: Project is discontinued; consider using tuir fork.

# EXAMPLES

```bash
# Launch default
rtv

# Specific subreddit
rtv -s programming

# Multireddit
rtv -s linux+python+vim

# User profile
rtv -s /u/spez

# Direct link
rtv https://reddit.com/r/linux/comments/...
```

# KEYBINDINGS

```
j/k     - Move down/up
l/h     - Open/back
o       - Open in browser
c       - Compose
/       - Search
r       - Refresh
q       - Quit
?       - Help
```

# CONFIGURATION

```
~/.config/rtv/rtv.cfg
```

# CAVEATS

Discontinued - use tuir instead. Requires Reddit account for some features. OAuth login needed.

# HISTORY

rtv was created by **Michael Lazar** as a terminal Reddit client. Development stopped in 2019; **tuir** is the community fork.

# SEE ALSO

[tuir](/man/tuir)(1), [w3m](/man/w3m)(1), [lynx](/man/lynx)(1)
