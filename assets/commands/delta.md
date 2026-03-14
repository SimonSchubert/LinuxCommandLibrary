# TAGLINE

syntax-highlighting pager for diffs

# TLDR

**View git diff** with delta

```git diff | delta```

**Compare two files**

```delta [file1.txt] [file2.txt]```

**Use side-by-side** view

```delta -s [file1.txt] [file2.txt]```

**Show line numbers**

```delta -n [file1.txt] [file2.txt]```

**Use specific syntax** theme

```delta --syntax-theme [Dracula] [file1.txt] [file2.txt]```

**Highlight word-level changes**

```delta --word-diff-regex '\w+' [file1.txt] [file2.txt]```

**Enable hyperlinks in output**

```delta --hyperlinks [file1.txt] [file2.txt]```

**Configure as git pager**

```git config --global core.pager delta```

# SYNOPSIS

**delta** [_options_] [_file1_] [_file2_]

# PARAMETERS

_FILE1_ _FILE2_
> Files to compare (reads from stdin if not provided).

**-s**, **--side-by-side**
> Side-by-side display mode.

**-n**, **--line-numbers**
> Show line numbers.

**--syntax-theme** _THEME_
> Syntax highlighting theme.

**--word-diff-regex** _REGEX_
> Highlight word-level changes using regex to define words.

**--hyperlinks**
> Render commit hashes, file paths, and line numbers as terminal hyperlinks.

**--features** _NAMES_
> Activate named feature sets defined in gitconfig.

**--paging** _auto|always|never_
> Control pager usage.

**--true-color** _auto|always|never_
> Control 24-bit RGB color output.

**--navigate**
> Enable navigation with n/N keys.

**--dark**/**--light**
> Optimize for dark/light terminal.

**--diff-so-fancy**
> Emulate diff-so-fancy output.

**--help**
> Display help information.

# DESCRIPTION

**delta** is a syntax-highlighting pager for git, diff, and grep output. It provides beautiful, readable diffs with features like side-by-side view, line numbering, and word-level change highlighting.

delta is designed as a git pager replacement, integrating seamlessly with git diff, git show, git log, and git blame. It uses the same syntax highlighting engine as bat, supporting hundreds of languages.

Features include navigation between hunks, customizable themes, hyperlinks to line numbers, and special handling of merge conflicts. It can also process unified diff output from other tools.

# CONFIGURATION

**~/.gitconfig**
> Configure delta as the default git pager with core.pager and delta.* options.

# CAVEATS

Requires terminal with true color support for best results. Large diffs may be slow to render. Some themes may not work well with all terminal color schemes.

# HISTORY

delta was created by **Dan Davison** and released in **2019**. It was inspired by diff-so-fancy but implemented in Rust for better performance and with additional features like syntax highlighting.

# SEE ALSO

[diff](/man/diff)(1), [git](/man/git)(1), [bat](/man/bat)(1), [diff-so-fancy](/man/diff-so-fancy)(1)
