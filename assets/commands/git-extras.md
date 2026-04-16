# TAGLINE

Collection of useful Git utilities and commands

# TLDR

**Show git-extras version**

```git extras --version```

**Update git-extras** to the latest release

```git extras update```

**List all git-extras commands**

```git extras --help```

**Show a repository summary**

```git summary```

**Generate a changelog from tags**

```git changelog```

# SYNOPSIS

**git** **extras** [**--version**] [**--help**] [**update**]

# PARAMETERS

**--version**
> Print the installed git-extras version.

**--help**
> Print the list of extra subcommands provided by git-extras.

**update**
> Fetch and install the latest git-extras release from upstream.

# DESCRIPTION

**git extras** is a comprehensive collection of Git utility commands that extend Git's functionality beyond its core feature set. The package includes dozens of helper commands designed to streamline common Git workflows and provide shortcuts for repetitive tasks.

Notable commands include git-summary for repository statistics, git-changelog for generating change logs, git-effort for tracking development activity, git-delete-branch for safe branch cleanup, git-ignore for template-based .gitignore creation, and git-undo for reverting recent changes.

Installation methods vary by platform, with packages available through Homebrew, apt, yum, and manual installation from source. The tools are implemented primarily as shell scripts, making them portable and easy to customize.

# SEE ALSO

[git](/man/git)(1), [git-summary](/man/git-summary)(1), [git-changelog](/man/git-changelog)(1), [git-effort](/man/git-effort)(1), [git-ignore](/man/git-ignore)(1), [git-undo](/man/git-undo)(1)
