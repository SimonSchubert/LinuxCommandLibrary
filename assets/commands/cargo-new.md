# TLDR

**Create new binary project**

```cargo new [project_name]```

**Create new library**

```cargo new [project_name] --lib```

**Create without git**

```cargo new [project_name] --vcs none```

**Create with specific edition**

```cargo new [project_name] --edition [2021]```

**Create with custom name**

```cargo new [path] --name [custom_name]```

# SYNOPSIS

**cargo new** [_options_] _path_

# DESCRIPTION

**cargo new** creates a new Cargo package in a new directory. Generates Cargo.toml manifest and src/ directory with a "Hello, World!" starter program. Initializes a git repository by default.

# PARAMETERS

**--bin**
> Create binary with src/main.rs (default)

**--lib**
> Create library with src/lib.rs

**--name** _name_
> Package name (defaults to directory name)

**--edition** _year_
> Rust edition (2015, 2018, 2021, 2024)

**--vcs** _type_
> Version control system (git, hg, pijul, fossil, none)

**--registry** _name_
> Registry for publishing

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# GENERATED STRUCTURE

```
project_name/
├── Cargo.toml
├── .gitignore
└── src/
    └── main.rs (or lib.rs)
```

# CAVEATS

Use cargo init for existing directories. Default edition is 2024 in recent Rust versions.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-init](/man/cargo-init)(1), [cargo-build](/man/cargo-build)(1)
