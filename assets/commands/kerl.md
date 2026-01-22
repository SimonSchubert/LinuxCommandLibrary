# TLDR

**List available releases**

```kerl list releases```

**Build Erlang version**

```kerl build [26.0] [26.0-build]```

**Install built version**

```kerl install [26.0-build] [~/.kerl/26.0]```

**Activate installation**

```source ~/.kerl/26.0/activate```

**List installations**

```kerl list installations```

**Delete build**

```kerl delete build [26.0-build]```

# SYNOPSIS

**kerl** _command_ [_args_]

# PARAMETERS

**list releases**
> Show available versions.

**list builds**
> Show completed builds.

**list installations**
> Show installed versions.

**build** _VSN_ _NAME_
> Build Erlang version.

**install** _BUILD_ _PATH_
> Install build to path.

**delete** _TYPE_ _NAME_
> Delete build or installation.

# DESCRIPTION

**kerl** manages multiple Erlang/OTP installations. It builds and installs different versions side by side.

The tool handles compilation from source. Activation scripts set up the environment for each version.

kerl manages Erlang versions.

# CAVEATS

Builds from source. Requires build dependencies. Shell script tool.

# HISTORY

kerl was created to manage multiple Erlang installations, similar to tools like rbenv for Ruby.

# SEE ALSO

[erl](/man/erl)(1), [asdf](/man/asdf)(1), [erlang](/man/erlang)(1)
