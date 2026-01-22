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

**-m** _MESSAGE_
> Description message.

**-r** _REV_
> Revision to describe.

**--stdin**
> Read message from stdin.

**--reset-author**
> Reset author to current user.

**--help**
> Display help information.

# DESCRIPTION

**jj describe** updates the description of a change. It sets or modifies the commit message equivalent.

The command opens an editor by default or accepts inline messages. Descriptions can be updated at any time.

jj describe sets change descriptions.

# CAVEATS

Subcommand of jj. Descriptions can be changed anytime. Empty description allowed.

# HISTORY

jj describe is part of **Jujutsu**, enabling flexible change descriptions that can be modified throughout development.

# SEE ALSO

[jj](/man/jj)(1), [jj-new](/man/jj-new)(1), [jj-log](/man/jj-log)(1)
