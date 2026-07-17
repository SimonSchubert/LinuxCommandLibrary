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

**-t** _tool_, **--tool** _tool_
> Use specific diff tool instead of the configured default.

**-y**, **--no-prompt**
> Don't prompt before launching each diff tool instance.

**--prompt**
> Prompt before each invocation (default behavior; overrides config).

**-d**, **--dir-diff**
> Copy modified files to a temp location and diff entire directory trees at once. Never prompts.

**-g**, **--gui**
> Use the tool configured in **diff.guitool** instead of **diff.tool**.

**--staged**
> Compare staged changes (same as **git diff --staged**).

**--tool-help**
> List available tools recognized on this system.

**-x** _cmd_, **--extcmd** _cmd_
> Run a custom command as `cmd $LOCAL $REMOTE`, ignoring configured tools.

**--no-symlinks**
> In dir-diff mode, copy files instead of symlinking unchanged ones (always on for Windows).

**--trust-exit-code**
> Exit with the invoked tool's exit code instead of ignoring it.

# DESCRIPTION

**git difftool** launches external visual diff tools to review changes in Git repositories. It is a frontend to **git diff** and accepts the same options and arguments, but hands the actual comparison off to a graphical or terminal-based diff application instead of printing a unified diff.

The command supports a wide variety of diff tools including vimdiff, meld, kdiff3, emerge, and opendiff; run **git difftool --tool-help** to see which are detected. Directory diff mode (**-d**) is particularly useful for graphical tools that support comparing entire directory trees simultaneously, since it stages a temporary copy of both trees rather than invoking the tool once per file.

# CONFIGURATION

**diff.tool**
> Default tool used by difftool (and **--gui** falls back through merge.guitool, diff.tool, merge.tool).

**difftool.\<tool\>.path**
> Explicit path to a tool's executable, when it isn't on **PATH**.

**difftool.\<tool\>.cmd**
> Custom command line for a tool, with **$LOCAL**, **$REMOTE**, **$MERGED**, and **$BASE** available.

**difftool.prompt**
> Whether to prompt before launching each instance (default true).

# CAVEATS

Errors from the diff tool are ignored unless **--trust-exit-code** is set. Directory diff mode discards tool-specific per-file invocation, which can behave differently for tools expecting single-file input.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-mergetool](/man/git-mergetool)(1), [git-log](/man/git-log)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-difftool)```

<!-- verified: 2026-07-17 -->
