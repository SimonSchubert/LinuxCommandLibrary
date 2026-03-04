# TAGLINE

Adaptable modal text editor

# TLDR

**Open a file** for editing

```ad [path/to/file]```

**Open multiple files**

```ad [file1] [file2]```

**Run an edit script** on files

```ad -e "[script]" [path/to/file]```

**Run an edit script** from a file

```ad -f [path/to/script] [path/to/file]```

**List open editor sessions**

```ad --list-sessions```

# SYNOPSIS

**ad** [_options_] [_files..._]

# PARAMETERS

**-e**, **--expression** _script_
> Execute an edit script inline

**-f**, **--script-file** _file_
> Load and execute an edit script from a file

**-c**, **--config** _path_
> Use a custom configuration file

**--default-config**
> Override user config and use defaults

**-l**, **--list-sessions**
> Display open editor sessions

**--rm-sockets**
> Clean up unresponsive socket files

**-h**, **--help**
> Display usage information

**-v**, **--version**
> Show version details

# DESCRIPTION

**ad** is a modal text editor written in Rust that combines vim-style modal editing with the extensibility philosophy of Plan 9's Acme editor. It features vim/kakoune-style text navigation and selection, emacs-inspired mini-buffer minor modes, sam/acme-style editing commands, and extension through external client programs via a built-in 9P file server.

The editor supports tree-sitter based syntax highlighting, LSP completions, mouse-based navigation and UI resizing, multiple columns and buffers, scratch buffers, and customizable keybindings. Configuration is done through a TOML file.

# CAVEATS

Still in active development with breaking changes between versions. Limited documentation beyond the built-in **:help** command. Requires familiarity with modal editing concepts.

# HISTORY

**ad** was created by **Innes Anderson-Morrison** (sminez) as an experimental editor combining ideas from vim, kakoune, emacs, and Plan 9's acme. Written in Rust and released under the MIT license, it reached version 0.4.0 in December 2025.

# SEE ALSO

[vim](/man/vim)(1), [kakoune](/man/kakoune)(1), [emacs](/man/emacs)(1)
