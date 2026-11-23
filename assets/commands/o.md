# TAGLINE

snappy, configuration-free terminal text editor and mini-IDE (orbiton)

# TLDR

**Open a file**

```o [file]```

**Open at a specific line**

```o [file]:[line]```

**Open at a line**, alternative forms

```o [file] +[line]```

**Open at a line and column**

```o [file] [line] [column]```

**Open the first file whose name matches a glob** (searched recursively)

```o -g "[*_test.go]"```

**Format a file in place** and quit (no UI)

```o -F [file]```

**Build the project** around the given file

```o -b [file]```

**Monitor a file** for changes (tail-like, read-only)

```o -m [file]```

**Paste the clipboard** contents into a new file

```o -p [file]```

**Print a file** with syntax highlighting and quit

```o -t [file]```

**Use Pico/Nano keybindings**

```o -a [file]```

**List all digraphs**

```o -s```

# SYNOPSIS

**o** [_options_] [_file_[**:**_line_ | **+**_line_]] [[**+**]_line_ [_col_]]

# PARAMETERS

**-c**, **--copy**
> Copy the given file into the clipboard and quit.

**-p**, **--paste**
> Paste the clipboard into the given file and quit (combine with `-f` to overwrite).

**-f**, **--force**
> Ignore file locks when opening.

**-m**, **--monitor**
> Monitor the file for changes; open read-only.

**-t**, **--list**
> Print the file using the red/black theme and exit.

**-b**, **--build**
> Build the file/project instead of editing.

**-F**, **--fmt**
> Format the file in place and quit (headless: no TTY or UI needed).

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
> Do not write location history, search history, highscore, or build/format commands to `~/.cache/o`.

**-i**, **--input-file** _FILE_
> File piped to stdin when running programs from the editor (default `input.txt`).

**-a**, **--nano**
> Emulate Pico/Nano keybindings.

**-o**, **--ollama**
> Use Ollama to explain the function under the cursor (also enabled by `ORBITON_OLLAMA`).

**-q**, **--quick-help**
> Always show the quick-help pane at startup.

**-z**, **--no-quick-help**
> Never show the quick-help pane.

**-x**, **--noapprox**
> Disable approximate filename matching.

**-g**, **--glob** _GLOB_
> Search recursively for, and open, the first filename matching the glob.

**-B**, **--book**
> Open in the best available book mode (graphical if the terminal supports it, text otherwise).

**-T**, **--book-mode-text**
> Text book mode: soft wrap, plain text, word count.

**-G**, **--book-mode-graphical**
> Graphical book mode (requires Kitty, iTerm2, or Sixel support).

**-y**, **--esc**
> Exit the program by pressing Esc.

**-s**, **--digraphs**
> List all supported digraphs and exit.

**-v**, **--version**
> Print version information.

**-h**, **--help**
> Show help.

# DESCRIPTION

**o** (the executable name of **orbiton**) is a small, snappy, configuration-free text editor and mini-IDE for the terminal. It detects the language from the filename and provides syntax highlighting, rainbow parentheses, a macro recorder, cut/paste "portals" between sessions, jump-to-error from compiler output, LSP support, and simple gdb/dlv frontends.

Invoking `o` with a file opens it; a line number can be given as `file:N`, `file+N`, or as a second argument (`N` or `+N`), and a column as a third argument. If no file matches exactly, a case-insensitive approximate match is tried. The editor has no config file by design: the only optional setting is the `O_THEME` environment variable (a built-in theme name or a base16 YAML file), and `NO_COLOR` disables colors. Behavior also changes with the executable name: symlinks such as `vs` (light theme), `sw` (synthwave), `nano`/`nan` (Nano mode), or `osudo` (visudo replacement) are recognized. The optional `og` binary is a VTE-based GUI frontend.

# CAVEATS

Depending on the distribution the package is named `orbiton` or `o`. Keybindings differ from vim and emacs; `o --help` gives an overview and most actions are reachable from the `ctrl-o` menu. Filenames that contain `:` or `+` followed by a number are interpreted as line numbers unless such a file exists.

# HISTORY

**orbiton** was created by **Alexander F. Rødseth** (xyproto) and was first published as the `o` editor in **2019**. It is written in **Go** and released under the BSD 3-clause license.

# SEE ALSO

[vim](/man/vim)(1), [nano](/man/nano)(1), [micro](/man/micro)(1), [emacs](/man/emacs)(1)

# RESOURCES

```[Source code](https://github.com/xyproto/orbiton)```

```[Homepage](https://roboticoverlords.org/orbiton/)```

<!-- verified: 2026-11-23 -->
