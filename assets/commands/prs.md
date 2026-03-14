# TAGLINE

TUI tool for tracking relevant pull requests

# TLDR

**Launch the PR tracker** in query mode

```prs```

Launch in **repos** mode

```prs --mode repos```

# SYNOPSIS

**prs** [_options_]

# PARAMETERS

**--mode** _MODE_
> Operating mode: query (search PRs by GitHub search syntax) or repos (browse predefined repository list).

# DESCRIPTION

**prs** is a terminal user interface for tracking pull requests without leaving the terminal. It supports two modes: **query mode** (default) searches PRs using GitHub search syntax, and **repos mode** lets you pick from a predefined repository list. Configuration priority is: flags, then environment variables, then YAML config file.

# KEYBOARD SHORTCUTS

**q / Esc**
> Go back

**Q**
> Quit from anywhere

**?**
> Open help view

**d**
> Open PR details view

**Ctrl+v**
> Show PR details using gh

# HISTORY

**prs** was created by **dhth** and is written in **Go**.

# SEE ALSO

[gh](/man/gh)(1), [git](/man/git)(1)
