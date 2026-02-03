# TLDR

**Run a command** and only show output on error

```cronic [command] [args...]```

**Run a cron job silently** unless it fails

```cronic /path/to/script.sh```

# SYNOPSIS

**cronic** _command_ [_args..._]

# DESCRIPTION

**cronic** is a shell script to wrap cron jobs and suppress output unless the command fails. It captures stdout, stderr, and the exit code, only displaying output when the command returns a non-zero exit code.

This reduces email noise from successful cron jobs while still alerting on failures.

# CAVEATS

Part of the moreutils package. Output is buffered, which may be problematic for very long-running commands with large output.

# SEE ALSO

[chronic](/man/chronic)(1), [cron](/man/cron)(8)
