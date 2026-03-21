# TAGLINE

Open Pulumi web console in browser

# TLDR

**Open Pulumi Console in the default browser**

```pulumi console```

**Open a specific stack in the console**

```pulumi console -s [stack_name]```

**Open the console from a different project directory**

```pulumi console -C [path/to/project]```

# SYNOPSIS

**pulumi** **console** [_options_]

# PARAMETERS

**-s**, **--stack** _string_
> The name of the stack to view in the console.

**-C**, **--cwd** _string_
> Run as if pulumi was started in the given directory.

**--color** _string_
> Control colorized output (always, never, raw, auto). Default is auto.

**--non-interactive**
> Disable interactive mode for all commands.

# DESCRIPTION

**pulumi console** opens the Pulumi Cloud web console in the default browser. It provides a web-based management interface for viewing and managing stacks, resources, deployment history, and activity logs. If a stack is specified with **-s**, the console opens directly to that stack's page.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-stack](/man/pulumi-stack)(1), [pulumi-login](/man/pulumi-login)(1)

