# TLDR

**Create commit with message**

```jj commit -m "[message]"```

**Commit interactively**

```jj commit -i```

**Commit with editor**

```jj commit```

# SYNOPSIS

**jj** **commit** [_options_]

# PARAMETERS

**-m**, **--message** _msg_
> Commit message.

**-i**, **--interactive**
> Interactive mode to select changes.

# DESCRIPTION

**jj commit** creates a new commit from the current working-copy changes in Jujutsu. The working copy becomes the child of the new commit. Unlike git, jj automatically treats the working copy as a commit, so this command finalizes the current changes.

# SEE ALSO

[jj](/man/jj)(1), [jj-status](/man/jj-status)(1)

