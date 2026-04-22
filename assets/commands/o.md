# TAGLINE

snappy, configuration-free terminal text editor and mini-IDE (orbiton)

# TLDR

**Open a file**

```o [file]```

**Open at a specific line**

```o [file]:[line]```

**Open at a line and column**

```o [file]:[line]:[column]```

**Open the first file whose name matches a substring**

```o -g [substring]```

**Format a file** instead of editing it

```o -F [file]```

**Build the project** around the given file

```o -b [file]```

**Monitor a file** for changes (tail-like, read-only)

```o -m [file]```

**Paste the clipboard** contents into a new file

```o -p [file]```

**List all digraphs**

```o -s```

# SYNOPSIS

**o** [_options_] [_file_[:_line_[:_col_]]]

# PARAMETERS

**-c**, **--copy**
> Copy the file into the clipboard.

**-p**, **--paste**
> Paste the clipboard into the given file (combine with `-f` to overwrite).

**-f**, **--force**
> Ignore file locks when opening.

**-m**, **--monitor**
> Monitor the file for changes; open read-only.

**-t**, **--list**
> Print the file with syntax highlighting and exit.

**-b**, **--build**
> Build the file/project instead of editing.

**-F**, **--format**
> Format the file instead of editing.

**-k**, **--create-dir**
> Create parent directories as needed for new files.

**-d**, **--debug**
> Start in debug (gdb/dlv) mode.

**-r**, **--release**
> Build in release mode instead of debug when applicable.

**-l**, **--last-command**
> Print the last used build/format/export command and exit.

**-e**, **--clear-locks**
> Clear all file locks and close portals.

**-n**, **--no-cache**
> Do not write history, highscore, or last-command caches.

**-i**, **--input-file** _FILE_
> Use _FILE_ as stdin for programs launched with Ctrl-Space.

**-a**, **--nano**
> Emulate Pico/Nano keybindings.

**-o**, **--ollama**
> Enable Ollama AI features (model from `$OLLAMA_MODEL`).

**-q**, **--quick-help**
> Always show the quick-help pane at startup.

**-z**, **--no-quick-help**
> Never show the quick-help pane.

**-x**, **--noapprox**
> Disable approximate filename matching.

**-g**, **--glob** _SUBSTRING_
> Open the first filename matching the substring.

**-s**, **--digraphs**
> List all supported digraphs and exit.

**-v**, **--version**
> Print version information.

**-h**, **--help**
> Show help.

# DESCRIPTION

**o** (the executable name of **orbiton**) is a small, snappy, configuration-free text editor and mini-IDE for the terminal. It detects the language from the filename and provides syntax highlighting, rainbow parentheses, a macro recorder, cut/paste "portals" between sessions, jump-to-error from compiler output, LSP support, and simple gdb/dlv frontends.

Invoking `o` with a file opens it; appending `:line` or `:line:col` jumps to that position. The editor has no config file by design: most behavior is inferred from file type and environment. A companion binary `ko` opens in light theme; `lo` reduces colors for low-bandwidth terminals.

# CAVEATS

Not related to the shell's built-in `o` alias (if any). Some distros ship orbiton under a different package name (e.g. `orbiton`, `o-editor`). Keybindings differ from vim/emacs; see the built-in quick-help (`Ctrl-o` then `?`).

# HISTORY

**orbiton** was created by **Alexander F. Rødseth** (xyproto). The project is written in **Go** and is published on GitHub at `xyproto/orbiton` under the BSD 3-clause license.

# SEE ALSO

[vim](/man/vim)(1), [nano](/man/nano)(1), [micro](/man/micro)(1), [emacs](/man/emacs)(1)
