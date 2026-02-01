# TLDR

**View a JSON file**

```jless [file.json]```

**View JSON from stdin**

```cat [file.json] | jless```

**View YAML file**

```jless --yaml [file.yaml]```

**Start with data mode** (default)

```jless -m data [file.json]```

**Start with line mode**

```jless -m line [file.json]```

**Truncate long strings**

```jless --truncate [file.json]```

**Open in scrolloff mode**

```jless --scrolloff [5] [file.json]```

# SYNOPSIS

**jless** [_options_] [_file_]

# PARAMETERS

**-m**, **--mode** _mode_
> Initial viewing mode: data or line.

**--yaml**
> Parse input as YAML instead of JSON.

**--truncate**
> Truncate long strings in display.

**--scrolloff** _lines_
> Minimum lines above/below cursor.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# KEYBOARD COMMANDS

**j**/**k** or **Down**/**Up**
> Move cursor down/up.

**h**/**l** or **Left**/**Right**
> Collapse/expand object or move out/in.

**H**/**L**
> Focus parent/first child.

**g**/**G**
> Jump to first/last element.

**Space**
> Toggle collapse of current node.

**c**
> Collapse all nodes.

**e**
> Expand all nodes.

**/**
> Search forward.

**?**
> Search backward.

**n**/**N**
> Next/previous search result.

**y**
> Yank (copy) current value.

**.**
> Repeat last command.

**:q** or **q**
> Quit.

# DESCRIPTION

**jless** is a command-line JSON viewer with vim-like navigation. It provides syntax highlighting, collapsible nodes, and search functionality for exploring JSON and YAML data.

Two viewing modes exist: **data mode** presents a tree view with collapsible objects and arrays, while **line mode** shows raw formatted output. Switch between them or start with **-m**.

Navigation follows vim conventions. Use **h**/**j**/**k**/**l** for movement, **Space** to toggle node expansion, and **c**/**e** for bulk collapse/expand. Search with **/** and navigate results with **n**/**N**.

The **yank** command copies values at the current position to the clipboard, useful for extracting specific data from large structures.

jless handles large files efficiently through lazy parsing and rendering, making it suitable for multi-megabyte JSON files.

# CAVEATS

Requires terminal with 256-color support for best display. Some terminals may not support clipboard integration for yank. Very deeply nested structures may affect navigation performance. YAML support requires explicit --yaml flag.

# HISTORY

jless was created by **Paul Julius Martinez** and first released in **2022**. Written in Rust, it was designed to fill the gap for a dedicated JSON browsing tool with vim-style navigation. The project gained popularity as a complement to jq for interactive JSON exploration. It continues development with YAML support and other improvements.

# SEE ALSO

[jq](/man/jq)(1), [gojq](/man/gojq)(1), [fx](/man/fx)(1), [less](/man/less)(1)
