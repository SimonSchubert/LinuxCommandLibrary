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

**Split all given files into vertical windows**

```hx --vsplit [file1] [file2]```

# SYNOPSIS

**hx** [_options_] [_files_]...

# PARAMETERS

_FILES_
> Files to edit, optionally suffixed with **:LINE** or **:LINE:COLUMN**.

**+**_N_
> Open the first given file at line _N_.

**--tutor**
> Open the interactive tutorial.

**--health** [_CATEGORY_]
> Check for setup problems; _CATEGORY_ can be a language name, or clipboard, languages, all-languages, all.

**-c**, **--config** _FILE_
> Configuration file to use.

**-g**, **--grammar** {**fetch**|**build**}
> Fetch or build tree-sitter grammars.

**-w**, **--working-dir** _PATH_
> Initial working directory.

**--vsplit** / **--hsplit**
> Split all given files vertically / horizontally into separate windows.

**--strict**
> Bail with an error for commands that can fail.

**--log** _FILE_
> File to use for logging.

**-v**
> Increase logging verbosity (repeatable).

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Print version information.

# DESCRIPTION

**hx** is the command for Helix editor. Helix is a post-modern modal editor with built-in LSP support and tree-sitter integration.

The editor uses selection-first editing model inspired by Kakoune. It provides syntax highlighting, completions, and diagnostics out of the box.

# CAVEATS

Different model than Vim. Learning curve for new users. Rust-based.

# HISTORY

Helix was created as a modern terminal editor, taking inspiration from **Kakoune** and **Neovim**.

# SEE ALSO

[helix](/man/helix)(1), [vim](/man/vim)(1), [nvim](/man/nvim)(1)

# RESOURCES

```[Source code](https://github.com/helix-editor/helix)```

```[Homepage](https://helix-editor.com)```

```[Documentation](https://docs.helix-editor.com)```

<!-- verified: 2026-07-19 -->
