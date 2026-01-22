# TLDR

**Run** background checker for Rust

```bacon```

Run **specific job**

```bacon [test]```

Run with **custom configuration**

```bacon --job [clippy]```

**List** available jobs

```bacon --list-jobs```

# SYNOPSIS

**bacon** [_options_] [_job_]

# DESCRIPTION

**bacon** is a background Rust code checker that runs cargo commands in watch mode. It continuously checks your code for compilation errors, warnings, and clippy lints, displaying results in a terminal UI.

The tool provides immediate feedback during development without manually running cargo commands.

# PARAMETERS

**--job**, **-j** _name_
> Run specific job

**--list-jobs**
> List available jobs

**--path** _dir_
> Project directory

**--config** _file_
> Configuration file

**-w**, **--watch**
> Additional paths to watch

# DEFAULT JOBS

**check**
> Run cargo check

**test**
> Run tests

**clippy**
> Run clippy lints

**run**
> Build and run

**doc**
> Generate documentation

# CONFIGURATION

Configuration in bacon.toml:
```toml
[jobs.check]
command = ["cargo", "check", "--color", "always"]
need_stdout = false
```

# CAVEATS

Requires Rust toolchain installed. High CPU usage during continuous checks. May be slower than manual runs on large projects. Terminal UI requires compatible terminal emulator.

# HISTORY

**bacon** was created by Denys Séguret (Canop) around **2021** to provide a better development experience for Rust projects with continuous feedback.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-watch](/man/cargo-watch)(1), [clippy](/man/clippy)(1)
