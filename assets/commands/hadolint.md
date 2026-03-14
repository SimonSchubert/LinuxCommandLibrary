# TAGLINE

dockerfile linter that validates best practices and common mistakes

# TLDR

**Lint a Dockerfile**

```hadolint [path/to/Dockerfile]```

**Lint from stdin**

```cat Dockerfile | hadolint -```

**Ignore specific rules**

```hadolint --ignore [DL3008] --ignore [DL3009] [path/to/Dockerfile]```

**Output as JSON**

```hadolint --format json [path/to/Dockerfile]```

**Only allow images from trusted registries**

```hadolint --trusted-registry [docker.io] [path/to/Dockerfile]```

**Use a custom config file**

```hadolint --config [path/to/.hadolint.yaml] [path/to/Dockerfile]```

**Set failure threshold severity**

```hadolint --failure-threshold [warning] [path/to/Dockerfile]```

# SYNOPSIS

**hadolint** [_options_] _dockerfile_

# PARAMETERS

_DOCKERFILE_
> Dockerfile to lint.

**--ignore** _RULE_
> Ignore specific rule.

**--format** _FMT_
> Output format: tty, json, checkstyle, codeclimate, gitlab_codeclimate, gnu, codacy, sonarqube, sarif (default: tty).

**--trusted-registry** _REG_
> Trusted container registry. Images from untrusted registries generate warnings.

**--config** _FILE_
> Config file path (default: .hadolint.yaml).

**--failure-threshold** _SEVERITY_
> Exit with failure code only for rules at or above this severity (error, warning, info, style, ignore, none).

**--no-color**
> Disable colored output.

**--no-fail**
> Don't exit with a failure status code.

**-t**, **--strict-labels**
> Check that labels conform to defined format.

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

[docker](/man/docker)(1), [shellcheck](/man/shellcheck)(1)
