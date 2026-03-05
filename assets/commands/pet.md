# TAGLINE

Simple command-line snippet manager

# TLDR

**Add a new snippet**

```pet new```

**Search and run a snippet**

```pet exec```

**List all snippets**

```pet list```

**Search snippets**

```pet search```

**Edit the snippet file**

```pet edit```

# SYNOPSIS

**pet** _command_ [_options_]

# PARAMETERS

**new**
> Add a new command snippet.

**exec**
> Search for a snippet and execute it.

**list**
> List all stored snippets.

**search**
> Search snippets interactively.

**edit**
> Open the snippet file in your editor.

**configure**
> Edit the configuration file.

**sync**
> Sync snippets via Gist.

# DESCRIPTION

**pet** is a simple command-line snippet manager. It stores frequently used commands with descriptions and optional parameter placeholders, then lets you search and execute them interactively using fuzzy finders like fzf or peco. Snippets can be synced across machines via GitHub Gist.

# CAVEATS

Requires **fzf** or **peco** for interactive selection.

# HISTORY

**pet** was created by **Teppei Fukuda** (knqyf263) and is written in **Go**.

# SEE ALSO

[nap](/man/nap)(1), [tldr](/man/tldr)(1), [fzf](/man/fzf)(1)
