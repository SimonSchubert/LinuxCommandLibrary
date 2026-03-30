# TAGLINE

Simple command-line snippet manager

# TLDR

**Add a new snippet**

```pet new```

**Add a new snippet with tags**

```pet new -t```

**Search and run a snippet**

```pet exec```

**Run a snippet filtered by tag**

```pet exec -t [tag_name]```

**Copy a snippet to the clipboard**

```pet clip```

**List all snippets**

```pet list```

**Search snippets interactively**

```pet search```

**Edit the snippet file**

```pet edit```

# SYNOPSIS

**pet** _command_ [_options_]

# PARAMETERS

**new**
> Create a new command snippet. Use **-t** to add tags.

**exec**
> Search for a snippet and execute it. Use **-t** to filter by tag.

**clip**
> Copy the selected snippet to the clipboard.

**list**
> Show all stored snippets.

**search**
> Search snippets interactively.

**edit**
> Open the snippet file in your editor.

**configure**
> Edit the configuration file.

**sync**
> Sync snippets via Gist, GitLab Snippets, or GitHub Enterprise.

**version**
> Print the version number.

**--config** _string_
> Specify config file (default $HOME/.config/pet/config.toml).

**--debug**
> Enable debug mode.

# DESCRIPTION

**pet** is a simple command-line snippet manager. It stores frequently used commands with descriptions and optional parameter placeholders, then lets you search and execute them interactively using fuzzy finders like fzf or peco. Snippets can be synced across machines via GitHub Gist, GitLab Snippets, or GitHub Enterprise.

# CAVEATS

Requires **fzf** or **peco** for interactive selection.

# HISTORY

**pet** was created by **Teppei Fukuda** (knqyf263) and is written in **Go**.

# SEE ALSO

[nap](/man/nap)(1), [tldr](/man/tldr)(1), [fzf](/man/fzf)(1), [peco](/man/peco)(1)
