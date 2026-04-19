# TAGLINE

Display details of a change

# TLDR

**Show the current change** (working copy)

```jj show```

**Show a specific revision**

```jj show [revset]```

**Show a histogram of changes**

```jj show --stat```

**Show only a summary** of changed files

```jj show -s```

**Show a Git-format diff**

```jj show --git```

**Use a custom output template**

```jj show -T "[template]"```

# SYNOPSIS

**jj show** [_options_] [_revsets_...]

# PARAMETERS

_REVSETS_
> Revision(s) to display (default: @, the working-copy commit).

**-T**, **--template** _TEMPLATE_
> Render each revision using the given template.

**-p**, **--patch**
> Display the patch compared to the parent revision.

**-s**, **--summary**
> For each path, show only whether it was modified, added, or deleted.

**--stat**
> Show a histogram of the changes.

**--types**
> For each path, show only its type (F=file, L=symlink, C=conflict, G=Git submodule).

**--name-only**
> For each path, show only its path.

**--git**
> Show a Git-format diff.

**--color-words**
> Show word-level diff with changes indicated only by color.

**--tool** _TOOL_
> Generate diff via an external command.

**--context** _N_
> Number of lines of context to show.

**-w**, **--ignore-all-space**
> Ignore whitespace when comparing lines.

**-b**, **--ignore-space-change**
> Ignore changes in amount of whitespace when comparing lines.

# DESCRIPTION

**jj show** displays details of a change in a Jujutsu repository, including description, author, timestamps and the diff compared to its parent. Output can be customized with templates and a variety of diff-formatting options.

# CAVEATS

Subcommand of **jj**. The symbol `@` refers to the working-copy commit. Template syntax is specific to Jujutsu; see `jj help -k templates`.

# HISTORY

**jj show** is part of **Jujutsu** (jj), a Git-compatible DVCS, providing detailed inspection of individual changes.

# SEE ALSO

[jj](/man/jj)(1), [jj-log](/man/jj-log)(1), [jj-diff](/man/jj-diff)(1)
