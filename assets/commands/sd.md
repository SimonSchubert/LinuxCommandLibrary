# TAGLINE

Intuitive find-and-replace command-line tool

# TLDR

**Replace text** in a file

```sd '[find]' '[replace]' [path/to/file]```

**Replace text using literal strings** (no regex)

```sd -F '[find]' '[replace]' [path/to/file]```

**Preview changes** without modifying the file

```sd -p '[find]' '[replace]' [path/to/file]```

**Replace text from stdin**

```echo '[text]' | sd '[find]' '[replace]'```

**Use capture groups** in replacement

```sd '(\w+)@(\w+)' '$1 at $2' [file]```

**Replace in multiple files** using fd

```fd --type file --exec sd '[find]' '[replace]'```

**Replace text containing special characters** literally

```sd -F '$.value' 'newValue' [config.json]```

# SYNOPSIS

**sd** [_options_] _find_ _replace-with_ [_files_...]

# PARAMETERS

**-F**, **--fixed-strings**
> Treat find and replace patterns as literal strings, not regular expressions

**-p**
> Preview changes without modifying files

**-i**
> Modify files in place (default behavior when files are specified)

**--**
> End of flags; allows patterns starting with a dash

# DESCRIPTION

**sd** is a fast, intuitive find-and-replace command-line tool written in Rust. It serves as a modern alternative to sed, focusing specifically on text substitution with a simpler, more readable syntax.

Unlike sed, sd uses JavaScript/Python-style regular expressions that most developers already know. The find and replace patterns are provided as separate arguments rather than combined in a complex expression, making commands easier to write and understand.

Capture groups work intuitively: use **$1**, **$2** for indexed groups, or **$name** for named groups defined with **(?P\<name\>pattern)**. To include a literal dollar sign in the replacement, escape it as **$$**.

When no files are specified, sd reads from standard input. Combined with tools like **fd**, it enables powerful batch replacements across entire codebases.

# CAVEATS

sd modifies files in place by default when file arguments are provided. Always use **-p** to preview changes on important files. The regex flavor differs from sed's, so patterns may need adjustment when migrating from sed workflows.

# HISTORY

**sd** was created by **chmln** and first released around **2019**. Written in **Rust**, it was designed to address the complexity and unintuitive syntax of sed for everyday find-and-replace tasks. The project gained popularity as part of the wave of modern Rust-based CLI tools reimagining traditional Unix utilities.

# SEE ALSO

[sed](/man/sed)(1), [awk](/man/awk)(1), [rg](/man/rg)(1), [fd](/man/fd)(1), [perl](/man/perl)(1)
