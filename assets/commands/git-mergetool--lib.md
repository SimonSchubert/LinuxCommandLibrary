# TLDR

**Source for tool scripts**

```. "$(git --exec-path)/git-mergetool--lib"```

# SYNOPSIS

**git-mergetool--lib**

# DESCRIPTION

**git-mergetool--lib** is a shell library used by git-mergetool and git-difftool. It provides common functions for tool selection, invocation, and configuration handling.

The library is sourced by scripts that need merge/diff tool functionality. It handles tool detection, path configuration, and tool-specific setup.

git-mergetool--lib is internal infrastructure for tool integration.

# CAVEATS

Internal library, not a command. Sourced by other git scripts. Not intended for direct use.

# HISTORY

git-mergetool--lib is part of **Git's** internal infrastructure, providing shared code for merge and diff tool integration.

# SEE ALSO

[git-mergetool](/man/git-mergetool)(1), [git-difftool](/man/git-difftool)(1)
