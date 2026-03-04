# TAGLINE

Jupyter notebooks in the terminal

# TLDR

**Launch** euporie

```euporie```

**Open** a notebook

```euporie [notebook.ipynb]```

**Create** new notebook

```euporie --new```

**Connect** to remote kernel

```euporie --kernel [kernel_name]```

# SYNOPSIS

**euporie** [_options_] [_notebook_]

# PARAMETERS

**--new**
> Create new notebook

**--kernel** _NAME_
> Connect to kernel

**--no-kernel**
> Open without kernel

**--theme** _THEME_
> Set color theme: dark, light

**--log-level** _LEVEL_
> Set logging level

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**euporie** is a terminal-based Jupyter notebook interface. It allows users to create, edit, and run Jupyter notebooks entirely within the terminal, without requiring a web browser.

The tool supports the full Jupyter notebook format, including markdown cells, code cells with syntax highlighting, and rich output display. It integrates with existing Jupyter kernels for executing code in various languages.

# KEYBINDINGS

**Enter**
> Edit cell / Execute cell (when in edit mode)

**Esc**
> Enter command mode

**a/b**
> Insert cell above/below

**dd**
> Delete cell

**y/m**
> Change cell type (code/markdown)

**↑/↓**
> Navigate cells

**Ctrl+S**
> Save notebook

**q**
> Quit

# CAVEATS

Requires Jupyter kernel for code execution. Rich output (images, plots) has limited display. Complex notebooks may have rendering issues. Terminal must support required Unicode and escape sequences.

# HISTORY

**euporie** was created to bring Jupyter notebooks to terminal-only environments, enabling notebook workflows in SSH sessions and minimal systems without web browsers.

# SEE ALSO

[jupyter](/man/jupyter)(1), [ipython](/man/ipython)(1), [nbterm](/man/nbterm)(1), [nbdime](/man/nbdime)(1)