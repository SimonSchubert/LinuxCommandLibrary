# TAGLINE

Open local Rust documentation in browser

# TLDR

**Open Rust documentation**

```rustup doc```

**Open The Book**

```rustup doc --book```

**Open standard library docs**

```rustup doc --std```

**Open the core library docs**

```rustup doc --core```

**Open the docs for a specific item**

```rustup doc [std::fs::File]```

**Print the documentation path** instead of opening it

```rustup doc --path```

# SYNOPSIS

**rustup** **doc** [_options_] [_topic_]

# PARAMETERS

**--book**
> The Rust Programming Language.

**--std**
> Standard library documentation.

**--reference**
> The Rust Reference.

**--core**
> Core library docs.

**--alloc**
> Alloc library docs.

**--cargo**
> The Cargo Book.

**--clippy**
> The Clippy documentation.

**--path**
> Print path instead of opening.

**--serve**
> Serve the docs over a local HTTP server, for sandboxed browsers that cannot open file:// URLs (recent versions).

**--toolchain** _name_
> Use a specific toolchain.

_topic_
> Item to open, such as std::fs or usize.

# DESCRIPTION

**rustup doc** opens local Rust documentation in the browser. Provides offline access to The Book, standard library, and reference documentation.

# SEE ALSO

[rustup](/man/rustup)(1), [cargo-doc](/man/cargo-doc)(1)

# RESOURCES

```[Source code](https://github.com/rust-lang/rustup)```

```[Documentation](https://rust-lang.github.io/rustup/)```

<!-- verified: 2026-11-08 -->
