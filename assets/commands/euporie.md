# TAGLINE

Jupyter notebooks, consoles, and previews in the terminal

# TLDR

**Open a notebook** in the terminal editor

```euporie notebook [notebook.ipynb]```

**Start a Jupyter console** connected to a kernel

```euporie console --kernel [python3]```

**Render a notebook** to the terminal without opening it

```euporie preview [notebook.ipynb]```

**Save a rendered preview** to a file

```euporie preview --save-as [output.txt] [notebook.ipynb]```

**Run euporie as a multi-user SSH hub**

```euporie hub --host [0.0.0.0] --port [8022]```

**Pick a color scheme**

```euporie notebook --color-scheme [dark] [notebook.ipynb]```

# SYNOPSIS

**euporie** _app_ [_options_] [_notebook_]

**euporie** **notebook** | **console** | **preview** | **hub** [_options_]

# APPS / SUBCOMMANDS

**notebook**
> Interactive notebook editor with Jupyter-like keybindings.

**console**
> Line-by-line REPL against any Jupyter kernel.

**preview**
> Render a notebook to stdout, a pager, or a file (no kernel required).

**hub**
> Multi-user SSH server — each client gets their own notebook editor.

# PARAMETERS

**--kernel** _NAME_
> Jupyter kernel to connect to (e.g. `python3`, `ir`, `julia-1.10`).

**--no-kernel**
> Open the notebook without starting a kernel.

**--color-scheme** _NAME_
> Color scheme: `default`, `light`, `dark`, `inverse`, or a custom scheme.

**--syntax-theme** _NAME_
> Pygments theme for code cells.

**--tab-size** _N_
> Number of spaces per tab.

**--terminal-graphics** _MODE_
> Image protocol: `sixel`, `iterm`, `kitty`, or `none`.

**--log-level** _LEVEL_
> Logging verbosity (`debug`, `info`, `warning`, `error`).

**--log-file** _FILE_
> Path to a log file.

**--host** _HOST_ (hub)
> Bind address for the SSH hub.

**--port** _PORT_ (hub)
> Listen port for the SSH hub.

**--save-as** _FILE_ (preview)
> Write rendered output to _FILE_ instead of stdout.

**--page** (preview)
> Pipe rendered output to `$PAGER`.

**-v**, **--version**
> Show version and exit.

**-h**, **--help**
> Show help.

# DESCRIPTION

**euporie** is a suite of terminal applications that bring the Jupyter ecosystem to the shell. Each subcommand is a self-contained app sharing the same rendering engine for markdown, LaTeX, syntax-highlighted code, and rich output (including inline images via sixel, iTerm2, or kitty graphics protocols).

The **notebook** app is a full editor that can execute cells, manage kernels, and save `.ipynb` files. The **console** app is a REPL front-end for any installed Jupyter kernel. The **preview** app is non-interactive and suitable for CI pipelines or scripting. The **hub** exposes the notebook editor over SSH so multiple users can share a server's resources.

# CONFIGURATION

Per-app configuration can be set via environment variables prefixed with the app name, e.g. `EUPORIE_NOTEBOOK_COLOR_SCHEME=dark`, `EUPORIE_CONSOLE_KERNEL=python3`. A config file at `~/.config/euporie/euporie.toml` is loaded by all apps.

# KEYBINDINGS (notebook)

**Enter / Esc**
> Toggle edit and command mode in the current cell.

**a** / **b**
> Insert cell above / below.

**dd**
> Delete current cell.

**y** / **m** / **r**
> Change cell type to code / markdown / raw.

**Ctrl-Enter** / **Shift-Enter**
> Run cell / run and go to next.

**Ctrl-S**
> Save notebook.

**Ctrl-Q**
> Quit.

# CAVEATS

Rich output (images, plots) requires a terminal that implements sixel, iTerm2, or kitty graphics. Complex JavaScript-based widgets (ipywidgets) have limited support. The hub app needs a host key and user authentication — see the docs for hub configuration.

# HISTORY

**euporie** is developed by **Josiah Outram Halstead** (joouha) and written in **Python** on top of **prompt_toolkit**. It is distributed on PyPI as `euporie` (install with `pip install euporie`).

# SEE ALSO

[jupyter](/man/jupyter)(1), [ipython](/man/ipython)(1)
