# TAGLINE

**%** in shell context typically refers to job control, bringing background

# TLDR

**Bring most recent background job to foreground**

```%```

**Bring job number N to foreground**

```%[N]```

**Bring job starting with string to foreground**

```%[string]```

**Bring job containing string to foreground**

```%?[string]```

**Use modulo operator in arithmetic**

```echo $((10 % 3))```

# SYNOPSIS

**%** [_job_spec_]

# JOB SPECIFICATIONS

**%** or **%+** or **%%**
> Current (most recent) job

**%-**
> Previous job

**%n**
> Job number n

**%string**
> Job whose command starts with string

**%?string**
> Job whose command contains string

# DESCRIPTION

**%** in shell context typically refers to job control, bringing background jobs to the foreground. It's shorthand for the **fg** command.

When a command is suspended (Ctrl+Z) or run in background (&), it gets a job number. The **%** notation provides quick access to these jobs.

In arithmetic contexts **$(( ))**, **%** is the modulo operator, returning the remainder of integer division.

In prompt strings (PS1), **%** introduces escape sequences in zsh for dynamic prompt elements.

# Start background job
sleep 100 &
# [1] 12345

# Bring to foreground
%1

# In arithmetic
remainder=$((17 % 5))  # Result: 2

# In zsh prompt (show current directory)
PS1='%~ $ '
```

# CAVEATS

Job control requires an interactive shell. Not available in scripts by default.

The **%** interpretation is context-dependent: job control at command position, modulo in arithmetic, format specifier in strings.

Job numbers reset when the shell restarts.

# SEE ALSO

[fg](/man/fg)(1), [bg](/man/bg)(1), [jobs](/man/jobs)(1), [kill](/man/kill)(1)
