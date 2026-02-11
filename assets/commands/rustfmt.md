# TAGLINE

Format Rust source code automatically

# TLDR

**Format a Rust file**

```rustfmt [main.rs]```

**Format multiple files**

```rustfmt [src/*.rs]```

**Check formatting** without changing files

```rustfmt --check [main.rs]```

**Format with backup**

```rustfmt --backup [main.rs]```

**Format using specific edition**

```rustfmt --edition [2021] [main.rs]```

**Format from stdin**

```cat [main.rs] | rustfmt```

**Show diff** of formatting changes

```rustfmt --emit files --check [main.rs]```

**Use config file**

```rustfmt --config-path [rustfmt.toml] [main.rs]```

# SYNOPSIS

**rustfmt** [_options_] [_files_...]

# DESCRIPTION

**rustfmt** is the official Rust code formatter. It automatically formats Rust code according to style guidelines, ensuring consistent code style across a project.

The tool can be integrated into editors, CI pipelines, and pre-commit hooks. Configuration is stored in rustfmt.toml or .rustfmt.toml at the project root.

When used with Cargo (`cargo fmt`), it formats all files in the project automatically. rustfmt supports all stable Rust syntax and can be configured for various style preferences.

# PARAMETERS

**--check**
> Check if formatting is correct, don't modify.

**--backup**
> Create backup of original files.

**--edition** _year_
> Rust edition (2015, 2018, 2021).

**--emit** _type_
> Output mode (files, stdout, checkstyle).

**--config** _key=value_
> Set configuration option.

**--config-path** _file_
> Path to configuration file.

**--print-config** _type_
> Print configuration (default, current, minimal).

**--files-with-diff**
> Print files that would change.

**--verbose**
> Print verbose output.

**--quiet**
> Print minimal output.

**--color** _when_
> Color output (auto, always, never).

# CONFIGURATION

**rustfmt.toml** / **.rustfmt.toml**
> Project-level configuration file at the project root defining formatting rules such as max_width, tab_spaces, edition, and use_small_heuristics.

**max_width**
> Maximum line width before wrapping (default 100).

**tab_spaces**
> Number of spaces per indentation level (default 4).

**edition**
> Rust edition to use for parsing (2015, 2018, 2021).

# CAVEATS

Some configurations are unstable and require nightly. Cannot format macros that produce unparseable output. Comments may be repositioned. Configuration changes may cause large diffs.

# HISTORY

**rustfmt** was developed by **Nick Cameron** starting in **2015** to provide official formatting for Rust code. It reached 1.0 alongside Rust 1.24 in **2018**. The tool was influenced by gofmt and aims to end style debates by providing a single canonical format. It's now maintained by the Rust style team.

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1), [clippy](/man/clippy)(1)
