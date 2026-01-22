# TLDR

**List** tests, plans, and stories

```tmt```

**Initialize** project structure

```tmt init```

**Create** test with template

```tmt test create -t [beakerlib] --link [verifies:issue#1234]```

List **tests/plans/stories**

```tmt [test|plan|story] ls [pattern]```

Show test **metadata** with context

```tmt -c [arch=aarch64] test show```

**Validate** tmt files

```tmt lint```

Use **filter**

```tmt tests ls -f [tag:foo] -f [tier:0]```

# SYNOPSIS

**tmt** [_OPTIONS_] _COMMAND_ [_ARGS_]

# COMMANDS

**init**
> Initialize tmt project structure

**test** [create|ls|show]
> Manage tests

**plan** [ls|show]
> Manage test plans

**story** [ls|show]
> Manage stories

**run**
> Execute tests

**lint**
> Validate tmt files

**try**
> Try tests interactively

# PARAMETERS

**-c, --context** _KEY=VALUE_
> Set context for operations

**-f, --filter** _EXPRESSION_
> Filter items

**-t, --template** _NAME_
> Use template for creation

# DESCRIPTION

**tmt** (Test Management Tool) is a framework for creating, organizing, and executing tests. It uses metadata in YAML format to define tests, plans, and stories, enabling reproducible test execution across different environments.

# CAVEATS

Requires proper tmt file structure. Tests run in containers by default. Complex plans may require additional provisioning setup.

# HISTORY

**tmt** was developed by **Red Hat** for managing tests across Fedora and RHEL, providing a unified test metadata format and execution framework.

# SEE ALSO

[beakerlib](/man/beakerlib)(1), [podman](/man/podman)(1)
