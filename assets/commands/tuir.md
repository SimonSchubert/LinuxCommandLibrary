# TAGLINE

Terminal user interface for Reddit

# TLDR

**Launch Reddit browser**

```tuir```

**Open specific subreddit**

```tuir -s [programming]```

**Open with URL**

```tuir [https://reddit.com/r/linux]```

**Open comments**

```tuir -l [post-url]```

**Use different theme**

```tuir --theme [molokai]```

# SYNOPSIS

**tuir** [_-s subreddit_] [_--theme name_] [_options_] [_url_]

# PARAMETERS

**-s** _SUBREDDIT_
> Open subreddit.

**-l** _URL_
> Open link.

**--theme** _NAME_
> Color theme.

**--config** _FILE_
> Config file.

**--help**
> Show help.

# DESCRIPTION

**tuir** (Terminal UI for Reddit) provides a full-featured Reddit browsing experience in the terminal. It displays subreddits, posts, and threaded comments in an ncurses-based interface navigated with vim-style keybindings.

The tool supports core Reddit interactions including voting, commenting, subscribing to subreddits, and opening links in an external browser or media viewer. Multiple subreddits can be browsed, and posts can be sorted by hot, new, top, and controversial.

Authentication via OAuth allows access to subscriptions, saved posts, and user-specific features. Themes can be customized to match terminal color schemes.

# KEY BINDINGS

- **j/k** - Navigate
- **l/h** - Enter/back
- **a/z** - Vote up/down
- **c** - Comment

# CAVEATS

Reddit API limits. OAuth authentication. Fork of rtv.

# HISTORY

**tuir** (Terminal UI for Reddit) is a maintained fork of **rtv** (Reddit Terminal Viewer) after it was abandoned.

# SEE ALSO

[rtv](/man/rtv)(1), [newsboat](/man/newsboat)(1)
