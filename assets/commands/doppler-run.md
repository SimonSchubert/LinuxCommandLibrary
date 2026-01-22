# TLDR

**Run command with** injected secrets

```doppler run -- [node app.js]```

**Run with specific** config

```doppler run --config [dev] -- [command]```

**Run with specific** project

```doppler run --project [myapp] -- [command]```

**Passthrough to shell**

```doppler run -- sh -c "[echo \$SECRET_KEY]"```

**Run with fallback** file

```doppler run --fallback [.env.backup] -- [command]```

# SYNOPSIS

**doppler run** [_options_] **--** _command_ [_args_]

# PARAMETERS

**--** _COMMAND_
> Command to run with injected secrets.

**--config** _NAME_
> Configuration environment to use.

**--project** _NAME_
> Project name.

**--fallback** _FILE_
> Fallback file if Doppler unavailable.

**--no-fallback**
> Disable fallback behavior.

**--preserve-env**
> Preserve existing environment variables.

**--help**
> Display help information.

# DESCRIPTION

**doppler run** executes a command with secrets from Doppler injected as environment variables. This enables applications to access secrets without code changes or local configuration files.

Secrets are fetched from the Doppler API and made available only to the executed process. The double-dash separates doppler options from the command to run.

Fallback files provide resilience when Doppler is unreachable, while preserve-env prevents overwriting existing environment variables.

# CAVEATS

Requires authenticated doppler CLI. Network latency affects startup time. Secrets visible in process environment. Child processes inherit secrets.

# HISTORY

doppler run is the primary command for secrets injection in the **Doppler** CLI, implementing the zero-configuration secrets access that Doppler was designed to provide.

# SEE ALSO

[doppler](/man/doppler)(1), [doppler-secrets](/man/doppler-secrets)(1), [env](/man/env)(1)
