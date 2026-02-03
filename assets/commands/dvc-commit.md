# TLDR

**Commit changes to .dvc files**

```dvc commit```

**Commit specific file**

```dvc commit [data.csv.dvc]```

**Commit with message**

```dvc commit -m "[message]"```

**Force commit**

```dvc commit -f```

# SYNOPSIS

**dvc** **commit** [_options_] [_targets_...]

# PARAMETERS

**-f**, **--force**
> Force commit even if unchanged.

**-m**, **--message** _msg_
> Commit message.

**-R**, **--recursive**
> Commit recursively.

# DESCRIPTION

**dvc commit** saves changes to tracked files by updating their .dvc file hashes. Used after modifying data files to record the new version.

# SEE ALSO

[dvc-add](/man/dvc-add)(1), [dvc-push](/man/dvc-push)(1)

