# TAGLINE

record changes to DVC-tracked files

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

**dvc commit** updates .dvc metadata files to reflect changes made to tracked data files in the workspace. After modifying a DVC-tracked file, its hash no longer matches the hash stored in the .dvc file. Running dvc commit computes the new hash and updates the .dvc file accordingly.

This is analogous to git commit but for DVC-tracked data: it records that you intentionally changed the file and want to version this new state. The command moves the new version into the DVC cache and updates the metadata.

Use dvc commit after editing data files, adding content to tracked directories, or replacing tracked files. The updated .dvc file can then be committed to Git, creating a new data version in your project history.

# SEE ALSO

[dvc-add](/man/dvc-add)(1), [dvc-push](/man/dvc-push)(1)

