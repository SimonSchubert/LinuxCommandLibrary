# TAGLINE

Enhanced interactive Python 3 REPL

# TLDR

**Start Python 3 REPL**

```ptpython3```

**Start with vi mode**

```ptpython3 --vi```

**Execute file then REPL**

```ptpython3 -i [script.py]```

# SYNOPSIS

**ptpython3** [_options_] [_file_]

# PARAMETERS

_FILE_
> Python file to execute before entering the REPL.

**--vi**
> Use Vi key bindings instead of the default Emacs bindings.

**-i**, **--interactive**
> Drop into an interactive REPL after executing _FILE_.

**--asyncio**
> Run an asyncio event loop so top-level _await_ expressions work.

**--light-bg**
> Use a color scheme tuned for terminals with a light background.

**--dark-bg**
> Use a color scheme tuned for terminals with a dark background.

**--config-file** _PATH_
> Load configuration from a non-default file.

**--history-file** _PATH_
> Use the specified file for input history.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**ptpython3** is the Python 3 variant of ptpython, an enhanced interactive REPL with syntax highlighting, autocompletion, multi-line editing, and vi/emacs key bindings built on the **prompt_toolkit** library.

On modern systems where Python 3 is the default, **ptpython** and **ptpython3** are typically identical. The separate binary exists for systems where both Python 2 and Python 3 are installed side by side.

# CONFIGURATION

**$PTPYTHON_CONFIG_HOME**
> Override the directory ptpython searches for its configuration. Defaults to a platform-specific user config directory (e.g. **~/.config/ptpython/** on Linux).

**$PYTHONSTARTUP**
> Standard Python variable; the referenced file runs before the interactive prompt.

# CAVEATS

Python 3 variant of ptpython; on modern systems where Python 3 is the default the two binaries are equivalent. Configuration files are honored only when ptpython is launched directly — not when embedded inside another application.

# HISTORY

ptpython3 is the **Python 3 variant** of ptpython.

# INSTALL

```dnf: sudo dnf install ptpython3```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ptpython](/man/ptpython)(1), [python3](/man/python3)(1), [ipython3](/man/ipython3)(1)

