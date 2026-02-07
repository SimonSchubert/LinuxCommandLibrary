# TAGLINE

Compare changes using external visual diff tools

# TLDR

**Compare using external tool**

```git difftool [file]```

**Compare with specific tool**

```git difftool -t [vimdiff] [file]```

**Compare without prompts**

```git difftool -y [file]```

**Compare staged changes**

```git difftool --staged```

**Compare commits**

```git difftool [commit1] [commit2]```

**Directory diff mode**

```git difftool -d [commit]```

# SYNOPSIS

**git** **difftool** [_options_] [_commit_] [_--_] [_files_...]

# PARAMETERS

**-t**, **--tool** _tool_
> Use specific diff tool.

**-y**, **--no-prompt**
> Don't prompt before launching.

**-d**, **--dir-diff**
> Directory diff mode.

**--staged**
> Compare staged changes.

**--tool-help**
> List available tools.

**-x** _cmd_
> Custom command.

# DESCRIPTION

**git difftool** launches external visual diff tools to review changes in Git repositories. Unlike the built-in git diff which displays changes in the terminal, difftool provides a graphical or enhanced viewing experience through specialized applications.

The command supports a wide variety of diff tools including vimdiff, meld, kdiff3, emerge, opendiff, and many others. Directory diff mode (-d) is particularly useful for graphical tools that support comparing entire directory trees simultaneously.

# CONFIGURATION

**~/.gitconfig**
> Global difftool settings including default tool and tool-specific configurations.

**.git/config**
> Repository-specific difftool configuration overriding global settings.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-mergetool](/man/git-mergetool)(1)
