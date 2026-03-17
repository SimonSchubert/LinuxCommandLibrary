# TAGLINE

Background Rust code checker

# TLDR

**Run the default check job in the current project**

```bacon```

**Run a specific job**

```bacon [test]```

**Run clippy lints**

```bacon --job [clippy]```

**List available jobs**

```bacon --list-jobs```

**Run in a specific project directory**

```bacon --path [path/to/project]```

**Initialize a bacon.toml configuration file**

```bacon --init```

**Open the preferences file path**

```bacon --prefs```

# SYNOPSIS

**bacon** [_options_] [_job_]

# PARAMETERS

**-j**, **--job** _name_
> Run the specified job. Can also be passed as a positional argument without the flag when unambiguous.

**--list-jobs**
> List all available jobs and exit.

**--path** _dir_
> Set the project directory (default is current directory).

**--config** _file_
> Use a specific bacon.toml configuration file.

**-w**, **--watch** _path_
> Additional paths to watch for changes.

**--init**
> Create a bacon.toml configuration file in the current project if one does not exist.

**--prefs**
> Create the preferences file if it does not exist and print its path.

**-s**, **--summary**
> Show a summary of results when finishing.

**--no-default-features**
> Disable default cargo features.

**--features** _features_
> Comma-separated list of cargo features to enable.

**--all-features**
> Enable all available cargo features.

# DESCRIPTION

**bacon** is a background Rust code checker that runs cargo commands in watch mode. It continuously checks your code for compilation errors, warnings, and clippy lints, displaying results in a terminal UI.

The tool provides immediate feedback during development without manually running cargo commands. When no ambiguity exists, the job name can be passed directly as a positional argument (e.g. `bacon clippy` instead of `bacon --job clippy`).

Default jobs include **check** (cargo check), **clippy** (clippy lints), **test** (run tests), **doc** (generate documentation), and **run** (build and run). Custom jobs can be defined in bacon.toml.

# CAVEATS

Requires the Rust toolchain to be installed. Continuous checking may cause high CPU usage on large projects. The terminal UI requires a compatible terminal emulator.

# HISTORY

**bacon** was created by Denys Séguret (Canop) around **2021** to provide a better development experience for Rust projects with continuous feedback.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-watch](/man/cargo-watch)(1), [clippy](/man/clippy)(1), [rustc](/man/rustc)(1)
