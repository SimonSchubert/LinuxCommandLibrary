# TAGLINE

CLI for the Avo analytics tracking plan platform

# TLDR

**Initialize** an Avo workspace in the current folder

```avo init```

**Pull** analytics wrappers from your Avo workspace

```avo pull```

**Pull** a specific source

```avo pull [source_name]```

**Check implementation status**

```avo status```

**Switch** to a different Avo branch

```avo checkout [branch]```

**Merge** the Avo main branch into your current branch

```avo merge main```

**Log into** the Avo platform

```avo login```

# SYNOPSIS

**avo** _command_ [_options_]

# PARAMETERS

**init**
> Initialize an Avo workspace in the current folder.

**pull** [_source_]
> Pull analytics wrappers from your Avo workspace.

**checkout** _branch_
> Switch to a different Avo branch.

**source** _command_
> Manage sources for the current project.

**status** [_source_]
> Show the status of the Avo implementation.

**merge main**
> Pull the Avo main branch into your current branch.

**conflict**
> Resolve git conflicts in Avo files.

**edit**
> Open the Avo workspace in the browser.

**login**
> Log into the Avo platform.

**logout**
> Log out from the Avo platform.

**whoami**
> Show the currently logged in username.

**-v**, **--verbose**
> Make output more verbose.

**-f**, **--force**
> Proceed with merge when incoming branch is open.

**--version**
> Show version number.

**--help**
> Show help.

# DESCRIPTION

**avo** is the command-line interface for the Avo analytics tracking plan platform. It lets you pull type-safe analytics wrappers (codegen) from your Avo workspace directly into your project, ensuring analytics implementations match your tracking plan.

The main workflow is running `avo pull` to fetch the latest generated analytics code based on your tracking plan defined at avo.app. On first run, it prompts you to select which Avo source to generate code for and where to save it. This configuration is stored in the **avo.json** file.

# CAVEATS

Requires Node.js >= 14.16. Must be authenticated via `avo login` before pulling. Configuration is stored in avo.json in the project root.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1)
