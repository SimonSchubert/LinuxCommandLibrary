# TAGLINE

dockerfile linter that validates best practices and common mistakes

# TLDR

**Lint Dockerfile**

```hadolint [Dockerfile]```

**Lint from stdin**

```cat Dockerfile | hadolint -```

**Ignore specific rules**

```hadolint --ignore [DL3008] [Dockerfile]```

**Output as JSON**

```hadolint --format json [Dockerfile]```

**Show trusted registries**

```hadolint --trusted-registry [docker.io] [Dockerfile]```

# SYNOPSIS

**hadolint** [_options_] _dockerfile_

# PARAMETERS

_DOCKERFILE_
> Dockerfile to lint.

**--ignore** _RULE_
> Ignore specific rule.

**--format** _FMT_
> Output format (tty, json, codeclimate).

**--trusted-registry** _REG_
> Trusted container registry.

**--config** _FILE_
> Config file path.

**--no-color**
> Disable colored output.

**--help**
> Display help information.

# DESCRIPTION

**Hadolint** is a Dockerfile linter that validates best practices and common mistakes. It uses ShellCheck to validate shell commands in RUN instructions.

The tool checks for security issues, inefficient layering, and deprecated syntax. It helps create optimized, secure container images.

# CAVEATS

Shell checking requires bash syntax. Some rules may not apply to all use cases. Configuration file recommended.

# HISTORY

Hadolint was created to improve Dockerfile quality by combining Docker best practices with ShellCheck's shell analysis.

# SEE ALSO

[docker](/man/docker)(1), [shellcheck](/man/shellcheck)(1), [dockerfile](/man/dockerfile)(5)
