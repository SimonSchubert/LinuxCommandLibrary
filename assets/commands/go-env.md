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

**Show only settings that differ from the defaults**

```go env -changed```

**Configure private modules** to bypass the proxy and checksum database

```go env -w GOPRIVATE=[github.com/myorg/*]```

**Locate the go env config file**

```go env GOENV```

# SYNOPSIS

**go** **env** [**-json**] [**-changed**] [**-u**] [**-w**] [_var_ ...]

# PARAMETERS

**-json**
> Print environment in JSON format.

**-w** _var_=_value_
> Set variable persistently in go/env file.

**-u** _var_ ...
> Unset the default set with **go env -w** for the named variables.

**-changed**
> Print only settings whose effective value differs from the default (Go 1.23+).

# DESCRIPTION

**go env** prints Go environment information. Without arguments, it prints all known environment variables as a shell script (a batch file on Windows). With arguments, it prints the value of each named variable on its own line. The **-w** flag writes values to the go/env file, making them persistent across sessions. The **-u** flag removes variables from go/env.

# CONFIGURATION

**$HOME/.config/go/env**
> Persistent Go environment variable file managed by go env -w (on macOS **~/Library/Application Support/go/env**). The location can be changed with the **GOENV** variable.

# CAVEATS

Values set in the process environment take precedence over defaults written with **-w**, and **go env -w** warns when an environment variable overrides the value being written. **GOROOT** and some other variables cannot be set with **-w**.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1), [go-mod](/man/go-mod)(1), [go-install](/man/go-install)(1)

# RESOURCES

```[Source code](https://go.googlesource.com/go)```

```[Homepage](https://go.dev)```

```[Documentation](https://pkg.go.dev/cmd/go#hdr-Print_Go_environment_information)```

<!-- verified: 2026-11-23 -->
