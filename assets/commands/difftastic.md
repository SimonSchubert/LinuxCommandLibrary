# TAGLINE

Structural diff tool with syntax awareness

# TLDR

**Compare** two files with syntax-aware diffing

```difft [file1] [file2]```

**Compare** files or directories recursively

```difft [dir1] [dir2]```

**Show** changes in a specific file from git

```difft --git [file]```

**Use** as git difftool

```git difftool --tool=difftastic```

# SYNOPSIS

**difft** [_options_] [_path1_] [_path2_]

# PARAMETERS

**--color** _MODE_
> Color mode: auto, always, never

**--display** _MODE_
> Display mode: side-by-side, inline, or json

**--syntax-highlight** _MODE_
> Syntax highlighting: on, off

**--check-only**
> Exit with status 1 if files differ

**--strip-cr**
> Strip carriage returns before comparing

**--context** _N_
> Number of context lines to show

**--tab-width** _N_
> Tab width for display (default: 4)

**--width** _N_
> Maximum width of output display

**--list-languages**
> Print all supported languages

**-h, --help**
> Display help and exit

**-V, --version**
> Display version and exit

# DESCRIPTION

**difftastic** is a structural diff tool that understands syntax. Unlike traditional line-based diff tools, it parses the code according to the programming language and shows changes based on the actual structure of the code.

The tool supports over 20 programming languages and provides more accurate diffs by recognizing when code has moved versus changed. It can be used standalone or integrated with git as a difftool.

# GIT INTEGRATION

Configure as git difftool:

```git config --global diff.tool difftastic```
```git config --global difftool.difftastic.cmd 'difft "$LOCAL" "$REMOTE"'```

Use with git:

```git difftool```

# CAVEATS

May be slower than traditional diff tools for very large files. Requires language grammars which may not support all edge cases. Binary files are not supported. Very deeply nested structures may have display issues.

# HISTORY

**difftastic** was created by Wilfred Hughes to address the limitations of line-based diffing when working with code. It uses tree-sitter parsers to build syntax trees and compare them structurally. The project has gained significant popularity for providing clearer, more meaningful diffs.

# SEE ALSO

[diff](/man/diff)(1), [git](/man/git)(1), [delta](/man/delta)(1), [diffnav](/man/diffnav)(1)