# TAGLINE

updates the description of a change

# TLDR

**Describe current change**

```jj describe -m "[message]"```

**Describe specific revision**

```jj describe -r [rev] -m "[message]"```

**Open editor for description**

```jj describe```

**Clear description**

```jj describe -m ""```

**Describe with stdin**

```echo "[message]" | jj describe --stdin```

# SYNOPSIS

**jj describe** [_options_]

# PARAMETERS

**-m**, **--message** _MESSAGE_
> Set the description without opening an editor. May be passed multiple times.

**-r** _REV_
> Revision(s) to describe. Defaults to `@` (the current change).

**--stdin**
> Read the description from standard input.

**--edit**
> Force opening the editor even when a message is supplied.

**--no-edit**
> Don't open the editor; keep the current description when no other input is provided.

**--reset-author**
> Reset the change's author to the configured user (newer jj versions).

**--author** _NAME_EMAIL_
> Override the author (newer jj versions).

**--help**
> Display help information.

# DESCRIPTION

**jj describe** updates the description of a change. It sets or modifies the commit message equivalent.

The command opens an editor by default or accepts inline messages. Descriptions can be updated at any time.

# CAVEATS

Subcommand of jj. Descriptions can be changed anytime. Empty description allowed.

# HISTORY

jj describe is part of **Jujutsu**, enabling flexible change descriptions that can be modified throughout development.

# SEE ALSO

[jj](/man/jj)(1), [jj-new](/man/jj-new)(1), [jj-log](/man/jj-log)(1)
