# TAGLINE

Modal text editor with multiple selections as a core concept

# TLDR

**Open a file**

```kak [path/to/file]```

**Open multiple files**

```kak [file1] [file2]```

**Open at a specific line**

```kak +[line] [path/to/file]```

**Start in a named session**

```kak -s [session_name] [path/to/file]```

**Connect to an existing session**

```kak -c [session_name]```

**Run in filter mode** (apply commands to stdin)

```echo "[text]" | kak -f '[commands]'```

# SYNOPSIS

**kak** [**-s** _session_] [**-c** _session_] [**-f** _commands_] [**+**_line_] [_file_...]

# PARAMETERS

**-s** _SESSION_
> Start a named session

**-c** _SESSION_
> Connect to an existing session

**-f** _COMMANDS_
> Run commands on stdin (filter mode)

**-e** _COMMANDS_
> Execute commands after startup

**-n**
> Don't load kakrc configuration

**-l**
> List existing sessions

**-d**
> Run as daemon (no UI)

# DESCRIPTION

**Kakoune** (invoked as **kak**) is a modal text editor inspired by Vim but designed around **multiple selections** as its central editing primitive. Instead of operating on a single cursor, most operations in Kakoune work on one or more selections simultaneously, enabling powerful text manipulation with fewer keystrokes.

Kakoune follows the **selection → action** model (as opposed to Vim's action → motion), meaning you first select text (using regex, text objects, or other methods), see what's selected, and then apply an operation. The editor supports client-server architecture for collaborative editing, built-in syntax highlighting, and extensive extensibility through its scripting language.

# CAVEATS

The selection-first paradigm differs from Vim's muscle memory and requires adjustment. Plugin ecosystem is smaller than Vim's. Configuration uses its own scripting language rather than a mainstream language.

# HISTORY

**Kakoune** was created by **Maxime Coste** (mawww) and is written in **C++**. Development began around **2011** as an experiment to improve upon Vim's editing model. The multiple-selections approach inspired later editors including **Helix**.

# SEE ALSO

[vim](/man/vim)(1), [helix](/man/helix)(1), [neovim](/man/neovim)(1)
