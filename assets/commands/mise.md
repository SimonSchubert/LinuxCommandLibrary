# TLDR

**Install tool**

```mise install [node@20]```

**Use tool version**

```mise use [node@20]```

**List installed**

```mise list```

**Set global version**

```mise use -g [python@3.11]```

**Run with tool**

```mise exec [node@18] -- node [script.js]```

**Activate shell**

```eval "$(mise activate bash)"```

# SYNOPSIS

**mise** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Mise operation.

**install** _TOOL_
> Install tool version.

**use** _TOOL_
> Set tool version.

**list**
> List installed versions.

**exec**
> Run with specified version.

**activate**
> Shell activation.

**--help**
> Display help information.

# DESCRIPTION

**mise** manages development tool versions. It's a polyglot runtime manager (successor to rtx).

The tool handles Node.js, Python, Ruby, and more. Compatible with asdf plugins.

mise manages tool versions.

# CAVEATS

Shell activation needed. Successor to rtx. asdf-compatible.

# HISTORY

mise (formerly rtx) was created as a fast, **Rust-based** alternative to asdf for managing tool versions.

# SEE ALSO

[asdf](/man/asdf)(1), [nvm](/man/nvm)(1), [pyenv](/man/pyenv)(1)

