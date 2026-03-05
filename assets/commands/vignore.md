# TAGLINE

Visualize files matched by ignore rules

# TLDR

**Visualize ignored files in a project**

```vignore -d [/path/to/project]```

# SYNOPSIS

**vignore** [**-h**] **-d** _DIFFPATH_

# PARAMETERS

**-d** _DIFFPATH_
> Path to the project directory to analyze.

# DESCRIPTION

**vignore** visualizes which files are matched by ignore rules such as .gitignore, .dockerignore, or .fdignore. It provides instant visual feedback to help developers understand their ignore patterns without guesswork. Requires **fd** to be installed.

# HISTORY

**vignore** was created by **James4Ever0** and is written in **Python**.

# SEE ALSO

[fd](/man/fd)(1), [tree](/man/tree)(1)
