# TAGLINE

post-modern modal text editor inspired by Kakoune and Vim

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

**Open a file at a specific working directory**

```hx -w [path/to/project] [file]```

# SYNOPSIS

**hx** [_options_] [_files_]...

# PARAMETERS

_FILES_
> Files to edit, optionally suffixed with **:LINE** or **:LINE:COLUMN**.

**+**_N_
> Open the first given file at line _N_ (or the last line if _N_ is omitted).

**--health** [_CATEGORY_]
> Check for potential setup problems; _CATEGORY_ can be a language name, or one of clipboard, languages, all-languages, all.

**--tutor**
> Open the interactive tutorial.

**-g**, **--grammar** {**fetch**|**build**}
> Fetch or build the tree-sitter grammars listed in languages.toml.

**-c**, **--config** _FILE_
> Specify a configuration file to use.

**--log** _FILE_
> Specify a file to use for logging.

**-w**, **--working-dir** _PATH_
> Specify an initial working directory.

**--vsplit**
> Split all given files vertically into separate windows.

**--hsplit**
> Split all given files horizontally into separate windows.

**--strict**
> Bail with an error for commands that can fail.

**-v**
> Increase logging verbosity (repeatable, up to 3 times).

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Print version information.

# DESCRIPTION

**Helix** is a post-modern modal text editor inspired by Kakoune and Vim. It features multiple selections, built-in LSP support, and tree-sitter integration.

The editor provides syntax highlighting, auto-completion, and diagnostics out of the box. It uses selection-action model instead of verb-object.

# CAVEATS

Different keybindings than Vim. Learning curve for selection model. Rust-based, requires compilation.

# HISTORY

**Helix** was started by **Blaž Hrastnik** in 2020 and first announced publicly in 2021. Unlike Vim/Neovim, it ships with sane defaults, tree-sitter-based syntax analysis, and LSP support built in rather than added via plugins, and it adopts Kakoune's selection-first ("selection, then action") editing model.

# SEE ALSO

[hx](/man/hx)(1), [vim](/man/vim)(1), [nvim](/man/nvim)(1), [kakoune](/man/kakoune)(1)

# RESOURCES

```[Source code](https://github.com/helix-editor/helix)```

```[Homepage](https://helix-editor.com)```

```[Documentation](https://docs.helix-editor.com)```

<!-- verified: 2026-07-19 -->
