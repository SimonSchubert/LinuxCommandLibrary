# TAGLINE

Visualize files matched by ignore rules

# TLDR

**Visualize ignored files in a project**

```vignore -d [/path/to/project]```

**Visualize ignored files in the current directory**

```vignore -d "$PWD"```

**Copy files** selected by the ignore rules to another directory

```vignore -d [/path/to/project] -c [/path/to/target]```

**Preview a copy** of the excluded files without writing anything

```vignore -d [/path/to/project] -c [/path/to/target] -i -y```

# SYNOPSIS

**vignore** [**-h**] **-d** _DIFFPATH_ [**-c** _TARGET_] [**-i**] [**-y**]

# PARAMETERS

**-d**, **--diffpath** _DIFFPATH_
> Absolute path to the project directory to analyze.

**-c**, **--copy** _TARGET_
> Copy the files filtered by the ignore rules to a directory.

**-i**, **--inverse**
> Invert the ignore rules.

**-y**, **--dryrun**
> Dry run.

**-h**, **--help**
> Show help message and exit.

# DESCRIPTION

**vignore** visualizes which files are matched by ignore rules such as .gitignore or .fdignore. It provides instant visual feedback to help developers understand their ignore patterns without guesswork. Requires **fd** to be installed.

# CAVEATS

Requires **fd** (fd-find) to be installed and available in PATH. Only supports ignore file formats that fd recognizes.

# HISTORY

**vignore** was created by **James4Ever0** and is written in **Python**.

# SEE ALSO

[fd](/man/fd)(1), [tree](/man/tree)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/James4Ever0/vignore)```

<!-- verified: 2026-11-09 -->
