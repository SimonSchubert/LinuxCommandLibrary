# TAGLINE

Visualize files matched by ignore rules

# TLDR

**Visualize ignored files in a project**

```vignore -d [/path/to/project]```

**Visualize ignored files in the current directory**

```vignore -d .```

# SYNOPSIS

**vignore** [**-h**] **-d** _DIFFPATH_

# PARAMETERS

**-d** _DIFFPATH_
> Path to the project directory to analyze.

**-h**, **--help**
> Show help message and exit.

# DESCRIPTION

**vignore** visualizes which files are matched by ignore rules such as .gitignore, .dockerignore, or .fdignore. It provides instant visual feedback to help developers understand their ignore patterns without guesswork. Requires **fd** to be installed.

# CAVEATS

Requires **fd** (fd-find) to be installed and available in PATH. Only supports ignore file formats that fd recognizes.

# HISTORY

**vignore** was created by **James4Ever0** and is written in **Python**.

# SEE ALSO

[fd](/man/fd)(1), [tree](/man/tree)(1), [git](/man/git)(1)
