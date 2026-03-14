# TAGLINE

Syntax-aware grep and code editing tool

# TLDR

**Replace matching text**

```echo 'Hello World!' | srgn '[wW]orld' -- 'there'```

**Convert piped input to uppercase**

```echo 'hello' | srgn --upper '.*'```

**Delete matching characters**

```echo 'Hello World!' | srgn --delete '[!]'```

**Squeeze repeated characters**

```echo 'Helloooo Woooorld!!!' | srgn --squeeze '(o|!)'```

**Search within Python class definitions**

```srgn --python 'class' '[age]'```

**Convert to lowercase within Rust strings only**

```srgn --rust 'string' --lower '.*'```

# SYNOPSIS

**srgn** [_options_] [_scope_] [**--** _replacement_]

# PARAMETERS

**--upper**
> Convert matched text to uppercase

**--lower**
> Convert matched text to lowercase

**--delete**
> Delete matched text

**--squeeze**
> Squeeze consecutive repeated characters into single occurrences

**--python** _QUERY_
> Scope to Python syntax nodes (e.g., class, function, string)

**--rust** _QUERY_
> Scope to Rust syntax nodes

**--go** _QUERY_
> Scope to Go syntax nodes

**--typescript** _QUERY_
> Scope to TypeScript syntax nodes

**--c** _QUERY_
> Scope to C syntax nodes

**--csharp** _QUERY_
> Scope to C# syntax nodes

**--hcl** _QUERY_
> Scope to HCL syntax nodes

**--glob** _PATTERN_
> Process files matching glob pattern

# DESCRIPTION

**srgn** is a grep-like tool that understands source code syntax via tree-sitter and allows manipulation in addition to search. It combines capabilities of tr, sed, and ripgrep with language grammar awareness, supporting Python, Rust, Go, TypeScript, C, C#, and HCL. It can perform bulk file edits, case transformations, and regex replacements scoped to specific syntactic constructs.

Actions are composable and applied in a fixed order regardless of flag order. Replacement (positional, after **--**) is applied first, then flags like **--upper**, **--lower**, **--delete**, and **--squeeze** are applied in sequence.

# HISTORY

**srgn** was created by **Alex Povel** and is written in **Rust**.

# SEE ALSO

[sed](/man/sed)(1), [tr](/man/tr)(1), [ripgrep](/man/ripgrep)(1), [ast-grep](/man/ast-grep)(1)
