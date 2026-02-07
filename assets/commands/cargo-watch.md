# TAGLINE

Watch source files and run Cargo commands on changes

# TLDR

**Watch and rebuild** on changes

```cargo watch```

**Watch and run tests**

```cargo watch -x test```

**Watch and run a specific example**

```cargo watch -x "run --example [example_name]"```

**Watch and run multiple commands**

```cargo watch -x check -x test -x run```

**Watch with clear screen** before each run

```cargo watch -c```

**Watch specific files or directories**

```cargo watch -w [src/] -w [tests/]```

**Ignore specific patterns**

```cargo watch -i "*.txt" -i "target/"```

**Watch with shell command**

```cargo watch -s "echo 'Changed!' && cargo build"```

# SYNOPSIS

**cargo watch** [_options_] [**-x** _command_]...

# DESCRIPTION

**cargo-watch** is a Cargo subcommand that watches project source files and runs Cargo commands when files change. It provides a convenient development workflow for continuous compilation, testing, or running.

By default, cargo watch runs `cargo check` on changes. Multiple commands can be chained with `-x` flags and will run in sequence. The tool debounces rapid file changes to avoid excessive rebuilds.

It watches all files that Cargo considers part of the project, including src/, tests/, benches/, examples/, and Cargo.toml. Custom watch paths and ignore patterns can be specified.

# PARAMETERS

**-x** _command_
> Cargo command to run (default: check).

**-s** _command_
> Shell command to run.

**-c**, **--clear**
> Clear screen before each run.

**-w** _path_
> Watch specific path (can repeat).

**-i** _pattern_
> Ignore files matching pattern.

**-d** _delay_
> Debounce delay in seconds.

**--poll**
> Use polling instead of events.

**--postpone**
> Postpone first run until change.

**-q**, **--quiet**
> Suppress output from watch itself.

**--no-gitignore**
> Don't use .gitignore patterns.

**--why**
> Show which file triggered the run.

**-B** _cmd_
> Run command before watched command.

**-N**
> Send desktop notification on finish.

# CONFIGURATION

**.ignore**
> Project-level ignore patterns for watched files (uses gitignore syntax).

# CAVEATS

Requires installation via `cargo install cargo-watch`. File system events may not work in all environments (use --poll as fallback). Rapid consecutive saves may be debounced into single runs. Large projects may benefit from increased debounce delay.

# HISTORY

**cargo-watch** was created by **F\u00e9lix Saparelli** (passcod) in **2015** to provide file watching functionality for Rust development. It built upon the notify crate for cross-platform file system events. The tool has become a standard part of many Rust developers' workflows, inspired by similar tools in other ecosystems like nodemon for Node.js.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-check](/man/cargo-check)(1), [watchexec](/man/watchexec)(1), [entr](/man/entr)(1)
