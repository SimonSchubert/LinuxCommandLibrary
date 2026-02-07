# TAGLINE

Modern Git CLI wrapper with simplified commands

# TLDR

**Save changes** to the current branch

```bit save```

**Sync with remote** and push changes

```bit sync```

**Sync with a specific branch**

```bit sync origin [master]```

**Switch to a branch** (creates if doesn't exist)

```bit switch [branch-name]```

**Interactive checkout** with branch selection

```bit checkout```

**Add files** with interactive selection

```bit add```

**Commit with a message** (standard git)

```bit commit -m "[message]"```

# SYNOPSIS

**bit** [_command_] [_arguments_]

# DESCRIPTION

**bit** is a modern Git CLI wrapper that provides simplified commands, intelligent defaults, and interactive prompts. It's built on top of git and maintains full compatibility with standard git commands.

The tool reduces common git workflows to simpler commands while providing suggestions, autocompletion for files and branches, and automatic fetch/fast-forwarding to reduce merge conflicts.

# SUBCOMMANDS

**save**
> Save changes to current branch (smart commit with optional amend)

**sync**
> Pull with rebase and push; optionally sync with another branch

**switch**
> Switch branches with prompt to create if non-existent

**checkout**
> Interactive branch/file checkout

**add**
> Interactive file staging

**info**
> Display current branch and status information

All standard **git** commands are also available through bit.

# PARAMETERS

All git parameters work with bit. Common ones include:

**-m** _message_
> Commit message (with bit commit)

**-a**
> Stage all modified files

**--amend**
> Amend the previous commit

**-r**
> Rebase when pulling

# CAVEATS

Requires Go environment with GOPATH and GOBIN set for installation. The **save** command may amend commits which rewrites history; use with caution on shared branches. Bit is experimental software and may have unexpected behavior in edge cases.

# HISTORY

bit was created by **Chris Walz** in **2020** as an experiment to modernize the git CLI experience. It aimed to reduce the complexity of common git operations while maintaining full git compatibility for power users.

# SEE ALSO

[git](/man/git)(1), [gh](/man/gh)(1), [tig](/man/tig)(1), [lazygit](/man/lazygit)(1)
