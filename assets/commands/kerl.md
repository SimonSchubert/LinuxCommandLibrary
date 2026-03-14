# TAGLINE

manages multiple Erlang/OTP installations

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

**Show status of builds and installations**

```kerl status```

**Delete build**

```kerl delete build [26.0-build]```

**Clean build artifacts**

```kerl cleanup [26.0-build]```

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

**update releases**
> Fetch up-to-date list of available releases.

**build-install** _VSN_ _NAME_ _PATH_
> Combine build and install in one step.

**status**
> Print available builds and installations.

**path** [_NAME_]
> Print path of active or named installation.

**active**
> Print the currently active installation.

**cleanup** _NAME_
> Remove compilation artifacts for a build.

**deploy** _HOST_ _DIR_
> Deploy installation to remote host via SSH.

# DESCRIPTION

**kerl** manages multiple Erlang/OTP installations. It builds and installs different versions side by side.

The tool handles compilation from source. Activation scripts set up the environment for each version.

# CAVEATS

Builds from source, so build dependencies (gcc, make, ncurses-dev, libssl-dev, etc.) must be installed. Shell script tool — configure via **$HOME/.kerlrc**. Set **KERL_INCLUDE_RELEASE_CANDIDATES=yes** to include release candidates.

# SEE ALSO

[erl](/man/erl)(1), [asdf](/man/asdf)(1)
