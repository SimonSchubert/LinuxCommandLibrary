# TAGLINE

Modern shell that treats data as structured information

# TLDR

**Start the shell**

```nu```

**Run a command**

```nu -c "[command]"```

**Run a script**

```nu [path/to/script.nu]```

**List files as structured data**

```ls | where size > 1mb | sort-by modified```

# SYNOPSIS

**nu** [_options_] [_script_]

# PARAMETERS

**-c** _COMMAND_
> Execute a command string and exit.

**--config** _FILE_
> Specify a configuration file.

# DESCRIPTION

**nushell** (command: **nu**) is a modern shell that treats data as structured information rather than plain text. It brings spreadsheet-like data manipulation to the command line with built-in support for JSON, CSV, YAML, SQLite, Excel, and more.

Nu pipelines use structured data so you can safely select, filter, and sort the same way every time. It draws inspiration from PowerShell, functional programming languages, and modern CLI tools. It is cross-platform with first-class support for Windows, macOS, and Linux.

# CONFIGURATION

**$nu.config-path**
> Configuration file location (use `$nu.config-path` to find it).

# CAVEATS

Not fully POSIX-compatible. Some Bash scripts and idioms do not work directly in Nushell. Plugin ecosystem is still evolving.

# HISTORY

**nushell** was created by **Yehuda Katz** and **Jonathan Turner** and is written in **Rust**. Development started in **2019**.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1), [pwsh](/man/pwsh)(1)
