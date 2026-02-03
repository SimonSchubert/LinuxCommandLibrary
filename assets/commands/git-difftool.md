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

**git difftool** shows changes using external diff tools. Supports vimdiff, meld, kdiff3, and other visual diff applications.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-mergetool](/man/git-mergetool)(1)

