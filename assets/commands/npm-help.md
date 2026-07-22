# TAGLINE

displays documentation for npm commands

# TLDR

**Get help on a command**

```npm help [install]```

**Search help topics by keyword**

```npm help-search [dependency]```

**Open help in the browser**

```npm help [command] --viewer browser```

**Read the npm overview**

```npm help npm```

**Open the help index**

```npm help help```

# SYNOPSIS

**npm** **help** [_topic_]

# PARAMETERS

_TOPIC_
> npm command name or general topic. Multiple words form a phrase passed to **man**'s search if no exact page is found.

**--viewer** _TYPE_
> Help viewer to use: _man_ (default on Unix), _browser_, or _woman_ (Emacs). On Windows the default is _browser_.

**--help**
> Display help for the **help** command itself.

# DESCRIPTION

**npm help** displays the npm manual page for a topic. By default it shells out to **man**(1) on Unix, but with **--viewer browser** it opens the rendered HTML on docs.npmjs.com.

If no exact match exists, **npm help** falls back to **npm help-search**, which performs a keyword search across all npm man pages and prints relevance-ranked excerpts.

# CAVEATS

The _man_ viewer requires a working **man** installation. The default viewer can be changed permanently with **npm config set viewer browser**.

# HISTORY

npm help provides access to **npm's documentation** system from the command line.

# INSTALL

```pacman: sudo pacman -S npm```

```apk: sudo apk add npm```

```brew: brew install npm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[npm](/man/npm)(1), [npm-docs](/man/npm-docs)(1)

