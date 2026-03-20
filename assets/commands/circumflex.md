# TAGLINE

Hacker News client for the terminal

# TLDR

**Browse** Hacker News interactively

```clx```

**Browse** with Nerd Fonts icons enabled

```clx -n```

**Set** comment width to 80 characters

```clx -c 80```

**Read** comments for a specific submission by ID

```clx comments [33192518]```

**Read** an article in Reader Mode by URL

```clx url [https://example.com/article]```

**Add** a submission to favorites

```clx add [33192518]```

**Clear** browsing history

```clx clear```

**Show** only specific categories

```clx --categories="ask,show"```

# SYNOPSIS

**clx** [_flags_]
**clx** [_command_] [_arguments_]

# PARAMETERS

**-a**, **--auto-expand**
> Auto-expand all replies in comment threads.

**--categories=**_string_
> Set visible categories (default: "top,best,ask,show").

**-c**, **--comment-width=**_int_
> Set comment width in characters (default: 70).

**-e**, **--disable-emojis**
> Disable emoji conversion in output.

**-d**, **--disable-history**
> Disable marking submissions as read.

**-t**, **--hide-indent**
> Hide indentation guide bars in comments.

**-n**, **--nerdfonts**
> Enable Nerd Fonts icons.

**-o**, **--plain-comments**
> Disable syntax highlighting in comments.

**-p**, **--plain-headlines**
> Disable syntax highlighting in headlines.

**-v**, **--version**
> Display version number.

# SUBCOMMANDS

**add** _id_
> Add a submission to favorites by its Hacker News ID.

**comments** _id_
> Jump directly to the comment section of a submission.

**article** _id_
> Read the linked article in Reader Mode.

**url** _url_
> Open any URL in Reader Mode.

**clear**
> Delete browsing history.

# DESCRIPTION

**circumflex** (binary name **clx**) is a terminal-based Hacker News client built with the Bubble Tea TUI framework. It lets you browse stories, read comment threads with syntax-aware formatting, and view linked articles in Reader Mode without leaving the terminal.

Comments are pretty-printed and piped to **less** with syntax highlighting for code snippets, @mentions, variables, and URLs. Rainbow-colored indentation bars distinguish nesting levels. The tool tracks read history, highlights new comments since last visit, and supports saving favorites as pretty-printed JSON at **~/.config/circumflex/favorites.json**.

# CAVEATS

Requires a modern version of **less** as its pager. Depends on Algolia's Hacker News Search API and cheeaun's unofficial HN API; functionality is impacted if either is down. Uses invisible Unicode characters for custom keybindings within less, which could cause issues with certain terminal configurations. The **CLX_BROWSER** environment variable can override the default browser.

# HISTORY

**circumflex** was created by **bensadeh** and publicly announced on Hacker News in **October 2022**. Written in Go using the Bubble Tea TUI framework, licensed under AGPL-3.0.

# SEE ALSO

[less](/man/less)(1), [newsboat](/man/newsboat)(1), [w3m](/man/w3m)(1), [lynx](/man/lynx)(1)
