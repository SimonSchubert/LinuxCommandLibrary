# TAGLINE

Update the description and create a new change on top in Jujutsu

# TLDR

**Create a commit with a message**

```jj commit -m "[message]"```

**Commit interactively** choosing which changes to include

```jj commit -i```

**Open an editor** to write the commit description

```jj commit```

**Commit only specific files**

```jj commit [path/to/file1] [path/to/file2]```

**Commit with a specific diff editor tool**

```jj commit --tool [meld]```

**Set a message and still open the editor** to refine it

```jj commit -m "[draft message]" --editor```

# SYNOPSIS

**jj** **commit** [_options_] [_FILESETS_...]

# PARAMETERS

_FILESETS_
> Put these paths in the current commit.

**-m**, **--message** _MESSAGE_
> The change description to use (don't open editor).

**-i**, **--interactive**
> Interactively choose which changes to include in the current commit.

**--tool** _NAME_
> Specify diff editor to be used (implies --interactive).

**--editor**
> Open an editor to edit the change description. Forces an editor even when using --message.

# DESCRIPTION

**jj commit** updates the description of the current working-copy commit and creates a new empty change on top of it. It is equivalent to running **jj describe** followed by **jj new**, and has the alias **jj ci**.

When invoked without path arguments or **--interactive**, all changes in the working copy are included. When paths or **--interactive** are used, only the selected changes are committed while the remaining changes are moved to the new working-copy commit above.

Unlike git, Jujutsu automatically treats the working copy as a mutable commit, so this command finalizes the current changes by setting a description and advancing the working copy.

# SEE ALSO

[jj](/man/jj)(1), [jj-describe](/man/jj-describe)(1), [jj-new](/man/jj-new)(1), [jj-status](/man/jj-status)(1), [jj-diff](/man/jj-diff)(1)

