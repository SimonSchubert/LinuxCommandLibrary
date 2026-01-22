# TLDR

**Check action authorization**

```pkcheck --action-id [action] --process [pid]```

**List actions**

```pkaction```

**Execute command as another user**

```pkexec [command]```

# SYNOPSIS

**polkit** [_options_]

# PARAMETERS

**pkcheck**
> Check authorization.

**pkaction**
> List actions.

**pkexec**
> Execute privileged command.

# DESCRIPTION

**polkit** (PolicyKit) provides authorization framework. Controls system-wide privileges.

The tool manages fine-grained permissions. Alternative to sudo for desktop.

polkit authorizes actions.

# CAVEATS

Desktop integration. Requires polkitd daemon. See individual commands.

# HISTORY

PolicyKit was created by **Red Hat** for fine-grained authorization control.

# SEE ALSO

[pkexec](/man/pkexec)(1), [pkaction](/man/pkaction)(1), [polkitd](/man/polkitd)(8)

