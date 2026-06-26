# TAGLINE

cron job output suppressor

# TLDR

**Run a command** and only show output on error

```cronic [command] [args...]```

**Run a cron job silently** unless it fails

```cronic /path/to/script.sh```

# SYNOPSIS

**cronic** _command_ [_args..._]

# DESCRIPTION

**cronic** is a shell script wrapper for cron jobs that suppresses output unless the command fails. Without cronic, every cron job that produces output triggers an email to the user, leading to inbox clutter from routine successful executions.

cronic captures both stdout and stderr along with the exit code. If the command succeeds (returns zero), all output is discarded. If the command fails (returns non-zero), cronic displays the captured output, allowing cron to send the failure notification email. This approach reduces email noise from successful jobs while ensuring administrators are alerted to actual failures.

# CAVEATS

cronic is a small standalone shell script by Chuck Houpt, not part of the moreutils package; the similar **chronic** command is the moreutils equivalent. The two differ in behavior: cronic also treats any output to stderr as a failure (even with a zero exit status), making it stricter about flagging problems. Output is buffered, which may be problematic for very long-running commands with large output.

# SEE ALSO

[chronic](/man/chronic)(1), [cron](/man/cron)(8)

# RESOURCES

```[Homepage](https://habilis.net/cronic/)```

<!-- verified: 2026-06-26 -->
