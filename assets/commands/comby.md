# TAGLINE

structural code search and replace tool

# TLDR

**Simple replacement**

```comby 'console.log(:[arg])' 'logger.info(:[arg])' [.js]```

**Replace in directory**

```comby 'foo(:[x])' 'bar(:[x])' [src/] -matcher [.py]```

**Preview changes**

```comby 'old' 'new' -match-only```

**Interactive review**

```comby 'pattern' 'replacement' -review```

**In-place modification**

```comby 'old' 'new' -in-place [file.go]```

**Diff output**

```comby 'old' 'new' -diff [file.js]```

# SYNOPSIS

**comby** _match_template_ _rewrite_template_ [_path_] [_options_]

# DESCRIPTION

**comby** is a structural code search and replace tool for any language. Uses lightweight templates with holes (:[name]) to match code structures. Understands syntax of code blocks, strings, and comments.

# PARAMETERS

**-matcher** _ext_
> File extension matcher (.py, .js, etc.)

**-match-only**
> Only show matches, don't rewrite

**-in-place**
> Modify files in place

**-diff**
> Show unified diff output

**-review**
> Interactive review mode

**-stdin**
> Read from stdin

**-stdout**
> Write to stdout

**-count**
> Count matches only

**-d** _dir_
> Target directory

# HOLE SYNTAX

**:[name]**
> Match any expression

**:[name:e]**
> Match balanced expression

**:[[name]]**
> Match across lines

**:[_]**
> Anonymous hole (discard)

# CAVEATS

Better than regex for nested structures. Does not support indentation-sensitive languages (Python, Haskell).

# SEE ALSO

[sed](/man/sed)(1), [ast-grep](/man/ast-grep)(1), [semgrep](/man/semgrep)(1)
