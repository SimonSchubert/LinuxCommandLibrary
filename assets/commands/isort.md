# TAGLINE

sorts Python imports alphabetically and separates them into sections

# TLDR

**Sort imports in a file in place**

```isort [file.py]```

**Check without modifying (exit non-zero if changes needed)**

```isort --check-only [file.py]```

**Show diff of proposed changes**

```isort --diff [file.py]```

**Sort all Python files in the current directory recursively**

```isort .```

**Use Black-compatible profile**

```isort --profile black [file.py]```

**Set line length and run in parallel**

```isort -l [100] -j [4] [path]```

# SYNOPSIS

**isort** [_options_] [_path_...]

# PARAMETERS

**-c**, **--check-only**
> Check whether imports are sorted without modifying files. Exit code 1 if changes would be made.

**--diff**
> Print a diff of the changes isort would make instead of applying them.

**--profile** _NAME_
> Use a predefined profile (black, django, pycharm, google, open_stack, plone, attrs, hug, wemake, appnexus).

**-l**, **--line-length** _LENGTH_
> Maximum import line length used for wrapping. Default is 79.

**--force-single-line**, **--sl**
> Force all `from` imports onto their own line.

**--skip**, **-s** _PATH_
> File or directory to skip. May be given multiple times.

**--atomic**
> Abort writing the output if the resulting file would contain syntax errors.

**-j**, **--jobs** _N_
> Number of files to process in parallel. A negative value uses the number of CPU cores.

**--settings-path**, **--sp** _PATH_
> Explicit path to the settings file or directory (overrides auto-detection).

**-v**, **--verbose**
> Print detailed output about processing.

**-q**, **--quiet**
> Only show errors.

**--help**
> Display help information.

# DESCRIPTION

**isort** sorts Python imports alphabetically and separates them into sections. It follows PEP 8 guidelines for import organization.

The tool groups imports by standard library, third-party, and local. It integrates with editors and CI pipelines.

# CAVEATS

Python-specific. May conflict with other formatters. Use profiles for compatibility.

# HISTORY

isort was created by **Timothy Crosley** to automatically sort and organize Python imports following best practices.

# SEE ALSO

[black](/man/black)(1), [ruff](/man/ruff)(1), [flake8](/man/flake8)(1), [autopep8](/man/autopep8)(1), [yapf](/man/yapf)(1), [pylint](/man/pylint)(1), [mypy](/man/mypy)(1)
