# TAGLINE

Browse Reddit in the terminal

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

**-s** _name_
> Open subreddit.

**-l** _url_
> Deprecated; pass the link as a positional argument instead.

**--log** _file_
> Log file.

**--config** _file_
> Config file.

**--ascii**
> ASCII-only mode.

**--theme** _name_
> Color theme, by name or file.

**--list-themes**
> List the available themes.

**--monochrome**
> Disable colors.

**--enable-media**
> Open external links using programs defined in the mailcap config.

**--clear-auth**
> Remove any saved user data before launching.

**--copy-config**
> Copy the default configuration to ~/.config/rtv/rtv.cfg.

# DESCRIPTION

**rtv** (Reddit Terminal Viewer) is a terminal interface for Reddit. It displays subreddits, posts, and comments in a text-based interface with vim-like navigation.

Note: The project is no longer maintained; consider using the tuir fork.

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
/       - Open a prompt to select a subreddit
f       - Search the current subreddit
r       - Refresh
q       - Quit
?       - Help
```

# CONFIGURATION

**~/.config/rtv/rtv.cfg**
> Main configuration file controlling default subreddit, keybindings, browser, editor, and display preferences.

# CAVEATS

Discontinued - use tuir instead. Requires Reddit account for some features. OAuth login needed.

# HISTORY

rtv was created by **Michael Lazar** as a terminal Reddit client. Development stopped in 2019; **tuir** is the community fork.

# SEE ALSO

[tuir](/man/tuir)(1), [w3m](/man/w3m)(1), [lynx](/man/lynx)(1)

# RESOURCES

```[Source code](https://github.com/michael-lazar/rtv)```

<!-- verified: 2026-11-08 -->
