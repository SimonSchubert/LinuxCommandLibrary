# TLDR

**Initialize in current directory**

```cargo init```

**Initialize binary project**

```cargo init --bin```

**Initialize library**

```cargo init --lib```

**Initialize without git**

```cargo init --vcs none```

**Initialize with specific name**

```cargo init --name [myproject]```

**Initialize with specific edition**

```cargo init --edition [2021]```

# SYNOPSIS

**cargo init** [_options_] [_path_]

# DESCRIPTION

**cargo init** creates a new Cargo package in an existing directory. Generates Cargo.toml and src/ with either main.rs (binary) or lib.rs (library). Unlike cargo new, does not create a new directory.

# PARAMETERS

**--bin**
> Create binary target with src/main.rs (default)

**--lib**
> Create library target with src/lib.rs

**--name** _name_
> Set package name (defaults to directory name)

**--edition** _year_
> Rust edition (2015, 2018, 2021, 2024)

**--vcs** _type_
> Initialize version control (git, hg, pijul, fossil, none)

**--registry** _name_
> Registry for publishing

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# GENERATED FILES

```
.
├── Cargo.toml
├── .gitignore (if using git)
└── src
    └── main.rs (or lib.rs)
```

# CAVEATS

Default edition is 2024 in recent Rust versions. Initializes git repository by default if not already in one.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-new](/man/cargo-new)(1), [cargo-build](/man/cargo-build)(1)
