# TAGLINE

print and manage Go environment variables

# TLDR

**Print all Go environment variables**

```go env```

**Print specific variable**

```go env GOPATH```

**Print multiple variables**

```go env GOROOT GOPATH GOBIN```

**Set a variable persistently**

```go env -w GOBIN=[/path/to/bin]```

**Unset a variable**

```go env -u GOBIN```

**Print as JSON**

```go env -json```

# SYNOPSIS

**go** **env** [**-json**] [**-u** _var_] [**-w** _var_=_value_] [_var_ ...]

# PARAMETERS

**-json**
> Print environment in JSON format.

**-w** _var_=_value_
> Set variable persistently in go/env file.

**-u** _var_
> Unset variable from go/env file.

# DESCRIPTION

**go env** prints Go environment information. Without arguments, it prints all known environment variables. With arguments, it prints the values of the named variables. The **-w** flag writes values to the go/env file, making them persistent across sessions. The **-u** flag removes variables from go/env.

# CONFIGURATION

**$HOME/.config/go/env**
> Persistent Go environment variable file managed by go env -w.

# CAVEATS

Variables set with -w take precedence over shell environment variables. The go/env file is typically located at $HOME/.config/go/env.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1)
