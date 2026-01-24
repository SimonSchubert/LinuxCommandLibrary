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

**tuir** browses Reddit. It's a terminal interface.

TUI for Reddit. Browse in terminal.

Subreddit navigation. Multi-reddit support.

Comment viewing. Threaded display.

Voting support. Upvote/downvote.

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
