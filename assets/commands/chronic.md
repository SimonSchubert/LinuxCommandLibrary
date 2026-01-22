# TLDR

**Run command silently unless it fails**

```chronic [command]```

**Verbose mode with stderr/stdout distinction**

```chronic -v [command]```

**Trigger on stderr output**

```chronic -e [command]```

**Verbose with stderr triggering**

```chronic -ve [command]```

# SYNOPSIS

**chronic** [_options_] _command_

# DESCRIPTION

**chronic** runs a command quietly, showing output only if the command fails (non-zero exit or crash). Part of moreutils. Ideal for cron jobs where you want verbose commands but silent success.

# PARAMETERS

**-v**
> Verbose mode: distinguish stdout/stderr, report return value

**-e**
> Stderr triggering: show output if stderr is non-empty

# EXIT STATUS

**0**
> Command succeeded with no stderr (in -e mode)

**1**
> Command failed

**2**
> Command succeeded but produced stderr (in -e mode)

# EXAMPLES

**Cron job**
```
0 1 * * * chronic backup
```

**Instead of**
```
0 1 * * * backup >/dev/null 2>&1
```

# BEHAVIOR

- Success (exit 0): output discarded
- Failure (exit != 0): output displayed
- With -e: stderr output triggers display even on success

# CAVEATS

Part of moreutils package. Better than redirecting to /dev/null because you still see errors.

# SEE ALSO

[moreutils](/man/moreutils)(1), [cron](/man/cron)(8), [sponge](/man/sponge)(1)
