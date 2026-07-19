# TAGLINE

browse Hacker News from the terminal (haxor-news)

# TLDR

**Show top posts**

```hn top```

**Show newest posts**

```hn new [20]```

**Show best posts**

```hn best```

**Show Ask HN posts**

```hn ask```

**Show Show HN posts**

```hn show```

**View a post's linked content or comments, by its list number**

```hn view [1]```

**View all comments for a post, piped through a pager**

```hn view [8] -c | less -r```

**Filter the monthly "who is hiring" post by keyword**

```hn hiring "[(?i)(Node|JavaScript).*(remote)]"```

# SYNOPSIS

**hn** _command_ [_params_] [_options_]

**haxor-news**

# COMMANDS

**top**, **best**, **new**, **ask**, **show**, **jobs**, **onion** [_limit_]
> List posts from that category (default limit: 10; onion default: all).

**view** _#_ [_options_]
> View a listed post's linked web content, or its comments with **-c**.

**hiring** [_regex_] [_post_id_]
> Filter the latest (or a given) monthly "who is hiring" post.

**freelance** [_regex_] [_post_id_]
> Filter the latest (or a given) monthly freelancer-availability post.

**user** _user_id_
> Show a user's profile info.

**help**
> Show usage help.

# PARAMETERS

**-c**, **--comments**
> Show all comments for the viewed post.

**-cu**, **--comments_unseen**
> Show only comments not previously seen (marked with **[!]**).

**-cr**, **--comments_recent**
> Show only comments posted in the last 60 minutes.

**-cq**, **--comments_regex_query** _regex_
> Show only comments matching a regular expression.

**-ch**, **--comments_hide**
> Hide (instead of collapse) comments that don't match a filter.

**-b**, **--browser**
> Open the linked content or comments in the default web browser instead of the terminal.

# DESCRIPTION

**hn** is the command-line client provided by **haxor-news**, a Python tool that brings Hacker News to the terminal without leaving the command line. It can list and page through Top, Best, New, Ask, Show, Jobs, and April Fools' "Onion" posts, view a post's linked web content (rendered as readable text) or its full comment tree, and filter large comment threads down to unseen, recent, or regex-matching comments.

Output can be piped to pagers, redirected to files, or combined with other command-line tools. Running the bare **haxor-news** command (rather than **hn**) launches an optional auto-completing interactive prompt using the same **hn** _command_ syntax.

# CAVEATS

Requires an internet connection; data comes from the Hacker News Firebase/Algolia APIs via the **haxor** Python library. The project has seen little activity since the mid-2010s, though its read-only browsing commands still work.

# HISTORY

**haxor-news** was created by **Donne Martin** and first released in **2015**, built on Kenneth Reitz's **requests**, Aaron Swartz's **html2text**, and the **click** and **prompt_toolkit** libraries.

# SEE ALSO

[rtv](/man/rtv)(1), [tuir](/man/tuir)(1), [w3m](/man/w3m)(1)

# RESOURCES

```[Source code](https://github.com/donnemartin/haxor-news)```

<!-- verified: 2026-07-19 -->
