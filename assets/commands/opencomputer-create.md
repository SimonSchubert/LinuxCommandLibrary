# TAGLINE

Scaffold a hello-world OpenComputer agent project

# TLDR

Create a project in the **current** directory

```opencomputer-create```

Create it in a **new** directory

```opencomputer-create [my-agent]```

Include a **browser** app as well as the agent

```opencomputer-create [my-agent] --spa```

The same scaffold through **npm**

```npm create @opencomputer/start@latest [my-agent]```

# SYNOPSIS

**opencomputer-create** [_directory_] [**--spa** | **--agent-only**]

# PARAMETERS

_directory_
> Where to write the project. The default is **.** (the current directory).

**--spa**
> Also scaffold a browser application. Passed through to **opencomputer init**.

**--agent-only**
> Scaffold the agent and no browser app. This is the default when **--spa** is omitted.

**-h**, **--help**
> Print usage and exit.

# DESCRIPTION

**opencomputer-create** writes a new OpenComputer project and is the **create-start** entry of the **@opencomputer/cli** package. It runs the same initializer as **opencomputer init**.

**--spa** and **--agent-only** cannot be combined. Extra arguments, or more than one directory, are rejected.

The npm package also exposes this flow as **npm create @opencomputer/start@latest**. After the files exist, sign in and link the directory with **opencomputer**.

# CAVEATS

The program's own error lines are prefixed with **create-start**, which is the internal script name, not the command you typed.

# SEE ALSO

[opencomputer](/man/opencomputer)(1)

# RESOURCES

```[Source code](https://github.com/diggerhq/opencomputer)```

```[Homepage](https://opencomputer.dev)```

```[Documentation](https://docs.opencomputer.dev)```

<!-- verified: 2026-11-21 -->
