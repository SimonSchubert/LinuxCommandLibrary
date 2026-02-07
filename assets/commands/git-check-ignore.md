# TAGLINE

Debug gitignore patterns and ignored files

# TLDR

**Check if file is ignored**

```git check-ignore [file.txt]```

**Show matching rule**

```git check-ignore -v [file.txt]```

**Check multiple files**

```git check-ignore [file1.txt] [file2.txt]```

**Read paths from stdin**

```echo "[path]" | git check-ignore --stdin```

**Check all ignored files**

```git check-ignore *```

# SYNOPSIS

**git check-ignore** [_options_] _pathspec_

# PARAMETERS

_PATHSPEC_
> File paths to check.

**-v**, **--verbose**
> Show source and pattern.

**--stdin**
> Read paths from stdin.

**-z**
> NUL-terminate output.

**-n**, **--non-matching**
> Show non-matching paths.

**-q**, **--quiet**
> Exit with status only.

**--help**
> Display help information.

# DESCRIPTION

**git check-ignore** debugs gitignore patterns. It reports whether paths are ignored and which pattern causes the ignore, helping troubleshoot gitignore rules.

The verbose mode (**-v**) shows the gitignore file, line number, and pattern responsible for ignoring a path. This is essential for debugging complex gitignore configurations with multiple .gitignore files at different directory levels.

The **--non-matching** option combined with **-v** can also show why a file is _not_ being ignored, helping diagnose cases where files unexpectedly appear in git status output.

# CONFIGURATION

**.gitignore**
> Pattern list specifying intentionally untracked files to ignore. Multiple .gitignore files can exist at different directory levels.

**~/.config/git/ignore**
> User-level global ignore patterns applied to all repositories.

**/etc/gitconfig**
> System-wide core.excludesFile configuration pointing to global ignore file.

# CAVEATS

Only checks patterns, not actual files. Nested gitignore files have priority. Negation patterns can override ignores.

# HISTORY

git check-ignore was added to **Git** to help debug gitignore rules, addressing common frustration with ignore pattern behavior.

# SEE ALSO

[git-status](/man/git-status)(1), [gitignore](/man/gitignore)(5)
