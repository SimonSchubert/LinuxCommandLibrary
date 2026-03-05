# TAGLINE

Syntax-aware grep and code editing tool

# TLDR

**Replace matching text**

```echo 'Hello World!' | srgn '[wW]orld' -- 'there'```

**Search within Python class definitions**

```srgn --python 'class' '[age]'```

**Convert piped input to uppercase**

```echo 'hello' | srgn --upper '.*'```

# SYNOPSIS

**srgn** [**--**_language_] [**--**_action_] [_scope_] [**--** _replacement_]

# DESCRIPTION

**srgn** is a grep-like tool that understands source code syntax via tree-sitter and allows manipulation in addition to search. It combines capabilities of tr, sed, and ripgrep with language grammar awareness, supporting Python, Rust, Go, TypeScript, C, C#, and HCL. It can perform bulk file edits, case transformations, and regex replacements scoped to specific syntactic constructs.

# HISTORY

**srgn** was created by **Alex Povel** and is written in **Rust**.

# SEE ALSO

[ripgrep](/man/ripgrep)(1), [sed](/man/sed)(1), [ast-grep](/man/ast-grep)(1)
