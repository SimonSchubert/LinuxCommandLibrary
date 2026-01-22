# TLDR

**Open file**

```hx [file]```

**Open at specific line**

```hx [file]:[line]```

**Open multiple files**

```hx [file1] [file2]```

**Check health**

```hx --health```

**Open tutor**

```hx --tutor```

# SYNOPSIS

**hx** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to edit.

**--health** _LANG_
> Check health for language.

**--tutor**
> Open interactive tutorial.

**--grammar**
> Fetch and build grammars.

**-c**, **--config** _FILE_
> Configuration file.

**--log** _FILE_
> Log file path.

**-v**
> Increase verbosity.

**--help**
> Display help information.

# DESCRIPTION

**Helix** is a post-modern modal text editor inspired by Kakoune and Vim. It features multiple selections, built-in LSP support, and tree-sitter integration.

The editor provides syntax highlighting, auto-completion, and diagnostics out of the box. It uses selection-action model instead of verb-object.

Helix is a modern terminal editor.

# CAVEATS

Different keybindings than Vim. Learning curve for selection model. Rust-based, requires compilation.

# HISTORY

Helix was created as a modern alternative to Vim and Neovim, focusing on better defaults and built-in functionality.

# SEE ALSO

[vim](/man/vim)(1), [nvim](/man/nvim)(1), [kakoune](/man/kakoune)(1)
