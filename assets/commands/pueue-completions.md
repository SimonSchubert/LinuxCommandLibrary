# TAGLINE

Generate shell completion scripts for pueue

# TLDR

**Generate bash completions**

```pueue completions bash [output_directory]```

**Generate zsh completions**

```pueue completions zsh [output_directory]```

**Generate fish completions**

```pueue completions fish [output_directory]```

**Generate elvish completions**

```pueue completions elvish [output_directory]```

**Generate PowerShell completions**

```pueue completions power-shell [output_directory]```

# SYNOPSIS

**pueue** **completions** _shell_ _output-directory_

# PARAMETERS

_shell_
> Shell to generate completions for: **bash**, **elvish**, **fish**, **power-shell**, or **zsh**.

_output-directory_
> Directory in which the completion file will be written. Pueue chooses the file name (e.g. _pueue_ for zsh, **pueue.fish** for fish).

# DESCRIPTION

**pueue completions** writes a shell completion script for the **pueue** client to a directory on disk. The generated file name depends on the shell: **pueue.bash** for bash, **_pueue** for zsh, **pueue.fish** for fish, and so on. After generation, the file should be sourced or placed in a directory on your shell's completion path (for example **~/.local/share/bash-completion/completions/** or **$fpath** for zsh).

# CAVEATS

Unlike many Rust CLI tools that print completions to stdout, **pueue completions** takes a target directory as its second argument and writes the file there. Pipe-based redirection will not work.

# SEE ALSO

[pueue](/man/pueue)(1), [pueued](/man/pueued)(1)
