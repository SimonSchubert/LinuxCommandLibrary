# TAGLINE

command for Helix editor

# TLDR

**Open file**

```hx [file]```

**Open at line**

```hx [file]:[line]```

**Open multiple files**

```hx [file1] [file2]```

**Check language support**

```hx --health [language]```

**Open tutor**

```hx --tutor```

# SYNOPSIS

**hx** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to edit.

**--tutor**
> Open tutorial.

**--health** _LANG_
> Check language support.

**-c**, **--config** _FILE_
> Configuration file.

**--grammar**
> Fetch/build grammars.

**-v**
> Increase verbosity.

**--help**
> Display help information.

# DESCRIPTION

**hx** is the command for Helix editor. Helix is a post-modern modal editor with built-in LSP support and tree-sitter integration.

The editor uses selection-first editing model inspired by Kakoune. It provides syntax highlighting, completions, and diagnostics out of the box.

# CAVEATS

Different model than Vim. Learning curve for new users. Rust-based.

# HISTORY

Helix was created as a modern terminal editor, taking inspiration from **Kakoune** and **Neovim**.

# SEE ALSO

[helix](/man/helix)(1), [vim](/man/vim)(1), [nvim](/man/nvim)(1)
