# TAGLINE

Open Pomodoro timer for the command line

# TLDR

**Start** a pomodoro

```pomodoro start```

**Check** status

```pomodoro status```

**Finish** early / break

```pomodoro finish```

**Clear** history / settings (see help)

```pomodoro --help```

# SYNOPSIS

**pomodoro** *command* [*options*]

# DESCRIPTION

**pomodoro** is the CLI from the **openpomodoro-cli** project implementing the Pomodoro Technique: timed focus intervals with breaks, status output suitable for shell prompts, and a simple log. Install with **go install github.com/open-pomodoro/openpomodoro-cli/cmd/pomodoro@latest** or distro packages where available.

# PARAMETERS

**start** [**-t** *duration*] [**-d** *description*]

> Begin a focus session (flags vary by version).

**status**

> Print whether a pomodoro is running and remaining time.

**finish** / **break** / **cancel**

> Complete or abort the current interval.

Configuration is typically under the XDG config home; see upstream README for **POMODORO_*** environment variables.

# CAVEATS

Multiple overlapping installs of unrelated “pomodoro” tools exist—ensure PATH points to openpomodoro-cli. Desktop notifications depend on optional hooks.

# SEE ALSO

[sleep](/man/sleep)(1), [timer](/man/timer)(1), [arttime](/man/arttime)(1)

# RESOURCES

```[Source code](https://github.com/open-pomodoro/openpomodoro-cli)```

<!-- verified: 2026-07-19 -->
