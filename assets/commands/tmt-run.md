# TAGLINE

Execute tmt test steps

# TLDR

**Run** all test steps

```tmt run```

**Discover** what tests would run

```tmt run discover -v```

Run with **provisioning** options

```tmt run -a provision -h [container] -i [fedora:rawhide]```

Run selected **plans** and tests

```tmt run plan -n [/plan/name] test -n [/test/name]```

Show **results** in browser

```tmt run -l report -h html -o```

Run with **context**

```tmt run -c [key=value]```

Run **interactively**

```tmt run -a execute -h tmt --interactive```

**Dry run** with verbose

```tmt run -n -vvv```

# SYNOPSIS

**tmt run** [_OPTIONS_] [_STEP_...]

# PARAMETERS

**-a, --all**
> Run all test steps

**-l, --last**
> Use the last run

**-n, --dry**
> Dry run mode (show actions without executing)

**-v, --verbose**
> Increase verbosity (can be repeated)

**-c, --context** _KEY=VALUE_
> Set context variables

**discover**
> Show what tests would be run

**provision**
> Prepare the test environment

**prepare**
> Prepare the system for testing

**execute**
> Run the tests

**report**
> Generate test reports

**finish**
> Clean up after testing

# DESCRIPTION

**tmt run** executes test management tool steps for test execution. By default, all steps (discover, provision, prepare, execute, report, finish) are executed in sequence. Individual steps can be run separately or with modified options.

The command supports different provisioning methods including containers, virtual machines, and remote systems. Tests can be filtered by name, context, or plan.

# CAVEATS

Running all steps requires appropriate provisioning backend. Container-based execution needs Podman or Docker. Some steps require root privileges. Large test suites may require significant resources.

# SEE ALSO

[tmt](/man/tmt)(1), [tmt-try](/man/tmt-try)(1), [podman](/man/podman)(1)
