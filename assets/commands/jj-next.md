# TLDR

**Move to child change**

```jj next```

**Move multiple steps**

```jj next [2]```

**Edit the target change**

```jj next --edit```

**Move to specific branch**

```jj next --branch [name]```

# SYNOPSIS

**jj next** [_options_] [_count_]

# PARAMETERS

_COUNT_
> Number of changes to move forward.

**--edit**
> Edit target change instead of creating new.

**--branch** _NAME_
> Follow specific branch.

**--help**
> Display help information.

# DESCRIPTION

**jj next** moves the working copy to a child change. It navigates forward in the change history.

The command is useful for reviewing changes in sequence. Combined with prev, it enables navigation through history.

jj next moves to child changes.

# CAVEATS

Subcommand of jj. Requires child changes to exist. Ambiguity with multiple children.

# HISTORY

jj next is part of **Jujutsu**, providing intuitive history navigation for the change-centric model.

# SEE ALSO

[jj](/man/jj)(1), [jj-prev](/man/jj-prev)(1), [jj-edit](/man/jj-edit)(1)
