# TAGLINE

Remove unused imports and variables from Python code

# TLDR

**Remove** unused imports from file

```autoflake --in-place --remove-unused-variables [file.py]```

Remove from **all Python files**

```autoflake --in-place --remove-all-unused-imports -r [.]```

**Check** without modifying

```autoflake --check [file.py]```

Remove unused imports and **variables**

```autoflake --in-place --remove-unused-variables --remove-all-unused-imports [file.py]```

# SYNOPSIS

**autoflake** [_--in-place_] [_--remove-unused-variables_] [_options_] _files_

# DESCRIPTION

**autoflake** removes unused imports and variables from Python code. It helps keep code clean by eliminating dead code automatically.

The tool uses static analysis to identify unused elements and can modify files in place or report issues.

# PARAMETERS

**--in-place**
> Modify files directly

**--remove-unused-variables**
> Remove unused variables

**--remove-all-unused-imports**
> Remove all unused imports

**--remove-duplicate-keys**
> Remove duplicate dictionary keys

**--check**
> Return error if changes needed (CI mode)

**-r**, **--recursive**
> Process directories recursively

**--exclude** _pattern_
> Exclude files matching pattern

**--imports** _modules_
> Additional modules to remove

# CAVEATS

May incorrectly identify imports used only in type hints. Does not handle all edge cases. Review changes before committing. Works well with other formatters like black.

# HISTORY

**autoflake** was created to automate cleanup of unused Python imports, complementing code formatters and linters.

# SEE ALSO

[black](/man/black)(1), [isort](/man/isort)(1), [flake8](/man/flake8)(1)
