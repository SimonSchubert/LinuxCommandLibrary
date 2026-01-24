# TLDR

**Generate documentation**

```rustdoc [lib.rs]```

**Generate for crate**

```rustdoc --crate-name [mylib] [lib.rs]```

**Output to directory**

```rustdoc -o [docs] [lib.rs]```

**Document with tests**

```rustdoc --test [lib.rs]```

**Set edition**

```rustdoc --edition [2021] [lib.rs]```

# SYNOPSIS

**rustdoc** [_options_] _input_

# DESCRIPTION

**rustdoc** generates HTML documentation from Rust source code and doc comments. It extracts specially-formatted comments and produces navigable API documentation.

The tool is typically invoked via `cargo doc` rather than directly, but can be used for custom documentation needs.

# PARAMETERS

**--crate-name** _name_
> Crate name.

**-o** _dir_, **--out-dir** _dir_
> Output directory.

**--test**
> Run documentation tests.

**--edition** _year_
> Rust edition.

**-L** _path_
> Library search path.

**--extern** _name=path_
> External crate.

**--document-private-items**
> Include private items.

**--html-in-header** _file_
> HTML to insert in header.

**--markdown-css** _file_
> CSS for markdown.

# CAVEATS

Usually use cargo doc instead. Library paths needed for dependencies. Doc tests require proper setup. Private items hidden by default.

# HISTORY

**rustdoc** has been part of Rust since early development. Documentation culture is strong in Rust, and rustdoc enables it with doc comments that compile to HTML and include tested code examples.

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1), [doxygen](/man/doxygen)(1)
