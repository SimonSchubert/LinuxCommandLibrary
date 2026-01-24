# TLDR

**Pipe git diff** through diff-so-fancy

```git diff | diff-so-fancy```

**Configure git** to use diff-so-fancy

```git config --global core.pager "diff-so-fancy | less --tabs=4 -RFX"```

**Use as git diff tool**

```git config --global interactive.diffFilter "diff-so-fancy --patch"```

**Show file changes** with improved output

```diff-so-fancy < [changes.diff]```

# SYNOPSIS

**diff-so-fancy** [_options_]

# DESCRIPTION

**diff-so-fancy** transforms git diff output into a more human-readable format. It improves the visual presentation of diffs with better line highlighting, cleaner headers, and removed chunk markers.

The tool uses terminal colors effectively to highlight what changed within lines, making code reviews faster and easier. It's designed as a git pager replacement.

# PARAMETERS

**--patch**
> Use patch-compatible output mode.

**--no-colors**
> Disable color output.

**--colors**
> Enable color output.

**--set-defaults**
> Configure git to use diff-so-fancy.

# GIT CONFIGURATION

```
git config --global core.pager "diff-so-fancy | less --tabs=4 -RFX"
git config --global color.ui true
git config --global color.diff-highlight.oldNormal "red bold"
git config --global color.diff-highlight.oldHighlight "red bold 52"
git config --global color.diff-highlight.newNormal "green bold"
git config --global color.diff-highlight.newHighlight "green bold 22"
```

# CAVEATS

Requires Perl. Modified output not suitable for patch application. Some themes may need color adjustment. Large diffs may be slower.

# HISTORY

**diff-so-fancy** was created by **Seth Vargo** and is maintained by **so-fancy**. It emerged from the desire for better diff visualization in terminals, building on git's diff-highlight script with additional formatting improvements.

# SEE ALSO

[git-diff](/man/git-diff)(1), [delta](/man/delta)(1), [colordiff](/man/colordiff)(1), [diff](/man/diff)(1)
