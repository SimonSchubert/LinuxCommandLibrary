# TAGLINE

syntax-aware structural diff tool

# TLDR

**Compare two files** with structural diffing

```difft [old_file] [new_file]```

**Compare files with side-by-side output**

```difft --display side-by-side [old_file] [new_file]```

**Show only changed lines** (inline display)

```difft --display inline [old_file] [new_file]```

**Compare with specific language** parsing

```difft --language [rust] [old.rs] [new.rs]```

**Compare directories**

```difft [old_directory] [new_directory]```

**Use with git diff**

```git diff --external-diff difft```

**Set as default git diff tool**

```git config --global diff.external difft```

**Compare ignoring whitespace**

```difft --skip-unchanged [old_file] [new_file]```

# SYNOPSIS

**difft** [_options_] _old_path_ _new_path_

# PARAMETERS

**--display** _mode_
> Output format: side-by-side, side-by-side-show-both, inline (default).

**--language** _lang_
> Force a specific language parser (auto-detected by default).

**--list-languages**
> Show all supported languages.

**--skip-unchanged**
> Don't show unchanged parts of the file.

**--context** _n_
> Number of context lines (default: 3).

**--width** _n_
> Maximum display width (default: terminal width).

**--color** _when_
> Color output: always, never, auto.

**--background** _type_
> Background color: light, dark (default: dark).

**--syntax-highlight** _on|off_
> Enable or disable syntax highlighting.

**--tab-width** _n_
> Tab display width (default: 4).

**--parse-error-limit** _n_
> Maximum number of parse errors before falling back to text diff.

**--byte-limit** _n_
> Skip files larger than this size.

**--graph-limit** _n_
> Maximum graph size for structural diff algorithm.

# DESCRIPTION

**difft** (Difftastic) is a structural diff tool that understands programming language syntax. Unlike line-based diff tools, it parses source code and compares the actual structure, showing meaningful changes while ignoring formatting differences.

The tool builds abstract syntax trees (ASTs) for both versions of a file, then computes the minimal structural difference. This means it can recognize when code is moved or refactored without treating it as completely different, and it won't flag changes that are purely whitespace or formatting.

Difftastic supports over 50 programming languages with dedicated parsers built using tree-sitter. For unsupported files, it falls back to a text-based diff. Language detection is automatic based on file extension, but can be overridden.

The side-by-side display shows old and new versions in parallel columns with colors indicating additions (green), deletions (red), and modifications. The inline display shows changes in a more compact format. Git integration allows using difft as the external diff tool.

# CAVEATS

Large files or very different structures may hit performance limits. Parse errors cause fallback to text diff. Some language features may not be perfectly parsed. Extremely complex structural changes may produce hard-to-follow output.

# HISTORY

**Difftastic** was created by Wilfred Hughes starting in **2020**. It was developed to address the limitations of line-based diffs, which often produce noisy output for refactoring or reformatting changes. The tool uses tree-sitter parsers for language-aware structural comparison and has gained popularity as a git diff replacement.

# SEE ALSO

[diff](/man/diff)(1), [git-diff](/man/git-diff)(1), [delta](/man/delta)(1), [colordiff](/man/colordiff)(1)
